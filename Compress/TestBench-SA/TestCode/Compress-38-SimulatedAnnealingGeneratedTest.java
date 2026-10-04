package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLinkName", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isCheckSumOK", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setDevMinor", "int", "33187"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setModTime", "java.util.Date", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=33187, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUse...#266#1859406001", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "parseTarHeader", new String[]{"byte[]", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:0>", "<sample:6>"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "fillGNUSparse0xData", "java.util.Map", "<sample:4>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isOldGNUSparse", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isSparse", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserId", new String[]{"int"}, new String[]{"30"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setDevMajor", "int", "-2147483648"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLongGroupId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=30, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUser...#266#479831823", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getRealSize", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "fillStarSparseData", "java.util.Map", "<sample:4>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setDevMajor", "int", "60"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isExtended", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=60, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, g...#258#778229193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isSparse", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isPaxHeader", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setDevMinor", "int", "-2"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isFile", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=, getRealSize=0, getSize=0, getUserId=0, get...#256#304886247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setModTime", new String[]{"java.util.Date"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLinkName", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setNames", "java.lang.String,java.lang.String", "GNU.sparse.realsize", "SCHILY.realsize"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setSize", "long", "-576460752303456678"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=SCHILY.realsize, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getS...#298#1523602177", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getDirectoryEntries", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "hashCode", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isFile", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGlobalPaxHeader", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.tar.TarArchiveEntry;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isLink", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isCharacterDevice", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setMode", "int", "0"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setName", "java.lang.String", "33188a,b,c"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=0, getName=33188a,b,c, getRealSize=0, getSize=0, getUserId=...#262#313559651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isSparse", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "fillStarSparseData", "java.util.Map", "<sample:4>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isDirectory", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setIds", "int,int", "33187", "1001"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=1001, getGroupName=, getLinkName=, getLongGroupId=1001, getLongUserId=33187, getMode=33188, getName=, getRealSize=0, getSize=0, getUse...#270#-801081325", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 38, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isFile", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-909675094", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setModTime", new String[]{"long"}, new String[]{"1651"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "writeEntryHeader", "byte[]", "<sample:2>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getFile", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getUserName", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGNUSparse", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGNULongNameEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "fillGNUSparse0xData", "java.util.Map", "<sample:1>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGNULongLinkEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isLink", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "parseTarHeader", "byte[]", "<null>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setSize", "long", "-3"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isLink", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "parseTarHeader", "byte[]", "<null>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setSize", "long", "-3"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isFIFO", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=, getRealSize=0, getSize=0, getUserId=0, get...#256#304886247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isFIFO", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLinkName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isStarSparse", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserId", "long", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLinkName", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isStarSparse", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserId", "long", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLinkName", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserId", "long", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLinkName", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isCheckSumOK", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setSize", new String[]{"long"}, new String[]{"33187"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=33187, getU...#268#89273951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setSize", new String[]{"long"}, new String[]{"33187"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "equals", "java.lang.Object", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=33187, getU...#268#89273951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setSize", new String[]{"long"}, new String[]{"33170"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=33170, getU...#268#1501027769", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "parseTarHeader", new String[]{"byte[]", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:0>", "<sample:6>"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isOldGNUSparse", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isSparse", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "parseTarHeader", new String[]{"byte[]", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<null>", "<sample:2>"}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isOldGNUSparse", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isSparse", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getGroupId", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getUserId", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isDirectory", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getGroupId", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getUserId", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isDirectory", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getGroupId", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getUserId", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isDirectory", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=, getRealSize=0, getSize=0, getUserId=0, get...#256#304886247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getGroupId", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getUserId", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isDirectory", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setIds", new String[]{"int", "int"}, new String[]{"32", "-2147479552"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=-2147479552, getGroupName=, getLinkName=, getLongGroupId=-2147479552, getLongUserId=32, getMode=33188, getName=a/sample, getRealSize=0...#286#-2073826129", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setIds", new String[]{"int", "int"}, new String[]{"32", "-2139090944"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=-2139090944, getGroupName=, getLinkName=, getLongGroupId=-2139090944, getLongUserId=32, getMode=33188, getName=a/sample, getRealSize=0...#286#1481368271", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setIds", new String[]{"int", "int"}, new String[]{"32", "-2147483648"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=-2147483648, getGroupName=, getLinkName=, getLongGroupId=-2147483648, getLongUserId=32, getMode=33188, getName=a/sample, getRealSize=0...#286#2044453775", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setIds", new String[]{"int", "int"}, new String[]{"2147483647", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isFIFO", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=-2147483648, getGroupName=, getLinkName=, getLongGroupId=-2147483648, getLongUserId=2147483647, getMode=33188, getName=a/sample, getRe...#302#1525866223", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setNames", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"os.name", "/a/b"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isLink", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isBlockDevice", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=/a/b, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getU...#275#1622617417", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setNames", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"os.name", "Y/a/b"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isLink", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isBlockDevice", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=Y/a/b, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, get...#276#-553423030", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setNames", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"os.name", "Y0a/b"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isLink", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isBlockDevice", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=Y0a/b, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, get...#276#-1593714869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setNames", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"os.nme", "Y0a/b"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isLink", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isBlockDevice", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=Y0a/b, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, get...#275#-864711450", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setNames", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"os.ne", "Y0a/b"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isLink", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isBlockDevice", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=Y0a/b, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, get...#274#1053032415", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setNames", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"pITLE", "2020-02-30T25:61:61"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "fillGNUSparse1xData", "java.util.Map", "<sample:3>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLongGroupId", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isFIFO", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=2020-02-30T25:61:61, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, ...#288#-207571895", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setNames", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"pITLE", "2020-02-30T25N61:61"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "fillGNUSparse1xData", "java.util.Map", "<sample:3>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLongGroupId", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isFIFO", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=2020-02-30T25N61:61, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, ...#288#461427805", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setNames", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"pITLE", "220-02-30T25N61:61"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "fillGNUSparse1xData", "java.util.Map", "<sample:3>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLongGroupId", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isFIFO", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=220-02-30T25N61:61, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, g...#287#-736737257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setNames", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"pITLE", "220-02-30T25N61:61"}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "fillGNUSparse1xData", "java.util.Map", "<sample:3>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLongGroupId", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isFIFO", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=220-02-30T25N61:61, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=, getRealSize=0, getSize=0...#279#-1521457105", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setNames", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-01-01", "220-02-30T25N61:61"}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "fillGNUSparse1xData", "java.util.Map", "<sample:3>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLongGroupId", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isFIFO", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=220-02-30T25N61:61, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=, getRealSize=0, getSize=0...#284#-1023867517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserId", new String[]{"int"}, new String[]{"60"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setDevMajor", "int", "-2147483648"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLongGroupId", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=60, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUser...#266#-1666913681", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserId", new String[]{"int"}, new String[]{"60"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setDevMajor", "int", "16878"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLongGroupId", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=16878, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=60, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, get...#270#-123813869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserId", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setDevMajor", "int", "16878"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLongGroupId", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=16878, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=10, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, get...#270#2022439539", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserId", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setDevMajor", "int", "16878"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLongGroupId", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=16878, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=2147483647, getMode=33188, getName=a/sample, getRealSize=0, getSiz...#286#1903650259", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getGroupName", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getRealSize", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserName", "java.lang.String", "GNU."}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#266#2091558385", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getGroupName", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getRealSize", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserName", "java.lang.String", "GNU."}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=, getRealSize=0, getSize=0, getUserId=0, get...#260#1833755975", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getGroupName", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getRealSize", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserName", "java.lang.String", "GN."}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=, getRealSize=0, getSize=0, getUserId=0, get...#259#789853524", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getGroupName", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getRealSize", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserName", "java.lang.String", "GN."}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#267#1335793468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getGroupName", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLinkName", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getRealSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getGroupName", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLinkName", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "fillGNUSparse0xData", "java.util.Map", "<empty>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getRealSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getGroupName", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "fillGNUSparse0xData", "java.util.Map", "<empty>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getRealSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "writeEntryHeader", new String[]{"byte[]", "org.apache.commons.compress.archivers.zip.ZipEncoding", "boolean"}, new String[]{"<sample:4>", "<sample:7>", "false"}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLongUserId", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isPaxGNUSparse", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setGroupId", "int", "1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "writeEntryHeader", new String[]{"byte[]", "org.apache.commons.compress.archivers.zip.ZipEncoding", "boolean"}, new String[]{"<sample:4>", "<null>", "false"}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLongUserId", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isPaxGNUSparse", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGNULongNameEntry", new String[]{}, new String[]{}, false, 21, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGNULongNameEntry", new String[]{}, new String[]{}, false, 22, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGNULongNameEntry", new String[]{}, new String[]{}, false, 23, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=, getRealSize=0, getSize=0, getUserId=0, get...#256#304886247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGNULongNameEntry", new String[]{}, new String[]{}, false, 24, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "writeEntryHeader", new String[]{"byte[]", "org.apache.commons.compress.archivers.zip.ZipEncoding", "boolean"}, new String[]{"<sample:1>", "<null>", "true"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getUserId", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getModTime", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGNUSparse", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=0, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isFile", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setModTime", "long", "16877"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setGroupId", new String[]{"long"}, new String[]{"0"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isOldGNUSparse", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLinkName", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setModTime", "java.util.Date", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isOldGNUSparse", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLinkName", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setModTime", "java.util.Date", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isOldGNUSparse", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setModTime", "java.util.Date", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=, getRealSize=0, getSize=0, getUserId=0, get...#256#304886247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isOldGNUSparse", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setModTime", "java.util.Date", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserId", new String[]{"int"}, new String[]{"16878"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=16878, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getU...#272#40971191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isDirectory", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setGroupId", "int", "999"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=999, getGroupName=, getLinkName=, getLongGroupId=999, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUse...#266#2121779249", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isDirectory", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setGroupId", "int", "999"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setName", "java.lang.String", "1.1234567890123456"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=999, getGroupName=, getLinkName=, getLongGroupId=999, getLongUserId=0, getMode=33188, getName=1.1234567890123456, getRealSize=0, getSi...#278#-1281640222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isDirectory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "equals", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isDirectory", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "equals", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isLink", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setSize", "long", "32"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=32, getUser...#265#-419218990", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isLink", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setSize", "long", "-3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isLink", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "parseTarHeader", "byte[]", "<null>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setSize", "long", "-3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isLink", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "parseTarHeader", "byte[]", "<null>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setSize", "long", "-3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isLink", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "parseTarHeader", "byte[]", "<null>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setSize", "long", "17"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isStarSparse", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=17, getUserId...#263#-2048259961", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isLink", new String[]{}, new String[]{}, false, 36, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLinkName", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getUserName", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setModTime", "java.util.Date", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isLink", new String[]{}, new String[]{}, false, 38, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getUserName", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setMode", "int", "32"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setModTime", "java.util.Date", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=32, getName=sample, getRealSize=0, getSize=0, getUserId=0, ...#259#-205467655", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isPaxHeader", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGNULongLinkEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isPaxHeader", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGNULongLinkEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserId", new String[]{"int"}, new String[]{"32"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=32, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUser...#266#-1736909617", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserId", new String[]{"int"}, new String[]{"34"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=34, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUser...#266#341316239", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isFIFO", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isFIFO", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isFIFO", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getModTime", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getMode", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setLinkName", "java.lang.String", "[1,2]"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=0, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=[1,2], getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, get...#269#106556922", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getModTime", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getMode", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setLinkName", "java.lang.String", "[1,2]"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=0, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=[1,2], getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=...#262#-1732992780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getModTime", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getMode", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setLinkName", "java.lang.String", "[1,1]"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=0, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=[1,1], getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=...#262#-1982271181", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getModTime", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getMode", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isFIFO", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setLinkName", "java.lang.String", "[1,1]"}}), new String[][]{{"after", "java.util.Date", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=[1,1], getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=...#262#-1982271181", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getModTime", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getMode", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isFIFO", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setLinkName", "java.lang.String", "[1,1]"}}), new String[][]{{"after", "java.util.Date", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=[1,1], getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=...#262#-1982271181", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getGroupId", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLongGroupId", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isSparse", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getGroupId", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLongGroupId", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isSparse", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getGroupId", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLongGroupId", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isSparse", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLinkName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isStarSparse", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserId", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLongGroupId", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isLink", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGNULongLinkEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getMode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "parseTarHeader", new String[]{"byte[]", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:0>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isOldGNUSparse", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isStarSparse", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "parseTarHeader", new String[]{"byte[]", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<null>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isOldGNUSparse", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isStarSparse", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "parseTarHeader", new String[]{"byte[]", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:0>", "<sample:7>"}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "fillGNUSparse0xData", "java.util.Map", "<sample:2>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isOldGNUSparse", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isStarSparse", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setIds", new String[]{"int", "int"}, new String[]{"-2", "-2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=-2147483648, getGroupName=, getLinkName=, getLongGroupId=-2147483648, getLongUserId=-2, getMode=33188, getName=a/sample, getRealSize=0...#286#2042977487", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setIds", new String[]{"int", "int"}, new String[]{"-2", "-2147479552"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=-2147479552, getGroupName=, getLinkName=, getLongGroupId=-2147479552, getLongUserId=-2, getMode=33188, getName=a/sample, getRealSize=0...#286#-2075302417", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setIds", new String[]{"int", "int"}, new String[]{"13", "-2147479552"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=-2147479552, getGroupName=, getLinkName=, getLongGroupId=-2147479552, getLongUserId=13, getMode=33188, getName=a/sample, getRealSize=0...#286#-1035205297", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setIds", new String[]{"int", "int"}, new String[]{"32", "-2147479552"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=-2147479552, getGroupName=, getLinkName=, getLongGroupId=-2147479552, getLongUserId=32, getMode=33188, getName=a/sample, getRealSize=0...#286#-2073826129", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setIds", new String[]{"int", "int"}, new String[]{"16", "-2147479552"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=-2147479552, getGroupName=, getLinkName=, getLongGroupId=-2147479552, getLongUserId=16, getMode=33188, getName=a/sample, getRealSize=0...#286#2082133487", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "parseTarHeader", "byte[],org.apache.commons.compress.archivers.zip.ZipEncoding", "<sample:0>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "parseTarHeader", "byte[],org.apache.commons.compress.archivers.zip.ZipEncoding", "<sample:3>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getSize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "parseTarHeader", "byte[],org.apache.commons.compress.archivers.zip.ZipEncoding", "<sample:3>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setNames", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"os.name", "/a/b"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isLink", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isBlockDevice", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=/a/b, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getU...#275#1622617417", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setNames", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"os.ne", "Y00aHello, WorldPT1H"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isLink", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=Y00aHello, WorldPT1H, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0,...#289#-1011566957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setNames", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"os.nea,b,c", "Y00aHello, WorldPT1H"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isLink", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=Y00aHello, WorldPT1H, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0,...#294#1575140641", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setNames", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"os.nea,bT,c", "Y00aHello, WorldPT1H"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=Y00aHello, WorldPT1H, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0,...#295#-46251329", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setNames", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"os.nea,bT,c", "Y00aHello, WorldPT1H"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "fillGNUSparse1xData", "java.util.Map", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=Y00aHello, WorldPT1H, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0,...#295#-46251329", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setNames", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"os.nea,bT,c", "2020-02-30T25:61:61"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "fillGNUSparse1xData", "java.util.Map", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=2020-02-30T25:61:61, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, ...#294#-1525293976", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getModTime", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getUserId", ""}}), new String[][]{{"getTimezoneOffset", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("480", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserId", new String[]{"int"}, new String[]{"33554462"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setDevMajor", "int", "-2147483648"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLongGroupId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=33554462, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, g...#278#-1508477777", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserId", new String[]{"int"}, new String[]{"60"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setDevMajor", "int", "-2147483648"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLongGroupId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=60, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUser...#266#-1666913681", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserId", new String[]{"int"}, new String[]{"120"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setDevMajor", "int", "-2147483648"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLongGroupId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=120, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUse...#268#1336459521", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getUserId", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getGroupName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserName", "java.lang.String", "GNU.sparse.name"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#279#1268637226", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getGroupName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserName", "java.lang.String", "GNU.sparse"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#274#-1469869121", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getGroupName", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getRealSize", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "parseTarHeader", "byte[]", "<sample:2>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserName", "java.lang.String", "GNU.sparse"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#272#1158513617", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setGroupId", new String[]{"int"}, new String[]{"16877"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGNULongLinkEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getRealSize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=16877, getGroupName=, getLinkName=, getLongGroupId=16877, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, ...#272#1114572575", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setGroupId", new String[]{"int"}, new String[]{"-16859"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGNULongLinkEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getRealSize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=-16859, getGroupName=, getLinkName=, getLongGroupId=-16859, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0...#274#672287167", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setGroupId", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGNULongLinkEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getRealSize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=-2147483648, getGroupName=, getLinkName=, getLongGroupId=-2147483648, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0,...#284#159190975", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isSymbolicLink", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isSymbolicLink", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isOldGNUSparse", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isSymbolicLink", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isOldGNUSparse", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "writeEntryHeader", new String[]{"byte[]", "org.apache.commons.compress.archivers.zip.ZipEncoding", "boolean"}, new String[]{"<null>", "<sample:5>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "writeEntryHeader", new String[]{"byte[]", "org.apache.commons.compress.archivers.zip.ZipEncoding", "boolean"}, new String[]{"<sample:2>", "<sample:6>", "true"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isPaxGNUSparse", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isDirectory", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setGroupId", "int", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "writeEntryHeader", new String[]{"byte[]", "org.apache.commons.compress.archivers.zip.ZipEncoding", "boolean"}, new String[]{"<sample:2>", "<sample:4>", "false"}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isPaxGNUSparse", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isExtended", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setGroupId", "int", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getGroupName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getFile", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setDevMajor", "int", "33187"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=33187, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getU...#268#-1208943521", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGNULongNameEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setLinkName", "java.lang.String", "5."}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=5., getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUse...#266#1136983512", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGNULongNameEntry", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setLinkName", "java.lang.String", "5."}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isDirectory", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=5., getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserI...#264#1072422570", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-597797096", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-909675094", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=, getRealSize=0, getSize=0, getUserId=0, get...#256#304886247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getDirectoryEntries", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.tar.TarArchiveEntry;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getDirectoryEntries", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.tar.TarArchiveEntry;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getDirectoryEntries", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.tar.TarArchiveEntry;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getName", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "fillStarSparseData", "java.util.Map", "<sample:4>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserId", "int", "-2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=-2, getMode=33188, getName=, getRealSize=0, getSize=0, getUserId=-2, g...#258#-156895961", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getName", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "fillStarSparseData", "java.util.Map", "<sample:4>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserId", "int", "62"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=62, getMode=33188, getName=, getRealSize=0, getSize=0, getUserId=62, g...#258#-371685817", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isOldGNUSparse", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isOldGNUSparse", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGNULongNameEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isOldGNUSparse", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "writeEntryHeader", "byte[],org.apache.commons.compress.archivers.zip.ZipEncoding,boolean", "<sample:0>", "<sample:1>", "true"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGNULongNameEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getRealSize", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getFile", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserName", "java.lang.String", "1.1234567890123456"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-909675094", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#280#1071809878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getFile", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserName", "java.lang.String", "1.1234567890123456"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#275#2143013844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLongUserId", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLongUserId", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getGroupName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLongUserId", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:1>"}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setLinkName", "java.lang.String", "1.5e300"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGNULongNameEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=1.5e300, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, g...#271#-1223129665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:W>"}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setLinkName", "java.lang.String", "1.6e300"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGNULongNameEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=1.6e300, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, g...#271#-959432640", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setMode", new String[]{"int"}, new String[]{"999"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=999, getName=a/sample, getRealSize=0, getSize=0, getUserId=...#262#1860059207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setMode", new String[]{"int"}, new String[]{"1000"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=1000, getName=a/sample, getRealSize=0, getSize=0, getUserId...#263#1562936871", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setMode", new String[]{"int"}, new String[]{"46"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=46, getName=a/sample, getRealSize=0, getSize=0, getUserId=0...#261#481945418", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setMode", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setMode", "int", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=2147483647, getName=a/sample, getRealSize=0, getSize=0, get...#269#592606324", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setMode", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setMode", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=2147483647, getName=0, getRealSize=0, getSize=0, getUserId=...#262#-30601286", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLongGroupId", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "equals", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setDevMinor", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLongGroupId", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "equals", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setDevMinor", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLongGroupId", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "equals", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setDevMinor", "int", "-1"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "writeEntryHeader", "byte[],org.apache.commons.compress.archivers.zip.ZipEncoding,boolean", "<sample:1>", "<sample:6>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=, getRealSize=0, getSize=0, getUserId=0, get...#256#304886247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getUserId", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setDevMinor", new String[]{"int"}, new String[]{"16876"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=16876, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getU...#268#-1898769251", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setDevMinor", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=2147483647, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0,...#273#1447646793", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isDirectory", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setGroupId", "int", "999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=999, getGroupName=, getLinkName=, getLongGroupId=999, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUse...#266#2121779249", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getUserName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getUserName", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getUserName", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getModTime", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserName", "java.lang.String", "0x123456789"}}, 3), new String[][]{{"setHours", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 03:00:00 PST 1969 {getDate=31, getDay=3, getHours=3, getMinutes=0, getMonth=11, getSeconds=0, getTime=-46800000, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#268#-29221082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getModTime", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3), new String[][]{{"setHours", "int", "6"}, {"getDate", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("31", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isPaxGNUSparse", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setIds", "int,int", "33189", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=10, getGroupName=, getLinkName=, getLongGroupId=10, getLongUserId=33189, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, ge...#274#-61179099", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isPaxGNUSparse", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setIds", "int,int", "33189", "-16877"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=-16877, getGroupName=, getLinkName=, getLongGroupId=-16877, getLongUserId=33189, getMode=33188, getName=sample, getRealSize=0, getSize...#280#-39672059", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setSize", new String[]{"long"}, new String[]{"1000"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGNULongNameEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=1000, getUs...#267#1060050770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setSize", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGNULongNameEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=92233720368...#282#1964437233", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a/sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getName", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a/sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getName", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "fillGNUSparse1xData", "java.util.Map", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getName", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setModTime", new String[]{"long"}, new String[]{"1001"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isStarSparse", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isDescendent", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isStarSparse", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isDescendent", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:5>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getFile", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "parseTarHeader", "byte[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getModTime", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getName", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isPaxHeader", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=0, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getModTime", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getName", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isPaxHeader", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isExtended", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=0, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserId", new String[]{"long"}, new String[]{"-1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=-1, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUser...#266#1517468463", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserId", new String[]{"long"}, new String[]{"1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=1, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#-443436739", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserId", new String[]{"long"}, new String[]{"0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserId", new String[]{"long"}, new String[]{"-9223372036854775808"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=-9223372036854775808, getMode=33188, getName=a/sample, getRealSize=0, ...#283#-729736029", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isPaxHeader", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLinkName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isPaxHeader", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLinkName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isPaxHeader", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLinkName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=, getRealSize=0, getSize=0, getUserId=0, get...#256#304886247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isPaxHeader", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLinkName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "parseTarHeader", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setSize", new String[]{"long"}, new String[]{"33188"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setModTime", "java.util.Date", "<empty>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "writeEntryHeader", "byte[]", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=33188, getU...#268#956326176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setSize", new String[]{"long"}, new String[]{"576460752303456676"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setModTime", "java.util.Date", "<empty>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "writeEntryHeader", "byte[]", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=57646075230...#281#1731253711", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setSize", new String[]{"long"}, new String[]{"-576460752303456676"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setModTime", "java.util.Date", "<empty>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "writeEntryHeader", "byte[]", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setSize", new String[]{"long"}, new String[]{"-576460752303456676"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setModTime", "java.util.Date", "<empty>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "writeEntryHeader", "byte[]", "<sample:2>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLastModifiedDate", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "writeEntryHeader", new String[]{"byte[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "writeEntryHeader", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setModTime", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getModTime", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setModTime", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getModTime", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isCharacterDevice", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isCharacterDevice", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getModTime", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isSparse", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=0, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a/sample, getRealSize=0, getSize=0, getUserI...#264#25647359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getRealSize", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getRealSize", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getRealSize", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "fillStarSparseData", "java.util.Map", "<sample:4>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isExtended", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getRealSize", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "fillStarSparseData", "java.util.Map", "<sample:4>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setDevMajor", "int", "60"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isExtended", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=60, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId...#263#-1804798057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getRealSize", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "fillStarSparseData", "java.util.Map", "<sample:4>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setDevMajor", "int", "60"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isExtended", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=60, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1156428179", SearchInputFactory_scaffolding.receiverState());
 }
}
