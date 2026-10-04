package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", new String[]{"java.util.Date"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessJavaTime", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", new String[]{"java.util.Date"}, new String[]{"<null>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", new String[]{"java.util.Date"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "1", "2097132"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", "java.util.Date", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:8>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", "java.util.Date", "<empty>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "hashCode", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:06 PST 1969]  {getCentralDirectoryData=[1, 6, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 6, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#-208062318", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getFlags", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:2>", "1", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  {getCentralDirectoryData=[0], getFlags=2, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=true, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", "java.util.Date", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "hashCode", ""}}), new String[][]{{"getCentralDirectoryData", "", "0"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromLocalFileData", "byte[],int,int", "<sample:5>", "2", "2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=111  Modify:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[1, 0, 0, 0, 0], getFlags=7, getLocalFileDataData=[1, 0, 0, 0, 0], isBit0_modifyTimePresent=true, isB...#258#1145321022", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:2>", "0", "999"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 21589 {getBytes=[85, 84], getValue=21589}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1111111  {getCentralDirectoryData=!NullPointerException, getFlags=127, getLocalFileDataData=!NullPointerException, isBit0_modifyTimePresent=true, isBit1_accessTimePresent...#237#1712260450", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "20", "999"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromLocalFileData", "byte[],int,int", "<sample:5>", "0", "8"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "4", "-20"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateJavaTime", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", new String[]{"byte"}, new String[]{"127"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1111111  {getCentralDirectoryData=!NullPointerException, getFlags=127, getLocalFileDataData=!NullPointerException, isBit0_modifyTimePresent=true, isBit1_accessTimePresent...#237#1712260450", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateTime", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", new String[]{"byte"}, new String[]{"26"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "hashCode", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=11010  {getCentralDirectoryData=[0], getFlags=26, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=true, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", "byte", "-128"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getFlags", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromCentralDirectoryData", "byte[],int,int", "<empty>", "-2147483648", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-2", "3"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x5455 Zip Extra Field: Flags=0 ", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2147483647", "2147483647"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x5455 Zip Extra Field: Flags=0 ", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessTime", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateJavaTime", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[1, 0, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 0, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#36110720", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", new String[]{"byte"}, new String[]{"2"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getFlags", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  {getCentralDirectoryData=[0], getFlags=2, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=true, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=11  Modify:[Wed Dec 31 16:00:00 PST 1969]  Access:[Wed Dec 31 16:00:05 PST 1969]  {getCentralDirectoryData=[3, 0, 0, 0, 0], getFlags=3, getLocalFileDataData=[3, 0, 0, 0, ...#309#-299573591", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", new String[]{"byte"}, new String[]{"127"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getFlags", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1111111  {getCentralDirectoryData=!NullPointerException, getFlags=127, getLocalFileDataData=!NullPointerException, isBit0_modifyTimePresent=true, isBit1_accessTimePresent...#237#1712260450", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataData", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getFlags", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:2>"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:01 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 1, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#764989907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromLocalFileData", "byte[],int,int", "<sample:0>", "-2147483648", "3"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateTime", ""}}, 2), new String[][]{{"getBytes", "", "4"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#1384459857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", "java.util.Date", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", ""}}, 1), new String[][]{{"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:8>"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#1384459857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromLocalFileData", "byte[],int,int", "<sample:2>", "2", "1000"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=111  Create:[Wed Dec 31 16:00:04 PST 1969]  {getCentralDirectoryData=!NullPointerException, getFlags=7, getLocalFileDataData=!NullPointerException, isBit0_modifyTimePrese...#270#-340413338", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "512", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryData", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:2>", "0", "-2013265920"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getFlags", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:0>", "42", "-32"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit2_createTimePresent", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getFlags", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", "java.util.Date", "<sample:5>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit0_modifyTimePresent", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Tue May 05 06:07:08 PST 1903]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, -116, 92, -99, -126], isBit0_modifyTimePresent=false, isBit...#257#89862392", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessTime", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:2>", "2147483647", "10"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 1 {getBytes=[1, 0], getValue=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateTime", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessTime", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "equals", "java.lang.Object", "<s:`>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:15.0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataData", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyJavaTime", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataData", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:5>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:03 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 3, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#-473949993", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Fri Apr 04 05:06:00 PST 1902]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 56, 60, -109, -128], isBit0_modifyTimePresent=false, isBit1...#256#1194440628", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:10>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessJavaTime", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=11  Modify:[Wed Dec 31 16:00:01 PST 1969]  Access:[Wed Dec 31 16:00:08 PST 1969]  {getCentralDirectoryData=[3, 1, 0, 0, 0], getFlags=3, getLocalFileDataData=[3, 1, 0, 0, ...#309#-1430323998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", actual.getClass().getName());
  assertEquals("0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit0_modifyTimePresent", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataData", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateJavaTime", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateTime", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "hashCode", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 21589 {getBytes=[85, 84], getValue=21589}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#1384459857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "2147483647", "1"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit2_createTimePresent", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:8>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=101  Modify:[Mon Jan 18 19:14:07 PST 2038]  Create:[Wed Dec 31 16:00:06 PST 1969]  {getCentralDirectoryData=[5, -1, -1, -1, 127], getFlags=5, getLocalFileDataData=[5, -1,...#320#-895418004", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessJavaTime", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromLocalFileData", "byte[],int,int", "<empty>", "14", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit0_modifyTimePresent", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryData", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessJavaTime", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 15:59:59 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, -1, -1, -1, -1], isBit0_modifyTimePresent=false, isBit1_acc...#252#772491864", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:1>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#1384459857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:1>"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[1, 0, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 0, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#36110720", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#1288179257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Mon Jan 18 19:14:07 PST 2038]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, -1, -1, -1, 127], isBit0_modifyTimePresent=false, isBit1_acc...#252#-1694822788", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryLength", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 1 {getBytes=[1, 0], getValue=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyJavaTime", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", actual.getClass().getName());
  assertEquals("0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "hashCode", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateTime", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyJavaTime", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getFlags", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", "byte", "17"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10001  {getCentralDirectoryData=!NullPointerException, getFlags=17, getLocalFileDataData=!NullPointerException, isBit0_modifyTimePresent=true, isBit1_accessTimePresent=fa...#236#1585354127", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", actual.getClass().getName());
  assertEquals("0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"getBytes", "", "0"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[85, 84]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:9>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:0>", "2147483647", "-2147483648"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:07 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 7, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#1246856903", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:1>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#1288179257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataData", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessTime", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 1 {getBytes=[1, 0], getValue=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:-0.5>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryLength", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateTime", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getFlags", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", new String[]{"byte"}, new String[]{"127"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1111111  {getCentralDirectoryData=!NullPointerException, getFlags=127, getLocalFileDataData=!NullPointerException, isBit0_modifyTimePresent=true, isBit1_accessTimePresent...#237#1712260450", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", new String[]{"byte"}, new String[]{"4"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  {getCentralDirectoryData=[0], getFlags=4, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:05 PST 1969]  {getCentralDirectoryData=[1, 5, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 5, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#548461071", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", actual.getClass().getName());
  assertEquals("0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getFlags", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:04 PST 1969]  {getCentralDirectoryData=[1, 4, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 4, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#1304984460", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit0_modifyTimePresent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryLength", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessTime", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", "java.util.Date", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#1288179257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessTime", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:01 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 1, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#764989907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessJavaTime", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getBytes", "", "6"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:02 PST 1969]  {getCentralDirectoryData=[1, 2, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 2, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#-1476936058", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessTime", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateTime", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit0_modifyTimePresent", ""}}), new String[][]{{"getHeaderId", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 21589 {getBytes=[85, 84], getValue=21589}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:0>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 15:59:59 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, -1, -1, -1, -1], isBit0_modifyTimePresent=false, isBit1_acc...#252#772491864", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit2_createTimePresent", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", "java.util.Date", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Fri Apr 04 05:06:00 PST 1902]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 56, 60, -109, -128], isBit0_modifyTimePresent=false, isBit1_...#255#-971339828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2147483647", "-22"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromCentralDirectoryData", "byte[],int,int", "<empty>", "2147483647", "1"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryData", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyJavaTime", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit2_createTimePresent", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getFlags", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateTime", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[1, 0, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 0, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#36110720", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", new String[]{"byte"}, new String[]{"2"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  {getCentralDirectoryData=[0], getFlags=2, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=true, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getCreateJavaTime", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#1384459857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=101  Modify:[Wed Dec 31 16:00:05 PST 1969]  Create:[Wed Dec 31 16:00:03 PST 1969]  {getCentralDirectoryData=[5, 5, 0, 0, 0], getFlags=5, getLocalFileDataData=[5, 5, 0, 0,...#310#1281811076", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:8>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "equals", "java.lang.Object", "<b:false>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:06 PST 1969]  {getCentralDirectoryData=[1, 6, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 6, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#-208062318", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:01 PST 1969]  {getCentralDirectoryData=[1, 1, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 1, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#-720412669", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 21589 {getBytes=[85, 84], getValue=21589}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit2_createTimePresent", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit2_createTimePresent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getFlags", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessTime", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit0_modifyTimePresent", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", new String[]{}, new String[]{}, false), new String[][]{{"getValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("21589", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#1384459857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getFlags", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataData", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Mon Jan 18 19:14:07 PST 2038]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, -1, -1, -1, 127], isBit0_modifyTimePresent=false, isBit1_acc...#252#-1694822788", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:03 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 3, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#-473949993", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessJavaTime", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 1 {getBytes=[1, 0], getValue=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateJavaTime", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", "java.util.Date", "<sample:4>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Fri Apr 04 05:06:00 PST 1902]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 56, 60, -109, -128], isBit0_modifyTimePresent=false, isBit1_...#255#-971339828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<null>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", new String[]{"byte"}, new String[]{"127"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", "java.util.Date", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1111111  Create:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=!NullPointerException, getFlags=127, getLocalFileDataData=!NullPointerException, isBit0_modifyTim...#276#-942400543", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x5455 Zip Extra Field: Flags=0 ", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateTime", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 15:59:59 PST 1969]  {getCentralDirectoryData=[1, -1, -1, -1, -1], getFlags=1, getLocalFileDataData=[1, -1, -1, -1, -1], isBit0_modifyTimePresent=tru...#266#-1013219649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "55", "-48"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:8>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateJavaTime", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-25166316", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:06 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 6, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#1866326853", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:6>"}}), new String[][]{{"getBytes", "", "4"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[5, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:04 PST 1969]  {getCentralDirectoryData=[1, 4, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 4, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#1304984460", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyJavaTime", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryLength", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:01 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 1, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#764989907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:c>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:05 PST 1969]  {getCentralDirectoryData=[1, 5, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 5, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#548461071", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:5>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:03 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 3, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#-570230593", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:0>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 15:59:59 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, -1, -1, -1, -1], isBit0_modifyTimePresent=false, isBit1_acce...#251#1429488240", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessTime", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", "java.util.Date", "<sample:5>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipLong", actual.getClass().getName());
  assertEquals("ZipLong value: -2103616372 {getBytes=[-116, 92, -99, -126], getIntValue=-2103616372, getValue=-2103616372}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Tue May 05 06:07:08 PST 1903]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, -116, 92, -99, -126], isBit0_modifyTimePresent=false, isBit1...#256#-1568867216", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:06 PST 1969]  {getCentralDirectoryData=[1, 6, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 6, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#-208062318", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:0>", "3", "524290"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:07 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 7, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#1343137503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:06 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 6, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#1866326853", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=110  Access:[Wed Dec 31 16:00:00 PST 1969]  Create:[Wed Dec 31 16:00:04 PST 1969]  {getCentralDirectoryData=[6], getFlags=6, getLocalFileDataData=[6, 0, 0, 0, 0, 4, 0, 0,...#298#923462042", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryLength", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:4>"}}), new String[][]{{"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 5 {getBytes=[5, 0], getValue=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:02 PST 1969]  {getCentralDirectoryData=[1, 2, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 2, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#-1476936058", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "-4194314", "8388588"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyJavaTime", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryLength", new String[]{}, new String[]{}, false), new String[][]{{"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:09 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 9, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#7917003", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:7>"}}), new String[][]{{"clone", "", "4"}, {"getBytes", "", "7"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[5, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:05 PST 1969]  {getCentralDirectoryData=[1, 5, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 5, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#548461071", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:4>"}}), new String[][]{{"parseFromLocalFileData", "byte[],int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessJavaTime", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessJavaTime", ""}}), new String[][]{{"getFlags", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:03 PST 1969]  {getCentralDirectoryData=[1, 3, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 3, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#2061507849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessTime", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:05 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 5, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#-1809170493", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", "java.util.Date", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=110  Access:[Wed Dec 31 16:00:00 PST 1969]  Create:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[6], getFlags=6, getLocalFileDataData=[6, 0, 0, 0, 0, 0, 0, 0,...#298#1736061602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "999", "2"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataData", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:01 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 1, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#668709307", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:03 PST 1969] ", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:03 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 3, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#-570230593", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyJavaTime", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:01 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 1, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#668709307", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#1288179257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessJavaTime", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", new String[]{"java.util.Date"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", "byte", "-1"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Mon Jan 18 19:14:07 PST 2038]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, -1, -1, -1, 127], isBit0_modifyTimePresent=false, isBit1_ac...#253#-1642829052", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessTime", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#1288179257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessTime", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:04 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 4, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#-1189700543", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessJavaTime", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:04 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 4, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#-1189700543", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessTime", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", "byte", "127"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1111111  {getCentralDirectoryData=!NullPointerException, getFlags=127, getLocalFileDataData=!NullPointerException, isBit0_modifyTimePresent=true, isBit1_accessTimePresent...#237#1712260450", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 15:59:59 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, -1, -1, -1, -1], isBit0_modifyTimePresent=false, isBit1_acce...#251#1429488240", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:5>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:03 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 3, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#-570230593", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", new String[]{"byte"}, new String[]{"0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:2>"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:01 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 1, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#764989907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateTime", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:04 PST 1969]  {getCentralDirectoryData=[1, 4, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 4, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#1304984460", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessJavaTime", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyJavaTime", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", "java.util.Date", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Fri Apr 04 05:06:00 PST 1902]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 56, 60, -109, -128], isBit0_modifyTimePresent=false, isBit1...#256#1194440628", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", "java.util.Date", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 5 {getBytes=[5, 0], getValue=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Fri Apr 04 05:06:00 PST 1902]  {getCentralDirectoryData=[1, 56, 60, -109, -128], getFlags=1, getLocalFileDataData=[1, 56, 60, -109, -128], isBit0_modifyTimePre...#274#-927931335", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x5455 Zip Extra Field: Flags=100  Create:[Mon Jan 18 19:14:07 PST 2038] ", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Mon Jan 18 19:14:07 PST 2038]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, -1, -1, -1, 127], isBit0_modifyTimePresent=false, isBit1_ac...#253#-1642829052", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:9>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Mon Sep 09 00:00:00 PST 1907]  {getCentralDirectoryData=[1, -128, -108, -54, -118], getFlags=1, getLocalFileDataData=[1, -128, -108, -54, -118], isBit0_modifyT...#280#-1347369082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-1065353216", "-8"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateJavaTime", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit2_createTimePresent", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyJavaTime", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyJavaTime", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"isBit2_createTimePresent", "", "1"}, {"isBit1_accessTimePresent", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 1 {getBytes=[1, 0], getValue=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:05 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 5, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#-1712889893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit0_modifyTimePresent", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateJavaTime", ""}}, 2), new String[][]{{"getCentralDirectoryLength", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 1 {getBytes=[1, 0], getValue=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", "java.util.Date", "<sample:3>"}}, 1), new String[][]{{"getValue", "", "0"}, {"clone", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 21589 {getBytes=[85, 84], getValue=21589}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", "java.util.Date", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#1288179257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", new String[]{"java.util.Date"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", "java.util.Date", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#1384459857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", new String[]{"java.util.Date"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessTime", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", "java.util.Date", "<null>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "hashCode", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:1>"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[1, 0, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 0, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#36110720", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Mon Jan 18 19:14:07 PST 2038]  {getCentralDirectoryData=[1, -1, -1, -1, 127], getFlags=1, getLocalFileDataData=[1, -1, -1, -1, 127], isBit0_modifyTimePresent=t...#268#1405239801", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:02 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 2, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#49239357", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.436>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:01 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 1, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#668709307", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit0_modifyTimePresent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromCentralDirectoryData", "byte[],int,int", "<null>", "4194305", "-507"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", "java.util.Date", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#1288179257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessJavaTime", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:8>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:06 PST 1969]  {getCentralDirectoryData=[1, 6, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 6, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#-208062318", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryData", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:9>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessJavaTime", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 5 {getBytes=[5, 0], getValue=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:07 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 7, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#1246856903", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", new String[]{"byte"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", "java.util.Date", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipLong", actual.getClass().getName());
  assertEquals("ZipLong value: 2 {getBytes=[2, 0, 0, 0], getIntValue=2, getValue=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:02 PST 1969]  {getCentralDirectoryData=[1, 2, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 2, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#-1476936058", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", "byte", "0"}}, 1), new String[][]{{"getHeaderId", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 21589 {getBytes=[85, 84], getValue=21589}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 21589 {getBytes=[85, 84], getValue=21589}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:4>"}}), new String[][]{{"getLocalFileDataLength", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 5 {getBytes=[5, 0], getValue=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:02 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 2, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#49239357", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessTime", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", "byte", "4"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  {getCentralDirectoryData=[0], getFlags=4, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", "java.util.Date", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:02 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 2, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#145519957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", "java.util.Date", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Fri Apr 04 05:06:00 PST 1902]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 56, 60, -109, -128], isBit0_modifyTimePresent=false, isBit1_...#255#-971339828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<null>"}}), new String[][]{{"getBytes", "", "4"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[85, 84]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit0_modifyTimePresent", ""}}, 2), new String[][]{{"getCreateJavaTime", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Mon Jan 18 19:14:07 PST 2038]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, -1, -1, -1, 127], isBit0_modifyTimePresent=false, isBit1_ac...#253#-1642829052", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:Wb>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:8>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:06 PST 1969]  {getCentralDirectoryData=[1, 6, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 6, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#-208062318", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", new String[]{"byte"}, new String[]{"-64"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", "java.util.Date", "<sample:6>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit0_modifyTimePresent", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataData", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:01 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 1, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#668709307", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:3>"}}, 3), new String[][]{{"getAccessTime", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipLong", actual.getClass().getName());
  assertEquals("ZipLong value: 2147483647 {getBytes=[-1, -1, -1, 127], getIntValue=2147483647, getValue=2147483647}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Mon Jan 18 19:14:07 PST 2038]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, -1, -1, -1, 127], isBit0_modifyTimePresent=false, isBit1_acc...#252#-1694822788", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessTime", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:03 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 3, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#-570230593", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyJavaTime", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", "byte", "120"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1111000  {getCentralDirectoryData=[0], getFlags=120, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=fa...#204#342053325", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit2_createTimePresent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:7>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataData", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:05 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 5, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#-1712889893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getFlags", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:7>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:05 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 5, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#-1712889893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateTime", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit0_modifyTimePresent", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:02 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 2, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#145519957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataData", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromLocalFileData", "byte[],int,int", "<sample:2>", "58", "1026"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[2, 2, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:02 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 2, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#145519957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit2_createTimePresent", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateJavaTime", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 15:59:59 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, -1, -1, -1, -1], isBit0_modifyTimePresent=false, isBit1_acce...#251#1429488240", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit2_createTimePresent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryData", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyJavaTime", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:04 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 4, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#-1093419943", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit0_modifyTimePresent", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "equals", "java.lang.Object", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Mon Jan 18 19:14:07 PST 2038]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, -1, -1, -1, 127], isBit0_modifyTimePresent=false, isBit1_ac...#253#-1642829052", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:01 PST 1969]  {getCentralDirectoryData=[1, 1, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 1, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#-720412669", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:8>"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:06 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 6, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#1962607453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:10>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:01 PST 1969]  {getCentralDirectoryData=[1, 1, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 1, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#-720412669", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", "byte", "1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=101  Create:[Wed Dec 31 15:59:59 PST 1969]  {getCentralDirectoryData=!NullPointerException, getFlags=5, getLocalFileDataData=!NullPointerException, isBit0_modifyTimePrese...#271#946938019", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Mon Jan 18 19:14:07 PST 2038]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, -1, -1, -1, 127], isBit0_modifyTimePresent=false, isBit1_ac...#253#-1642829052", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit2_createTimePresent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", "java.util.Date", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:03 PST 1969]  {getCentralDirectoryData=[1, 3, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 3, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#2061507849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", "java.util.Date", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit0_modifyTimePresent", ""}}, 1), new String[][]{{"getBytes", "", "4"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[5, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[1, 0, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 0, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#36110720", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:6>"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:04 PST 1969]  {getCentralDirectoryData=[1, 4, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 4, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#1304984460", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:0>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getFlags", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 15:59:59 PST 1969] ", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 15:59:59 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, -1, -1, -1, -1], isBit0_modifyTimePresent=false, isBit1_acce...#251#1429488240", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", new String[]{"byte"}, new String[]{"91"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1011011  {getCentralDirectoryData=!NullPointerException, getFlags=91, getLocalFileDataData=!NullPointerException, isBit0_modifyTimePresent=true, isBit1_accessTimePresent=...#237#-853369073", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", "java.util.Date", "<sample:9>"}}), new String[][]{{"clone", "", "0"}, {"clone", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 21589 {getBytes=[85, 84], getValue=21589}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Mon Sep 09 00:00:00 PST 1907]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, -128, -108, -54, -118], isBit0_modifyTimePresent=false, isBi...#258#-218769296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:4>"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Fri Apr 04 05:06:00 PST 1902]  {getCentralDirectoryData=[1, 56, 60, -109, -128], getFlags=1, getLocalFileDataData=[1, 56, 60, -109, -128], isBit0_modifyTimePre...#274#-927931335", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:01 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 1, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#764989907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessTime", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyJavaTime", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", "java.util.Date", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "equals", "java.lang.Object", "<i:65>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#1288179257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:5>"}}), new String[][]{{"getBytes", "", "6"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[5, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:03 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 3, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#-473949993", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessTime", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:3>"}}), new String[][]{{"putLong", "byte[],int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", new String[]{"java.util.Date"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getCreateTime", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:05 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 5, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#-1809170493", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit2_createTimePresent", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipLong", actual.getClass().getName());
  assertEquals("ZipLong value: -1 {getBytes=[-1, -1, -1, -1], getIntValue=-1, getValue=-1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 15:59:59 PST 1969]  {getCentralDirectoryData=[1, -1, -1, -1, -1], getFlags=1, getLocalFileDataData=[1, -1, -1, -1, -1], isBit0_modifyTimePresent=tru...#266#-1013219649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", new String[]{}, new String[]{}, false), new String[][]{{"getCentralDirectoryLength", "", "0"}, {"getValue", "", "2"}, {"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyJavaTime", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", "java.util.Date", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:06 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=6, getTime=6000, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=101  Modify:[Wed Dec 31 16:00:06 PST 1969]  Create:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[5, 6, 0, 0, 0], getFlags=5, getLocalFileDataData=[5, 6, 0, 0,...#310#-346966711", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:0>", "-1", "500"}}), new String[][]{{"setAccessTime", "org.apache.commons.compress.archivers.zip.ZipLong", "1"}, {"isBit1_accessTimePresent", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 1 {getBytes=[1, 0], getValue=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "hashCode", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyJavaTime", ""}}, 1), new String[][]{{"getValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:04 PST 1969]  {getCentralDirectoryData=[1, 4, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 4, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#1304984460", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessJavaTime", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", "byte", "5"}}, 1), new String[][]{{"getBytes", "", "6"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[85, 84]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=101  {getCentralDirectoryData=!NullPointerException, getFlags=5, getLocalFileDataData=!NullPointerException, isBit0_modifyTimePresent=true, isBit1_accessTimePresent=false...#232#-1234565185", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataData", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:03 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 3, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#-473949993", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#1384459857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:2>", "-1001", "29"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Mon Jan 18 19:14:07 PST 2038]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, -1, -1, -1, 127], isBit0_modifyTimePresent=false, isBit1_acc...#252#-1694822788", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateTime", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessTime", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateTime", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 15:59:59 PST 1969]  {getCentralDirectoryData=[1, -1, -1, -1, -1], getFlags=1, getLocalFileDataData=[1, -1, -1, -1, -1], isBit0_modifyTimePresent=tru...#266#-1013219649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessTime", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", "java.util.Date", "<sample:1>"}}, 1), new String[][]{{"getValue", "", "1"}, {"getIntValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#1384459857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", "byte", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", "byte", "4"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  {getCentralDirectoryData=[0], getFlags=4, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", new String[]{"byte"}, new String[]{"76"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", "byte", "-128"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", "java.util.Date", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1001100  Create:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[4], getFlags=76, getLocalFileDataData=[4, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_ac...#253#190435048", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", "byte", "127"}}), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1111111  {getCentralDirectoryData=!NullPointerException, getFlags=127, getLocalFileDataData=!NullPointerException, isBit0_modifyTimePresent=true, isBit1_accessTimePresent...#237#1712260450", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getFlags", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:03 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 3, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#-473949993", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getCentralDirectoryData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:6>"}}), new String[][]{{"getIntValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:04 PST 1969]  {getCentralDirectoryData=[1, 4, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 4, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#1304984460", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit2_createTimePresent", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:02 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 2, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#49239357", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit0_modifyTimePresent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:06 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 6, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#1866326853", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit2_createTimePresent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
