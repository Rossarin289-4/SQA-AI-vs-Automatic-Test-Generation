package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", "long", "151060470"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "2147483639"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#299#1914176013", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:11>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[9, 0, 9, 0, 10, 11, 12, 1, 0, 1, 0, 127, 2, 3, 0, 0, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[9, 0, 9, 0, 10, 11, 12, 1,...#455#-1831466560", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:3>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-134309475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", new String[]{"long"}, new String[]{"131196"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", "long", "-67108849"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=131196, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[]...#302#-376053030", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", new String[]{"int"}, new String[]{"-2097152"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<s:key>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=1, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#1082999615", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", "int", "30"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#8320534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<sample:1>"}}), new String[][]{{"addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals(" {getCentralDirectoryExtra=[3, 0, 3, 0, 4, 5, 6], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[3, 0, 3, 0, 4, 5, 6], getExtraFields=?, getInternalAttributes=0, ...#339#-461543868", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#283#2026951996", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:7>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String,byte[]", "1", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1 {getCentralDirectoryExtra=[5, 0, 5, 0, 6, 7, 0, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[5, 0, 5, 0, 6, 7, 0, 0, 0], getExtraFields=?, getInternalA...#370#-820838319", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", new String[]{"long"}, new String[]{"-30"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeUnparseableExtraFieldData", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", "int", "-4227073"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-30, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMet...#304#604085160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String", "byte[]"}, new String[]{"-0.0\t", "<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", "int", "65546"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "65539"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "-0.0\t {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=65539, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ...#298#-1383105642", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setGeneralPurposeBit", "org.apache.commons.compress.archivers.zip.GeneralPurposeBit", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=!ArrayIndexOutOfBoundsException, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=?, getInternalAttributes=0, getLoc...#314#-1165121273", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:12>"}}, 1), new String[][]{{"getExternalAttributes", "", "4"}, {"setExtra", "byte[]", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("a {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLocalFil...#322#1033166600", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLocalFil...#322#1033166600", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, g...#279#-330397306", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-134309475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeUnparseableExtraFieldData", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "65700"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", "byte[]", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=65700, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#287#-689344492", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#-484286111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "32764"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 15:59:59 PST 1969 {getDate=31, getDay=3, getHours=15, getMinutes=59, getMonth=11, getSeconds=59, getTime=-1, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=32764, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMe...#289#959939803", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 15:59:59 PST 1969 {getDate=31, getDay=3, getHours=15, getMinutes=59, getMonth=11, getSeconds=59, getTime=-1, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#294#242578595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeUnparseableExtraFieldData", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#287#1882684751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#283#2026951996", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField[]"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLoc...#333#1913170700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:9>"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#-484286111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#296#-699278366", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#283#2026951996", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:0>"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-134309475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "-65534"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-65534, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#291#-1726736583", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", new String[]{"long"}, new String[]{"-56"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setGeneralPurposeBit", "org.apache.commons.compress.archivers.zip.GeneralPurposeBit", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", new String[]{"int"}, new String[]{"-8388610"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#292#-748127038", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:2>"}}, 1), new String[][]{{"getName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String,byte[]", "-0.0", "<sample:0>"}}, 3), new String[][]{{"setTimeLocal", "java.time.LocalDateTime", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("-0.0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#309#-2034673979", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-0.0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMe...#293#1677847032", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", new String[]{"int"}, new String[]{"-2097152"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeUnparseableExtraFieldData", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=1, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#1276674589", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", new String[]{"long"}, new String[]{"-89"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", "boolean", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#296#-699278366", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 15:59:59 PST 1969 {getDate=31, getDay=3, getHours=15, getMinutes=59, getMonth=11, getSeconds=59, getTime=-1, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#283#2026951996", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", new String[]{"long"}, new String[]{"-47"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-47, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMet...#300#1767031879", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-134309475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#296#-699278366", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", new String[]{"long"}, new String[]{"-44"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "80"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-44, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#287#-1044094524", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", new String[]{"long"}, new String[]{"8"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#1748026457", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "-9223372036854775808"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-9223372036854775808, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFile...#314#-973389410", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#-484286111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", new String[]{"int"}, new String[]{"72"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=72, getLocalFileDataExtra=[], getMetho...#286#-1553144046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", new String[]{"long"}, new String[]{"524304"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", "boolean", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#290#-2024656927", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", "boolean", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:5>"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[3, 0, 3, 0, 4, 5, 6], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[3, 0, 3, 0, 4, 5, 6], getExtraFields=?, getInternalAttributes=0, ...#339#-461543868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLoc...#333#1913170700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", new String[]{"long"}, new String[]{"9205357638345293763"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", "int", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-65536, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#313#1796401822", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:8>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLocalFile...#321#-1891467444", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#284#887909432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 15:59:59 PST 1969 {getDate=31, getDay=3, getHours=15, getMinutes=59, getMonth=11, getSeconds=59, getTime=-1, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-909675094", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#-484286111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:10>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLocalFile...#321#-1891467444", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMe...#295#29306236", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("47", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setGeneralPurposeBit", new String[]{"org.apache.commons.compress.archivers.zip.GeneralPurposeBit"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:0>"}}, 1), new String[][]{{"before", "java.util.Date", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#287#1882684751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<s:key>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<s:a>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", "int", "1073741841"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setGeneralPurposeBit", "org.apache.commons.compress.archivers.zip.GeneralPurposeBit", "<sample:9>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String", "0.5d1.5e30>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0.5d1.5e30> {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ...#305#488825794", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-134309475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", new String[]{"long"}, new String[]{"50"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "-7"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=50, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#299#402102894", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#-484286111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", ""}}, 3), new String[][]{{"before", "java.util.Date", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String", "+z1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+z1", String.valueOf(actual));
  assertEquals("receiver state after the call", "+z1 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMet...#290#1286655067", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String"}, new String[]{"1ee10"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "1ee10 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getM...#295#-1434180017", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#296#-699278366", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", "int", "65546"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", "long", "134283262"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("134283262", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=655361, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getM...#298#1680394048", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "9223372036854775764"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=9223372036854775764, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileData...#304#198586997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-134309475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", "int", "45"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=2949121, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#292#943674303", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-134309475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#283#2026951996", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String"}, new String[]{"4"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "-2251799813619713"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "4 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-2251799813619713, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataEx...#303#1959618574", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", new String[]{"long"}, new String[]{"4295032832"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:10>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=4295032832, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ...#294#1913243907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#283#2026951996", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String"}, new String[]{"T"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "T {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#287#-1187798377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:33>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String", "byte[]"}, new String[]{"1.5e30>", "<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1.5e30> {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ge...#314#1066472084", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#296#-699278366", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", new String[]{"int"}, new String[]{"3"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=196609, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getM...#296#1083957499", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String,byte[]", "{\"a\":1}", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{\"a\":1} {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ge...#302#-1689483846", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-134309475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", new String[]{"int"}, new String[]{"-4194305"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#292#990746396", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setGeneralPurposeBit", "org.apache.commons.compress.archivers.zip.GeneralPurposeBit", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x123456789 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[]...#307#-709640183", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#283#2026951996", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, g...#279#-330397306", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String", "\010"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\010 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#287#999365375", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", new String[]{"long"}, new String[]{"104923134"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#292#1077600942", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeUnparseableExtraFieldData", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", "int", "23"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=1507329, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#292#1652304074", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-2>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", "long", "-26"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#-484286111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:1>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String", "PT1Hiinvalid entry size"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT1Hiinvalid entry size {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFile...#331#1265202235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", "byte[]", "<sample:1>"}}), new String[][]{{"getInternalAttributes", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#296#-699278366", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#-484286111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 15:59:59 PST 1969 {getDate=31, getDay=3, getHours=15, getMinutes=59, getMonth=11, getSeconds=59, getTime=-1, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 15:59:59 PST 1969 {getDate=31, getDay=3, getHours=15, getMinutes=59, getMonth=11, getSeconds=59, getTime=-1, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#-484286111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "65546"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#290#1155150917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#-484286111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[3, 0, 3, 0, 4, 5, 6], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[3, 0, 3, 0, 4, 5, 6], getExtraFields=?, getInternalAttributes=0, ...#339#-461543868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", new String[]{"int"}, new String[]{"-12"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#289#-2002890639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLocalFile...#321#-1891467444", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String", "byte[]"}, new String[]{"1.123456C890123456", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1.123456C890123456 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataE...#321#797870008", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField[]"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod...#291#674381126", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", new String[]{"long"}, new String[]{"4"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-1024380331", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", new String[]{"int"}, new String[]{"3"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=3, getLocalFileDataExtra=[], getMetho...#298#317867786", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#296#-699278366", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:5>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[3, 0, 3, 0, 4, 5, 6], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[3, 0, 3, 0, 4, 5, 6], getExtraFields=?, getInternalAttributes=0,...#352#49912298", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#287#1882684751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String,byte[]", ",1", "<null>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", ",1 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#288#-1392327155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false), new String[][]{{"getExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "0"}, {"getMethod", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", "int", "-1"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=-1, getLocalFileDataExtra=[], getM...#296#-2045989388", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", new String[]{"int"}, new String[]{"-30"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#299#-202251449", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=!ArrayIndexOutOfBoundsException, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=?, getInternalAttributes=0, getLoc...#326#-1922988367", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String", "byte[]"}, new String[]{"ctrue0", "<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "ctrue0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#-43760456", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", "byte[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#296#-699278366", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String"}, new String[]{"ii"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "ii {getCentralDirectoryExtra=[3, 0, 3, 0, 4, 5, 6], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[3, 0, 3, 0, 4, 5, 6], getExtraFields=?, getInternalAttributes=0...#343#1737924420", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, ...#292#-590507604", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:0>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod...#291#674381126", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", new String[]{"long"}, new String[]{"4295032832"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#293#2123842559", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", "int", "-2147483648"}}), new String[][]{{"getRawName", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=-2147483648, getLocalFileDataExtra=[],...#295#-1492625013", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#-484286111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.GeneralPurposeBit", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:6>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLocalFil...#334#-1885621966", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLo...#345#-1196976991", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getDay", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-134309475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", "boolean", "false"}}), new String[][]{{"removeUnparseableExtraFieldData", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[5, 0, 5, 0, 6, 7, 0, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[5, 0, 5, 0, 6, 7, 0, 0, 0], getExtraFields=?, getInternalAt...#357#638109126", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", "byte[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#296#-699278366", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"setDate", "int", "6"}, {"setTime", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=1, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-134309475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "4611685468671574015"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=4611685468671574015, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileData...#316#-1116002070", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#284#887909432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", new String[]{"long"}, new String[]{"65536"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#301#-406437370", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#296#-699278366", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"usesStrongEncryption", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLocalFile...#321#-1891467444", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", new String[]{"long"}, new String[]{"-65535"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-65535, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[]...#302#665718670", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", new String[]{"long"}, new String[]{"17592186044403"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#299#1274735033", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, g...#279#-330397306", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", "int", "65536"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=65536, getLocalFileDataExtra=[], getMet...#289#961410603", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLocalFile...#321#-1891467444", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#283#2026951996", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=3, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#296#31332223", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=2147483647, getLocalFileDataExtra=[], ...#294#491934243", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLoc...#333#1913170700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#285#651138516", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#287#1882684751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#-484286111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", new String[]{"int"}, new String[]{"-3"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", "int", "8"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=524289, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getM...#291#1898373217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=-2147483648, getLocalFileDataExtra=[],...#295#-1492625013", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "<sample:0>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", "int", "15"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=!ArrayIndexOutOfBoundsException, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=983041, getExtra=null, getExtraFields=?, getInternalAttributes=0, ge...#319#1910301295", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#285#651138516", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", new String[]{"int"}, new String[]{"-26"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=-26, getLocalFileDataExtra=[], getMet...#300#-261976056", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", new String[]{"int"}, new String[]{"262145"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=262145, getLocalFileDataExtra=[], getM...#290#12271291", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, g...#279#-330397306", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", new String[]{"long"}, new String[]{"98303"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=98303, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[],...#301#733599034", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"clone", "", "1"}, {"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMe...#295#29306236", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#-484286111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("47", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:11>"}}), new String[][]{{"getUnparseableExtraFieldData", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[9, 0, 9, 0, 10, 11, 12, 0, 0, 0, 0, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[9, 0, 9, 0, 10, 11, 12, 0, 0, 0, 0, 0, 0], g...#402#-1891896845", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-134309475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getCrc", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#-484286111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-134309475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-134309475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"-2147483647"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "<null>"}}), new String[][]{{"toLocaleString", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dec 31, 1969, 3:59:59 PM", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#295#-1013890953", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "62"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=62, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-712327479", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#283#2026951996", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-134309475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", "long", "-2162688"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#-484286111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "-2147483648"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#287#1882684751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-134309475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:0>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, ...#280#-1948420094", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals(" {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#283#2026951996", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String,byte[]", "655351e10", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Oct 03 05:53:16 PDT 2026 {getDate=3, getDay=6, getHours=5, getMinutes=53, getMonth=9, getSeconds=16, getTime=1791031996408, getTimezoneOffset=420, getYear=126}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "655351e10 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ...#321#373008631", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "65535"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=65535, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMe...#289#936828505", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#293#-891183639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", new String[]{"int"}, new String[]{"-4227073"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=2147418112, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ...#298#1233372032", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", new String[]{"long"}, new String[]{"-12"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", "int", "65535"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-12, getExtra=null, getExtraFields=[], getInternalAttributes=65535, getLocalFileDataExtra=[], get...#291#313996619", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String,byte[]", "0xFFFFFFFF", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0xFFFFFFFF {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[],...#309#2094336234", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#287#1882684751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:7>"}}), new String[][]{{"getDate", "", "7"}, {"getMinutes", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("59", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMe...#295#29306236", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", "int", "2"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-1665453275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#285#651138516", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String"}, new String[]{"PT2H"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "PT2H {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMe...#293#433406753", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#-484286111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:3>"}}), new String[][]{{"getYear", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("69", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-134309475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=1, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#944478813", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Oct 03 05:53:16 PDT 2026 {getDate=3, getDay=6, getHours=5, getMinutes=53, getMonth=9, getSeconds=16, getTime=1791031996408, getTimezoneOffset=420, getYear=126}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", "int", "-29"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<i:1>"}}), new String[][]{{"usesDataDescriptor", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#-484286111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String", ":F.25"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", ":F.25 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getM...#294#1889831445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String,byte[]", "\037- ", "<null>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\037-  {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1...#285#-1609605810", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String", "byte[]"}, new String[]{"1e10", "<empty>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1e10 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#288#1784149783", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getYear", "", "0"}, {"before", "java.util.Date", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"3"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:7>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[5, 0, 5, 0, 6, 7, 0, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[5, 0, 5, 0, 6, 7, 0, 0, 0], getExtraFields=?, getInte...#368#-1717969163", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String", "byte[]"}, new String[]{" - ", "<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " -  {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMet...#291#535960469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", "byte[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#296#-699278366", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "-2048"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-2048, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMe...#289#1106810370", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-134309475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#284#887909432", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-134309475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#-484286111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#287#1882684751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "281474976710639"}}), new String[][]{{"getTimezoneOffset", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("420", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=281474976710639, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtr...#312#-900998305", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("47", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-65520, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#307#609521021", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-112>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-134309475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#283#2026951996", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setGeneralPurposeBit", new String[]{"org.apache.commons.compress.archivers.zip.GeneralPurposeBit"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setGeneralPurposeBit", new String[]{"org.apache.commons.compress.archivers.zip.GeneralPurposeBit"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, g...#279#-330397306", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"4"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#295#-1754576787", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=1, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#944478813", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"1"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#296#-648046792", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 15:59:59 PST 1969 {getDate=31, getDay=3, getHours=15, getMinutes=59, getMonth=11, getSeconds=59, getTime=-1, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#283#2026951996", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", "byte[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#296#-699278366", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", ""}}), new String[][]{{"encode", "", "5"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", "int", "29"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#-1164333398", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"2"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#297#-843149175", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#284#887909432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setGeneralPurposeBit", new String[]{"org.apache.commons.compress.archivers.zip.GeneralPurposeBit"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#287#1882684751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[9, 0, 9, 0, 10, 11, 12, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[9, 0, 9, 0, 10, 11, 12, 0, 0, 0, 0, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[9, 0, 9, 0, 10, 11, 12, 0, 0, 0, 0, 0,...#414#-1201490681", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:3>"}}), new String[][]{{"useEncryption", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.GeneralPurposeBit", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, g...#279#-330397306", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, g...#279#-330397306", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("131089", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=131089, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMe...#301#233365571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "-9223372036854775808"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-9223372036854775808, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDat...#305#1650428621", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, g...#279#-330397306", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String", "1/5e3001.5f"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/5e3001.5f {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ...#316#-289405158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#-484286111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String,byte[]", "-1", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#291#1025635119", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{"byte[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"setCompressedSize", "long", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals(" {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=2, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-1...#282#366968106", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", "int", "0"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#1304657827", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String", "byte[]"}, new String[]{"12:30:45{\"a\":1}", "<empty>"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "12:30:45{\"a\":1} {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtr...#312#-1183161230", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<empty>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#285#651138516", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("47", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#293#-891183639", SearchInputFactory_scaffolding.receiverState());
 }
}
