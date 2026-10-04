package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"[^\\d]", "a,b,c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSNameMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+a b1E-5", "[b"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true), new String[][]{{"canRead", "", "0"}, {"isDirectory", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"i"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionAtLeast", new String[]{"float"}, new String[]{"3.4028235E38"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSMatch", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"2047483", "{\"!:1}", "8\t", "1.53"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"  "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"9"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("9.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"---1"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"getTotalSpace", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("983349346304", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionAtLeast", new String[]{"int"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"setWritable", "boolean", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"getPath", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/opt/java/openjdk", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"renameTo", "java.io.File", "0"}, {"compareTo", "java.io.File", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("14", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true), new String[][]{{"canWrite", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true), new String[][]{{"isDirectory", "", "3"}, {"lastModified", "", "3"}, {"getName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("search-fixed", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"i", "PT1H"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"setWritable", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"\r1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"{\"!:1}user.dir"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"04743"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("4743.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"1.12s45678"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 12, 45678]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true), new String[][]{{"getName", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("tmp", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true), new String[][]{{"getAbsolutePath", "", "7"}, {"toPath", "", "2"}});
  assertNotNull(actual);
  assertEquals("sun.nio.fs.UnixPath", actual.getClass().getName());
  assertEquals("/workspace/output/ai-runs/Lang-29/20261003-193249-095-23b38fd1/algorithm-pso/evaluation/fitness/search-fixed {getNameCount=9, isAbsolute=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"{\"!:1}"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{".53"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[53, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true), new String[][]{{"setReadable", "boolean,boolean", "7"}, {"getName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("openjdk", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"\u00e91.12345678"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.1234568", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"canWrite", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSNameMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"bjava.awt.graphicsenv", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true), new String[][]{{"setLastModified", "long", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"i"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61java.class.path"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("2020.23", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"getAbsolutePath", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/tmp", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionAtLeast", new String[]{"int"}, new String[]{"2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true), new String[][]{{"setReadable", "boolean", "3"}, {"toURI", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.net.URI", actual.getClass().getName());
  assertEquals("file:/opt/java/openjdk/ {getAuthority=null, getFragment=null, getHost=null, getPath=/opt/java/openjdk/, getPort=-1, getQuery=null, getRawAuthority=null, getRawFragment=null, getRawPath=/opt/java/openj...#381#186184450", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"1^5f"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("150", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("200", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"v1,28"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.28", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"0x1F"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"<a>b"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"TITLE"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSMatch", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"PrT1H", "\n", "java.compimer", "{\"\"!:1}"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true), new String[][]{{"getPath", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/opt/java/openjdk", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"getTotalSpace", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("983349346304", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSNameMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"{!\n1}", "[\\d]"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"-1-5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("150", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"1.1234567java.awt.printerjob "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.1234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{".521474836447"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"-2.5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("2.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"2047383"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2047383]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"1.1233567890123457"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSMatch", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"1.5f.5e300", "", "-1C5", "P1,3]"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"2148483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"1.1245671.5e300"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.1245672", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"2vH0-01-01"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("2.01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"a8 buser.dir"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("8.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionAtLeast", new String[]{"int"}, new String[]{"3"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSMatch", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"9", "java.class.version", "1F-5file.encoding", "java.ho "}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"list", "java.io.FilenameFilter", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"1.1234567890w23456"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 1234567890, 23456]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaAwtHeadless", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"1-0234567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2345770", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"isDirectory", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true), new String[][]{{"listFiles", "java.io.FilenameFilter", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.io.File;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true), new String[][]{{"listFiles", "java.io.FilenameFilter", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.io.File;", actual.getClass().getName());
  assertEquals("[/opt/java/openjdk/bin, /opt/java/openjdk/lib, /opt/java/openjdk/jmods, /opt/java/openjdk/legal, /opt/java/openjdk/conf, /opt/java/openjdk/release, /opt/java/openjdk/include, /opt/java/openjdk/man, /o...#223#-991007599", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF6"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"1.5e300true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("450", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSMatch", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"[]\\d]", "j`va.io.tmpdir", "", "jjsva.home"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true), new String[][]{{"mkdir", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true), new String[][]{{"getCanonicalPath", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/root", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"1223456789012345578901234567890"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true), new String[][]{{"canRead", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"2020-02-30T2F:61:61"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("202050", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"file6separator"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("600", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"nukl"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true), new String[][]{{"isHidden", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 2, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"[^\\d2"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true), new String[][]{{"delete", "", "0"}, {"toURI", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.net.URI", actual.getClass().getName());
  assertEquals("file:/workspace/output/ai-runs/Lang-29/20261003-193249-095-23b38fd1/algorithm-pso/evaluation/fitness/search-fixed/ {getAuthority=null, getFragment=null, getHost=null, getPath=/workspace/output/ai-runs...#648#-1404376516", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"1.1234567java.awt.printxrjob"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 1234567]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"+a b1E-5null2020-02-30T25:61:61"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 5, 2020, 2, 30, 25, 61, 61, 0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true), new String[][]{{"getName", "", "5"}, {"mkdirs", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaAwtHeadless", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"1.5e30["}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("180", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"01/"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"setLastModified", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true), new String[][]{{"mkdir", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"0x1Fjava.library.path2020-02-30T25:61:61"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2030", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true), new String[][]{{"listFiles", "java.io.FilenameFilter", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.io.File;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"mkdir", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"1.5f"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"compareTo", "java.io.File", "7"}, {"listFiles", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.io.File;", actual.getClass().getName());
  assertEquals("[/tmp/jansi-2.4.3-bb333ecbff74a1f7-libjansi.so.lck, /tmp/jansi-2.4.3-bb333ecbff74a1f7-libjansi.so, /tmp/tomcat.8080.17597536642731864978, /tmp/tomcat.8080.4052791338623087315, /tmp/hsperfdata_root, /t...#351#802813531", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true), new String[][]{{"getParent", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/workspace/output/ai-runs/Lang-29/20261003-193249-095-23b38fd1/algorithm-pso/evaluation/fitness", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"4"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("4.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSNameMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "java.class.pat;h1.12345678901234567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"7rue"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("7.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true), new String[][]{{"getParentFile", "", "5"}, {"getPath", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"mull"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a,ac", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true), new String[][]{{"length", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"8user.xdir"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("8.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"fild.encoding1.5e300"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.53", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"{\"a\"1}"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"canRead", "", "4"}, {"compareTo", "java.io.File", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("22", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true), new String[][]{{"getAbsolutePath", "", "2"}, {"compareTo", "java.io.File", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"getParent", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 12345678]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionAtLeast", new String[]{"int"}, new String[]{"28"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"delete", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaAwtHeadless", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"011"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1100", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"mkdir", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"delete", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"1E"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"h--1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"list", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[jansi-2.4.3-bb333ecbff74a1f7-libjansi.so.lck, jansi-2.4.3-bb333ecbff74a1f7-libjansi.so, tomcat.8080.17597536642731864978, tomcat.8080.4052791338623087315, hsperfdata_root, tb-check2, tomcat.8080.2508...#301#97503157", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"java.endorsed.7irs"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("700", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"*1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionAtLeast", new String[]{"float"}, new String[]{"-2.14748365E9"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"1.123456F8901234567"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"listFiles", "java.io.FilenameFilter", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.io.File;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionAtLeast", new String[]{"int"}, new String[]{"2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"0x123456788"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1234567880", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"getParent", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/workspace/output/ai-runs/Lang-29/20261003-193249-095-23b38fd1/algorithm-pso/evaluation/fitness", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"010"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61java.class.pathPT1H"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("2020.23", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"1.5e50b"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("200", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"canExecute", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"canWrite", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"getAbsolutePath", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/tmp", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSNameMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"[^\\d^0", "202001-01"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"."}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"exists", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"/1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"setExecutable", "boolean,boolean", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{".5i1E-5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("515", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSNameMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"java.compilesjava.endorsed.dirs", "1L"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"22020-02-01"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("22020.21", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"ae1/"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true), new String[][]{{"setReadable", "boolean,boolean", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"1E.5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 5, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"2030-01-01null"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2030, 1, 1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"g11L"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("11.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"java.wt.printerjob"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"1L"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionAtLeast", new String[]{"float"}, new String[]{"3"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"-1-6"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionAtLeast", new String[]{"float"}, new String[]{"2.14748365E9"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"java.c^ompiler2020-02-30T25:61:61"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("2020.23", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"/a0b"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"renameTo", "java.io.File", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"1.1m3456789013456"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"-1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionAtLeast", new String[]{"float"}, new String[]{"-0.95"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"listFiles", "java.io.FileFilter", "5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.io.File;", actual.getClass().getName());
  assertEquals("[/workspace/output/ai-runs/Lang-29/20261003-193249-095-23b38fd1/algorithm-pso/evaluation/fitness/search-fixed/build.xml, /workspace/output/ai-runs/Lang-29/20261003-193249-095-23b38fd1/algorithm-pso/ev...#2117#189512177", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"lastModified", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionAtLeast", new String[]{"float"}, new String[]{"-2.14748365E9"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.530x123456789", "1.531E-5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"[1,2+]"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 2, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSMatch", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "8", "", "010"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"getPath", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/opt/java/openjdk", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"isFile", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"\t--1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"0x1F"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{">x1F"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"1.12345678901234560"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"java.awt.fonts2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-100", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionAtLeast", new String[]{"int"}, new String[]{"-2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"getPath", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/opt/java/openjdk", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"1.1223C45678"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 1223, 45678]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaAwtHeadless", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"2147483+6648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("214814780", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionAtLeast", new String[]{"int"}, new String[]{"2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSNameMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"[b", ""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"+1\n"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"+a b1E-5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 5, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"getAbsolutePath", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/workspace/output/ai-runs/Lang-29/20261003-193249-095-23b38fd1/algorithm-pso/evaluation/fitness/search-fixed", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionAtLeast", new String[]{"int"}, new String[]{"268435424"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSMatch", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"a,,b,d", "<null>", "1.5", "12:30:45"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"compareTo", "java.io.File", "6"}, {"isDirectory", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"isFile", "", "4"}, {"getName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("openjdk", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"1.6f"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("160", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSMatch", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"1:e10", "{\"`\":1}", "<null>", "[bfile.separator"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"getName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("root", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"listFiles", "java.io.FilenameFilter", "6"}});
  assertNotNull(actual);
  assertEquals("[Ljava.io.File;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"getUsableSpace", "", "4"}, {"listFiles", "java.io.FilenameFilter", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.io.File;", actual.getClass().getName());
  assertEquals("[/root/.bashrc, /root/.profile, /root/.subversion, /root/.java, /root/.m2, /root/.cpanm, /root/.wget-hsts]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"[1,2]TITLE1.12345678"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 2, 1, 12345678, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"length", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4096", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"getPath", "", "1"}, {"compareTo", "java.io.File", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("22", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"delete", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"getName", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("tmp", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"1\\:30:45"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.3045", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"3abc1.5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("315", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"toURL", "", "5"}, {"getContent", "", "3"}});
  assertNotNull(actual);
  assertEquals("sun.net.www.content.text.PlainTextInputStream", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"canExecute", "", "1"}, {"isHidden", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"0xFEFFFFFF"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"H.5f1.12345678901234567"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSNameMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.26", ""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"setReadable", "boolean,boolean", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"a,b,c.5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("500", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"setLastModified", "long", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"getName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("search-fixed", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"getParent", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/opt/java", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"createNewFile", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"010.5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1050", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".1.51.12345678", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"1234567890123456789012345677890[^\\d]"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"getParent", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/workspace/output/ai-runs/Lang-29/20261003-193249-095-23b38fd1/algorithm-pso/evaluation/fitness", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSMatch", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"awt.t", "-0.5", "", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"getAbsolutePath", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/tmp", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"2020-1s-30T25:61:61java.class.path"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2020, 1, 30, 25, 61, 61, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"getCanonicalFile", "", "1"}, {"createNewFile", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"getPath", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/root", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSMatch", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"12:30:45", "{\"!:1}user.dir", "", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"listFiles", "", "5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.io.File;", actual.getClass().getName());
  assertEquals("[/workspace/output/ai-runs/Lang-29/20261003-193249-095-23b38fd1/algorithm-pso/evaluation/fitness/search-fixed/build.xml, /workspace/output/ai-runs/Lang-29/20261003-193249-095-23b38fd1/algorithm-pso/ev...#2117#189512177", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"getTotalSpace", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("983349346304", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"awt.toolkitabcPT1H", "awt.t"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"getPath", "", "7"}, {"mkdirs", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSNameMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1E-4.5", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"listFiles", "java.io.FileFilter", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.io.File;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionAtLeast", new String[]{"float"}, new String[]{"Infinity"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"compareTo", "java.io.File", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-50", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"mkdir", "", "4"}, {"getParent", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionAtLeast", new String[]{"float"}, new String[]{"1.07374182E9"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"toURL", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("file:/opt/java/openjdk/ {getAuthority=, getDefaultPort=-1, getFile=/opt/java/openjdk/, getHost=, getPath=/opt/java/openjdk/, getPort=-1, getProtocol=file, getQuery=null, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "java.runtime.version"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345678902234567", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSMatch", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"21477483648", "1.123445678901234561", "<null>", ""}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"getParent", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/opt/java", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"listFiles", "java.io.FileFilter", "1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.io.File;", actual.getClass().getName());
  assertEquals("[/root/.bashrc, /root/.profile, /root/.subversion, /root/.java, /root/.m2, /root/.cpanm, /root/.wget-hsts]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSNameMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TITLE31.1234567890123456", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSMatch", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"java.class.versionTITLE12:30:45", "1.12345678901234567", "", "1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"getName", "", "3"}, {"list", "java.io.FilenameFilter", "2"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSMatch", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"java.homejava.library.path1e10", "{Ia\":0}", "<null>", "20,20-02-30T25:61:61"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSNameMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-0.00xFFFFFFFF", ""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"20474835.-1.5", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSNameMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"5. 2020-02-30T25:61:61", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSMatch", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"a,b,cjava.compiler", "p15e300", "", ""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"java.io.tmpdir", "java.io.tmpdir"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5e300Title", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-1.52020-02-30T25:61:61", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
