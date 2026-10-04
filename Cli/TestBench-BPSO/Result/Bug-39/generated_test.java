package generated.algorithm;

import junit.framework.TestCase;

public class BinaryParticleSwarmGeneratedTest extends TestCase {
 public void testGeneratedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"--1.4"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFiles", new String[]{"java.lang.String"}, new String[]{"1,2]"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"1.12.345678"}, true);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("1.12.345678 {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-39/20261003-064531-866-47c20ac.., getCanonicalPath=/workspace/output/ai-runs/Cli-39/20261003...#408#-945496974", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"0,2"}, true);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("0,2 {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-39/20261003-064531-866-47c20ac.., getCanonicalPath=/workspace/output/ai-runs/Cli-39/20261003-064531-...#384#-852522545", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"tue"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"IIi"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createDate", new String[]{"java.lang.String"}, new String[]{"Taaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1.25"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{".5TITLE"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{".0.0", "<s:k7ex>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"5/", "<sample:3>"}, true, 0, null, 1);
  assertNull(actual);
 }
 public void testGeneratedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"-0.00x1F", "<null>"}, true);
  assertNull(actual);
 }
 public void testGeneratedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createDate", new String[]{"java.lang.String"}, new String[]{"1.25"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"--1.4a b"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{".5TITLEE"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFiles", new String[]{"java.lang.String"}, new String[]{"PT1H"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createDate", new String[]{"java.lang.String"}, new String[]{"0x1F-1"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFiles", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"Not yt implementedNot yet implemented"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("Not yt implementedNot yet implemented {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-39/20261003-064531-866-47c20ac.., getCanonicalPath=/workspace/outp...#486#-287366990", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"i"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{".5TITLE-1.5"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"00"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"1.1244567"}, true), new String[][]{{"isHidden", "", "7"}, {"setWritable", "boolean,boolean", "7"}, {"getAbsoluteFile", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("/workspace/output/ai-runs/Cli-39/20261003-064531-866-47c20ac9/algorithm-pso/evaluation/fitness/search-fixed/1.1244567 {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/outpu...#620#349093199", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1-C"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"1,2]\n"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFiles", new String[]{"java.lang.String"}, new String[]{"1.5e3/0"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"0"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"0xFFFFFFFFNot yet implementedUnable to find file: ", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFFFFFFNot yet implementedUnable to find file: ", String.valueOf(actual));
 }
 public void testGeneratedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"Not yet implemfnted"}, true), new String[][]{{"getCanonicalPath", "", "1"}, {"getTotalSpace", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{".5e300"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0E299", String.valueOf(actual));
 }
 public void testGeneratedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"E-5"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"21_20-02-30T25:61:61", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("21_20-02-30T25:61:61", String.valueOf(actual));
 }
 public void testGeneratedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1L1.1234567890123456", "<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"1231456789012345678901234567890"}, true), new String[][]{{"getCanonicalPath", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/workspace/output/ai-runs/Cli-39/20261003-064531-866-47c20ac9/algorithm-pso/evaluation/fitness/search-fixed/1231456789012345678901234567890", String.valueOf(actual));
 }
 public void testGeneratedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"0L", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0L", String.valueOf(actual));
 }
 public void testGeneratedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"0b"}, true), new String[][]{{"deleteOnExit", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("0b {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-39/20261003-064531-866-47c20ac.., getCanonicalPath=/workspace/output/ai-runs/Cli-39/20261003-064531-8...#381#1213252243", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"123556789012345678901234567890", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("123556789012345678901234567890", String.valueOf(actual));
 }
 public void testGeneratedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"0x122456789"}, true, 0, null, 1), new String[][]{{"canRead", "", "2"}, {"listFiles", "java.io.FilenameFilter", "3"}});
  assertNull(actual);
 }
 public void testGeneratedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"1.12/345678901234567"}, true, 0, null, 2), new String[][]{{"lastModified", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"8"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"1.24", "<sample:3>"}, true, 0, null, 3);
  assertNull(actual);
 }
 public void testGeneratedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.25"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.25", String.valueOf(actual));
 }
 public void testGeneratedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://exmple.com/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://exmple.com/a?b=c {getAuthority=exmple.com, getDefaultPort=80, getFile=/a?b=c, getHost=exmple.com, getPath=/a, getPort=-1, getProtocol=http, getQuery=b=c, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"12930:45", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12930:45", String.valueOf(actual));
 }
 public void testGeneratedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createDate", new String[]{"java.lang.String"}, new String[]{"0x-FFFFFFFFNot yet implementedUnable to find file: "}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"0yFFFFFGFF"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("0yFFFFFGFF {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-39/20261003-064531-866-47c20ac.., getCanonicalPath=/workspace/output/ai-runs/Cli-39/20261003-...#405#-698100213", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"!1.25", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("!1.25", String.valueOf(actual));
 }
 public void testGeneratedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"1.5f", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5f", String.valueOf(actual));
 }
 public void testGeneratedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, true, 0, null, 2), new String[][]{{"isAbsolute", "", "1"}, {"getName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2]", String.valueOf(actual));
 }
 public void testGeneratedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"1.123456781.1234567890123456"}, true, 0, null, 2), new String[][]{{"getName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.123456781.1234567890123456", String.valueOf(actual));
 }
 public void testGeneratedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"17.5e300", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("17.5e300", String.valueOf(actual));
 }
 public void testGeneratedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"1,\\", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"2147", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147", String.valueOf(actual));
 }
 public void testGeneratedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"{\n", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\n", String.valueOf(actual));
 }
 public void testGeneratedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"b", "<sample:1>"}, true, 0, null, 2);
  assertNull(actual);
 }
 public void testGeneratedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"01012:30:45"}, true, 0, null, 1), new String[][]{{"exists", "", "3"}, {"isAbsolute", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"0x1F", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x1F", String.valueOf(actual));
 }
 public void testGeneratedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"71.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("71.5", String.valueOf(actual));
 }
 public void testGeneratedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"-1", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{".4", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".4", String.valueOf(actual));
 }
 public void testGeneratedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaa5aaaaaaaaaaaaaa"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"<aT>b</a>", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<aT>b</a>", String.valueOf(actual));
 }
 public void testGeneratedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"1,1]"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{" \n"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals(" \n {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-39/20261003-064531-866-47c20ac.., getCanonicalPath=/workspace/output/ai-runs/Cli-39/20261003-064531-8...#381#-1794119573", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"{\"a\":1}}", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}}", String.valueOf(actual));
 }
 public void testGeneratedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"7"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 public void testGeneratedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"http://example.com/a2?b=c", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.com/a2?b=c", String.valueOf(actual));
 }
 public void testGeneratedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"1e10", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1e10", String.valueOf(actual));
 }
 public void testGeneratedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"1.1234567", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567", String.valueOf(actual));
 }
 public void testGeneratedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{".5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
 }
 public void testGeneratedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"0x1Fa"}, true, 0, null, 3), new String[][]{{"canExecute", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"", "<sample:5>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1.5", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1.5", String.valueOf(actual));
 }
 public void testGeneratedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"00x2F", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("00x2F", String.valueOf(actual));
 }
 public void testGeneratedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{".4"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.4", String.valueOf(actual));
 }
 public void testGeneratedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"1.12.445678"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"010", "<sample:5>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://exmple.dom/a?b=c"}, true), new String[][]{{"getPort", "", "5"}, {"getQuery", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b=c", String.valueOf(actual));
 }
 public void testGeneratedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"/a/b"}, true, 0, null, 2), new String[][]{{"toURI", "", "4"}, {"getRawAuthority", "", "0"}});
  assertNull(actual);
 }
 public void testGeneratedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.12345"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.12345", String.valueOf(actual));
 }
 public void testGeneratedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"Titl"}, true, 0, null, 2), new String[][]{{"isAbsolute", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"itrue"}, true, 0, null, 1), new String[][]{{"getAbsolutePath", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/workspace/output/ai-runs/Cli-39/20261003-064531-866-47c20ac9/algorithm-pso/evaluation/fitness/search-fixed/itrue", String.valueOf(actual));
 }
 public void testGeneratedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"TITLE/a/b12:30:45", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITLE/a/b12:30:45", String.valueOf(actual));
 }
 public void testGeneratedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"1.5", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 public void testGeneratedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.5d"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 public void testGeneratedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"Unable to find file: 1.12.345678"}, true, 0, null, 2), new String[][]{{"mkdirs", "", "1"}, {"setExecutable", "boolean,boolean", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"1,\\5/", "<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"-0.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
 }
 public void testGeneratedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"31.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("31.5", String.valueOf(actual));
 }
 public void testGeneratedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"tque"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http:/p/example.com/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http:/p/example.com/a?b=c {getAuthority=null, getDefaultPort=80, getFile=/p/example.com/a?b=c, getHost=, getPath=/p/example.com/a, getPort=-1, getProtocol=http, getQuery=b=c, getRef=null, getUserInfo=...#205#-576774781", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"PT1H<", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT1H<", String.valueOf(actual));
 }
 public void testGeneratedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"a,b,ctrue", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,ctrue", String.valueOf(actual));
 }
 public void testGeneratedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"a5/"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1234567890123457", String.valueOf(actual));
 }
 public void testGeneratedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"5."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
 }
 public void testGeneratedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{",1.5", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(",1.5", String.valueOf(actual));
 }
 public void testGeneratedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1.12345678901234467", "<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 public void testGeneratedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"[1,x].5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("[1,x].5 {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-39/20261003-064531-866-47c20ac.., getCanonicalPath=/workspace/output/ai-runs/Cli-39/20261003-064...#396#397706339", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFF"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("0xFFFFFFF {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-39/20261003-064531-866-47c20ac.., getCanonicalPath=/workspace/output/ai-runs/Cli-39/20261003-0...#402#1388499783", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"tu", "<s:Pkez>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"-11.12345678901234567"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-11.123456789012346", String.valueOf(actual));
 }
 public void testGeneratedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"1.12345678901"}, true, 0, null, 3), new String[][]{{"createNewFile", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"123456779012345678901234567890"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("123456779012345678901234567890 {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-39/20261003-064531-866-47c20ac.., getCanonicalPath=/workspace/output/ai-r...#465#-855314183", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1..Te300", "<s:a>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"", "<null>"}, true);
  assertNull(actual);
 }
 public void testGeneratedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{".4e300"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.0E299", String.valueOf(actual));
 }
 public void testGeneratedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.4e300"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.4E300", String.valueOf(actual));
 }
 public void testGeneratedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"\n010"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("\n010 {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-39/20261003-064531-866-47c20ac.., getCanonicalPath=/workspace/output/ai-runs/Cli-39/20261003-064531...#387#1427612986", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"0x1F", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x1F", String.valueOf(actual));
 }
 public void testGeneratedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.12345677901234467"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1234567790123446", String.valueOf(actual));
 }
 public void testGeneratedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.2", String.valueOf(actual));
 }
 public void testGeneratedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.12345678901234560"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1234567890123457", String.valueOf(actual));
 }
 public void testGeneratedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.02345678"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.02345678", String.valueOf(actual));
 }
 public void testGeneratedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.5e400"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 public void testGeneratedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"15f", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("15f", String.valueOf(actual));
 }
 public void testGeneratedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"0.1234567"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.1234567", String.valueOf(actual));
 }
 public void testGeneratedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.4"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.4", String.valueOf(actual));
 }
 public void testGeneratedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1234567890123457", String.valueOf(actual));
 }
 public void testGeneratedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"21"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("21", String.valueOf(actual));
 }
 public void testGeneratedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
 }
 public void testGeneratedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"-1.5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.5", String.valueOf(actual));
 }
 public void testGeneratedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"-1.5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.io.FileInputStream", actual.getClass().getName());
 }
 public void testGeneratedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.coF/a?b=c"}, true), new String[][]{{"openConnection", "java.net.Proxy", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.4"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.4", String.valueOf(actual));
 }
 public void testGeneratedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"//b"}, true, 0, null, 3), new String[][]{{"available", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"Not yet implemeenyed", "<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 public void testGeneratedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5E300", String.valueOf(actual));
 }
 public void testGeneratedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"3"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 public void testGeneratedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"0x1F", "<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 public void testGeneratedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"/a/b "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.io.FileInputStream", actual.getClass().getName());
 }
 public void testGeneratedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"+1"}, true), new String[][]{{"getFD", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.io.FileDescriptor", actual.getClass().getName());
 }
 public void testGeneratedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"-1.5"}, true), new String[][]{{"getFD", "", "1"}, {"valid", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://dxmple.com/a?b=cNot yet implemented"}, true), new String[][]{{"getContent", "java.lang.Class[]", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.net.UnknownHostException", thrown.getClass().getName());
 }
 public void testGeneratedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"+1"}, true), new String[][]{{"mark", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.io.FileInputStream", actual.getClass().getName());
 }
 public void testGeneratedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http:/.example.com/a?b=cnull"}, true);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http:/.example.com/a?b=cnull {getAuthority=null, getDefaultPort=80, getFile=/.example.com/a?b=cnull, getHost=, getPath=/.example.com/a, getPort=-1, getProtocol=http, getQuery=b=cnull, getRef=null, get...#214#-1897205297", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"1.5f"}, true), new String[][]{{"readAllBytes", "", "7"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"+1"}, true), new String[][]{{"getChannel", "", "3"}});
  assertNotNull(actual);
  assertEquals("sun.nio.ch.FileChannelImpl", actual.getClass().getName());
  assertEquals("{isOpen=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"1.5f"}, true), new String[][]{{"readNBytes", "byte[],int,int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true), new String[][]{{"getHost", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("example.com", String.valueOf(actual));
 }
 public void testGeneratedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http:./exmple.com/a?b=c"}, true), new String[][]{{"getProtocol", "", "3"}, {"toURI", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.net.URI", actual.getClass().getName());
  assertEquals("http:./exmple.com/a?b=c {getAuthority=null, getFragment=null, getHost=null, getPath=null, getPort=-1, getQuery=null, getRawAuthority=null, getRawFragment=null, getRawPath=null, getRawQuery=null, getRa...#353#473436502", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com}a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://example.com}a?b=c {getAuthority=example.com}a, getDefaultPort=80, getFile=?b=c, getHost=example.com}a, getPath=, getPort=-1, getProtocol=http, getQuery=b=c, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://exmple.c"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://exmple.c {getAuthority=exmple.c, getDefaultPort=80, getFile=, getHost=exmple.c, getPath=, getPort=-1, getProtocol=http, getQuery=null, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://exmple.com/a?b=c"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://exmple.com/a?b=c {getAuthority=exmple.com, getDefaultPort=80, getFile=/a?b=c, getHost=exmple.com, getPath=/a, getPort=-1, getProtocol=http, getQuery=b=c, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c {getAuthority=example.com, getDefaultPort=80, getFile=/a?b=c, getHost=example.com, getPath=/a, getPort=-1, getProtocol=http, getQuery=b=c, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c {getAuthority=example.com, getDefaultPort=80, getFile=/a?b=c, getHost=example.com, getPath=/a, getPort=-1, getProtocol=http, getQuery=b=c, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/`?b=c"}, true, 0, null, 1), new String[][]{{"getHost", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("example.com", String.valueOf(actual));
 }
 public void testGeneratedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"+1"}, true, 0, null, 1), new String[][]{{"available", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://exaample.com/a?b=c"}, true, 0, null, 1), new String[][]{{"getContent", "java.lang.Class[]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.net.UnknownHostException", thrown.getClass().getName());
 }
 public void testGeneratedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c {getAuthority=example.com, getDefaultPort=80, getFile=/a?b=c, getHost=example.com, getPath=/a, getPort=-1, getProtocol=http, getQuery=b=c, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"+1"}, true, 0, null, 2), new String[][]{{"available", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://exmple.com/a?b=c"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://exmple.com/a?b=c {getAuthority=exmple.com, getDefaultPort=80, getFile=/a?b=c, getHost=exmple.com, getPath=/a, getPort=-1, getProtocol=http, getQuery=b=c, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://exmple.com/a?b=c"}, true, 0, null, 1), new String[][]{{"getDefaultPort", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("80", String.valueOf(actual));
 }
 public void testGeneratedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"1.5f"}, true, 0, null, 2), new String[][]{{"getChannel", "", "5"}});
  assertNotNull(actual);
  assertEquals("sun.nio.ch.FileChannelImpl", actual.getClass().getName());
  assertEquals("{isOpen=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://ex`mple.com/a?b=cHello, World"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://ex`mple.com/a?b=cHello, World {getAuthority=ex`mple.com, getDefaultPort=80, getFile=/a?b=cHello, World, getHost=ex`mple.com, getPath=/a, getPort=-1, getProtocol=http, getQuery=b=cHello, World, ...#230#-2111290635", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://e"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://e {getAuthority=e, getDefaultPort=80, getFile=, getHost=e, getPath=, getPort=-1, getProtocol=http, getQuery=null, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"-1.5"}, true, 0, null, 2), new String[][]{{"markSupported", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.coma?b=c"}, true, 0, null, 3), new String[][]{{"getContent", "java.lang.Class[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.net.UnknownHostException", thrown.getClass().getName());
 }
 public void testGeneratedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/b?b=c"}, true, 0, null, 3), new String[][]{{"getContent", "java.lang.Class[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 public void testGeneratedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/?b=c"}, true, 0, null, 3), new String[][]{{"getFile", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/?b=c", String.valueOf(actual));
 }
 public void testGeneratedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 3), new String[][]{{"getPort", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http:/i"}, true, 0, null, 3), new String[][]{{"getPath", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/i", String.valueOf(actual));
 }
 public void testGeneratedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=ca,b,c"}, true, 0, null, 1), new String[][]{{"getContent", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 public void testGeneratedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 2), new String[][]{{"getQuery", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b=c", String.valueOf(actual));
 }
 public void testGeneratedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"2020-0I2-30T25:61:61", "<sample:11>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"121234567890123456", "<sample:11>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("121234567890123456", String.valueOf(actual));
 }
 public void testGeneratedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c[1,2]"}, true, 0, null, 2), new String[][]{{"getAuthority", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("example.com", String.valueOf(actual));
 }
 public void testGeneratedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 2), new String[][]{{"getContent", "java.lang.Class[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 public void testGeneratedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://exm"}, true, 0, null, 2), new String[][]{{"getFile", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
}
