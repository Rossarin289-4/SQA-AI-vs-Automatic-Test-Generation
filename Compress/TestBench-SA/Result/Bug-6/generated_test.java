package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", new String[]{"int"}, new String[]{"131073"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:6>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=65553, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getM...#303#1866103573", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", "byte[]", "<sample:0>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isSupportedCompressionMethod", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#285#-420130636", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", "byte[]", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "65535"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[3, 0, 3, 0, 4, 5, 6], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=65535, getExtra=[3, 0, 3, 0, 4, 5, 6], getExtraFields=?, getInternalAttribute...#347#1552461244", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", "int", "-1"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:5>"}}, 3), new String[][]{{"setMonth", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Mar 31 16:00:00 PST 1969 {getDate=31, getDay=1, getHours=16, getMinutes=0, getMonth=2, getSeconds=0, getTime=-23760000000, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[3, 0, 3, 0, 4, 5, 6], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-65536, getExtra=[3, 0, 3, 0, 4, 5, 6], getExtraFields=?, getInternalAttribut...#351#636632481", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:6>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:6>"}}, 3), new String[][]{{"getCentralDirectoryExtra", "", "5"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -54, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLocalFi...#337#-422170508", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "2"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#299#-127813805", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample/ {getCentralDirectoryExtra=!ArrayIndexOutOfBoundsException, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=?, getInternalAttributes=0, ...#339#-637369321", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", "int", "0"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", ""}}), new String[][]{{"isSupportedCompressionMethod", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#286#1239874907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<null>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", "int", "131073"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0/", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#305#921687298", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:5>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:5>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isSupportedCompressionMethod", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#299#1638994724", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isSupportedCompressionMethod", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", "int", "8"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#287#-1616610337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#288#649409011", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#301#-1794577591", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#299#51668889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ge...#311#301624769", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#287#1935576217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#285#-420130636", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:5>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[3, 0, 3, 0, 4, 5, 6], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[3, 0, 3, 0, 4, 5, 6], getExtraFields=?, getInternalAttributes=0, ...#341#432127932", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "0"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[3, 0, 3, 0, 4, 5, 6], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[3, 0, 3, 0, 4, 5, 6], getExtraFields=?, getInternalAttributes=0, ...#341#432127932", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", new String[]{"long"}, new String[]{"-4611686018427387903"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-4611686018427387903, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFi...#318#1270955744", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", new String[]{"long"}, new String[]{"65536"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=65536, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[],...#303#-1756410832", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#285#-420130636", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"2091"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<s:key>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#289#-378728821", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"1045"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<s:key>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#289#178086037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"-1045"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<s:k\n[>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "-9223372036854775808"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<s:o<\n[>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-9223372036854775808, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileData...#314#-1722956113", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 20, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#287#1935576217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 21, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#289#-1621999609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 22, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#299#-2036271595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 23, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#288#649409011", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#301#-1794577591", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#288#-764701", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#290#1383534389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#287#1935576217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#289#-1621999609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#299#-2036271595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[3, 0, 3, 0, 4, 5, 6], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[3, 0, 3, 0, 4, 5, 6], getExtraFields=?, getInternalAttributes=0,...#342#-1642958890", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", "int", "65536"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=1, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#287#-1294773867", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", "int", "65536"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=1, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#289#824220453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"16"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#287#562150042", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"47"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#287#-1437470728", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"74"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isSupportedCompressionMethod", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#287#1399877458", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", new String[]{"long"}, new String[]{"65536"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=65536, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMe...#291#705096048", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", "byte[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMe...#297#-307324684", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", "byte[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#286#-545732146", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "16"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", "byte[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#287#-1644210097", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"getComment", "", "4"}, {"isDirectory", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#289#-1621999609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<b:false>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ge...#311#301624769", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<b:false>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#299#-2036271595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<b:false>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#287#1935576217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isSupportedCompressionMethod", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#289#-1621999609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", new String[]{"int"}, new String[]{"131073"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=65537, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMe...#291#1981064173", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", new String[]{"int"}, new String[]{"4"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=262145, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getM...#292#-614730086", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", new String[]{"int"}, new String[]{"2"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=131073, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getM...#292#149039711", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", new String[]{"int"}, new String[]{"7"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=458753, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getM...#292#-530667709", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#289#-1621999609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#299#-2036271595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#288#649409011", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#301#-1794577591", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=1, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#288#1411290322", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#287#1935576217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#289#-1031058647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 17, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ge...#311#301624769", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<s:key>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#299#-2036271595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<s:key>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#288#649409011", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<s:k9eyy>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#301#-1794577591", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<s:k9eyy>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#285#-420130636", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:4>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isSupportedCompressionMethod", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#287#1935576217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<sample:10>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", "byte[]", "<empty>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#286#-545732146", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:5>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "-9223372036854775808"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-9223372036854775808, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataE...#305#1239005950", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:5>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "9223372036854775807"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=9223372036854775807, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataEx...#304#-650784292", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "16"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#289#1045427402", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "16"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0/", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#302#473855346", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "16"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#288#131977154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "16"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#300#1860392130", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String"}, new String[]{"5."}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "5. {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#291#909808185", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String"}, new String[]{"4."}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "4. {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#291#1548010777", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String"}, new String[]{"/"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#288#1600680388", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String"}, new String[]{".5."}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", ".5. {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMet...#293#506487285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String"}, new String[]{".55."}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", ".55. {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMe...#295#1309905945", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#288#649409011", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0/", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#301#-1794577591", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#287#1935576217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#299#51668889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLocalFile...#323#665106116", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, g...#281#1909922430", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals(" {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#285#-420130636", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#287#1935576217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#287#273042252", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#289#-1621999609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[3, 0, 3, 0, 4, 5, 6], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[3, 0, 3, 0, 4, 5, 6], getExtraFields=?, getInternalAttributes=0, ...#341#432127932", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[3, 0, 3, 0, 4, 5, 6], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[3, 0, 3, 0, 4, 5, 6], getExtraFields=?, getInternalAttributes=0,...#343#-290099900", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[3, 0, 3, 0, 4, 5, 6], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[3, 0, 3, 0, 4, 5, 6], getExtraFields=?, getInternalAttributes=0,...#353#1021359570", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=!ArrayIndexOutOfBoundsException, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=?, getInternalAttributes=0, getLoca...#315#330272259", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[3, 0, 3, 0, 4, 5, 6], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[3, 0, 3, 0, 4, 5, 6], getExtraFields=?, getInternalAttributes=0,...#342#-1642958890", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLocalFil...#324#1607452830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#288#649409011", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#288#649409011", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#285#-420130636", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:5>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#287#1935576217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=9223372036854775807, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileData...#306#-1521455487", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-9223372036854775808, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDat...#307#2090768163", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 15, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=9223372036854775807, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataE...#305#1329728231", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=9223372036854775807, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFil...#317#762952167", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", new String[]{"long"}, new String[]{"4611686018427387903"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=4611686018427387903, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFil...#317#102423979", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", new String[]{"long"}, new String[]{"65564"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=!ArrayIndexOutOfBoundsException, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=65564, getExtra=null, getExtraFields=?, getInternalAttributes=...#331#-1448032409", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:0>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, ...#293#-1651788208", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:4>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLocalFil...#324#1607452830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:5>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[3, 0, 3, 0, 4, 5, 6], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[3, 0, 3, 0, 4, 5, 6], getExtraFields=?, getInternalAttributes=0,...#342#-1642958890", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#287#1935576217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:7>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[5, 0, 5, 0, 6, 7, 0, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[5, 0, 5, 0, 6, 7, 0, 0, 0], getExtraFields=?, getInternalA...#360#-1441364712", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<null>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[3, 0, 3, 0, 4, 5, 6], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[3, 0, 3, 0, 4, 5, 6], getExtraFields=?, getInternalAttributes=0, ...#341#432127932", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLocalFile...#323#665106116", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLocalFil...#325#-710343876", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#289#-1621999609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#299#-2036271595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#288#649409011", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", new String[]{"int"}, new String[]{"65535"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=65535, getLocalFileDataExtra=[], getM...#303#267887117", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", new String[]{"int"}, new String[]{"-65535"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=-65535, getLocalFileDataExtra=[], get...#304#1346584502", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", new String[]{"int"}, new String[]{"65534"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-131072, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#429086596", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=1, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#287#-1294773867", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-65536, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getM...#296#1395021238", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", new String[]{"int"}, new String[]{"-2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=65537, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMe...#291#1981064173", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", new String[]{"int"}, new String[]{"17"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=1114113, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#294#1544421744", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", new String[]{"int"}, new String[]{"34"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=2228225, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#294#527523306", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#287#1935576217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"17"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<s:key>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#287#-647092197", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<s:key>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#286#30632668", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"2049"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<s:key>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#289#1286221176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"2091"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<s:key>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#289#-378728821", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"-536871957"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<s:<\n[>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#287#1935576217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#289#-1621999609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#299#-2036271595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#288#649409011", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#289#-1031058647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", new String[]{"int"}, new String[]{"17"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#288#232889121", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 29, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-65520, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[...#320#-1280785137", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#287#1935576217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#289#-1621999609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#299#-2036271595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#288#649409011", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#301#-1794577591", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", new String[]{"int"}, new String[]{"65534"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", "int", "15"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=983041, getExtra=?, getExtraFields=?, getInternalAttributes=65534, getLocalFileDataExtra=?, getMet...#291#1964835361", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", new String[]{"int"}, new String[]{"65534"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-65536, getExtra=?, getExtraFields=?, getInternalAttributes=65534, getLocalFileDataExtra=?, getMet...#294#107756830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", new String[]{"int"}, new String[]{"-16711682"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-65536, getExtra=?, getExtraFields=?, getInternalAttributes=-16711682, getLocalFileDataExtra=?, ge...#298#-1277863414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#285#-420130636", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#287#273042252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#287#1935576217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#289#-1621999609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=-1, getLocalFileDataExtra=[], getMeth...#290#644696365", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", "int", "1023"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=1023, getLocalFileDataExtra=[], getMe...#292#-840338319", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("47", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=-1, getLocalFileDataExtra=[], getMeth...#300#1142689053", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=-1, getLocalFileDataExtra=[], getMeth...#289#635170447", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", "int", "-2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=-2, getLocalFileDataExtra=[], getMeth...#289#-1865611504", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", "int", "-2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1535", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=-2, getLocalFileDataExtra=[], getMet...#302#861284834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", "int", "31"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1535", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=31, getLocalFileDataExtra=[], getMet...#302#-1286221413", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[5, 0, 5, 0, 6, 7, 0, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[5, 0, 5, 0, 6, 7, 0, 0, 0], getExtraFields=?, getInternalAt...#359#636700350", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#295#-134831583", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#287#1935576217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[3, 0, 3, 0, 4, 5, 6], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[3, 0, 3, 0, 4, 5, 6], getExtraFields=?, getInternalAttributes=0, ...#341#432127932", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[3, 0, 3, 0, 4, 5, 6], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[3, 0, 3, 0, 4, 5, 6], getExtraFields=?, getInternalAttributes=0,...#343#-290099900", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[3, 0, 3, 0, 4, 5, 6], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[3, 0, 3, 0, 4, 5, 6], getExtraFields=?, getInternalAttributes=0,...#353#1021359570", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[3, 0, 3, 0, 4, 5, 6], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[3, 0, 3, 0, 4, 5, 6], getExtraFields=?, getInternalAttributes=0,...#342#-1642958890", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#287#1935576217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#289#-1621999609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#299#-2036271595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#288#649409011", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#301#-1794577591", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", "byte[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#285#-420130636", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#301#-1794577591", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ge...#311#301624769", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#287#1935576217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#289#-1621999609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#299#-2036271595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#288#649409011", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false), new String[][]{{"getComment", "", "4"}, {"isDirectory", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#287#1935576217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getComment", "", "4"}, {"isDirectory", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#299#-2036271595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getComment", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#299#-2036271595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getComment", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#288#649409011", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getComment", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#301#-1794577591", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getComment", "", "4"}, {"setLastAccessTime", "java.nio.file.attribute.FileTime", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#299#1638994724", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#301#-1794577591", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getComment", "", "4"}, {"setLastAccessTime", "java.nio.file.attribute.FileTime", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMe...#297#-307324684", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#299#51668889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"getComment", "", "4"}, {"setLastAccessTime", "java.nio.file.attribute.FileTime", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#286#-545732146", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#288#649409011", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#296#-1511017893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", new String[]{"int"}, new String[]{"8"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#287#-1552095343", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", new String[]{"int"}, new String[]{"75"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#288#1620821865", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=0, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#288#649409011", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Oct 03 05:46:15 PDT 2026 {getDate=3, getDay=6, getHours=5, getMinutes=46, getMonth=9, getSeconds=15, getTime=1791031575842, getTimezoneOffset=420, getYear=126}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#301#-1794577591", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Oct 03 05:46:15 PDT 2026 {getDate=3, getDay=6, getHours=5, getMinutes=46, getMonth=9, getSeconds=15, getTime=1791031575842, getTimezoneOffset=420, getYear=126}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ge...#311#301624769", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 15:59:59 PST 1969 {getDate=31, getDay=3, getHours=15, getMinutes=59, getMonth=11, getSeconds=59, getTime=-1, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#287#1935576217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Oct 03 05:46:15 PDT 2026 {getDate=3, getDay=6, getHours=5, getMinutes=46, getMonth=9, getSeconds=15, getTime=1791031575842, getTimezoneOffset=420, getYear=126}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#299#-2036271595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=!ArrayIndexOutOfBoundsException, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=?, getInternalAttributes=0, getLoca...#315#330272259", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=!ArrayIndexOutOfBoundsException, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=?, getInternalAttributes=0, getLoc...#317#1539064797", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:4>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLocalFil...#325#-710343876", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "<sample:0>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:4>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=!ArrayIndexOutOfBoundsException, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=?, getInternalAttributes=0, getLoc...#327#-9018901", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#297#-728714534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#286#-545732146", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#299#1638994724", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isSupportedCompressionMethod", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#287#1935576217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isSupportedCompressionMethod", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#289#-1621999609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", new String[]{"int"}, new String[]{"74"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", "int", "131073"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=65537, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMe...#292#-121752812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:4>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isSupportedCompressionMethod", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#297#-728714534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<null>"}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isSupportedCompressionMethod", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", "byte[]", "<sample:0>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isSupportedCompressionMethod", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#287#574271150", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", "byte[]", "<sample:0>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:5>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isSupportedCompressionMethod", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#299#1638994724", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", "byte[]", "<empty>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#286#-545732146", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#287#1935576217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#289#-1621999609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#299#-2036271595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#288#649409011", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0/", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#301#-1794577591", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "16"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#289#1045427402", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", "int", "65536"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#302#91225388", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String"}, new String[]{"5."}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "5. {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#291#909808185", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, g...#281#1909922430", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, ...#283#-768912702", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", ""}}), new String[][]{{"setLastModifiedTime", "java.nio.file.attribute.FileTime", "0"}, {"removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1), new String[][]{{"setLastModifiedTime", "java.nio.file.attribute.FileTime", "5"}, {"removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:5>"}}, 1), new String[][]{{"setCrc", "long", "5"}, {"removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<i:-2048>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", "int", "65535"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String", "1.5d"}}, 1), new String[][]{{"setCrc", "long", "5"}, {"setSize", "long", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("1.5d {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=2, getExternalAttributes=-65520, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#311#138903131", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1.5d {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-65520, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ...#315#1488160214", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<i:-2048>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", "int", "65535"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String", "1.5d"}}, 1), new String[][]{{"setCrc", "long", "5"}, {"setSize", "long", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("1.5d {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=2, getExternalAttributes=-65536, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#300#262159763", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1.5d {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-65536, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ...#304#-181137010", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<i:-2048>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", "int", "65535"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String", "1.\"5d"}}, 1), new String[][]{{"setCrc", "long", "5"}, {"setSize", "long", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("1.\"5d {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=2, getExternalAttributes=-65536, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ge...#302#-1397562325", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1.\"5d {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-65536, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[],...#306#1900101332", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<i:-2048>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String", "1.\"5d"}}, 1), new String[][]{{"setCrc", "long", "5"}, {"setSize", "long", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("1.\"5d {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=2, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#293#-1184479352", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1.\"5d {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getM...#297#2052316047", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<i:-2048>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String", "1.\"5dh"}}, 1), new String[][]{{"setCrc", "long", "5"}, {"setSize", "long", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("1.\"5dh {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=2, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMet...#295#175754400", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1.\"5dh {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#299#480784729", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<i:-2048>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String", "1.\"5di"}}, 1), new String[][]{{"setCrc", "long", "5"}, {"setSize", "long", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("1.\"5di {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=2, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMet...#295#147368414", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1.\"5di {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#299#-1940449095", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<i:-2048>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String", "1.\"6di"}}, 1), new String[][]{{"setCrc", "long", "5"}, {"setSize", "long", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("1.\"6di {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=2, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMet...#295#-1361760356", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1.\"6di {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#299#-873879527", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<i:-2048>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String", "1.\"6d_i"}}, 1), new String[][]{{"setCrc", "long", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("1.\"6d_i {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=2, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMe...#298#1041854768", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1.\"6d_i {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ge...#301#-608227999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<i:-2048>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String", "1.\"6d_i"}}, 1), new String[][]{{"setCrc", "long", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("1.\"6d_i {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=2, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMe...#309#264107593", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1.\"6d_i {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ge...#312#-680828552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<i:4068>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String", "1.\"6d^i"}}, 1), new String[][]{{"setCrc", "long", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("1.\"6d^i {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=2, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMe...#309#-135912663", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1.\"6d^i {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ge...#312#-65842570", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#287#1935576217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#289#-1621999609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 12, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1535", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#301#-1794577591", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1864843205", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ge...#311#301624769", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1535", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1,...#295#151000686", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#289#-1621999609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#299#-2036271595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#288#1210108789", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "42"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("42", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#302#-499118919", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<null>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "42"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("42", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#302#-499118919", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", new String[]{"long"}, new String[]{"3"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=3, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#287#-73747146", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", new String[]{"long"}, new String[]{"4194305"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=4194305, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#293#1321256489", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:6>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, ...#293#-1651788208", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:6>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[5, 0, 5, 0, 6, 7, 0, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[5, 0, 5, 0, 6, 7, 0, 0, 0], getExtraFields=?, getInternalA...#371#-31650864", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLocalFil...#335#1149339530", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, ...#293#-1651788208", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:7>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "65536"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=65536, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=...#297#301821927", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:7>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "65536"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=65536, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=...#287#-1935899495", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", new String[]{}, new String[]{}, false), new String[][]{{"getHours", "", "0"}, {"getMinutes", "", "5"}, {"setDate", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Dec 04 15:59:59 PST 1969 {getDate=4, getDay=4, getHours=15, getMinutes=59, getMonth=11, getSeconds=59, getTime=-2332800001, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#287#1935576217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getHours", "", "0"}, {"getMinutes", "", "5"}, {"setDate", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Dec 04 15:59:59 PST 1969 {getDate=4, getDay=4, getHours=15, getMinutes=59, getMonth=11, getSeconds=59, getTime=-2332800001, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#289#-1621999609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:1>"}}), new String[][]{{"getHours", "", "0"}, {"getMinutes", "", "5"}, {"setDate", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Oct 04 05:46:15 PDT 2026 {getDate=4, getDay=0, getHours=5, getMinutes=46, getMonth=9, getSeconds=15, getTime=1791117975842, getTimezoneOffset=420, getYear=126}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#299#-2036271595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isSupportedCompressionMethod", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#285#-420130636", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isSupportedCompressionMethod", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#287#273042252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isSupportedCompressionMethod", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#297#-728714534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:6>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -54, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLocalFile...#323#665106116", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:7>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[5, 0, 5, 0, 6, 7, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[5, 0, 5, 0, 6, 7, 0, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[5, 0, 5, 0, 6, 7, 0, 0, 0], getExtraFields=?, getInternalA...#361#1179654786", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:6>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -54, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLocalFi...#337#-422170508", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:6>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -54, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLocalFile...#323#665106116", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:6>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -54, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLoc...#335#1905193604", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:6>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -54, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLocalFil...#324#1607452830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:6>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<d:1.495>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -54, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample/ {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLo...#347#-1451769738", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:7>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<d:1.495>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[5, 0, 5, 0, 6, 7, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[5, 0, 5, 0, 6, 7, 0, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[5, 0, 5, 0, 6, 7, 0, 0, 0], getExtraFields=?, getInternal...#373#1704123630", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:5>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<d:1.495>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[3, 0, 3, 0, 4, 5, 6]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[3, 0, 3, 0, 4, 5, 6], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[3, 0, 3, 0, 4, 5, 6], getExtraFields=?, getInternalAttributes=0...#355#-1274601684", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "16"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", "int", "-2046"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#285#-420130636", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -54, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLocalFil...#325#-1396471330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isSupportedCompressionMethod", ""}}), new String[][]{{"getLocalFileDataExtra", "", "7"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ge...#311#301624769", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isSupportedCompressionMethod", ""}}, 3), new String[][]{{"getLastAccessTime", "", "7"}, {"setComment", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals(" {getCentralDirectoryExtra=[], getComment=a, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-1, ...#282#-1405037034", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#287#1935576217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isSupportedCompressionMethod", ""}}, 3), new String[][]{{"getLastAccessTime", "", "7"}, {"setComment", "java.lang.String", "1"}, {"getCompressedSize", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#287#1935576217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isSupportedCompressionMethod", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isSupportedCompressionMethod", ""}}, 3), new String[][]{{"getLastAccessTime", "", "7"}, {"setComment", "java.lang.String", "1"}, {"getCompressedSize", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#289#-1031058647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isSupportedCompressionMethod", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isSupportedCompressionMethod", ""}}, 3), new String[][]{{"getLastAccessTime", "", "7"}, {"setComment", "java.lang.String", "1"}, {"getCompressedSize", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ge...#311#301624769", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isSupportedCompressionMethod", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isSupportedCompressionMethod", ""}}, 3), new String[][]{{"getLastAccessTime", "", "7"}, {"setComment", "java.lang.String", "1"}, {"getCompressedSize", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#299#-2036271595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isSupportedCompressionMethod", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isSupportedCompressionMethod", ""}}, 3), new String[][]{{"getLastAccessTime", "", "7"}, {"setComment", "java.lang.String", "1"}, {"getCompressedSize", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#288#649409011", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", new String[]{"int"}, new String[]{"131073"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=131073, getLocalFileDataExtra=[], getM...#292#-2136759284", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=-2147483648, getLocalFileDataExtra=[],...#297#1700592963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Hello, World {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[...#311#-1054742375", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String"}, new String[]{"Hello, World1.12345678901234567"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Hello, World1.12345678901234567 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getL...#349#1803793607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String"}, new String[]{"Hello, World1/12345678901234567"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Hello, World1/12345678901234567 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getL...#349#396610053", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String"}, new String[]{"Hello, Wold1/12345678902234567"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Hello, Wold1/12345678902234567 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLo...#347#872344857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String"}, new String[]{"Hello, Wold1/12345678901234567"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Hello, Wold1/12345678901234567 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLo...#347#669088441", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "74"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<i:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#288#1519909898", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "-2147483648"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#297#-2092443345", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", "byte[]", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "65535"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=65535, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLoca...#329#1734693812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "-9223372036854775808"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-9223372036854775808, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttrib...#344#-354730812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, g...#281#1909922430", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[3, 0, 3, 0, 4, 5, 6], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[3, 0, 3, 0, 4, 5, 6], getExtraFields=?, getInternalAttributes=0, ...#341#432127932", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLocalFile...#323#665106116", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:7>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[5, 0, 5, 0, 6, 7, 0, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[5, 0, 5, 0, 6, 7, 0, 0, 0], getExtraFields=?, getInternalAt...#359#636700350", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLocalFil...#325#-710343876", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", new String[]{"int"}, new String[]{"4"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=262145, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getM...#292#-614730086", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", new String[]{"int"}, new String[]{"12"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=786433, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getM...#293#-1223977338", SearchInputFactory_scaffolding.receiverState());
 }
}
