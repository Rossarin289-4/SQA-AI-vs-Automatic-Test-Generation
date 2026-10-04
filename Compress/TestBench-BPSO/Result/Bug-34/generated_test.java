package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:2>", "-1000", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 30837 {getBytes=[117, 120], getValue=30837}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=0 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 1, 0, 2, -24, 3], getUID=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-2"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}}), new String[][]{{"getBytes", "", "4"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[9, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4294967294 {getCentralDirectoryData=[], getGID=4294967294, getLocalFileDataData=[1, 2, -24, 3, 4, -2, -1, -1, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", ""}}, 3), new String[][]{{"setUID", "long", "2"}, {"parseFromLocalFileData", "byte[],int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=1000 GID=1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.X7875_NewUnix", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-66770287", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[127]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"2002"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<b:true>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=2002 {getCentralDirectoryData=[], getGID=2002, getLocalFileDataData=[1, 2, -24, 3, 2, -46, 7], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-66770287", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 2, -24, 3, 2, -24, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"-9205357638345293824"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 7 {getBytes=[7, 0], getValue=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"-8202"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:3>", "10", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4294959094 {getCentralDirectoryData=[], getGID=4294959094, getLocalFileDataData=[1, 2, -24, 3, 4, -10, -33, -1, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 2, -24, 3, 2, -24, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"-68721945870"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 7 {getBytes=[7, 0], getValue=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "-2147483648", "2002"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2147483646", "2147483647"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:0>", "1234566", "500"}}, 2), new String[][]{{"getValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30837", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 30837 {getBytes=[117, 120], getValue=30837}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 2, -24, 3, 2, -24, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<s:b>"}}, 2), new String[][]{{"getBytes", "", "3"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "-2", "10"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"getBytes", "", "1"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[117, 120]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-1234623"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"getBytes", "", "0"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[117, 120]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}}, 3), new String[][]{{"clone", "", "6"}, {"getBytes", "", "0"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 30837 {getBytes=[117, 120], getValue=30837}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "1073741824", "-1234568"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", ""}}, 3), new String[][]{{"getValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-2"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 4, -2, -1, -1, -1, 2, -24, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4294967294 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, -2, -1, -1, -1, 2, -24, 3], getUID=4294967294}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<null>", "-1073741824", "-975"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:6>", "2147483647", "0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-1234566"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<null>", "1000", "-2147483648"}}, 2), new String[][]{{"getBytes", "", "1"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[7, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 0 {getBytes=[0, 0], getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"999"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=999 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -25, 3, 2, -24, 3], getUID=999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-1"}}, 2), new String[][]{{"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 30837 {getBytes=[117, 120], getValue=30837}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4294967295 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, -1, -1, -1, -1, 2, -24, 3], getUID=4294967295}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:242>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", ""}}, 3), new String[][]{{"clone", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 0 {getBytes=[0, 0], getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<d:0.375>"}}, 2), new String[][]{{"clone", "", "6"}, {"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 0 {getBytes=[0, 0], getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"getUID", "", "7"}, {"getCentralDirectoryLength", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 0 {getBytes=[0, 0], getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<empty>", "-2147483648", "2147483647"}}, 1), new String[][]{{"getBytes", "", "1"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[117, 120]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-25"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4294967271 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, -25, -1, -1, -1, 2, -24, 3], getUID=4294967271}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:da>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "9223372036854775807"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=9223372036854775807 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 8, -1, -1, -1, -1, -1, -1, -1, 127, 2, -24, 3], getUID=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-16384"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4294950912", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4294950912 {getCentralDirectoryData=[], getGID=4294950912, getLocalFileDataData=[1, 2, -24, 3, 4, 0, -64, -1, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"-2"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4294967294 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, -2, -1, -1, -1, 2, -24, 3], getUID=4294967294}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"743"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=743 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -25, 2, 2, -24, 3], getUID=743}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", ""}}, 1), new String[][]{{"getBytes", "", "5"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[7, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", ""}}, 1), new String[][]{{"getValue", "", "6"}, {"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 7 {getBytes=[7, 0], getValue=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", ""}}, 2), new String[][]{{"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "70368744178663"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("70368744178663", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=70368744178663 {getCentralDirectoryData=[], getGID=70368744178663, getLocalFileDataData=[1, 2, -24, 3, 6, -25, 3, 0, 0, 0, 64], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"0"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<sample:1>", "2147483647", "-33769"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=0 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 1, 0, 2, -24, 3], getUID=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "1052", "1073742823"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "53"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<i:2>"}}, 3), new String[][]{{"setGID", "long", "2"}, {"getLocalFileDataLength", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 6 {getBytes=[6, 0], getValue=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=53 {getCentralDirectoryData=[], getGID=53, getLocalFileDataData=[1, 2, -24, 3, 1, 53], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:aa>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-1234566"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4293732730 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 122, 41, -19, -1, 2, -24, 3], getUID=4293732730}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"-4194301"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4290772995 {getCentralDirectoryData=[], getGID=4290772995, getLocalFileDataData=[1, 2, -24, 3, 4, 3, 0, -64, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<s:a@>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getLocalFileDataLength", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 7 {getBytes=[7, 0], getValue=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"549755814836"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=549755814836 {getCentralDirectoryData=[], getGID=549755814836, getLocalFileDataData=[1, 2, -24, 3, 5, -76, 3, 0, 0, -128], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<sample:0>", "-2256", "4"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-1234567"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4293732729 {getCentralDirectoryData=[], getGID=4293732729, getLocalFileDataData=[1, 2, -24, 3, 4, 121, 41, -19, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"81"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=81 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 1, 81, 2, -24, 3], getUID=81}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=0 {getCentralDirectoryData=[], getGID=0, getLocalFileDataData=[1, 2, -24, 3, 1, 0], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "500"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", ""}}, 1), new String[][]{{"getValue", "", "2"}, {"getBytes", "", "1"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[117, 120]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=500 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -12, 1, 2, -24, 3], getUID=500}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<sample:2>", "999", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-66770287", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "1234568"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1234568 {getCentralDirectoryData=[], getGID=1234568, getLocalFileDataData=[1, 2, -24, 3, 3, -120, -42, 18], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"-617283"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4294350013 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, -67, -108, -10, -1, 2, -24, 3], getUID=4294350013}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:110>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 2, -24, 3, 2, -24, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 0 {getBytes=[0, 0], getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-66770287", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 7 {getBytes=[7, 0], getValue=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", ""}}), new String[][]{{"clone", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.X7875_NewUnix", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"-32768"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-2"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "4194303"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4294934528 GID=4294967294 {getCentralDirectoryData=[], getGID=4294967294, getLocalFileDataData=[1, 4, 0, -128, -1, -1, 4, -2, -1, -1, -1], getUID=4294934528}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<sample:2>", "-39", "-17"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 2, -24, 3, 2, -24, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"-72057594039162503"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "1234568"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=1000 GID=1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2147483647", "-2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "-1048639", "-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "2", "-1073740878"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "36028797018963970"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=36028797018963970 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 7, 2, 0, 0, 0, 0, 0, -128, 2, -24, 3], getUID=36028797018963970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<d:1.5>"}}), new String[][]{{"getBytes", "", "3"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[7, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<i:-262144>"}}), new String[][]{{"getValue", "", "7"}, {"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:0>", "-45", "-2147483648"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}}), new String[][]{{"getCentralDirectoryLength", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 0 {getBytes=[0, 0], getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<s:neyW>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", ""}}), new String[][]{{"getBytes", "", "1"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=9223372036854775807 {getCentralDirectoryData=[], getGID=9223372036854775807, getLocalFileDataData=[1, 2, -24, 3, 8, -1, -1, -1, -1, -1, -1, -1, 127], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-65648"}}), new String[][]{{"getCentralDirectoryLength", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 0 {getBytes=[0, 0], getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4294901648 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, -112, -1, -2, -1, 2, -24, 3], getUID=4294901648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}}), new String[][]{{"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30837", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-2469136"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 2, -24, 3, 4, -16, 82, -38, -1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4292498160 {getCentralDirectoryData=[], getGID=4292498160, getLocalFileDataData=[1, 2, -24, 3, 4, -16, 82, -38, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[127]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"-32768"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4294934528 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 0, -128, -1, -1, 2, -24, 3], getUID=4294934528}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-1234568"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=0 GID=4293732728 {getCentralDirectoryData=[], getGID=4293732728, getLocalFileDataData=[1, 1, 0, 4, 120, 41, -19, -1], getUID=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"-41"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4294967255 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, -41, -1, -1, -1, 2, -24, 3], getUID=4294967255}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-18"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4294967278 {getCentralDirectoryData=[], getGID=4294967278, getLocalFileDataData=[1, 2, -24, 3, 4, -18, -1, -1, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"-5"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4294967291 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, -5, -1, -1, -1, 2, -24, 3], getUID=4294967291}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"-4194303"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<empty>", "2147483391", "-1234567"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4290772993 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 1, 0, -64, -1, 2, -24, 3], getUID=4290772993}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "1001"}}), new String[][]{{"getValue", "", "0"}, {"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 0 {getBytes=[0, 0], getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1001 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -23, 3, 2, -24, 3], getUID=1001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false), new String[][]{{"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}}), new String[][]{{"getBytes", "", "3"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[117, 120]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-2"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4294967294 {getCentralDirectoryData=[], getGID=4294967294, getLocalFileDataData=[1, 2, -24, 3, 4, -2, -1, -1, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[3, 4]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-32768"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 0 {getBytes=[0, 0], getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4294934528 {getCentralDirectoryData=[], getGID=4294934528, getLocalFileDataData=[1, 2, -24, 3, 4, 0, -128, -1, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "2147483647", "-17"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "1234567"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1234567 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 3, -121, -42, 18, 2, -24, 3], getUID=1234567}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-2469136"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4292498160 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, -16, 82, -38, -1, 2, -24, 3], getUID=4292498160}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "4194303"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}}), new String[][]{{"parseFromCentralDirectoryData", "byte[],int,int", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.X7875_NewUnix", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=1000 GID=4194303 {getCentralDirectoryData=[], getGID=4194303, getLocalFileDataData=[1, 2, -24, 3, 3, -1, -1, 63], getUID=1000}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4194303 {getCentralDirectoryData=[], getGID=4194303, getLocalFileDataData=[1, 2, -24, 3, 3, -1, -1, 63], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-1234567"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 9 {getBytes=[9, 0], getValue=9}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4293732729 {getCentralDirectoryData=[], getGID=4293732729, getLocalFileDataData=[1, 2, -24, 3, 4, 121, 41, -19, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "999"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=999 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -25, 3, 2, -24, 3], getUID=999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "9223372036854775807"}}), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=9223372036854775807 {getCentralDirectoryData=[], getGID=9223372036854775807, getLocalFileDataData=[1, 2, -24, 3, 8, -1, -1, -1, -1, -1, -1, -1, 127], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[127, 2, 3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-2"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4294967294 {getCentralDirectoryData=[], getGID=4294967294, getLocalFileDataData=[1, 2, -24, 3, 4, -2, -1, -1, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-9223372036854775808"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "1034"}}), new String[][]{{"getBytes", "", "3"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1034 {getCentralDirectoryData=[], getGID=1034, getLocalFileDataData=[1, 2, -24, 3, 2, 10, 4], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", ""}}), new String[][]{{"parseFromCentralDirectoryData", "byte[],int,int", "0"}, {"getLocalFileDataData", "", "0"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 2, -24, 3, 2, -24, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[4, 5, 6]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"-1234597"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4293732699 {getCentralDirectoryData=[], getGID=4293732699, getLocalFileDataData=[1, 2, -24, 3, 4, 91, 41, -19, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "0"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 1, 0, 2, -24, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=0 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 1, 0, 2, -24, 3], getUID=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4294967295 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, -1, -1, -1, -1, 2, -24, 3], getUID=4294967295}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"-57"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4294967239 {getCentralDirectoryData=[], getGID=4294967239, getLocalFileDataData=[1, 2, -24, 3, 4, -57, -1, -1, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<empty>", "-1234568", "-78"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-1234564"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("65536005", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4293732732 {getCentralDirectoryData=[], getGID=4293732732, getLocalFileDataData=[1, 2, -24, 3, 4, 124, 41, -19, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "2"}}), new String[][]{{"getBytes", "", "7"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[6, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=2 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 1, 2, 2, -24, 3], getUID=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-1234566"}}), new String[][]{{"getHeaderId", "", "2"}, {"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 30837 {getBytes=[117, 120], getValue=30837}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4293732730 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 122, 41, -19, -1, 2, -24, 3], getUID=4293732730}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"45"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "999"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=999 GID=45 {getCentralDirectoryData=[], getGID=45, getLocalFileDataData=[1, 2, -25, 3, 1, 45], getUID=999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"1099510393209"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1099510393209 {getCentralDirectoryData=[], getGID=1099510393209, getLocalFileDataData=[1, 2, -24, 3, 5, 121, 41, -19, -1, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false), new String[][]{{"getCentralDirectoryData", "", "4"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "0"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 2, -24, 3, 1, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=0 {getCentralDirectoryData=[], getGID=0, getLocalFileDataData=[1, 2, -24, 3, 1, 0], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "1"}}), new String[][]{{"getBytes", "", "7"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[6, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 1, 1, 2, -24, 3], getUID=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "997"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-66770276", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=997 {getCentralDirectoryData=[], getGID=997, getLocalFileDataData=[1, 2, -24, 3, 2, -27, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-1234568"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", ""}}), new String[][]{{"getBytes", "", "6"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[117, 120]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4293732728 {getCentralDirectoryData=[], getGID=4293732728, getLocalFileDataData=[1, 2, -24, 3, 4, 120, 41, -19, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "2098153"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 8 {getBytes=[8, 0], getValue=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=2098153 {getCentralDirectoryData=[], getGID=2098153, getLocalFileDataData=[1, 2, -24, 3, 3, -23, 3, 32], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "4194303"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4194303", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4194303 {getCentralDirectoryData=[], getGID=4194303, getLocalFileDataData=[1, 2, -24, 3, 3, -1, -1, 63], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "2028"}}), new String[][]{{"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 7 {getBytes=[7, 0], getValue=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=2028 {getCentralDirectoryData=[], getGID=2028, getLocalFileDataData=[1, 2, -24, 3, 2, -20, 7], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-1234521"}}), new String[][]{{"getBytes", "", "4"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[117, 120]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4293732775 {getCentralDirectoryData=[], getGID=4293732775, getLocalFileDataData=[1, 2, -24, 3, 4, -89, 41, -19, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-1"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 4, -1, -1, -1, -1, 2, -24, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4294967295 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, -1, -1, -1, -1, 2, -24, 3], getUID=4294967295}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-28672"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<i:110>"}}), new String[][]{{"clone", "", "6"}, {"getValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4294938624 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 0, -112, -1, -1, 2, -24, 3], getUID=4294938624}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "999"}}), new String[][]{{"getValue", "", "5"}, {"getBytes", "", "7"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[117, 120]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=999 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -25, 3, 2, -24, 3], getUID=999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"parseFromLocalFileData", "byte[],int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "47"}}), new String[][]{{"getUID", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("47", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=47 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 1, 47, 2, -24, 3], getUID=47}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<sample:2>", "-2147483648", "127"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "4194303"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-63252858", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4194303 {getCentralDirectoryData=[], getGID=4194303, getLocalFileDataData=[1, 2, -24, 3, 3, -1, -1, 63], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-32768"}}), new String[][]{{"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30837", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4294934528 {getCentralDirectoryData=[], getGID=4294934528, getLocalFileDataData=[1, 2, -24, 3, 4, 0, -128, -1, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-617283"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("66305476", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4294350013 {getCentralDirectoryData=[], getGID=4294350013, getLocalFileDataData=[1, 2, -24, 3, 4, -67, -108, -10, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", ""}}), new String[][]{{"getCentralDirectoryLength", "", "7"}, {"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"clone", "", "6"}, {"getGID", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "140737492549631"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2146293026", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=140737492549631 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 6, -1, -1, 63, 0, 0, -128, 2, -24, 3], getUID=140737492549631}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-1234568", "1001"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", ""}}, 1), new String[][]{{"getBytes", "", "2"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4294967287", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4294967287 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, -9, -1, -1, -1, 2, -24, 3], getUID=4294967287}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-1234605"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("65536042", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4293732691 {getCentralDirectoryData=[], getGID=4293732691, getLocalFileDataData=[1, 2, -24, 3, 4, 83, 41, -19, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=1000 GID=1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-617284"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4294350012", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4294350012 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, -68, -108, -10, -1, 2, -24, 3], getUID=4294350012}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[127, 2, 3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<null>", "-65536", "2"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=1000 GID=1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "0"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:0>", "-999", "-1000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1234287", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=0 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 1, 0, 2, -24, 3], getUID=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", ""}}, 1), new String[][]{{"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-2469117"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=4292498179 GID=1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4292498179 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 3, 83, -38, -1, 2, -24, 3], getUID=4292498179}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-1234573"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4293732723 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 115, 41, -19, -1, 2, -24, 3], getUID=4293732723}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-2469132"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 4, -12, 82, -38, -1, 2, -24, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4292498164 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, -12, 82, -38, -1, 2, -24, 3], getUID=4292498164}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"-1234581"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4293732715 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 107, 41, -19, -1, 2, -24, 3], getUID=4293732715}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-20"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 30837 {getBytes=[117, 120], getValue=30837}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4294967276 {getCentralDirectoryData=[], getGID=4294967276, getLocalFileDataData=[1, 2, -24, 3, 4, -20, -1, -1, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "18"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 6 {getBytes=[6, 0], getValue=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=18 {getCentralDirectoryData=[], getGID=18, getLocalFileDataData=[1, 2, -24, 3, 1, 18], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"2548"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<sample:1>", "-2147483648", "-1234563"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=2548 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -12, 9, 2, -24, 3], getUID=2548}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:2>", "2147483647", "-17"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "945"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-66770232", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=945 {getCentralDirectoryData=[], getGID=945, getLocalFileDataData=[1, 2, -24, 3, 2, -79, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"-1234567"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:2>", "-2147483648", "2147483647"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-38"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4293732729 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 121, 41, -19, -1, 2, -24, 3], getUID=4293732729}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "-1234524", "1001"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "64"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=64 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 1, 64, 2, -24, 3], getUID=64}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "2000"}}, 3), new String[][]{{"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 30837 {getBytes=[117, 120], getValue=30837}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=2000 {getCentralDirectoryData=[], getGID=2000, getLocalFileDataData=[1, 2, -24, 3, 2, -48, 7], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"1000"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "2147483649"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=2147483649 {getCentralDirectoryData=[], getGID=2147483649, getLocalFileDataData=[1, 2, -24, 3, 4, 1, 0, 0, -128], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-617283"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 4, -67, -108, -10, -1, 2, -24, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4294350013 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, -67, -108, -10, -1, 2, -24, 3], getUID=4294350013}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "500"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=500 GID=1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=500 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -12, 1, 2, -24, 3], getUID=500}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "9223372036854775807"}}), new String[][]{{"getBytes", "", "0"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[13, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=9223372036854775807 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 8, -1, -1, -1, -1, -1, -1, -1, 127, 2, -24, 3], getUID=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"2000"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=2000 {getCentralDirectoryData=[], getGID=2000, getLocalFileDataData=[1, 2, -24, 3, 2, -48, 7], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "1001"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 2, -24, 3, 2, -23, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1001 {getCentralDirectoryData=[], getGID=1001, getLocalFileDataData=[1, 2, -24, 3, 2, -23, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"2199023256556"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-24"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=2199023256556 {getCentralDirectoryData=[], getGID=2199023256556, getLocalFileDataData=[1, 2, -24, 3, 6, -20, 3, 0, 0, 0, 2], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"-68719476237"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "999"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 30837 {getBytes=[117, 120], getValue=30837}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=999 {getCentralDirectoryData=[], getGID=999, getLocalFileDataData=[1, 2, -24, 3, 2, -25, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-1234566"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4293732730", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4293732730 GID=1 {getCentralDirectoryData=[], getGID=1, getLocalFileDataData=[1, 4, 122, 41, -19, -1, 1, 1], getUID=4293732730}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"8192"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "1001"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=8192 GID=1001 {getCentralDirectoryData=[], getGID=1001, getLocalFileDataData=[1, 2, 0, 32, 2, -23, 3], getUID=8192}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "274877905944"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-61592943", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=274877905944 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 5, 24, -4, -1, -1, 63, 2, -24, 3], getUID=274877905944}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-42", "1000"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<sample:0>", "0", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 30837 {getBytes=[117, 120], getValue=30837}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[-1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-34359738368"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "0"}}, 1), new String[][]{{"getBytes", "", "7"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[6, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=0 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 1, 0, 2, -24, 3], getUID=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-65536"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=1000 GID=4294901760", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4294901760 {getCentralDirectoryData=[], getGID=4294901760, getLocalFileDataData=[1, 2, -24, 3, 4, 0, 0, -1, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"4194303"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4194303 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 3, -1, -1, 63, 2, -24, 3], getUID=4194303}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-13"}}, 3), new String[][]{{"clone", "", "3"}, {"getBytes", "", "1"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4294967283 {getCentralDirectoryData=[], getGID=4294967283, getLocalFileDataData=[1, 2, -24, 3, 4, -13, -1, -1, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-9", "2147483647"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[127]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}}, 1), new String[][]{{"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-1"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4294967295 {getCentralDirectoryData=[], getGID=4294967295, getLocalFileDataData=[1, 2, -24, 3, 4, -1, -1, -1, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=1000 GID=0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=0 {getCentralDirectoryData=[], getGID=0, getLocalFileDataData=[1, 2, -24, 3, 1, 0], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", ""}}, 3), new String[][]{{"clone", "", "2"}, {"getBytes", "", "1"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[7, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[127, 2, 3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<empty>", "89", "-617275"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "4"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 1, 4, 2, -24, 3], getUID=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-60"}}, 2), new String[][]{{"getBytes", "", "3"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[117, 120]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4294967236 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, -60, -1, -1, -1, 2, -24, 3], getUID=4294967236}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"-32768"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4294934528 {getCentralDirectoryData=[], getGID=4294934528, getLocalFileDataData=[1, 2, -24, 3, 4, 0, -128, -1, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"4611721202799476735"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4611721202799476735 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 8, -1, -1, -1, -1, -1, 31, 0, 64, 2, -24, 3], getUID=4611721202799476735}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "9223372036854775807"}}, 1), new String[][]{{"clone", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 0 {getBytes=[0, 0], getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=9223372036854775807 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 8, -1, -1, -1, -1, -1, -1, -1, 127, 2, -24, 3], getUID=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1 {getCentralDirectoryData=[], getGID=1, getLocalFileDataData=[1, 2, -24, 3, 1, 1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "2"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-25"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4294967271", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4294967271 GID=2 {getCentralDirectoryData=[], getGID=2, getLocalFileDataData=[1, 4, -25, -1, -1, -1, 1, 2], getUID=4294967271}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[127, 2, 3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "66"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-5297519", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=66 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 1, 66, 2, -24, 3], getUID=66}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-1234566"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("65536003", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4293732730 {getCentralDirectoryData=[], getGID=4293732730, getLocalFileDataData=[1, 2, -24, 3, 4, 122, 41, -19, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=9223372036854775807 {getCentralDirectoryData=[], getGID=9223372036854775807, getLocalFileDataData=[1, 2, -24, 3, 8, -1, -1, -1, -1, -1, -1, -1, 127], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<null>"}}, 1), new String[][]{{"getCentralDirectoryData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"-9223372036854775807"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-250", "4"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<sample:0>", "-1234568", "936"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-7"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 9 {getBytes=[9, 0], getValue=9}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4294967289 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, -7, -1, -1, -1, 2, -24, 3], getUID=4294967289}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-1"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1234286", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4294967295 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, -1, -1, -1, -1, 2, -24, 3], getUID=4294967295}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"1"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1 {getCentralDirectoryData=[], getGID=1, getLocalFileDataData=[1, 2, -24, 3, 1, 1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "1"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}}), new String[][]{{"getLocalFileDataLength", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 6 {getBytes=[6, 0], getValue=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 1, 1, 2, -24, 3], getUID=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-32766"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4294934530 {getCentralDirectoryData=[], getGID=4294934530, getLocalFileDataData=[1, 2, -24, 3, 4, 2, -128, -1, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2147483647", "2147483647"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-1234566"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4293732730 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 122, 41, -19, -1, 2, -24, 3], getUID=4293732730}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<sample:1>", "500", "-40"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-32768"}}, 1), new String[][]{{"clone", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 30837 {getBytes=[117, 120], getValue=30837}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4294934528 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 0, -128, -1, -1, 2, -24, 3], getUID=4294934528}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:1>", "2147483647", "0"}}, 1), new String[][]{{"getUID", "", "1"}, {"getLocalFileDataLength", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 7 {getBytes=[7, 0], getValue=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", ""}}, 1), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30837", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-617283"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4294350013 {getCentralDirectoryData=[], getGID=4294350013, getLocalFileDataData=[1, 2, -24, 3, 4, -67, -108, -10, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "1234566"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("694889091", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1234566 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 3, -122, -42, 18, 2, -24, 3], getUID=1234566}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"-1234566"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4293732730 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 122, 41, -19, -1, 2, -24, 3], getUID=4293732730}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "9223372036854775807"}}, 2), new String[][]{{"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=9223372036854775807 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 8, -1, -1, -1, -1, -1, -1, -1, 127, 2, -24, 3], getUID=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "1099511628776"}}, 3), new String[][]{{"getBytes", "", "3"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[117, 120]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1099511628776 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 6, -24, 3, 0, 0, 0, 1, 2, -24, 3], getUID=1099511628776}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-1234567"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 4, 121, 41, -19, -1, 2, -24, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4293732729 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 121, 41, -19, -1, 2, -24, 3], getUID=4293732729}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 0 {getBytes=[0, 0], getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=0 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 1, 0, 2, -24, 3], getUID=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"-4"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4294967292 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, -4, -1, -1, -1, 2, -24, 3], getUID=4294967292}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "16777214"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-50669945", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=16777214 {getCentralDirectoryData=[], getGID=16777214, getLocalFileDataData=[1, 2, -24, 3, 3, -2, -1, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "9223372036854775807"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=9223372036854775807 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 8, -1, -1, -1, -1, -1, -1, -1, 127, 2, -24, 3], getUID=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-617305"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1800066407", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4294349991 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, -89, -108, -10, -1, 2, -24, 3], getUID=4294349991}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "1"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=1000 GID=1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1 {getCentralDirectoryData=[], getGID=1, getLocalFileDataData=[1, 2, -24, 3, 1, 1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"9007199254740998"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=9007199254740998 {getCentralDirectoryData=[], getGID=9007199254740998, getLocalFileDataData=[1, 2, -24, 3, 7, 6, 0, 0, 0, 0, 0, 32], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "999"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-66770274", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=999 {getCentralDirectoryData=[], getGID=999, getLocalFileDataData=[1, 2, -24, 3, 2, -25, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}}, 3), new String[][]{{"setUID", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "4193331"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 2, -24, 3, 3, 51, -4, 63]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4193331 {getCentralDirectoryData=[], getGID=4193331, getLocalFileDataData=[1, 2, -24, 3, 3, 51, -4, 63], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "2199023222744"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1112855918", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=2199023222744 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 6, -40, 127, -1, -1, -1, 1, 2, -24, 3], getUID=2199023222744}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "1234552"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=1000 GID=1234552", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1234552 {getCentralDirectoryData=[], getGID=1234552, getLocalFileDataData=[1, 2, -24, 3, 3, 120, -42, 18], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.X7875_NewUnix", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-1235605"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-628697732", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4293731691 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 107, 37, -19, -1, 2, -24, 3], getUID=4293731691}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[127]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "1"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-66770568", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1 {getCentralDirectoryData=[], getGID=1, getLocalFileDataData=[1, 2, -24, 3, 1, 1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", ""}}, 3), new String[][]{{"getUID", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "7"}}), new String[][]{{"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=7 {getCentralDirectoryData=[], getGID=7, getLocalFileDataData=[1, 2, -24, 3, 1, 7], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "70368742943081"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("70368742943081", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=70368742943081 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 6, 105, 41, -19, -1, -1, 63, 2, -24, 3], getUID=70368742943081}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", ""}}, 1), new String[][]{{"getGID", "", "3"}, {"parseFromCentralDirectoryData", "byte[],int,int", "6"}, {"parseFromLocalFileData", "byte[],int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1 {getCentralDirectoryData=[], getGID=1, getLocalFileDataData=[1, 2, -24, 3, 1, 1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"-1234505"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "4194303"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4293732791 {getCentralDirectoryData=[], getGID=4293732791, getLocalFileDataData=[1, 2, -24, 3, 4, -73, 41, -19, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "1000", "1"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "1"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1 {getCentralDirectoryData=[], getGID=1, getLocalFileDataData=[1, 2, -24, 3, 1, 1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-1"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 9 {getBytes=[9, 0], getValue=9}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4294967295 {getCentralDirectoryData=[], getGID=4294967295, getLocalFileDataData=[1, 2, -24, 3, 4, -1, -1, -1, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.X7875_NewUnix", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-2"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 0 {getBytes=[0, 0], getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4294967294 {getCentralDirectoryData=[], getGID=4294967294, getLocalFileDataData=[1, 2, -24, 3, 4, -2, -1, -1, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "9192"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9192", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=9192 {getCentralDirectoryData=[], getGID=9192, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 35], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:2>", "0", "-617283"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 4, -1, -1, -1, -1, 2, -24, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4294967295 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, -1, -1, -1, -1, 2, -24, 3], getUID=4294967295}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "9223372036854775807"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=9223372036854775807 {getCentralDirectoryData=[], getGID=9223372036854775807, getLocalFileDataData=[1, 2, -24, 3, 8, -1, -1, -1, -1, -1, -1, -1, 127], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[3, 4]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "998"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=998 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -26, 3, 2, -24, 3], getUID=998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"-55"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-9223372036854774784"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4294967241 {getCentralDirectoryData=[], getGID=4294967241, getLocalFileDataData=[1, 2, -24, 3, 4, -55, -1, -1, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "4194293"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 3, -11, -1, 63, 2, -24, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4194293 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 3, -11, -1, 63, 2, -24, 3], getUID=4194293}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "281474976710655"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("281474976710655", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=281474976710655 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 6, -1, -1, -1, -1, -1, -1, 2, -24, 3], getUID=281474976710655}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<sample:3>", "-2147483648", "-2147483648"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-1234580"}}, 1), new String[][]{{"clone", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 9 {getBytes=[9, 0], getValue=9}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4293732716 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 108, 41, -19, -1, 2, -24, 3], getUID=4293732716}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-51"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4294967245 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, -51, -1, -1, -1, 2, -24, 3], getUID=4294967245}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"-1234566"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4293732730 {getCentralDirectoryData=[], getGID=4293732730, getLocalFileDataData=[1, 2, -24, 3, 4, 122, 41, -19, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-41"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=4294967255 GID=1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4294967255 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, -41, -1, -1, -1, 2, -24, 3], getUID=4294967255}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}}, 3), new String[][]{{"getCentralDirectoryLength", "", "0"}, {"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-60"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4294967236 {getCentralDirectoryData=[], getGID=4294967236, getLocalFileDataData=[1, 2, -24, 3, 4, -60, -1, -1, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-66770568", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1 {getCentralDirectoryData=[], getGID=1, getLocalFileDataData=[1, 2, -24, 3, 1, 1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:0>", "0", "0"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "981"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 2, -24, 3, 2, -43, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=981 {getCentralDirectoryData=[], getGID=981, getLocalFileDataData=[1, 2, -24, 3, 2, -43, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "262144"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", ""}}, 1), new String[][]{{"getValue", "", "2"}, {"getBytes", "", "1"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=262144 {getCentralDirectoryData=[], getGID=262144, getLocalFileDataData=[1, 2, -24, 3, 3, 0, 0, 4], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "35150012350478"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-66652561", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=35150012350478 {getCentralDirectoryData=[], getGID=35150012350478, getLocalFileDataData=[1, 2, -24, 3, 6, 14, 0, 0, 0, -8, 31], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "499"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 2, -13, 1, 2, -24, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=499 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -13, 1, 2, -24, 3], getUID=499}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"2"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=2 {getCentralDirectoryData=[], getGID=2, getLocalFileDataData=[1, 2, -24, 3, 1, 2], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-1234567"}}, 1), new String[][]{{"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4293732729 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 121, 41, -19, -1, 2, -24, 3], getUID=4293732729}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-710279"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 4, 121, 41, -11, -1, 2, -24, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4294257017 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 121, 41, -11, -1, 2, -24, 3], getUID=4294257017}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-2469134"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1390422709", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4292498162 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, -14, 82, -38, -1, 2, -24, 3], getUID=4292498162}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "4194303"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=4194303 GID=1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4194303 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 3, -1, -1, 63, 2, -24, 3], getUID=4194303}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "70368744177663"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-66939239", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=70368744177663 {getCentralDirectoryData=[], getGID=70368744177663, getLocalFileDataData=[1, 2, -24, 3, 6, -1, -1, -1, -1, -1, 63], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "2147483647", "0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-1234567"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4293732729 {getCentralDirectoryData=[], getGID=4293732729, getLocalFileDataData=[1, 2, -24, 3, 4, 121, 41, -19, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
}
