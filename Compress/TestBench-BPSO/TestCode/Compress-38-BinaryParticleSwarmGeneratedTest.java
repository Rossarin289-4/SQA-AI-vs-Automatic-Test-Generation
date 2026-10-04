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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "fillGNUSparse1xData", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setDevMajor", new String[]{"int"}, new String[]{"-1073745920"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isSparse", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "fillGNUSparse0xData", "java.util.Map", "<sample:1>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setName", "java.lang.String", "123456789012345678901234567890-0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=123456789012345678901234567890-0.0, getRealS...#290#-675840355", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isLink", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isSymbolicLink", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "equals", "java.lang.Object", "<i:56>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=, getRealSize=0, getSize=0, getUserId=0, get...#256#304886247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setDevMinor", new String[]{"int"}, new String[]{"8439"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "hashCode", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=8439, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0,...#260#-28204933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getMode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isFile", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("33188", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGNULongNameEntry", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setNames", "java.lang.String,java.lang.String", "", "user.naame"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=user.naame, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUs...#267#-1787116500", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setLinkName", new String[]{"java.lang.String"}, new String[]{"Size is out of range: "}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setModTime", "java.util.Date", "<sample:1>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isFile", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=Size is out of range: , getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getS...#279#1568194252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setSize", new String[]{"long"}, new String[]{"-68719442545"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isFIFO", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getGroupId", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setGroupId", new String[]{"long"}, new String[]{"4611686018427387903"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setName", "java.lang.String", "0x1F1.12345678901234567/"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isDirectory", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=-1, getGroupName=, getLinkName=, getLongGroupId=4611686018427387903, getLongUserId=0, getMode=33188, getName=0x1F1.12345678901234567/,...#299#-152171071", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLongUserId", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setIds", "int,int", "92", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("92", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=?, getGroupId=2147483647, getGroupName=, getLinkName=, getLongGroupId=2147483647, getLongUserId=92, getMode=16877, getName=a/, getRealSize=0, getSize...#277#-234711084", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "parseTarHeader", new String[]{"byte[]"}, new String[]{"<null>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setGroupName", new String[]{"java.lang.String"}, new String[]{"-0.0+1"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLastModifiedDate", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=-0.0+1, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId...#263#2018559268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getDevMinor", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getDevMinor", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isDirectory", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGNULongLinkEntry", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getDevMajor", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=, getRealSize=0, getSize=0, getUserId=0, get...#256#304886247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setNames", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"H", "-116877"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=-116877, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, get...#270#379393876", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getGroupName", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isPaxGNUSparse", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "fillGNUSparse1xData", new String[]{"java.util.Map"}, new String[]{"<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setMode", new String[]{"int"}, new String[]{"-76"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=-76, getName=sample, getRealSize=0, getSize=0, getUserId=0,...#260#1850918924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setDevMinor", new String[]{"int"}, new String[]{"-5"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getDevMajor", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setIds", new String[]{"int", "int"}, new String[]{"16612", "-2147483648"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGlobalPaxHeader", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=-2147483648, getGroupName=, getLinkName=, getLongGroupId=-2147483648, getLongUserId=16612, getMode=33188, getName=sample, getRealSize=...#290#-135514483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setMode", new String[]{"int"}, new String[]{"158"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=158, getName=sample, getRealSize=0, getSize=0, getUserId=0,...#260#-592952620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "parseTarHeader", new String[]{"byte[]", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:0>", "<sample:5>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "parseTarHeader", new String[]{"byte[]"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setMode", "int", "33187"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isSparse", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "parseTarHeader", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isFIFO", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isSparse", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isLink", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isPaxHeader", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isSparse", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setName", "java.lang.String", " -0.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName= -0.0, getRealSize=0, getSize=0, getUserId=0...#261#617288612", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isSparse", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLinkName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setDevMajor", new String[]{"int"}, new String[]{"1000"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserId", "int", "-2"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=1000, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=-2, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUse...#267#1387841768", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLongUserId", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isOldGNUSparse", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setModTime", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setIds", "int,int", "67108800", "-2147483648"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=-2147483648, getGroupName=, getLinkName=, getLongGroupId=-2147483648, getLongUserId=67108800, getMode=33188, getName=, getRealSize=0, ...#290#-828393465", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setModTime", new String[]{"java.util.Date"}, new String[]{"<null>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setName", new String[]{"java.lang.String"}, new String[]{"16"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGlobalPaxHeader", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getModTime", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=16, getRealSize=0, getSize=0, getUserId=0, g...#258#-67891060", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "parseTarHeader", new String[]{"byte[]", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<null>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isBlockDevice", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setModTime", "java.util.Date", "<empty>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLongUserId", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a, getRealSize=0, getSize=0, getUserId=0, ge...#257#-978397888", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "fillGNUSparse0xData", new String[]{"java.util.Map"}, new String[]{"<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isFIFO", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGNUSparse", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a, getRealSize=0, getSize=0, getUserId=0, ge...#257#-978397888", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isLink", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "parseTarHeader", "byte[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a, getRealSize=0, getSize=0, getUserId=0, ge...#257#-978397888", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "writeEntryHeader", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isSymbolicLink", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isFile", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "writeEntryHeader", new String[]{"byte[]", "org.apache.commons.compress.archivers.zip.ZipEncoding", "boolean"}, new String[]{"<sample:0>", "<sample:10>", "true"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLinkName", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a, getRealSize=0, getSize=0, getUserId=0, ge...#257#-978397888", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getGroupId", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isExtended", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getDevMajor", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isCharacterDevice", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a, getRealSize=0, getSize=0, getUserId=0, ge...#257#-978397888", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isCheckSumOK", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "writeEntryHeader", new String[]{"byte[]", "org.apache.commons.compress.archivers.zip.ZipEncoding", "boolean"}, new String[]{"<null>", "<sample:10>", "false"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGNULongLinkEntry", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isDirectory", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "fillGNUSparse0xData", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getDevMajor", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "fillGNUSparse0xData", "java.util.Map", "<null>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getGroupName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setModTime", new String[]{"java.util.Date"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setGroupName", "java.lang.String", "1e"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getMode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=1e, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=, getRealSize=0, getSize=0, getUserId=0, g...#258#1650845179", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGNULongLinkEntry", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a, getRealSize=0, getSize=0, getUserId=0, ge...#257#-978397888", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isCharacterDevice", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getDevMinor", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGNULongNameEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a, getRealSize=0, getSize=0, getUserId=0, ge...#257#-978397888", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLongUserId", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getUserName", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserName", "java.lang.String", "1E-5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1E-5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#261#987035699", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setMode", new String[]{"int"}, new String[]{"-85"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=-85, getName=sample, getRealSize=0, getSize=0, getUserId=0,...#260#1790682410", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLastModifiedDate", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "parseTarHeader", "byte[]", "<empty>"}}), new String[][]{{"setMonth", "int", "1"}, {"getDay", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isSparse", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isFile", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getFile", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getDirectoryEntries", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.tar.TarArchiveEntry;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setGroupId", new String[]{"long"}, new String[]{"-66334"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLastModifiedDate", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=-66334, getGroupName=, getLinkName=, getLongGroupId=-66334, getLongUserId=0, getMode=33188, getName=a, getRealSize=0, getSize=0, getUs...#267#245377222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "fillGNUSparse1xData", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setIds", "int,int", "2147483647", "64"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isSparse", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getUserName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a, getRealSize=0, getSize=0, getUserId=0, ge...#257#-978397888", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getGroupName", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getDirectoryEntries", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isBlockDevice", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=, getRealSize=0, getSize=0, getUserId=0, get...#256#304886247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserId", new String[]{"long"}, new String[]{"33132"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=33132, getMode=33188, getName=, getRealSize=0, getSize=0, getUserId=33...#264#-1906296985", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getDevMinor", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "fillStarSparseData", "java.util.Map", "<sample:3>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGNULongNameEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isBlockDevice", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setDevMajor", new String[]{"int"}, new String[]{"16928"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=16928, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUse...#266#1349970011", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getDirectoryEntries", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getUserName", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.tar.TarArchiveEntry;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isLink", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGlobalPaxHeader", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGNUSparse", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setModTime", new String[]{"java.util.Date"}, new String[]{"<sample:2>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "fillStarSparseData", new String[]{"java.util.Map"}, new String[]{"<sample:4>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=, getRealSize=0, getSize=0, getUserId=0, get...#256#304886247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "equals", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry"}, new String[]{"<sample:0>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a, getRealSize=0, getSize=0, getUserId=0, ge...#257#-978397888", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:3>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isPaxHeader", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getDevMajor", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=, getRealSize=0, getSize=0, getUserId=0, get...#256#304886247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setNames", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12<30:452020-01-01", "!!"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=!!, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=, getRealSize=0, getSize=0, getUserId=0, g...#276#-863530360", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "parseTarHeader", new String[]{"byte[]", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<null>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "fillGNUSparse1xData", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isCharacterDevice", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isSparse", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "parseTarHeader", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setDevMinor", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=2147483647, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a, getRealSize=0, getSize=0, getUse...#266#1459279670", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isOldGNUSparse", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a, getRealSize=0, getSize=0, getUserId=0, ge...#257#-978397888", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "parseTarHeader", new String[]{"byte[]", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<empty>", "<sample:7>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getDirectoryEntries", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGNULongLinkEntry", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=, getRealSize=0, getSize=0, getUserId=0, get...#256#304886247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isOldGNUSparse", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isPaxGNUSparse", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setModTime", new String[]{"long"}, new String[]{"287"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isLink", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=, getRealSize=0, getSize=0, getUserId=0, get...#256#304886247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isBlockDevice", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserName", "java.lang.String", "a,b,c"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#267#-778990877", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=, getRealSize=0, getSize=0, getUserId=0, get...#256#304886247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setGroupId", new String[]{"long"}, new String[]{"16594"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=16594, getGroupName=, getLinkName=, getLongGroupId=16594, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, ge...#270#1493572273", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getGroupId", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a, getRealSize=0, getSize=0, getUserId=0, ge...#257#-978397888", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserName", new String[]{"java.lang.String"}, new String[]{"1e"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a, getRealSize=0, getSize=0, getUserId=0, ge...#259#-84715348", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setGroupId", new String[]{"long"}, new String[]{"-522775"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setModTime", "java.util.Date", "<sample:4>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserName", "java.lang.String", "000"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=-522775, getGroupName=, getLinkName=, getLongGroupId=-522775, getLongUserId=0, getMode=33188, getName=a, getRealSize=0, getSize=0, get...#272#-1235861806", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getRealSize", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setDevMinor", new String[]{"int"}, new String[]{"-1073741824"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGNUSparse", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isFIFO", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=, getRealSize=0, getSize=0, getUserId=0, get...#256#304886247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGNULongNameEntry", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGNULongLinkEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setNames", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"vi", "\u00e91000"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setDevMajor", "int", "2113"}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getModTime", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=2113, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=\u00e91000, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, ge...#272#126420159", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGlobalPaxHeader", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setModTime", "java.util.Date", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "equals", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry"}, new String[]{"<sample:2>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isOldGNUSparse", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserId", "long", "72057594037944531"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=72057594037944531, getMode=33188, getName=sample, getRealSize=0, getSi...#282#-810306000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isPaxGNUSparse", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=, getRealSize=0, getSize=0, getUserId=0, get...#256#304886247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "fillStarSparseData", new String[]{"java.util.Map"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getLongUserId", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=a, getRealSize=0, getSize=0, getUserId=0, ge...#257#-978397888", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isPaxHeader", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "parseTarHeader", "byte[],org.apache.commons.compress.archivers.zip.ZipEncoding", "<null>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setModTime", new String[]{"java.util.Date"}, new String[]{"<sample:1>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=, getRealSize=0, getSize=0, getUserId=0, get...#256#304886247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isPaxGNUSparse", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserId", new String[]{"long"}, new String[]{"17592186061296"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=17592186061296, getMode=33188, getName=sample, getRealSize=0, getSize=...#279#43805509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isFile", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "parseTarHeader", "byte[]", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getGroupId", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isSparse", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserName", "java.lang.String", "7 6"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#265#-955795388", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGNULongLinkEntry", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setSize", "long", "8360"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=8360, getUser...#265#731315862", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "fillGNUSparse1xData", new String[]{"java.util.Map"}, new String[]{"<sample:4>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setUserId", new String[]{"int"}, new String[]{"1"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getMode", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=1, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=1, ge...#257#-1043280529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isFIFO", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isGNUSparse", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getGroupName", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "parseTarHeader", "byte[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=sample, getRealSize=0, getSize=0, getUserId=...#262#-787949679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "getUserId", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "setIds", "int,int", "30", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=30, getMode=33188, getName=, getRealSize=0, getSize=0, getUserId=30, g...#258#886799911", SearchInputFactory_scaffolding.receiverState());
 }
}
