package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"0"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=0 {getCentralDirectoryData=[], getGID=0, getLocalFileDataData=[1, 2, -24, 3, 1, 0], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<sample:1>", "0", "2"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:2>", "10", "2147483647"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", ""}}, 1), new String[][]{{"getHeaderId", "", "7"}, {"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30837", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[0, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-1000"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-1234567"}}, 3), new String[][]{{"getBytes", "", "4"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[11, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4294966296 GID=4293732729 {getCentralDirectoryData=[], getGID=4293732729, getLocalFileDataData=[1, 4, 24, -4, -1, -1, 4, 121, 41, -19, -1], getUID=4294966296}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<sample:0>", "-1234568", "262143"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<s:key>"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}}, 3), new String[][]{{"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.X7875_NewUnix", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"9223372036854644735"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=9223372036854644735 {getCentralDirectoryData=[], getGID=9223372036854644735, getLocalFileDataData=[1, 2, -24, 3, 8, -1, -1, -3, -1, -1, -1, -1, 127], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"9223372036854644714"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=9223372036854644714 {getCentralDirectoryData=[], getGID=9223372036854644714, getLocalFileDataData=[1, 2, -24, 3, 8, -22, -1, -3, -1, -1, -1, -1, 127], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=9223372036854775807 {getCentralDirectoryData=[], getGID=9223372036854775807, getLocalFileDataData=[1, 2, -24, 3, 8, -1, -1, -1, -1, -1, -1, -1, 127], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"-46"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4294967250 {getCentralDirectoryData=[], getGID=4294967250, getLocalFileDataData=[1, 2, -24, 3, 4, -46, -1, -1, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"-1234566"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4293732730 {getCentralDirectoryData=[], getGID=4293732730, getLocalFileDataData=[1, 2, -24, 3, 4, 122, 41, -19, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"17184807208"}, false, 8, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=17184807208 {getCentralDirectoryData=[], getGID=17184807208, getLocalFileDataData=[1, 2, -24, 3, 5, 40, 89, 75, 0, 4], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"-17184807208"}, false, 8, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "-1000", "1234568"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=1000 GID=1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"-1234566"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<s:>"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4293732730 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 122, 41, -19, -1, 2, -24, 3], getUID=4293732730}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "-1", "262143"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "11", "2147483606"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-1234568"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=1000 GID=4293732728", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4293732728 {getCentralDirectoryData=[], getGID=4293732728, getLocalFileDataData=[1, 2, -24, 3, 4, 120, 41, -19, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<b:false>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 30837 {getBytes=[117, 120], getValue=30837}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}}, 1), new String[][]{{"getBytes", "", "5"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}}, 3), new String[][]{{"getCentralDirectoryData", "", "6"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "1998"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=1998 GID=1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1998 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -50, 7, 2, -24, 3], getUID=1998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-1234568"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4293732728 {getCentralDirectoryData=[], getGID=4293732728, getLocalFileDataData=[1, 2, -24, 3, 4, 120, 41, -19, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"-1234568"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4293732728 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 120, 41, -19, -1, 2, -24, 3], getUID=4293732728}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"2147483649"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=2147483649 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 1, 0, 0, -128, 2, -24, 3], getUID=2147483649}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"-8795455488029"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"1"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 1, 1, 2, -24, 3], getUID=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"-16"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4294967280 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, -16, -1, -1, -1, 2, -24, 3], getUID=4294967280}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 2, -24, 3, 2, -24, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "-1234568", "1073741823"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-1234568", "1073741823"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<empty>", "-1234568", "10"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"2"}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=2 {getCentralDirectoryData=[], getGID=2, getLocalFileDataData=[1, 2, -24, 3, 1, 2], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"1"}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1 {getCentralDirectoryData=[], getGID=1, getLocalFileDataData=[1, 2, -24, 3, 1, 1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"13"}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=13 {getCentralDirectoryData=[], getGID=13, getLocalFileDataData=[1, 2, -24, 3, 1, 13], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"14"}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=14 {getCentralDirectoryData=[], getGID=14, getLocalFileDataData=[1, 2, -24, 3, 1, 14], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"7"}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<i:0>"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=7 {getCentralDirectoryData=[], getGID=7, getLocalFileDataData=[1, 2, -24, 3, 1, 7], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-66770287", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 7 {getBytes=[7, 0], getValue=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<d:1.5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"clone", "", "0"}, {"clone", "", "5"}, {"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30837", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"1049576"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1049576 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 3, -24, 3, 16, 2, -24, 3], getUID=1049576}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"1000"}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"-1234568"}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4293732728 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 120, 41, -19, -1, 2, -24, 3], getUID=4293732728}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"-1234596"}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4293732700 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 92, 41, -19, -1, 2, -24, 3], getUID=4293732700}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"-1234566"}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4293732730 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 122, 41, -19, -1, 2, -24, 3], getUID=4293732730}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[127, 2, 3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[127]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[3, 4]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 7 {getBytes=[7, 0], getValue=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[3, 4]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[127]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[127, 2, 3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:]>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:3.0>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<sample:2>", "-1", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 2, -24, 3, 2, -24, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-1234567"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 2, -24, 3, 4, 121, 41, -19, -1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4293732729 {getCentralDirectoryData=[], getGID=4293732729, getLocalFileDataData=[1, 2, -24, 3, 4, 121, 41, -19, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-1234568"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4293732728", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4293732728 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 120, 41, -19, -1, 2, -24, 3], getUID=4293732728}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 7 {getBytes=[7, 0], getValue=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", ""}}, 3), new String[][]{{"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 18, new String[][]{}, 2), new String[][]{{"getBytes", "", "7"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[117, 120]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"setGID", "long", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.X7875_NewUnix", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=1000 GID=3 {getCentralDirectoryData=[], getGID=3, getLocalFileDataData=[1, 2, -24, 3, 1, 3], getUID=1000}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"getCentralDirectoryData", "", "4"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=1000 GID=1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "2147483606", "1"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<sample:1>", "-1", "-1234566"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"getBytes", "", "1"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[7, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 0 {getBytes=[0, 0], getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.X7875_NewUnix", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}}), new String[][]{{"getCentralDirectoryLength", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 0 {getBytes=[0, 0], getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}}), new String[][]{{"getCentralDirectoryLength", "", "5"}, {"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<sample:0>", "-1234568", "-1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.X7875_NewUnix", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<sample:0>", "-1234568", "-1"}}), new String[][]{{"setUID", "long", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.X7875_NewUnix", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=9223372036854775807 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 8, -1, -1, -1, -1, -1, -1, -1, 127, 2, -24, 3], getUID=9223372036854775807}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<sample:0>", "-1234568", "262143"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<s:key>"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.X7875_NewUnix", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<s:key>"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}}), new String[][]{{"parseFromLocalFileData", "byte[],int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<s:key>"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}}), new String[][]{{"getLocalFileDataData", "", "6"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 2, -24, 3, 2, -24, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:1>", "262143", "-1234568"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<empty>", "-34789000", "0"}}), new String[][]{{"getLocalFileDataData", "", "6"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 2, -24, 3, 2, -24, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "999", "1000"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2147483606", "1000"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"9223372036854775807"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=9223372036854775807 {getCentralDirectoryData=[], getGID=9223372036854775807, getLocalFileDataData=[1, 2, -24, 3, 8, -1, -1, -1, -1, -1, -1, -1, 127], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"9223372036854644735"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=9223372036854644735 {getCentralDirectoryData=[], getGID=9223372036854644735, getLocalFileDataData=[1, 2, -24, 3, 8, -1, -1, -3, -1, -1, -1, -1, 127], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"-1234566"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4293732730 {getCentralDirectoryData=[], getGID=4293732730, getLocalFileDataData=[1, 2, -24, 3, 4, 122, 41, -19, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"-1234506"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4293732790 {getCentralDirectoryData=[], getGID=4293732790, getLocalFileDataData=[1, 2, -24, 3, 4, -74, 41, -19, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"-4296201802"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"17184807208"}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=17184807208 {getCentralDirectoryData=[], getGID=17184807208, getLocalFileDataData=[1, 2, -24, 3, 5, 40, 89, 75, 0, 4], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:le0>"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 0 {getBytes=[0, 0], getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=1000 GID=1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"-1234567"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4293732729 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 121, 41, -19, -1, 2, -24, 3], getUID=4293732729}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"-1234597"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<s:>"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4293732699 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 91, 41, -19, -1, 2, -24, 3], getUID=4293732699}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"1000"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<s:>"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"-8591169189"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<s:>"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"1001"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<s:>"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1001 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -23, 3, 2, -24, 3], getUID=1001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"980"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<s:>"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=980 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -44, 3, 2, -24, 3], getUID=980}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 2, -24, 3, 2, -24, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "1"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 1, 1, 2, -24, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 1, 1, 2, -24, 3], getUID=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-1234568"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=1000 GID=4293732728", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4293732728 {getCentralDirectoryData=[], getGID=4293732728, getLocalFileDataData=[1, 2, -24, 3, 4, 120, 41, -19, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 30837 {getBytes=[117, 120], getValue=30837}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-1234566"}}), new String[][]{{"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 0 {getBytes=[0, 0], getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4293732730 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 122, 41, -19, -1, 2, -24, 3], getUID=4293732730}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-2469132"}}), new String[][]{{"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 0 {getBytes=[0, 0], getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4292498164 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, -12, 82, -38, -1, 2, -24, 3], getUID=4292498164}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-2469132"}}), new String[][]{{"getValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4292498164 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, -12, 82, -38, -1, 2, -24, 3], getUID=4292498164}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "999", "-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:0>", "10", "999"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}}), new String[][]{{"getBytes", "", "5"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:1>", "10", "999"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 7 {getBytes=[7, 0], getValue=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", ""}}), new String[][]{{"getBytes", "", "7"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[7, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}}), new String[][]{{"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "1001"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 2, -23, 3, 2, -24, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1001 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -23, 3, 2, -24, 3], getUID=1001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-66770287", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "999"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=999 GID=1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=999 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -25, 3, 2, -24, 3], getUID=999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "1998"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=1998 GID=1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1998 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -50, 7, 2, -24, 3], getUID=1998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false), new String[][]{{"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30837", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "1"}}), new String[][]{{"setUID", "long", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.X7875_NewUnix", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=4294967295 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, -1, -1, -1, -1, 2, -24, 3], getUID=4294967295}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 1, 1, 2, -24, 3], getUID=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "2"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=2 {getCentralDirectoryData=[], getGID=2, getLocalFileDataData=[1, 2, -24, 3, 1, 2], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-1234568", "1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[127, 2, 3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[127]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-1234566"}}), new String[][]{{"clone", "", "0"}, {"clone", "", "5"}, {"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30837", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4293732730 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 122, 41, -19, -1, 2, -24, 3], getUID=4293732730}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "1234566"}}), new String[][]{{"clone", "", "0"}, {"clone", "", "5"}, {"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30837", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1234566 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 3, -122, -42, 18, 2, -24, 3], getUID=1234566}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<sample:2>", "1", "0"}}), new String[][]{{"clone", "", "0"}, {"clone", "", "5"}, {"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30837", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[2, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<sample:4>", "1", "0"}}), new String[][]{{"clone", "", "0"}, {"clone", "", "5"}, {"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30837", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[4, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false), new String[][]{{"getBytes", "", "3"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[117, 120]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[3, 4]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[4, 5, 6]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[6, 7]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "1001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-66770288", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1001 {getCentralDirectoryData=[], getGID=1001, getLocalFileDataData=[1, 2, -24, 3, 2, -23, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-1234568"}}), new String[][]{{"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 9 {getBytes=[9, 0], getValue=9}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4293732728 {getCentralDirectoryData=[], getGID=4293732728, getLocalFileDataData=[1, 2, -24, 3, 4, 120, 41, -19, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-1234568"}}), new String[][]{{"clone", "", "1"}, {"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4293732728 {getCentralDirectoryData=[], getGID=4293732728, getLocalFileDataData=[1, 2, -24, 3, 4, 120, 41, -19, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-1234567"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 2, -24, 3, 4, 121, 41, -19, -1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4293732729 {getCentralDirectoryData=[], getGID=4293732729, getLocalFileDataData=[1, 2, -24, 3, 4, 121, 41, -19, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-1234568"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 2, -24, 3, 4, 120, 41, -19, -1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4293732728 {getCentralDirectoryData=[], getGID=4293732728, getLocalFileDataData=[1, 2, -24, 3, 4, 120, 41, -19, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", ""}}), new String[][]{{"getGID", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-1234568"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4293732728", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4293732728 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 120, 41, -19, -1, 2, -24, 3], getUID=4293732728}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "1001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1001", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1001 {getCentralDirectoryData=[], getGID=1001, getLocalFileDataData=[1, 2, -24, 3, 2, -23, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "1001"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4294967295", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4294967295 {getCentralDirectoryData=[], getGID=4294967295, getLocalFileDataData=[1, 2, -24, 3, 4, -1, -1, -1, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-1234568"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("65536001", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4293732728 {getCentralDirectoryData=[], getGID=4293732728, getLocalFileDataData=[1, 2, -24, 3, 4, 120, 41, -19, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "4503599626135928"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-36175840", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4503599626135928 {getCentralDirectoryData=[], getGID=4503599626135928, getLocalFileDataData=[1, 2, -24, 3, 7, 120, 41, -19, -1, -1, -1, 15], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false), new String[][]{{"getCentralDirectoryData", "", "7"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<empty>", "-1234567", "2147483606"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.X7875_NewUnix", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<empty>", "-1234567", "2147483606"}}, 1), new String[][]{{"getLocalFileDataData", "", "7"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 2, -24, 3, 2, -24, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<empty>", "-1234567", "2147483606"}}, 1), new String[][]{{"getLocalFileDataLength", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 7 {getBytes=[7, 0], getValue=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}}, 3), new String[][]{{"getLocalFileDataLength", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 7 {getBytes=[7, 0], getValue=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=2 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 1, 2, 2, -24, 3], getUID=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:X>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "999"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=999 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -25, 3, 2, -24, 3], getUID=999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-1234567"}}), new String[][]{{"getValue", "", "6"}, {"getBytes", "", "3"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4293732729 {getCentralDirectoryData=[], getGID=4293732729, getLocalFileDataData=[1, 2, -24, 3, 4, 121, 41, -19, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=0 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 1, 0, 2, -24, 3], getUID=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "4398046511104"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4398046511104", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4398046511104 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 6, 0, 0, 0, 0, 0, 4, 2, -24, 3], getUID=4398046511104}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-1234566"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 0 {getBytes=[0, 0], getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4293732730 {getCentralDirectoryData=[], getGID=4293732730, getLocalFileDataData=[1, 2, -24, 3, 4, 122, 41, -19, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"-2147500069"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"-1073750034"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=3221217262 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, -18, -33, -1, -65, 2, -24, 3], getUID=3221217262}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 1, 1, 2, -24, 3], getUID=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4294967295 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, -1, -1, -1, -1, 2, -24, 3], getUID=4294967295}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<sample:1>", "-2147483648", "262143"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}}, 2), new String[][]{{"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 0 {getBytes=[0, 0], getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}}, 1), new String[][]{{"getBytes", "", "3"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[117, 120]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-1234567"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.X7875_NewUnix", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=4293732729 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 121, 41, -19, -1, 2, -24, 3], getUID=4293732729}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4293732729 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 121, 41, -19, -1, 2, -24, 3], getUID=4293732729}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-1234567"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 4, 121, 41, -19, -1, 2, -24, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4293732729 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 121, 41, -19, -1, 2, -24, 3], getUID=4293732729}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<sample:0>", "1", "1"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", ""}}, 2), new String[][]{{"getBytes", "", "5"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[7, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"-4611686018429840642"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", ""}}, 3), new String[][]{{"getUID", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30837", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:1>", "1001", "-2147483648"}}, 3), new String[][]{{"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-1234566"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=1000 GID=4293732730", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4293732730 {getCentralDirectoryData=[], getGID=4293732730, getLocalFileDataData=[1, 2, -24, 3, 4, 122, 41, -19, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-1234566"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=1000 GID=4293732730", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4293732730 {getCentralDirectoryData=[], getGID=4293732730, getLocalFileDataData=[1, 2, -24, 3, 4, 122, 41, -19, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "999"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=1000 GID=999", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=999 {getCentralDirectoryData=[], getGID=999, getLocalFileDataData=[1, 2, -24, 3, 2, -25, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"9223372036854775785"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<i:48>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=9223372036854775785 {getCentralDirectoryData=[], getGID=9223372036854775785, getLocalFileDataData=[1, 2, -24, 3, 8, -23, -1, -1, -1, -1, -1, -1, 127], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"4611686018427387892"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<i:48>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4611686018427387892 {getCentralDirectoryData=[], getGID=4611686018427387892, getLocalFileDataData=[1, 2, -24, 3, 8, -12, -1, -1, -1, -1, -1, -1, 63], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"9223372036854775529"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<i:48>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=9223372036854775529 {getCentralDirectoryData=[], getGID=9223372036854775529, getLocalFileDataData=[1, 2, -24, 3, 8, -23, -2, -1, -1, -1, -1, -1, 127], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"4611686018427387764"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<i:-2147483648>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4611686018427387764 {getCentralDirectoryData=[], getGID=4611686018427387764, getLocalFileDataData=[1, 2, -24, 3, 8, 116, -1, -1, -1, -1, -1, -1, 63], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"getLocalFileDataLength", "", "4"}, {"getBytes", "", "1"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[7, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=1000 GID=1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=0 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 1, 0, 2, -24, 3], getUID=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=0 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 1, 0, 2, -24, 3], getUID=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "-1", "2147483647"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "-617283", "131028"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=0 {getCentralDirectoryData=[], getGID=0, getLocalFileDataData=[1, 2, -24, 3, 1, 0], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "288230376151712744"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", ""}}), new String[][]{{"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 30837 {getBytes=[117, 120], getValue=30837}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=288230376151712744 {getCentralDirectoryData=[], getGID=288230376151712744, getLocalFileDataData=[1, 2, -24, 3, 8, -24, 3, 0, 0, 0, 0, 0, 4], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-288230376151712744"}}, 3), new String[][]{{"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 30837 {getBytes=[117, 120], getValue=30837}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<sample:2>", "2147483606", "-34789000"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", ""}}, 2), new String[][]{{"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "9223372036854775807"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", ""}}, 2), new String[][]{{"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=9223372036854775807 {getCentralDirectoryData=[], getGID=9223372036854775807, getLocalFileDataData=[1, 2, -24, 3, 8, -1, -1, -1, -1, -1, -1, -1, 127], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "1"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", ""}}, 2), new String[][]{{"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1 {getCentralDirectoryData=[], getGID=1, getLocalFileDataData=[1, 2, -24, 3, 1, 1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-524287"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", ""}}, 2), new String[][]{{"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4294443009 {getCentralDirectoryData=[], getGID=4294443009, getLocalFileDataData=[1, 2, -24, 3, 4, 1, 0, -8, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-524313"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", ""}}, 2), new String[][]{{"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4294442983 {getCentralDirectoryData=[], getGID=4294442983, getLocalFileDataData=[1, 2, -24, 3, 4, -25, -1, -9, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-524359"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", ""}}, 2), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4294442937 {getCentralDirectoryData=[], getGID=4294442937, getLocalFileDataData=[1, 2, -24, 3, 4, -71, -1, -9, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "9223372036854775807"}}, 2), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=9223372036854775807 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 8, -1, -1, -1, -1, -1, -1, -1, 127, 2, -24, 3], getUID=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "9223372036854775773"}}, 2), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=9223372036854775773 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 8, -35, -1, -1, -1, -1, -1, -1, 127, 2, -24, 3], getUID=9223372036854775773}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "1"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 1, 1, 2, -24, 3], getUID=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "1"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "1"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1 GID=1 {getCentralDirectoryData=[], getGID=1, getLocalFileDataData=[1, 1, 1, 1, 1], getUID=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "1"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1 {getCentralDirectoryData=[], getGID=1, getLocalFileDataData=[1, 2, -24, 3, 1, 1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-2096152"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4292871144 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, -24, 3, -32, -1, 2, -24, 3], getUID=4292871144}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "2096152"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=2096152 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 3, 24, -4, 31, 2, -24, 3], getUID=2096152}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "4192304"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4192304 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 3, 48, -8, 63, 2, -24, 3], getUID=4192304}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false), new String[][]{{"getHeaderId", "", "7"}, {"clone", "", "2"}, {"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30837", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-66770287", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 10, new String[][]{}), new String[][]{{"parseFromCentralDirectoryData", "byte[],int,int", "1"}, {"setGID", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "1000", "2147483647"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "9223372036854775807"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=9223372036854775807 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 8, -1, -1, -1, -1, -1, -1, -1, 127, 2, -24, 3], getUID=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2147483647", "2147483647"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "9223372036854775807"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=9223372036854775807 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 8, -1, -1, -1, -1, -1, -1, -1, 127, 2, -24, 3], getUID=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "1001"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-66835823", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1001 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -23, 3, 2, -24, 3], getUID=1001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "1013"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-65525103", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1013 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -11, 3, 2, -24, 3], getUID=1013}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1234287", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=0 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 1, 0, 2, -24, 3], getUID=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1234287", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=0 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 1, 0, 2, -24, 3], getUID=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "13"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2086255", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=13 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 1, 13, 2, -24, 3], getUID=13}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "525"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-35640687", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=525 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, 13, 2, 2, -24, 3], getUID=525}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-525"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("35575150", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4294966771 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, -13, -3, -1, -1, 2, -24, 3], getUID=4294966771}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "1"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.X7875_NewUnix", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=1000 GID=1 {getCentralDirectoryData=[], getGID=1, getLocalFileDataData=[1, 2, -24, 3, 1, 1], getUID=1000}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1 {getCentralDirectoryData=[], getGID=1, getLocalFileDataData=[1, 2, -24, 3, 1, 1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<sample:2>", "0", "-1234566"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[127, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=9223372036854775807 {getCentralDirectoryData=[], getGID=9223372036854775807, getLocalFileDataData=[1, 2, -24, 3, 8, -1, -1, -1, -1, -1, -1, -1, 127], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "1"}}, 1), new String[][]{{"clone", "", "1"}, {"getBytes", "", "6"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[6, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 1, 1, 2, -24, 3], getUID=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "0"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", ""}}, 1), new String[][]{{"clone", "", "1"}, {"getBytes", "", "6"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[6, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=0 {getCentralDirectoryData=[], getGID=0, getLocalFileDataData=[1, 2, -24, 3, 1, 0], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "0"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "1001"}}, 1), new String[][]{{"clone", "", "1"}, {"getBytes", "", "6"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[6, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1001 GID=0 {getCentralDirectoryData=[], getGID=0, getLocalFileDataData=[1, 2, -23, 3, 1, 0], getUID=1001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-9223372036854775808"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "1001"}}, 1), new String[][]{{"clone", "", "1"}, {"getBytes", "", "6"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[7, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1001 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -23, 3, 2, -24, 3], getUID=1001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-4611686018427387904"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-1234568"}}, 1), new String[][]{{"clone", "", "1"}, {"getBytes", "", "6"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[9, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4293732728 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 120, 41, -19, -1, 2, -24, 3], getUID=4293732728}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-34789000", "-1"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4294967295 {getCentralDirectoryData=[], getGID=4294967295, getLocalFileDataData=[1, 2, -24, 3, 4, -1, -1, -1, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-34789000", "-1"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-1048577"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4293918719 {getCentralDirectoryData=[], getGID=4293918719, getLocalFileDataData=[1, 2, -24, 3, 4, -1, -1, -17, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-34789000", "-1"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-1234568"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4293732728 {getCentralDirectoryData=[], getGID=4293732728, getLocalFileDataData=[1, 2, -24, 3, 4, 120, 41, -19, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-1234567"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4293732729 {getCentralDirectoryData=[], getGID=4293732729, getLocalFileDataData=[1, 2, -24, 3, 4, 121, 41, -19, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 0 {getBytes=[0, 0], getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-66770287", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<sample:0>", "0", "262143"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 7 {getBytes=[7, 0], getValue=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[-1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "1001"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 0 {getBytes=[0, 0], getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1001 {getCentralDirectoryData=[], getGID=1001, getLocalFileDataData=[1, 2, -24, 3, 2, -23, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[3, 4]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[127, 2, 3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[127]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:2>", "-34789000", "-1234568"}}), new String[][]{{"setUID", "long", "5"}, {"getUID", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-2147483648", "2"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", "byte[],int,int", "<null>", "-1234568", "2147483606"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 2, -24, 3, 2, -24, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "971"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("971", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=971 {getCentralDirectoryData=[], getGID=971, getLocalFileDataData=[1, 2, -24, 3, 2, -53, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"-1234566"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4293732730 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 122, 41, -19, -1, 2, -24, 3], getUID=4293732730}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", new String[]{"long"}, new String[]{"-617283"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4294350013 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, -67, -108, -10, -1, 2, -24, 3], getUID=4294350013}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<b:true>"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-1234566"}}), new String[][]{{"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.X7875_NewUnix", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=4293732730 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 122, 41, -19, -1, 2, -24, 3], getUID=4293732730}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4293732730 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 122, 41, -19, -1, 2, -24, 3], getUID=4293732730}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-1234567"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 0 {getBytes=[0, 0], getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4293732729 {getCentralDirectoryData=[], getGID=4293732729, getLocalFileDataData=[1, 2, -24, 3, 4, 121, 41, -19, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "1234567"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<sample:0>"}}, 1), new String[][]{{"getBytes", "", "3"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1234567 {getCentralDirectoryData=[], getGID=1234567, getLocalFileDataData=[1, 2, -24, 3, 3, -121, -42, 18], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "1234567"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<i:1>"}}, 2), new String[][]{{"getBytes", "", "3"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1234567 {getCentralDirectoryData=[], getGID=1234567, getLocalFileDataData=[1, 2, -24, 3, 3, -121, -42, 18], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"-1989465135390079555"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<i:-1>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 30837 {getBytes=[117, 120], getValue=30837}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<i:-1>"}}, 1), new String[][]{{"getValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30837", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=2 {getCentralDirectoryData=[], getGID=2, getLocalFileDataData=[1, 2, -24, 3, 1, 2], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:2>", "10", "2147483647"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", ""}}, 1), new String[][]{{"getHeaderId", "", "7"}, {"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30837", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}}, 3), new String[][]{{"clone", "", "7"}, {"parseFromLocalFileData", "byte[],int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "1001"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 7 {getBytes=[7, 0], getValue=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1001 {getCentralDirectoryData=[], getGID=1001, getLocalFileDataData=[1, 2, -24, 3, 2, -23, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<null>", "999", "-2147483648"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-1234506"}}), new String[][]{{"getValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4293732790 {getCentralDirectoryData=[], getGID=4293732790, getLocalFileDataData=[1, 2, -24, 3, 4, -74, 41, -19, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromLocalFileData", "byte[],int,int", "<empty>", "999", "-2147483648"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}}, 1), new String[][]{{"getValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-1234563"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4293732733 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 125, 41, -19, -1, 2, -24, 3], getUID=4293732733}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-1234568"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4293732728 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 120, 41, -19, -1, 2, -24, 3], getUID=4293732728}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-1234566"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4293732730", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4293732730 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 122, 41, -19, -1, 2, -24, 3], getUID=4293732730}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-536870912"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3758096384", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=3758096384 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 0, 0, 0, -32, 2, -24, 3], getUID=3758096384}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", new String[]{"long"}, new String[]{"-4539628424389458979"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:1>", "-1234568", "1"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-1234568"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 4, 120, 41, -19, -1, 2, -24, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4293732728 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 120, 41, -19, -1, 2, -24, 3], getUID=4293732728}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", ""}}, 3), new String[][]{{"getBytes", "", "2"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-1"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<s:ey>"}}, 3), new String[][]{{"getBytes", "", "2"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4294967295 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, -1, -1, -1, -1, 2, -24, 3], getUID=4294967295}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "1032", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<s:a>"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4294967295 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, -1, -1, -1, -1, 2, -24, 3], getUID=4294967295}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-1"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", ""}}, 3), new String[][]{{"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30837", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4294967295 {getCentralDirectoryData=[], getGID=4294967295, getLocalFileDataData=[1, 2, -24, 3, 4, -1, -1, -1, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "2000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=2000 {getCentralDirectoryData=[], getGID=2000, getLocalFileDataData=[1, 2, -24, 3, 2, -48, 7], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-2000"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4294965296", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4294965296 {getCentralDirectoryData=[], getGID=4294965296, getLocalFileDataData=[1, 2, -24, 3, 4, 48, -8, -1, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1 {getCentralDirectoryData=[], getGID=1, getLocalFileDataData=[1, 2, -24, 3, 1, 1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getUID", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "38"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=38 {getCentralDirectoryData=[], getGID=38, getLocalFileDataData=[1, 2, -24, 3, 1, 38], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "trimLeadingZeroesForceMinLength", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[4, 5, 6]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "999"}}, 3), new String[][]{{"getLocalFileDataLength", "", "0"}, {"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 7 {getBytes=[7, 0], getValue=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=999 {getCentralDirectoryData=[], getGID=999, getLocalFileDataData=[1, 2, -24, 3, 2, -25, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "2147484647"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", ""}}, 3), new String[][]{{"getLocalFileDataLength", "", "0"}, {"getBytes", "", "5"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[9, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=2147484647 {getCentralDirectoryData=[], getGID=2147484647, getLocalFileDataData=[1, 2, -24, 3, 4, -25, 3, 0, -128], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 8, -1, -1, -1, -1, -1, -1, -1, 127, 2, -24, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=9223372036854775807 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 8, -1, -1, -1, -1, -1, -1, -1, 127, 2, -24, 3], getUID=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-1234568"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<s:kez>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4293732728 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 120, 41, -19, -1, 2, -24, 3], getUID=4293732728}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-1234572"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<s:ke0z>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4293732724 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 116, 41, -19, -1, 2, -24, 3], getUID=4293732724}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "1234572"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<s:ke0z>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1234572 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 3, -116, -42, 18, 2, -24, 3], getUID=1234572}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:0>", "-1", "-1"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "972"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.X7875_NewUnix", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=972 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -52, 3, 2, -24, 3], getUID=972}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=972 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -52, 3, 2, -24, 3], getUID=972}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", ""}}, 3), new String[][]{{"getValue", "", "5"}, {"clone", "", "6"}, {"getBytes", "", "0"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[7, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:scpeyd;>"}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "4294967296"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4294967296 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 5, 0, 0, 0, 0, 1, 2, -24, 3], getUID=4294967296}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "999"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-66770274", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=999 {getCentralDirectoryData=[], getGID=999, getLocalFileDataData=[1, 2, -24, 3, 2, -25, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-1234568"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=4293732728 GID=1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4293732728 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 120, 41, -19, -1, 2, -24, 3], getUID=4293732728}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getHeaderId", ""}}, 2), new String[][]{{"getValue", "", "6"}, {"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 2, -24, 3, 2, -24, 3], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-1234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4293732729", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4293732729 {getCentralDirectoryData=[], getGID=4293732729, getLocalFileDataData=[1, 2, -24, 3, 4, 121, 41, -19, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getGID", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "clone", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "-1234551"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4293732745", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=4293732745 {getCentralDirectoryData=[], getGID=4293732745, getLocalFileDataData=[1, 2, -24, 3, 4, -119, 41, -19, -1], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "268436455"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getLocalFileDataData", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=1000 GID=268436455", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=268436455 {getCentralDirectoryData=[], getGID=268436455, getLocalFileDataData=[1, 2, -24, 3, 4, -25, 3, 0, 16], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "0"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=0 {getCentralDirectoryData=[], getGID=0, getLocalFileDataData=[1, 2, -24, 3, 1, 0], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "0"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "equals", "java.lang.Object", "<b:false>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=0 {getCentralDirectoryData=[], getGID=0, getLocalFileDataData=[1, 2, -24, 3, 1, 0], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", ""}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setUID", "long", "-1234568"}, {"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-694823556", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=4293732728 GID=1000 {getCentralDirectoryData=[], getGID=1000, getLocalFileDataData=[1, 4, 120, 41, -19, -1, 2, -24, 3], getUID=4293732728}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X7875_NewUnix", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", "toString", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.zip.X7875_NewUnix", "setGID", "long", "9223372036854775807"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x7875 Zip Extra Field: UID=1000 GID=9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x7875 Zip Extra Field: UID=1000 GID=9223372036854775807 {getCentralDirectoryData=[], getGID=9223372036854775807, getLocalFileDataData=[1, 2, -24, 3, 8, -1, -1, -1, -1, -1, -1, -1, 127], getUID=1000}", SearchInputFactory_scaffolding.receiverState());
 }
}
