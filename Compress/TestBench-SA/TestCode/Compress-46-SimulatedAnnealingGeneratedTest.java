package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", new String[]{"java.util.Date"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "equals", "java.lang.Object", "<s:/}*>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", "java.util.Date", "<null>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:2>", "5", "-2147483647"}}, 2), new String[][]{{"getBytes", "", "4"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2147483647", "-1"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", "java.util.Date", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromLocalFileData", "byte[],int,int", "<sample:1>", "1", "-2147483647"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", "java.util.Date", "<null>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateTime", ""}}), new String[][]{{"setCreateJavaTime", "java.util.Date", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", new String[]{"byte"}, new String[]{"3"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromLocalFileData", "byte[],int,int", "<sample:2>", "1", "1000"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=11  {getCentralDirectoryData=!NullPointerException, getFlags=3, getLocalFileDataData=!NullPointerException, isBit0_modifyTimePresent=true, isBit1_accessTimePresent=true, ...#231#2120083711", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", new String[]{"byte"}, new String[]{"-127"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromLocalFileData", "byte[],int,int", "<sample:2>", "1", "2147483647"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "1", "10"}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromLocalFileData", "byte[],int,int", "<sample:0>", "-2147483648", "2"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryLength", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", new String[]{"byte"}, new String[]{"127"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryData", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:6>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1111111  Modify:[Wed Dec 31 16:00:04 PST 1969]  {getCentralDirectoryData=[1, 4, 0, 0, 0], getFlags=127, getLocalFileDataData=[1, 4, 0, 0, 0], isBit0_modifyTimePresent=tru...#264#1083096137", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "1", "1"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "hashCode", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  {getCentralDirectoryData=[0], getFlags=4, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessJavaTime", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateTime", ""}}, 2), new String[][]{{"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", actual.getClass().getName());
  assertEquals("0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", "byte", "0"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataData", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit0_modifyTimePresent", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessTime", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 4, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:04 PST 1969]  {getCentralDirectoryData=[1, 4, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 4, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#1304984460", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit0_modifyTimePresent", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit0_modifyTimePresent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", "java.util.Date", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[1, 0, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 0, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#36110720", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyJavaTime", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 1 {getBytes=[1, 0], getValue=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessTime", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit0_modifyTimePresent", ""}}, 3), new String[][]{{"clone", "", "7"}, {"getValue", "", "4"}, {"clone", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 21589 {getBytes=[85, 84], getValue=21589}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessTime", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit0_modifyTimePresent", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:6>"}}, 3), new String[][]{{"clone", "", "7"}, {"getValue", "", "4"}, {"clone", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 21589 {getBytes=[85, 84], getValue=21589}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:04 PST 1969]  {getCentralDirectoryData=[1, 4, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 4, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#1304984460", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit0_modifyTimePresent", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:6>"}}, 3), new String[][]{{"getBytes", "", "7"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[85, 84]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:04 PST 1969]  {getCentralDirectoryData=[1, 4, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 4, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#1304984460", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit0_modifyTimePresent", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:5>"}}, 3), new String[][]{{"getBytes", "", "7"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[85, 84]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:03 PST 1969]  {getCentralDirectoryData=[1, 3, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 3, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#2061507849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryData", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=101  Modify:[Wed Dec 31 16:00:00 PST 1969]  Create:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[5, 0, 0, 0, 0], getFlags=5, getLocalFileDataData=[5, 0, 0, 0,...#310#-658316721", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryData", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryData", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[1, 0, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 0, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#36110720", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit2_createTimePresent", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 15:59:59 PST 1969]  {getCentralDirectoryData=[1, -1, -1, -1, -1], getFlags=1, getLocalFileDataData=[1, -1, -1, -1, -1], isBit0_modifyTimePresent=tru...#266#-1013219649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit2_createTimePresent", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:01 PST 1969]  {getCentralDirectoryData=[1, 1, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 1, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#-720412669", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit2_createTimePresent", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[1, 0, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 0, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#36110720", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Mon Jan 18 19:14:07 PST 2038]  {getCentralDirectoryData=[1, -1, -1, -1, 127], getFlags=1, getLocalFileDataData=[1, -1, -1, -1, 127], isBit0_modifyTimePresent=t...#268#1405239801", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", "byte", "4"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=101  Modify:[Mon Jan 18 19:14:07 PST 2038]  {getCentralDirectoryData=[1, -1, -1, -1, 127], getFlags=5, getLocalFileDataData=[1, -1, -1, -1, 127], isBit0_modifyTimePresent...#269#-1666289323", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", "byte", "4"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=101  Modify:[Wed Dec 31 16:00:03 PST 1969]  {getCentralDirectoryData=[1, 3, 0, 0, 0], getFlags=5, getLocalFileDataData=[1, 3, 0, 0, 0], isBit0_modifyTimePresent=true, isB...#259#1643550973", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:5>"}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", "byte", "127"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1111111  Modify:[Wed Dec 31 16:00:03 PST 1969]  {getCentralDirectoryData=[1, 3, 0, 0, 0], getFlags=127, getLocalFileDataData=[1, 3, 0, 0, 0], isBit0_modifyTimePresent=tru...#264#-1438015098", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessJavaTime", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessJavaTime", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromCentralDirectoryData", "byte[],int,int", "<empty>", "3", "1000"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", "java.util.Date", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyJavaTime", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#1288179257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "1001", "1001"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", "byte", "-128"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-2147483647", "1001"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "5", "999"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessTime", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getFlags", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit0_modifyTimePresent", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getFlags", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", new String[]{}, new String[]{}, false, 13, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x5455 Zip Extra Field: Flags=0 ", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:10>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Sat Oct 10 11:12:00 PST 1908]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, -128, -107, -42, -116], isBit0_modifyTimePresent=false, isB...#259#1032321398", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", new String[]{"java.util.Date"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#1288179257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateTime", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:6>"}}, 3), new String[][]{{"putLong", "byte[],int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit0_modifyTimePresent", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getFlags", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "equals", "java.lang.Object", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", new String[]{"java.util.Date"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#1384459857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=110  Access:[Tue May 05 06:07:08 PST 1903]  Create:[Wed Dec 31 16:00:01 PST 1969]  {getCentralDirectoryData=[6], getFlags=6, getLocalFileDataData=[6, -116, 92, -99, -126,...#307#1046420439", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=110  Access:[Tue May 05 06:07:08 PST 1903]  Create:[Wed Dec 31 16:00:04 PST 1969]  {getCentralDirectoryData=[6], getFlags=6, getLocalFileDataData=[6, -116, 92, -99, -126,...#307#1177602551", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=110  Access:[Tue May 05 06:07:08 PST 1903]  Create:[Mon Jan 18 19:14:07 PST 2038]  {getCentralDirectoryData=[6], getFlags=6, getLocalFileDataData=[6, -116, 92, -99, -126,...#312#-795184244", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateJavaTime", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryLength", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessJavaTime", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataData", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[1, 0, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 0, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#36110720", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", new String[]{"java.util.Date"}, new String[]{"<null>"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:5>"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Tue May 05 06:07:08 PST 1903]  {getCentralDirectoryData=[1, -116, 92, -99, -126], getFlags=1, getLocalFileDataData=[1, -116, 92, -99, -126], isBit0_modifyTimeP...#276#-1930275404", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:4>"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Fri Apr 04 05:06:00 PST 1902]  {getCentralDirectoryData=[1, 56, 60, -109, -128], getFlags=1, getLocalFileDataData=[1, 56, 60, -109, -128], isBit0_modifyTimePre...#274#-927931335", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:1>", "0", "1001"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", actual.getClass().getName());
  assertEquals("0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", ""}}, 1), new String[][]{{"getAccessTime", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataData", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataData", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", "java.util.Date", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[2, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#1384459857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataData", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", "java.util.Date", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[4, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#1288179257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[4]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:05 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 5, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#-1809170493", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[4]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:06 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 6, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#1866326853", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "hashCode", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "hashCode", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessTime", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "hashCode", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessTime", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483526", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Mon Jan 18 19:14:07 PST 2038]  {getCentralDirectoryData=[1, -1, -1, -1, 127], getFlags=1, getLocalFileDataData=[1, -1, -1, -1, 127], isBit0_modifyTimePresent=t...#268#1405239801", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit0_modifyTimePresent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryData", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:01 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 1, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#668709307", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 15:59:59 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, -1, -1, -1, -1], isBit0_modifyTimePresent=false, isBit1_acc...#252#772491864", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Mon Jan 18 19:14:07 PST 2038]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, -1, -1, -1, 127], isBit0_modifyTimePresent=false, isBit1_ac...#253#-1642829052", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:02 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 2, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#49239357", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateJavaTime", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:05 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 5, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#-1809170493", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessJavaTime", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", actual.getClass().getName());
  assertEquals("0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessJavaTime", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateTime", ""}}), new String[][]{{"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", actual.getClass().getName());
  assertEquals("0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateTime", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:}*>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", "byte", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:*>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", "byte", "0"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit0_modifyTimePresent", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit0_modifyTimePresent", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 5, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:05 PST 1969]  {getCentralDirectoryData=[1, 5, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 5, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#548461071", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit0_modifyTimePresent", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 4, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:04 PST 1969]  {getCentralDirectoryData=[1, 4, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 4, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#1304984460", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataData", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit0_modifyTimePresent", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<null>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#1384459857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateJavaTime", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit0_modifyTimePresent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "equals", "java.lang.Object", "<s:}*>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 1 {getBytes=[1, 0], getValue=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "equals", "java.lang.Object", "<s:}*>"}}), new String[][]{{"getBytes", "", "4"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "equals", "java.lang.Object", "<s:}*>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:2>", "5", "-2147483647"}}), new String[][]{{"getBytes", "", "4"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", new String[]{"byte"}, new String[]{"3"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit2_createTimePresent", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=11  {getCentralDirectoryData=!NullPointerException, getFlags=3, getLocalFileDataData=!NullPointerException, isBit0_modifyTimePresent=true, isBit1_accessTimePresent=true, ...#231#2120083711", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 21589 {getBytes=[85, 84], getValue=21589}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", new String[]{}, new String[]{}, false, 14, new String[][]{}), new String[][]{{"clone", "", "7"}, {"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("21589", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:5>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit0_modifyTimePresent", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", ""}}), new String[][]{{"clone", "", "7"}, {"getValue", "", "4"}, {"clone", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 21589 {getBytes=[85, 84], getValue=21589}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:03 PST 1969]  {getCentralDirectoryData=[1, 3, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 3, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#2061507849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", new String[]{}, new String[]{}, false, 30, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:6>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit0_modifyTimePresent", ""}}), new String[][]{{"clone", "", "7"}, {"getValue", "", "4"}, {"clone", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 21589 {getBytes=[85, 84], getValue=21589}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:04 PST 1969]  {getCentralDirectoryData=[1, 4, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 4, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#1304984460", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit0_modifyTimePresent", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", ""}}), new String[][]{{"getBytes", "", "7"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[85, 84]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#1288179257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryData", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=101  Modify:[Wed Dec 31 16:00:00 PST 1969]  Create:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[5, 0, 0, 0, 0], getFlags=5, getLocalFileDataData=[5, 0, 0, 0,...#310#-658316721", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryData", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[1, 0, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 0, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#36110720", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:5>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", "java.util.Date", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:03 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 3, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#-473949993", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "4", "5"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit2_createTimePresent", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:05 PST 1969]  {getCentralDirectoryData=[1, 5, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 5, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#548461071", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit2_createTimePresent", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:06 PST 1969]  {getCentralDirectoryData=[1, 6, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 6, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#-208062318", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit2_createTimePresent", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 15:59:59 PST 1969]  {getCentralDirectoryData=[1, -1, -1, -1, -1], getFlags=1, getLocalFileDataData=[1, -1, -1, -1, -1], isBit0_modifyTimePresent=tru...#266#-1013219649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Mon Jan 18 19:14:07 PST 2038]  {getCentralDirectoryData=[1, -1, -1, -1, 127], getFlags=1, getLocalFileDataData=[1, -1, -1, -1, 127], isBit0_modifyTimePresent=t...#268#1405239801", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:01 PST 1969]  {getCentralDirectoryData=[1, 1, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 1, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#-720412669", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessJavaTime", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromCentralDirectoryData", "byte[],int,int", "<null>", "4", "2147483647"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:03 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 3, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#-473949993", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromCentralDirectoryData", "byte[],int,int", "<null>", "4", "2147483647"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:06 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 6, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#1962607453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "5", "1000"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit2_createTimePresent", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", new String[]{"byte"}, new String[]{"2"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromLocalFileData", "byte[],int,int", "<sample:1>", "999", "4"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateJavaTime", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  {getCentralDirectoryData=[0], getFlags=2, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=true, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", new String[]{"byte"}, new String[]{"127"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromLocalFileData", "byte[],int,int", "<sample:1>", "999", "4"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateJavaTime", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1111111  {getCentralDirectoryData=!NullPointerException, getFlags=127, getLocalFileDataData=!NullPointerException, isBit0_modifyTimePresent=true, isBit1_accessTimePresent...#237#1712260450", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#1384459857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:04 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 4, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#-1093419943", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Mon Jan 18 19:14:07 PST 2038]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, -1, -1, -1, 127], isBit0_modifyTimePresent=false, isBit1_acc...#252#-1694822788", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 15:59:59 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, -1, -1, -1, -1], isBit0_modifyTimePresent=false, isBit1_acce...#251#1429488240", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=110  Access:[Wed Dec 31 15:59:59 PST 1969]  Create:[Wed Dec 31 16:00:03 PST 1969]  {getCentralDirectoryData=[6], getFlags=6, getLocalFileDataData=[6, -1, -1, -1, -1, 3, 0...#302#-2025384325", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryLength", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 1 {getBytes=[1, 0], getValue=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateTime", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:02 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 2, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#49239357", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Mon Jan 18 19:14:07 PST 2038]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, -1, -1, -1, 127], isBit0_modifyTimePresent=false, isBit1_ac...#253#-1642829052", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:01 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 1, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#668709307", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#1288179257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateTime", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", "java.util.Date", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[1, 0, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 0, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#36110720", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:04 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 4, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#-1189700543", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#1288179257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Mon Jan 18 19:14:07 PST 2038]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, -1, -1, -1, 127], isBit0_modifyTimePresent=false, isBit1_ac...#253#-1642829052", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit2_createTimePresent", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessTime", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:02 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 2, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#49239357", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit2_createTimePresent", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", "byte", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit2_createTimePresent", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", "byte", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x5455 Zip Extra Field: Flags=0 ", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", "byte", "0"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:02 PST 1969] ", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:02 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 2, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#145519957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", "byte", "0"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 15:59:59 PST 1969] ", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 15:59:59 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, -1, -1, -1, -1], isBit0_modifyTimePresent=false, isBit1_acce...#251#1429488240", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", "byte", "0"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x5455 Zip Extra Field: Flags=10  Access:[Mon Jan 18 19:14:07 PST 2038] ", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Mon Jan 18 19:14:07 PST 2038]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, -1, -1, -1, 127], isBit0_modifyTimePresent=false, isBit1_acc...#252#-1694822788", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyJavaTime", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessTime", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", new String[]{"byte"}, new String[]{"19"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10011  {getCentralDirectoryData=!NullPointerException, getFlags=19, getLocalFileDataData=!NullPointerException, isBit0_modifyTimePresent=true, isBit1_accessTimePresent=tr...#235#-2083655457", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", new String[]{"byte"}, new String[]{"18"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10010  {getCentralDirectoryData=[0], getFlags=18, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=true, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", new String[]{"java.util.Date"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Tue May 05 06:07:08 PST 1903]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, -116, 92, -99, -126], isBit0_modifyTimePresent=false, isBit...#257#89862392", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:10>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Sat Oct 10 11:12:00 PST 1908]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, -128, -107, -42, -116], isBit0_modifyTimePresent=false, isB...#259#1032321398", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateTime", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipLong", actual.getClass().getName());
  assertEquals("ZipLong value: 3 {getBytes=[3, 0, 0, 0], getIntValue=3, getValue=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:03 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 3, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#-570230593", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateTime", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:5>"}}), new String[][]{{"putLong", "byte[],int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit2_createTimePresent", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getFlags", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "equals", "java.lang.Object", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Tue May 05 06:07:08 PST 1903]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, -116, 92, -99, -126], isBit0_modifyTimePresent=false, isBit1...#256#-1568867216", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=110  Access:[Tue May 05 06:07:08 PST 1903]  Create:[Wed Dec 31 16:00:01 PST 1969]  {getCentralDirectoryData=[6], getFlags=6, getLocalFileDataData=[6, -116, 92, -99, -126,...#307#1046420439", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:5>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", "java.util.Date", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#1384459857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryLength", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", "java.util.Date", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[4]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#1288179257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 21589 {getBytes=[85, 84], getValue=21589}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:01 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 1, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#764989907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateJavaTime", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", "byte", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  {getCentralDirectoryData=!NullPointerException, getFlags=1, getLocalFileDataData=!NullPointerException, isBit0_modifyTimePresent=true, isBit1_accessTimePresent=false, ...#231#1043028069", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateJavaTime", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", "byte", "2"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataData", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  {getCentralDirectoryData=[0], getFlags=2, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=true, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", new String[]{"java.util.Date"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:5>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Tue May 05 06:07:08 PST 1903]  {getCentralDirectoryData=[1, -116, 92, -99, -126], getFlags=1, getLocalFileDataData=[1, -116, 92, -99, -126], isBit0_modifyTimeP...#276#-1930275404", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"setCreateJavaTime", "java.util.Date", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", "java.util.Date", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 5 {getBytes=[5, 0], getValue=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[1, 0, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 0, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#36110720", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", "java.util.Date", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 1 {getBytes=[1, 0], getValue=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#1288179257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", "java.util.Date", "<sample:1>"}}), new String[][]{{"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#1288179257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:7>"}}), new String[][]{{"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:05 PST 1969]  {getCentralDirectoryData=[1, 5, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 5, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#548461071", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:7>"}}), new String[][]{{"getBytes", "", "4"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[5, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:05 PST 1969]  {getCentralDirectoryData=[1, 5, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 5, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#548461071", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:5>"}}), new String[][]{{"clone", "", "5"}, {"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:03 PST 1969]  {getCentralDirectoryData=[1, 3, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 3, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#2061507849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", new String[]{"byte"}, new String[]{"2"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  {getCentralDirectoryData=[0], getFlags=2, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=true, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", new String[]{"byte"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  {getCentralDirectoryData=!NullPointerException, getFlags=1, getLocalFileDataData=!NullPointerException, isBit0_modifyTimePresent=true, isBit1_accessTimePresent=false, ...#231#1043028069", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessTime", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", "java.util.Date", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#1384459857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:03 PST 1969]  {getCentralDirectoryData=[1, 3, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 3, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#2061507849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 21589 {getBytes=[85, 84], getValue=21589}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:4>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateTime", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataData", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:02 PST 1969]  {getCentralDirectoryData=[1, 2, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 2, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#-1476936058", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit2_createTimePresent", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", "java.util.Date", "<sample:1>"}}), new String[][]{{"clone", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 1 {getBytes=[1, 0], getValue=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#1384459857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateJavaTime", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", "byte", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=101  {getCentralDirectoryData=!NullPointerException, getFlags=5, getLocalFileDataData=!NullPointerException, isBit0_modifyTimePresent=true, isBit1_accessTimePresent=false...#232#-1234565185", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateJavaTime", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", "byte", "40"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=101000  {getCentralDirectoryData=[0], getFlags=40, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=fals...#202#1446472622", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyJavaTime", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:03 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 3, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#-473949993", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyJavaTime", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:5>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", "java.util.Date", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=0, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=11  Modify:[Wed Dec 31 16:00:00 PST 1969]  Access:[Wed Dec 31 16:00:03 PST 1969]  {getCentralDirectoryData=[3, 0, 0, 0, 0], getFlags=3, getLocalFileDataData=[3, 0, 0, 0, ...#309#-1897238483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyJavaTime", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:4>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", "java.util.Date", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=0, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=11  Modify:[Wed Dec 31 16:00:00 PST 1969]  Access:[Wed Dec 31 16:00:02 PST 1969]  {getCentralDirectoryData=[3, 0, 0, 0, 0], getFlags=3, getLocalFileDataData=[3, 0, 0, 0, ...#309#1598896367", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyJavaTime", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:02 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 2, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#145519957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyJavaTime", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataData", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "equals", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 1, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:01 PST 1969]  {getCentralDirectoryData=[1, 1, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 1, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#-720412669", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x5455 Zip Extra Field: Flags=0 ", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-1", "3"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateJavaTime", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "equals", "java.lang.Object", "<i:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "-512", "6"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateJavaTime", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateJavaTime", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "equals", "java.lang.Object", "<i:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit0_modifyTimePresent", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessJavaTime", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 21589 {getBytes=[85, 84], getValue=21589}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateTime", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", "java.util.Date", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipLong", actual.getClass().getName());
  assertEquals("ZipLong value: 0 {getBytes=[0, 0, 0, 0], getIntValue=0, getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#1288179257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", new String[]{"byte"}, new String[]{"34"}, false, 13, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100010  {getCentralDirectoryData=[0], getFlags=34, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=true, isBit2_createTimePresent=false...#201#101282536", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", new String[]{"byte"}, new String[]{"17"}, false, 13, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10001  {getCentralDirectoryData=!NullPointerException, getFlags=17, getLocalFileDataData=!NullPointerException, isBit0_modifyTimePresent=true, isBit1_accessTimePresent=fa...#236#1585354127", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataData", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[2, 2, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:02 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 2, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#145519957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataData", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[2, -1, -1, -1, 127]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Mon Jan 18 19:14:07 PST 2038]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, -1, -1, -1, 127], isBit0_modifyTimePresent=false, isBit1_acc...#252#-1694822788", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "999", "1001"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", "java.util.Date", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessJavaTime", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "5", "8187"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryData", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit2_createTimePresent", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", "java.util.Date", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#1288179257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateTime", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", "byte", "1"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  {getCentralDirectoryData=!NullPointerException, getFlags=1, getLocalFileDataData=!NullPointerException, isBit0_modifyTimePresent=true, isBit1_accessTimePresent=false, ...#231#1043028069", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#1288179257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 15:59:59 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, -1, -1, -1, -1], isBit0_modifyTimePresent=false, isBit1_acc...#252#772491864", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataData", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateJavaTime", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", "byte", "2"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  {getCentralDirectoryData=[0], getFlags=2, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=true, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Mon Jan 18 19:14:07 PST 2038]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, -1, -1, -1, 127], isBit0_modifyTimePresent=false, isBit1_ac...#253#-1642829052", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:02 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 2, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#49239357", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:02 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 2, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#49239357", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Mon Jan 18 19:14:07 PST 2038]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, -1, -1, -1, 127], isBit0_modifyTimePresent=false, isBit1_ac...#253#-1642829052", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:7>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:05 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 5, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#-1809170493", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:04 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 4, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#-1189700543", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#1288179257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", new String[]{"java.util.Date"}, new String[]{"<null>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getFlags", ""}}), new String[][]{{"getBytes", "", "2"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessJavaTime", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 1 {getBytes=[1, 0], getValue=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessJavaTime", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromLocalFileData", "byte[],int,int", "<empty>", "3", "-1"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit2_createTimePresent", ""}}, 1), new String[][]{{"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getFlags", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:05 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 5, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#-1809170493", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:4>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessJavaTime", ""}}, 2), new String[][]{{"setModifyJavaTime", "java.util.Date", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", actual.getClass().getName());
  assertEquals("0x5455 Zip Extra Field: Flags=11  Modify:[Wed Dec 31 16:00:00 PST 1969]  Access:[Wed Dec 31 16:00:02 PST 1969]  {getCentralDirectoryData=[3, 0, 0, 0, 0], getFlags=3, getLocalFileDataData=[3, 0, 0, 0, ...#309#1598896367", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:02 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 2, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#145519957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:4>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessJavaTime", ""}}), new String[][]{{"setModifyJavaTime", "java.util.Date", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", actual.getClass().getName());
  assertEquals("0x5455 Zip Extra Field: Flags=11  Modify:[Wed Dec 31 16:00:00 PST 1969]  Access:[Wed Dec 31 16:00:02 PST 1969]  {getCentralDirectoryData=[3, 0, 0, 0, 0], getFlags=3, getLocalFileDataData=[3, 0, 0, 0, ...#309#1598896367", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:02 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 2, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#145519957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", new String[]{"byte"}, new String[]{"127"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromLocalFileData", "byte[],int,int", "<sample:2>", "1", "1000"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1111111  {getCentralDirectoryData=!NullPointerException, getFlags=127, getLocalFileDataData=!NullPointerException, isBit0_modifyTimePresent=true, isBit1_accessTimePresent...#237#1712260450", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyJavaTime", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryLength", ""}}), new String[][]{{"compareTo", "java.util.Date", "1"}, {"setSeconds", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Jan 18 19:14:01 PST 2038 {getDate=18, getDay=1, getHours=19, getMinutes=14, getMonth=0, getSeconds=1, getTime=2147483641000, getTimezoneOffset=480, getYear=138}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Mon Jan 18 19:14:07 PST 2038]  {getCentralDirectoryData=[1, -1, -1, -1, 127], getFlags=1, getLocalFileDataData=[1, -1, -1, -1, 127], isBit0_modifyTimePresent=t...#268#1405239801", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyJavaTime", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryLength", ""}}, 2), new String[][]{{"compareTo", "java.util.Date", "1"}, {"setSeconds", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Jan 18 19:14:01 PST 2038 {getDate=18, getDay=1, getHours=19, getMinutes=14, getMonth=0, getSeconds=1, getTime=2147483641000, getTimezoneOffset=480, getYear=138}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Mon Jan 18 19:14:07 PST 2038]  {getCentralDirectoryData=[1, -1, -1, -1, 127], getFlags=1, getLocalFileDataData=[1, -1, -1, -1, 127], isBit0_modifyTimePresent=t...#268#1405239801", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyJavaTime", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryLength", ""}}, 2), new String[][]{{"compareTo", "java.util.Date", "1"}, {"setSeconds", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:01 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=1, getTime=1000, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:01 PST 1969]  {getCentralDirectoryData=[1, 1, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 1, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#-720412669", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "hashCode", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[1, 0, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 0, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#36110720", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyJavaTime", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateTime", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x5455 Zip Extra Field: Flags=100  Create:[Mon Jan 18 19:14:07 PST 2038] ", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Mon Jan 18 19:14:07 PST 2038]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, -1, -1, -1, 127], isBit0_modifyTimePresent=false, isBit1_ac...#253#-1642829052", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:03 PST 1969] ", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:03 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 3, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#-570230593", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:5>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", "java.util.Date", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x5455 Zip Extra Field: Flags=110  Access:[Wed Dec 31 16:00:00 PST 1969]  Create:[Wed Dec 31 16:00:03 PST 1969] ", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=110  Access:[Wed Dec 31 16:00:00 PST 1969]  Create:[Wed Dec 31 16:00:03 PST 1969]  {getCentralDirectoryData=[6], getFlags=6, getLocalFileDataData=[6, 0, 0, 0, 0, 3, 0, 0,...#298#-2094613540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", "java.util.Date", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:00 PST 1969] ", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#1384459857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", new String[]{"byte"}, new String[]{"5"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromLocalFileData", "byte[],int,int", "<sample:2>", "10", "2147483646"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=101  {getCentralDirectoryData=!NullPointerException, getFlags=5, getLocalFileDataData=!NullPointerException, isBit0_modifyTimePresent=true, isBit1_accessTimePresent=false...#232#-1234565185", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataData", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getFlags", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateTime", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessTime", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryLength", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Mon Jan 18 19:14:07 PST 2038]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, -1, -1, -1, 127], isBit0_modifyTimePresent=false, isBit1_ac...#253#-1642829052", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "2147483647", "2"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"getBytes", "", "6"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateTime", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", "java.util.Date", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[2, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#1384459857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", new String[]{"byte"}, new String[]{"5"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=101  {getCentralDirectoryData=!NullPointerException, getFlags=5, getLocalFileDataData=!NullPointerException, isBit0_modifyTimePresent=true, isBit1_accessTimePresent=false...#232#-1234565185", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:7>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:05 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 5, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#-1712889893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:04 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 4, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#-1093419943", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "toString", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:03 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 3, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#-473949993", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessTime", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:8>"}, false, 12, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:06 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 6, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#1962607453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:*>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", "java.util.Date", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#1384459857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCreateTime", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[4, -1, -1, -1, 127]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Mon Jan 18 19:14:07 PST 2038]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, -1, -1, -1, 127], isBit0_modifyTimePresent=false, isBit1_ac...#253#-1642829052", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyJavaTime", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getFlags", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataData", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[4, -1, -1, -1, -1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 15:59:59 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, -1, -1, -1, -1], isBit0_modifyTimePresent=false, isBit1_acc...#252#772491864", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:1>"}, false, 9, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#1288179257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:2>"}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=101  Modify:[Mon Jan 18 19:14:07 PST 2038]  Create:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[5, -1, -1, -1, 127], getFlags=5, getLocalFileDataData=[5, -1,...#320#2007684728", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit0_modifyTimePresent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:03 PST 1969]  {getCentralDirectoryData=[1, 3, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 3, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#2061507849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit0_modifyTimePresent", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:06 PST 1969]  {getCentralDirectoryData=[1, 6, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 6, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#-208062318", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit0_modifyTimePresent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryData", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:02 PST 1969]  {getCentralDirectoryData=[1, 2, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 2, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#-1476936058", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getHeaderId", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getFlags", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", "byte", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 21589 {getBytes=[85, 84], getValue=21589}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  {getCentralDirectoryData=!NullPointerException, getFlags=1, getLocalFileDataData=!NullPointerException, isBit0_modifyTimePresent=true, isBit1_accessTimePresent=false, ...#231#1043028069", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", "java.util.Date", "<empty>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", "byte", "127"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "parseFromCentralDirectoryData", "byte[],int,int", "<null>", "999", "1001"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", "java.util.Date", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", "byte", "127"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1111111  Access:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=!NullPointerException, getFlags=127, getLocalFileDataData=!NullPointerException, isBit0_modifyTim...#276#-1739906439", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", "java.util.Date", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", "byte", "127"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1111111  {getCentralDirectoryData=!NullPointerException, getFlags=127, getLocalFileDataData=!NullPointerException, isBit0_modifyTimePresent=true, isBit1_accessTimePresent...#237#1712260450", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyTime", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", "java.util.Date", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setFlags", "byte", "63"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=111111  {getCentralDirectoryData=!NullPointerException, getFlags=63, getLocalFileDataData=!NullPointerException, isBit0_modifyTimePresent=true, isBit1_accessTimePresent=t...#235#-1496612492", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:mu/>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:mu/>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", "java.util.Date", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 0, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessTi...#247#1384459857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getModifyJavaTime", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setCreateTime", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 5 {getBytes=[5, 0], getValue=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=100  Create:[Wed Dec 31 16:00:03 PST 1969]  {getCentralDirectoryData=[4], getFlags=4, getLocalFileDataData=[4, 3, 0, 0, 0], isBit0_modifyTimePresent=false, isBit1_accessT...#248#-570230593", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 1 {getBytes=[1, 0], getValue=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", ""}}, 3), new String[][]{{"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", ""}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "clone", ""}}, 3), new String[][]{{"getBytes", "", "5"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessJavaTime", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "equals", "java.lang.Object", "<s:a>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setModifyJavaTime", "java.util.Date", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "isBit1_accessTimePresent", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=1  Modify:[Wed Dec 31 16:00:00 PST 1969]  {getCentralDirectoryData=[1, 0, 0, 0, 0], getFlags=1, getLocalFileDataData=[1, 0, 0, 0, 0], isBit0_modifyTimePresent=true, isBit...#258#36110720", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "setAccessJavaTime", new String[]{"java.util.Date"}, new String[]{"<sample:4>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=10  Access:[Fri Apr 04 05:06:00 PST 1902]  {getCentralDirectoryData=[2], getFlags=2, getLocalFileDataData=[2, 56, 60, -109, -128], isBit0_modifyTimePresent=false, isBit1_...#255#-971339828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getAccessJavaTime", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "getFlags", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x5455 Zip Extra Field: Flags=0  {getCentralDirectoryData=[0], getFlags=0, getLocalFileDataData=[0], isBit0_modifyTimePresent=false, isBit1_accessTimePresent=false, isBit2_createTimePresent=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
