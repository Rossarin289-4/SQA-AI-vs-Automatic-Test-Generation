package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2147483647", "0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setDiskStartNumber", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[3, 0, 0, 0], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 16 {getBytes=[16, 0], getValue=16}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setCompressedSize", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getHeaderId", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:5>"}}), new String[][]{{"getValue", "", "5"}, {"clone", "", "0"}, {"getBytes", "", "5"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,.., getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "1"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", "boolean,boolean,boolean,boolean", "false", "true", "false", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", new String[]{"boolean", "boolean", "boolean", "boolean"}, new String[]{"false", "false", "true", "false"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromCentralDirectoryData", "byte[],int,int", "<empty>", "-2147483648", "0"}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromLocalFileData", "byte[],int,int", "<empty>", "-4", "10"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.zip.ZipException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataData", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:2>", "10", "1064"}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", "boolean,boolean,boolean,boolean", "false", "true", "true", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromCentralDirectoryData", "byte[],int,int", "<empty>", "1073741823", "76"}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", "boolean,boolean,boolean,boolean", "true", "false", "false", "false"}}, 2), new String[][]{{"getBytes", "", "2"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[8, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0,.., getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setCompressedSize", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", new String[]{"boolean", "boolean", "boolean", "boolean"}, new String[]{"false", "false", "false", "false"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getRelativeHeaderOffset", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "-2147483648", "2147483647"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getRelativeHeaderOffset", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getDiskStartNumber", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getDiskStartNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryLength", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "53", "0"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", new String[]{"boolean", "boolean", "boolean", "boolean"}, new String[]{"true", "true", "true", "true"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getHeaderId", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0,.., getLocalFileDataData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "1048577", "0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromCentralDirectoryData", "byte[],int,int", "<null>", "-1", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getHeaderId", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 1 {getBytes=[1, 0], getValue=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCompressedSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "-1073741843", "0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getHeaderId", ""}}, 1), new String[][]{{"getLongValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setDiskStartNumber", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:10>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[8, 0, 0, 0], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromCentralDirectoryData", "byte[],int,int", "<null>", "2110", "506"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 24 {getBytes=[24, 0], getValue=24}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0, 1, .., getLocalFileDataData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setDiskStartNumber", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", ""}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", "boolean,boolean,boolean,boolean", "true", "false", "false", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", "boolean,boolean,boolean,boolean", "true", "false", "true", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getDiskStartNumber", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipLong", actual.getClass().getName());
  assertEquals("ZipLong value: 4 {getBytes=[4, 0, 0, 0], getValue=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getHeaderId", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 1 {getBytes=[1, 0], getValue=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCompressedSize", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setCompressedSize", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getHeaderId", ""}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:0>", "-2", "10"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setCompressedSize", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", new String[]{"boolean", "boolean", "boolean", "boolean"}, new String[]{"true", "false", "true", "true"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setCompressedSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:10>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[8, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getRelativeHeaderOffset", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[4, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "2147483647", "32815"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromLocalFileData", "byte[],int,int", "<empty>", "0", "-1"}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryLength", ""}}, 2), new String[][]{{"clone", "", "4"}, {"getBytes", "", "3"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[28, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", new String[]{"boolean", "boolean", "boolean", "boolean"}, new String[]{"true", "false", "true", "true"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getDiskStartNumber", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", new String[]{"boolean", "boolean", "boolean", "boolean"}, new String[]{"false", "false", "true", "true"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getHeaderId", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", "boolean,boolean,boolean,boolean", "true", "true", "true", "false"}}, 1), new String[][]{{"clone", "", "1"}, {"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromCentralDirectoryData", "byte[],int,int", "<empty>", "-2147483648", "1"}}, 3), new String[][]{{"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"getBytes", "", "6"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", ""}}, 1), new String[][]{{"getLongValue", "", "0"}, {"getBytes", "", "6"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1, -1, -1, -1, -1, -1, -1, -1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", new String[]{"boolean", "boolean", "boolean", "boolean"}, new String[]{"false", "false", "false", "false"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setCompressedSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getDiskStartNumber", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCompressedSize", ""}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getHeaderId", ""}}, 2), new String[][]{{"getLongValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getDiskStartNumber", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "-2147483648", "-1"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.zip.ZipException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCompressedSize", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getHeaderId", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"getBytes", "", "1"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setCompressedSize", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryData", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromLocalFileData", "byte[],int,int", "<null>", "-1", "2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", new String[]{"boolean", "boolean", "boolean", "boolean"}, new String[]{"true", "true", "false", "false"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getHeaderId", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setCompressedSize", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<null>"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, 4, .., getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getRelativeHeaderOffset", ""}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getDiskStartNumber", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"getBytes", "", "3"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", new String[]{"boolean", "boolean", "boolean", "boolean"}, new String[]{"true", "false", "false", "false"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:7>"}}, 3), new String[][]{{"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:5>"}}, 1), new String[][]{{"clone", "", "5"}, {"getBytes", "", "2"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[8, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", ""}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:6>"}}, 1), new String[][]{{"getBytes", "", "1"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[4, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[4, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getHeaderId", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getDiskStartNumber", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 1 {getBytes=[1, 0], getValue=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "-2147483648", "-1073741822"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryLength", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.zip.ZipException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setCompressedSize", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[4, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromCentralDirectoryData", "byte[],int,int", "<empty>", "0", "2068"}}, 2), new String[][]{{"getBytes", "", "2"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[4, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0,.., getLocalFileDataData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getHeaderId", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", ""}}, 1), new String[][]{{"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 1 {getBytes=[1, 0], getValue=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromLocalFileData", "byte[],int,int", "<sample:2>", "539", "0"}}, 2), new String[][]{{"clone", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 0 {getBytes=[0, 0], getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromCentralDirectoryData", "byte[],int,int", "<null>", "-2147483607", "-2"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-2147483648", "1034"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setCompressedSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", "boolean,boolean,boolean,boolean", "false", "false", "false", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setDiskStartNumber", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataData", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0, 2, .., getLocalFileDataData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getHeaderId", ""}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", "boolean,boolean,boolean,boolean", "true", "true", "true", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "-2147483647", "1"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCompressedSize", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryData", ""}}, 2), new String[][]{{"getBytes", "", "4"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[28, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0,.., getLocalFileDataData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "10", "2147483647"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getDiskStartNumber", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getDiskStartNumber", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipLong", actual.getClass().getName());
  assertEquals("ZipLong value: 4 {getBytes=[4, 0, 0, 0], getValue=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setCompressedSize", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryData", ""}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", ""}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", "boolean,boolean,boolean,boolean", "true", "false", "true", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", actual.getClass().getName());
  assertEquals("ZipEightByteInteger value: 0 {getBytes=[0, 0, 0, 0, 0, 0, 0, 0], getLongValue=0, getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:10>"}}, 3), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[8, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[8, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", new String[]{"boolean", "boolean", "boolean", "boolean"}, new String[]{"false", "false", "false", "false"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0,.., getLocalFileDataData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getHeaderId", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 1 {getBytes=[1, 0], getValue=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataData", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getDiskStartNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setCompressedSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataData", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryLength", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 0 {getBytes=[0, 0], getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getDiskStartNumber", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCompressedSize", ""}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getDiskStartNumber", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", new String[]{"boolean", "boolean", "boolean", "boolean"}, new String[]{"false", "true", "false", "false"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCompressedSize", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:2>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setDiskStartNumber", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[3, 0, 0, 0], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getRelativeHeaderOffset", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataData", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0,.., getLocalFileDataData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "-2147483648", "0"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getHeaderId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "1", "-6"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", ""}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCompressedSize", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", new String[]{"boolean", "boolean", "boolean", "boolean"}, new String[]{"false", "false", "true", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0,.., getLocalFileDataData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getDiskStartNumber", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getDiskStartNumber", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setDiskStartNumber", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[2, 0, 0, 0], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getRelativeHeaderOffset", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getRelativeHeaderOffset", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 0 {getBytes=[0, 0], getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getRelativeHeaderOffset", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getDiskStartNumber", ""}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", actual.getClass().getName());
  assertEquals("ZipEightByteInteger value: 1 {getBytes=[1, 0, 0, 0, 0, 0, 0, 0], getLongValue=1, getValue=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0,.., getLocalFileDataData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCompressedSize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromLocalFileData", "byte[],int,int", "<empty>", "-1073741843", "-2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", new String[]{"boolean", "boolean", "boolean", "boolean"}, new String[]{"false", "false", "true", "true"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", new String[]{"boolean", "boolean", "boolean", "boolean"}, new String[]{"true", "false", "true", "true"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataData", ""}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataData", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setDiskStartNumber", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", "boolean,boolean,boolean,boolean", "true", "false", "true", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:5>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "1", "1034"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getDiskStartNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getRelativeHeaderOffset", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[8, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setCompressedSize", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "-2147483622", "0"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setDiskStartNumber", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryLength", new String[]{}, new String[]{}, false), new String[][]{{"getBytes", "", "0"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getRelativeHeaderOffset", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setCompressedSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setDiskStartNumber", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCompressedSize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[8, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", ""}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", "boolean,boolean,boolean,boolean", "true", "false", "true", "true"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", actual.getClass().getName());
  assertEquals("ZipEightByteInteger value: 0 {getBytes=[0, 0, 0, 0, 0, 0, 0, 0], getLongValue=0, getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:9>"}}), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("24", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "-1034", "-2147483648"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.zip.ZipException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "1034"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getRelativeHeaderOffset", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCompressedSize", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", actual.getClass().getName());
  assertEquals("ZipEightByteInteger value: 1 {getBytes=[1, 0, 0, 0, 0, 0, 0, 0], getLongValue=1, getValue=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setCompressedSize", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:0>", "-2147483648", "16"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setCompressedSize", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:5>"}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", "boolean,boolean,boolean,boolean", "true", "false", "true", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1,.., getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "2147483647", "0"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryData", ""}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getDiskStartNumber", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getRelativeHeaderOffset", ""}}), new String[][]{{"getLongValue", "", "5"}, {"getValue", "", "5"}, {"getLongValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0,.., getLocalFileDataData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCompressedSize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromLocalFileData", "byte[],int,int", "<sample:0>", "1", "-4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", actual.getClass().getName());
  assertEquals("ZipEightByteInteger value: 0 {getBytes=[0, 0, 0, 0, 0, 0, 0, 0], getLongValue=0, getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setCompressedSize", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCompressedSize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, 4, .., getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "-2147483648", "0"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCompressedSize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", ""}}), new String[][]{{"getBytes", "", "4"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getValue", "", "2"}, {"getBytes", "", "2"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-1073741823", "0"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getRelativeHeaderOffset", ""}}), new String[][]{{"getBytes", "", "5"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[28, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", ""}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", "boolean,boolean,boolean,boolean", "false", "true", "false", "false"}}), new String[][]{{"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getRelativeHeaderOffset", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getBytes", "", "1"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1, -1, -1, -1, -1, -1, -1, -1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromLocalFileData", "byte[],int,int", "<sample:2>", "0", "47"}}), new String[][]{{"getBytes", "", "2"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:5>"}}), new String[][]{{"getValue", "", "3"}, {"getBytes", "", "4"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1, -1, -1, -1, -1, -1, -1, -1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "536870912", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCompressedSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:6>"}}), new String[][]{{"getBytes", "", "0"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1, -1, -1, -1, -1, -1, -1, -1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=[4, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", ""}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", "boolean,boolean,boolean,boolean", "true", "true", "false", "true"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 16 {getBytes=[16, 0], getValue=16}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:5>"}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getHeaderId", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 0 {getBytes=[0, 0], getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", new String[]{"boolean", "boolean", "boolean", "boolean"}, new String[]{"true", "false", "true", "true"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setCompressedSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getRelativeHeaderOffset", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getHeaderId", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryData", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 1 {getBytes=[1, 0], getValue=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:3>"}}), new String[][]{{"getBytes", "", "4"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", ""}}), new String[][]{{"getValue", "", "1"}, {"getLongValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", "boolean,boolean,boolean,boolean", "false", "false", "false", "false"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getHeaderId", new String[]{}, new String[]{}, false), new String[][]{{"getValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataData", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getRelativeHeaderOffset", ""}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", "boolean,boolean,boolean,boolean", "true", "false", "true", "true"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 16 {getBytes=[16, 0], getValue=16}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[4, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCompressedSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", ""}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCompressedSize", ""}}), new String[][]{{"getBytes", "", "6"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0,.., getLocalFileDataData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getHeaderId", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", "boolean,boolean,boolean,boolean", "true", "true", "false", "false"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 1 {getBytes=[1, 0], getValue=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getHeaderId", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCompressedSize", ""}}), new String[][]{{"getBytes", "", "3"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setDiskStartNumber", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:0>"}}), new String[][]{{"getBytes", "", "4"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[4, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:4>"}}), new String[][]{{"getBytes", "", "2"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataData", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getRelativeHeaderOffset", ""}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:4>"}}), new String[][]{{"getLongValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getHeaderId", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1, -1, -1, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[-1, -1, -1, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCompressedSize", ""}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", ""}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", "boolean,boolean,boolean,boolean", "true", "false", "true", "false"}}), new String[][]{{"getValue", "", "0"}, {"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCompressedSize", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", actual.getClass().getName());
  assertEquals("ZipEightByteInteger value: -1 {getBytes=[-1, -1, -1, -1, -1, -1, -1, -1], getLongValue=-1, getValue=-1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCompressedSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getDiskStartNumber", ""}}), new String[][]{{"getLongValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCompressedSize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setCompressedSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:2>"}}), new String[][]{{"clone", "", "1"}, {"getBytes", "", "4"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[16, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataData", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getDiskStartNumber", ""}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromLocalFileData", "byte[],int,int", "<sample:3>", "-2", "-23"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryLength", ""}}), new String[][]{{"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCompressedSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryLength", ""}}), new String[][]{{"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataData", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryData", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getBytes", "", "3"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[16, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getHeaderId", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getDiskStartNumber", ""}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:5>", "1", "-1073741855"}}, 3), new String[][]{{"getBytes", "", "6"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "10", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromCentralDirectoryData", "byte[],int,int", "<null>", "-1", "2147483647"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:6>"}}, 3), new String[][]{{"getBytes", "", "7"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, 4, .., getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:1>"}}), new String[][]{{"clone", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 8 {getBytes=[8, 0], getValue=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromLocalFileData", "byte[],int,int", "<sample:0>", "-2147483648", "-1073741824"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getRelativeHeaderOffset", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", ""}}), new String[][]{{"getLongValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0,.., getLocalFileDataData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", ""}}, 3), new String[][]{{"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, 1, .., getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:2>"}}), new String[][]{{"getBytes", "", "4"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[8, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setDiskStartNumber", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 4 {getBytes=[4, 0], getValue=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[2, 0, 0, 0], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getRelativeHeaderOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setDiskStartNumber", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[2, 0, 0, 0], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setCompressedSize", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0,.., getLocalFileDataData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", new String[]{"boolean", "boolean", "boolean", "boolean"}, new String[]{"true", "true", "false", "true"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:0>"}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getDiskStartNumber", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setDiskStartNumber", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setDiskStartNumber", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:8>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "2147483647", "0"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=[4, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"clone", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 16 {getBytes=[16, 0], getValue=16}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCompressedSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getRelativeHeaderOffset", ""}}), new String[][]{{"getLongValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0,.., getLocalFileDataData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2147483647", "-2147483648"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setCompressedSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "1042", "-1073741843"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.zip.ZipException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getHeaderId", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 1 {getBytes=[1, 0], getValue=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setCompressedSize", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setCompressedSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:4>"}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getDiskStartNumber", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:7>"}}, 1), new String[][]{{"clone", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 8 {getBytes=[8, 0], getValue=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setDiskStartNumber", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[2, 0, 0, 0], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", ""}}, 1), new String[][]{{"getValue", "", "6"}, {"getBytes", "", "4"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[4, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0,.., getLocalFileDataData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryData", ""}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromLocalFileData", "byte[],int,int", "<sample:0>", "1034", "-2"}}, 1), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0,.., getLocalFileDataData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", new String[]{"boolean", "boolean", "boolean", "boolean"}, new String[]{"false", "false", "true", "false"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryData", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "10", "-2147483640"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", ""}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", "boolean,boolean,boolean,boolean", "false", "false", "true", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataData", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getHeaderId", ""}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setCompressedSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setDiskStartNumber", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0], getLocalFileDataData=[4, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 16 {getBytes=[16, 0], getValue=16}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getDiskStartNumber", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:8>"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", new String[]{"boolean", "boolean", "boolean", "boolean"}, new String[]{"true", "true", "false", "true"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0,.., getLocalFileDataData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCompressedSize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", "boolean,boolean,boolean,boolean", "true", "false", "true", "true"}}, 2), new String[][]{{"getValue", "", "4"}, {"getLongValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", ""}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", "boolean,boolean,boolean,boolean", "false", "true", "true", "true"}}, 3), new String[][]{{"getBytes", "", "6"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getHeaderId", ""}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", "boolean,boolean,boolean,boolean", "true", "false", "true", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0,.., getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getHeaderId", ""}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", actual.getClass().getName());
  assertEquals("ZipEightByteInteger value: -1 {getBytes=[-1, -1, -1, -1, -1, -1, -1, -1], getLongValue=-1, getValue=-1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[-1, -1, -1, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:2>", "1019", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getRelativeHeaderOffset", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:7>"}}), new String[][]{{"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,.., getLocalFileDataData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCompressedSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getRelativeHeaderOffset", ""}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromLocalFileData", "byte[],int,int", "<sample:0>", "536870911", "-46"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", actual.getClass().getName());
  assertEquals("ZipEightByteInteger value: 0 {getBytes=[0, 0, 0, 0, 0, 0, 0, 0], getLongValue=0, getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0,.., getLocalFileDataData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCompressedSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setCompressedSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", "boolean,boolean,boolean,boolean", "false", "true", "true", "true"}}), new String[][]{{"getBytes", "", "2"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getHeaderId", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"clone", "", "0"}, {"clone", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 1 {getBytes=[1, 0], getValue=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0,.., getLocalFileDataData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", new String[]{"boolean", "boolean", "boolean", "boolean"}, new String[]{"false", "false", "false", "false"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCompressedSize", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataData", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setDiskStartNumber", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<null>"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:7>"}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:0>", "-7", "0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getRelativeHeaderOffset", ""}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:2>"}}, 1), new String[][]{{"getBytes", "", "1"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0,.., getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getHeaderId", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:6>"}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getRelativeHeaderOffset", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 1 {getBytes=[1, 0], getValue=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getRelativeHeaderOffset", ""}}, 1), new String[][]{{"clone", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 0 {getBytes=[0, 0], getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"getBytes", "", "7"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[16, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0,.., getLocalFileDataData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", ""}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getRelativeHeaderOffset", ""}}, 3), new String[][]{{"clone", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 16 {getBytes=[16, 0], getValue=16}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:2>", "-1073741842", "2068"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 16 {getBytes=[16, 0], getValue=16}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", new String[]{"boolean", "boolean", "boolean", "boolean"}, new String[]{"true", "true", "false", "true"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setCompressedSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromLocalFileData", "byte[],int,int", "<empty>", "131073", "80"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", "boolean,boolean,boolean,boolean", "false", "true", "false", "true"}}, 3), new String[][]{{"getBytes", "", "6"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[16, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", "boolean,boolean,boolean,boolean", "true", "false", "true", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryLength", ""}}), new String[][]{{"getBytes", "", "4"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[16, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataData", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1, -1, -1, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[-1, -1, -1, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCompressedSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", "boolean,boolean,boolean,boolean", "true", "true", "true", "true"}}, 2), new String[][]{{"getBytes", "", "2"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0,.., getLocalFileDataData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", ""}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", "boolean,boolean,boolean,boolean", "false", "true", "true", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getHeaderId", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromCentralDirectoryData", "byte[],int,int", "<empty>", "-1073742080", "-536870921"}}, 1), new String[][]{{"getBytes", "", "2"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCompressedSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<null>"}}, 1), new String[][]{{"getLongValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0], getLocalFileDataData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getHeaderId", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 1 {getBytes=[1, 0], getValue=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getHeaderId", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataData", ""}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:1>"}}, 3), new String[][]{{"getBytes", "", "4"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[16, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-1", "1073741843"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getHeaderId", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", actual.getClass().getName());
  assertEquals("ZipEightByteInteger value: 0 {getBytes=[0, 0, 0, 0, 0, 0, 0, 0], getLongValue=0, getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getDiskStartNumber", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipLong", actual.getClass().getName());
  assertEquals("ZipLong value: 4 {getBytes=[4, 0, 0, 0], getValue=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getHeaderId", ""}}, 2), new String[][]{{"getLongValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", new String[]{"boolean", "boolean", "boolean", "boolean"}, new String[]{"true", "false", "true", "false"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataLength", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:7>"}}), new String[][]{{"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 16 {getBytes=[16, 0], getValue=16}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0, 0, .., getLocalFileDataData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setCompressedSize", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromLocalFileData", "byte[],int,int", "<sample:1>", "10", "-2147483648"}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", "boolean,boolean,boolean,boolean", "true", "true", "true", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromLocalFileData", "byte[],int,int", "<sample:0>", "1073741823", "65546"}}, 3), new String[][]{{"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0,.., getLocalFileDataData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataData", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCompressedSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryLength", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", actual.getClass().getName());
  assertEquals("ZipEightByteInteger value: -1 {getBytes=[-1, -1, -1, -1, -1, -1, -1, -1], getLongValue=-1, getValue=-1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getLocalFileDataData", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:4>"}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getDiskStartNumber", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getDiskStartNumber", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", new String[]{"boolean", "boolean", "boolean", "boolean"}, new String[]{"true", "true", "true", "true"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:2>", "0", "20"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.zip.ZipException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setDiskStartNumber", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:0>"}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setDiskStartNumber", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setDiskStartNumber", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0,.., getLocalFileDataData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getDiskStartNumber", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1, -1, -1, -1, -1, -1, -1, -1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", new String[]{"boolean", "boolean", "boolean", "boolean"}, new String[]{"false", "false", "false", "true"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:0>", "1034", "0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.zip.ZipException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setRelativeHeaderOffset", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", "boolean,boolean,boolean,boolean", "true", "true", "true", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getRelativeHeaderOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setCompressedSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCompressedSize", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromCentralDirectoryData", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2147483647", "20"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getRelativeHeaderOffset", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryData", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0,.., getLocalFileDataData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setDiskStartNumber", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:1>"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0,.., getLocalFileDataData=[4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getDiskStartNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryLength", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setDiskStartNumber", new String[]{"org.apache.commons.compress.archivers.zip.ZipLong"}, new String[]{"<sample:5>"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromLocalFileData", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "10", "0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:1>", "-2147483648", "2147483647"}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryLength", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "reparseCentralDirectoryData", "boolean,boolean,boolean,boolean", "false", "true", "true", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getRelativeHeaderOffset", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:0>", "-41", "-2147483648"}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryData", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getDiskStartNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromLocalFileData", "byte[],int,int", "<empty>", "-2", "-2147483648"}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setCompressedSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getSize", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"getBytes", "", "6"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1, -1, -1, -1, -1, -1, -1, -1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setCompressedSize", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:2>", "2147483647", "-2"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getRelativeHeaderOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "parseFromCentralDirectoryData", "byte[],int,int", "<sample:4>", "0", "-5"}, {"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=!IllegalArgumentException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getDiskStartNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setDiskStartNumber", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:6>"}}), new String[][]{{"getValue", "", "6"}, {"getValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0, 4, .., getLocalFileDataData=[-1, -1, -1, -1, -1, -1, -1, -1, 4, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setSize", new String[]{"org.apache.commons.compress.archivers.zip.ZipEightByteInteger"}, new String[]{"<sample:7>"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1], getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getDiskStartNumber", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0], getLocalFileDataData=[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getRelativeHeaderOffset", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", actual.getClass().getName());
  assertEquals("ZipEightByteInteger value: -1 {getBytes=[-1, -1, -1, -1, -1, -1, -1, -1], getLongValue=-1, getValue=-1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1,.., getLocalFileDataData=[0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "getCentralDirectoryLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "setDiskStartNumber", "org.apache.commons.compress.archivers.zip.ZipLong", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipShort", actual.getClass().getName());
  assertEquals("ZipShort value: 4 {getBytes=[4, 0], getValue=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCentralDirectoryData=[4, 0, 0, 0], getLocalFileDataData=[]}", SearchInputFactory_scaffolding.receiverState());
 }
}
