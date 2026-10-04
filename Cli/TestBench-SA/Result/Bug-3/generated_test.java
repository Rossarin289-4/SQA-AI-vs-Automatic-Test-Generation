package generated.algorithm;

import junit.framework.TestCase;

public class SimulatedAnnealingGeneratedTest extends TestCase {
 public void testGeneratedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFiles", new String[]{"java.lang.String"}, new String[]{"Unable to find: "}, true);
  assertNull(actual);
 }
 public void testGeneratedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, true);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("2020-01-01 {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-3/20261003-060509-372-6fdc507d.., getCanonicalPath=/workspace/output/ai-runs/Cli-3/20261003-0...#405#-1847968043", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"2020-01"}, true);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("2020-01 {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-3/20261003-060509-372-6fdc507d.., getCanonicalPath=/workspace/output/ai-runs/Cli-3/20261003-0605...#396#-718302669", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
 }
 public void testGeneratedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"214748:3648"}, true);
  assertNull(actual);
 }
 public void testGeneratedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"a b", "<sample:2>"}, true);
  assertNull(actual);
 }
 public void testGeneratedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"a b", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a b", String.valueOf(actual));
 }
 public void testGeneratedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true);
  assertNull(actual);
 }
 public void testGeneratedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"1"}, true);
  assertNull(actual);
 }
 public void testGeneratedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"1L"}, true), new String[][]{{"delete", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"/a/b", "<b:true>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"-12null", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-12null", String.valueOf(actual));
 }
 public void testGeneratedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"-22nu", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-22nu", String.valueOf(actual));
 }
 public void testGeneratedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"-22ull", "<sample:6>"}, true, 0, null, 2);
  assertNull(actual);
 }
 public void testGeneratedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"--22bull", "<sample:5>"}, true, 0, null, 2);
  assertNull(actual);
 }
 public void testGeneratedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"019", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("019", String.valueOf(actual));
 }
 public void testGeneratedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createDate", new String[]{"java.lang.String"}, new String[]{"1"}, true);
  assertNull(actual);
 }
 public void testGeneratedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"\013\n"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("\013\n {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-3/20261003-060509-372-6fdc507d.., getCanonicalPath=/workspace/output/ai-runs/Cli-3/20261003-060509-37...#381#-876598324", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"\013\n"}, true, 0, null, 1), new String[][]{{"renameTo", "java.io.File", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{".Xt12\n456789012345678901234567890-1", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".Xt12\n456789012345678901234567890-1", String.valueOf(actual));
 }
 public void testGeneratedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"1L", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1L", String.valueOf(actual));
 }
 public void testGeneratedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"_1L", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("_1L", String.valueOf(actual));
 }
 public void testGeneratedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, true);
  assertNull(actual);
 }
 public void testGeneratedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, true, 0, null, 3);
  assertNull(actual);
 }
 public void testGeneratedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1L"}, true, 0, null, 1);
  assertNull(actual);
 }
 public void testGeneratedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{" ", "<null>"}, true);
  assertNull(actual);
 }
 public void testGeneratedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createDate", new String[]{"java.lang.String"}, new String[]{"1.25"}, true, 0, null, 3);
  assertNull(actual);
 }
 public void testGeneratedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"\n"}, true);
  assertNull(actual);
 }
 public void testGeneratedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"0x1F", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x1F", String.valueOf(actual));
 }
 public void testGeneratedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"1", "<sample:5>"}, true, 0, null, 1);
  assertNull(actual);
 }
 public void testGeneratedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"1", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 public void testGeneratedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"abc"}, true, 0, null, 2);
  assertNull(actual);
 }
 public void testGeneratedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"2020-02-30T25:61:61", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02-30T25:61:61", String.valueOf(actual));
 }
 public void testGeneratedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"2020-02-30T25:61:61", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02-30T25:61:61", String.valueOf(actual));
 }
 public void testGeneratedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"1.1234567890123456", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567890123456", String.valueOf(actual));
 }
 public void testGeneratedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"0.1234567890123456", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.1234567890123456", String.valueOf(actual));
 }
 public void testGeneratedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"0.12345678901", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.12345678901", String.valueOf(actual));
 }
 public void testGeneratedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"0.12345678901--1", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.12345678901--1", String.valueOf(actual));
 }
 public void testGeneratedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"0.12345678901--14", "<sample:1>"}, true, 0, null, 3);
  assertNull(actual);
 }
 public void testGeneratedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"Qa b", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Qa b", String.valueOf(actual));
 }
 public void testGeneratedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"Qa b1.5d", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Qa b1.5d", String.valueOf(actual));
 }
 public void testGeneratedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"Unable to parse: ", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Unable to parse: ", String.valueOf(actual));
 }
 public void testGeneratedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFiles", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, true, 0, null, 1);
  assertNull(actual);
 }
 public void testGeneratedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createDate", new String[]{"java.lang.String"}, new String[]{"-0.0aabaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true, 0, null, 1);
  assertNull(actual);
 }
 public void testGeneratedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createDate", new String[]{"java.lang.String"}, new String[]{"1.5e30"}, true, 0, null, 2);
  assertNull(actual);
 }
 public void testGeneratedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"12345678901:345678901234567890", "<s:ke{>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"0x1F"}, true);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("0x1F {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-3/20261003-060509-372-6fdc507d.., getCanonicalPath=/workspace/output/ai-runs/Cli-3/20261003-060509-...#387#1748246258", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"Unable to parse: "}, true, 0, null, 1);
  assertNull(actual);
 }
 public void testGeneratedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFiles", new String[]{"java.lang.String"}, new String[]{"0"}, true, 0, null, 3);
  assertNull(actual);
 }
 public void testGeneratedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.5f"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 public void testGeneratedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 public void testGeneratedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c {getAuthority=example.com, getDefaultPort=80, getFile=/a?b=c, getHost=example.com, getPath=/a, getPort=-1, getProtocol=http, getQuery=b=c, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"httpL://example.com/a?b<c"}, true, 0, null, 3);
  assertNull(actual);
 }
 public void testGeneratedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"PT"}, true);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("PT {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-3/20261003-060509-372-6fdc507d.., getCanonicalPath=/workspace/output/ai-runs/Cli-3/20261003-060509-37...#381#-1063686787", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"1e10"}, true, 0, null, 2), new String[][]{{"getParent", "", "0"}});
  assertNull(actual);
 }
 public void testGeneratedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"a"}, true, 0, null, 3);
  assertNull(actual);
 }
 public void testGeneratedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1234567890123457", String.valueOf(actual));
 }
 public void testGeneratedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.12345677901234567010"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1234567790123458", String.valueOf(actual));
 }
 public void testGeneratedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"010"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 public void testGeneratedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"0110"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("110", String.valueOf(actual));
 }
 public void testGeneratedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFiles", new String[]{"java.lang.String"}, new String[]{"0xFG\u00e9FFFFFFF"}, true, 0, null, 2);
  assertNull(actual);
 }
 public void testGeneratedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"Titlea,b,c"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("Titlea,b,c {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-3/20261003-060509-372-6fdc507d.., getCanonicalPath=/workspace/output/ai-runs/Cli-3/20261003-0...#405#111580679", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"2;30:45"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("2;30:45 {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-3/20261003-060509-372-6fdc507d.., getCanonicalPath=/workspace/output/ai-runs/Cli-3/20261003-0605...#396#-582589424", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"2;30:35"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("2;30:35 {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-3/20261003-060509-372-6fdc507d.., getCanonicalPath=/workspace/output/ai-runs/Cli-3/20261003-0605...#396#1969609903", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"2;T0:351.1234567890123456"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("2;T0:351.1234567890123456 {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-3/20261003-060509-372-6fdc507d.., getCanonicalPath=/workspace/output/ai-runs/C...#450#-1781409165", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"--22bull-1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("--22bull-1 {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-3/20261003-060509-372-6fdc507d.., getCanonicalPath=/workspace/output/ai-runs/Cli-3/20261003-0...#405#815819364", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"--22bu/ll-1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("--22bu/ll-1 {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-3/20261003-060509-372-6fdc507d.., getCanonicalPath=/workspace/output/ai-runs/Cli-3/20261003-...#403#2018279459", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"--22bu/ll-11E-5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("--22bu/ll-11E-5 {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-3/20261003-060509-372-6fdc507d.., getCanonicalPath=/workspace/output/ai-runs/Cli-3/20261...#415#816074879", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 public void testGeneratedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"-0.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
 }
 public void testGeneratedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1234567890123457", String.valueOf(actual));
 }
 public void testGeneratedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 public void testGeneratedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1.5e300", "<i:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"-0.0"}, true, 0, null, 1);
  assertNull(actual);
 }
 public void testGeneratedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"1E-5"}, true, 0, null, 1);
  assertNull(actual);
 }
 public void testGeneratedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{",C6a,b]m"}, true, 0, null, 2);
  assertNull(actual);
 }
 public void testGeneratedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"010"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 public void testGeneratedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"a3aaaaaaPaaaaaaaaaaaaaaa,aaaaaa2020-02-30T25:61:61"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("a3aaaaaaPaaaaaaaaaaaaaaa,aaaaaa2020-02-30T25:61:61 {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-3/20261003-060509-372-6fdc507d.., getCanonicalPath=/w...#525#1702042340", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"a4aaaaaaPaaaaaaaaaaaaHaa,aaaaaa2020-02-31.5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("a4aaaaaaPaaaaaaaaaaaaHaa,aaaaaa2020-02-31.5 {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-3/20261003-060509-372-6fdc507d.., getCanonicalPath=/workspac...#504#-477089883", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"--11.5e300"}, true, 0, null, 1), new String[][]{{"listFiles", "java.io.FilenameFilter", "5"}});
  assertNull(actual);
 }
 public void testGeneratedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"--1.5e300"}, true, 0, null, 1), new String[][]{{"listFiles", "java.io.FilenameFilter", "5"}, {"getPath", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--1.5e300", String.valueOf(actual));
 }
 public void testGeneratedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"/xFFFFFFFF"}, true, 0, null, 2);
  assertNull(actual);
 }
 public void testGeneratedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"2.5f"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.5", String.valueOf(actual));
 }
 public void testGeneratedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"/a/bVnaale to pars: 1.5e30/0"}, true, 0, null, 2);
  assertNull(actual);
 }
 public void testGeneratedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"\t1.12345678"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.12345678", String.valueOf(actual));
 }
 public void testGeneratedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"8<?>b<aa>", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8<?>b<aa>", String.valueOf(actual));
 }
 public void testGeneratedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"8<?>b<aa", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8<?>b<aa", String.valueOf(actual));
 }
 public void testGeneratedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"{A\"a\":1}", "<s:oa>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.122147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.122147483648", String.valueOf(actual));
 }
 public void testGeneratedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.12214748348"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.12214748348", String.valueOf(actual));
 }
 public void testGeneratedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.12214747348"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.12214747348", String.valueOf(actual));
 }
 public void testGeneratedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.12214747358"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.12214747358", String.valueOf(actual));
 }
 public void testGeneratedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.12345678901234667"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1234567890123466", String.valueOf(actual));
 }
 public void testGeneratedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"-0.0"}, true, 0, null, 3);
  assertNull(actual);
 }
 public void testGeneratedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"\t", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t", String.valueOf(actual));
 }
 public void testGeneratedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"11", "<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 public void testGeneratedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
 }
 public void testGeneratedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"2147483649"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483649", String.valueOf(actual));
 }
 public void testGeneratedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"2137483649"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2137483649", String.valueOf(actual));
 }
 public void testGeneratedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.12345678", String.valueOf(actual));
 }
 public void testGeneratedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.11345678"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.11345678", String.valueOf(actual));
 }
 public void testGeneratedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.11345648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.11345648", String.valueOf(actual));
 }
 public void testGeneratedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"<a>b</", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a>b</", String.valueOf(actual));
 }
 public void testGeneratedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"0xFEFFFFFF1.112345678901234567", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFEFFFFFF1.112345678901234567", String.valueOf(actual));
 }
 public void testGeneratedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"0xFE\tFFFFFF1.1133456-8901234/567", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFE\tFFFFFF1.1133456-8901234/567", String.valueOf(actual));
 }
 public void testGeneratedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 public void testGeneratedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"1.223456789601234477", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.223456789601234477", String.valueOf(actual));
 }
 public void testGeneratedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"5."}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
 }
 public void testGeneratedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{".5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
 }
 public void testGeneratedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"http://examplf.com/a?b=c", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://examplf.com/a?b=c", String.valueOf(actual));
 }
 public void testGeneratedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
 }
 public void testGeneratedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"htTp:0/exam]BlecoI/a?a=c", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("htTp:0/exam]BlecoI/a?a=c", String.valueOf(actual));
 }
 public void testGeneratedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"hTp:0/exam]BlecoI/a?a=c1E-5", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("hTp:0/exam]BlecoI/a?a=c1E-5", String.valueOf(actual));
 }
 public void testGeneratedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"\\", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\", String.valueOf(actual));
 }
 public void testGeneratedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{".", "<sample:11>"}, true, 0, null, 3);
  assertNull(actual);
 }
 public void testGeneratedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"--22bull", "<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 public void testGeneratedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true), new String[][]{{"toExternalForm", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c", String.valueOf(actual));
 }
 public void testGeneratedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c {getAuthority=example.com, getDefaultPort=80, getFile=/a?b=c, getHost=example.com, getPath=/a, getPort=-1, getProtocol=http, getQuery=b=c, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://exmple.Iom/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://exmple.Iom/a?b=c {getAuthority=exmple.Iom, getDefaultPort=80, getFile=/a?b=c, getHost=exmple.Iom, getPath=/a, getPort=-1, getProtocol=http, getQuery=b=c, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"ccc", "<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 public void testGeneratedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://exaxmple.com/a?b=c"}, true), new String[][]{{"getContent", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.net.UnknownHostException", thrown.getClass().getName());
 }
 public void testGeneratedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true), new String[][]{{"getFile", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a?b=c", String.valueOf(actual));
 }
 public void testGeneratedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://examle.com/a?b=c1.1234567890123456"}, true), new String[][]{{"getFile", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a?b=c1.1234567890123456", String.valueOf(actual));
 }
 public void testGeneratedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://examle.com/a?b=c1.1234567890123456"}, true);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://examle.com/a?b=c1.1234567890123456 {getAuthority=examle.com, getDefaultPort=80, getFile=/a?b=c1.1234567890123456, getHost=examle.com, getPath=/a, getPort=-1, getProtocol=http, getQuery=b=c1.123...#245#1117295417", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true), new String[][]{{"getContent", "java.lang.Class[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 public void testGeneratedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 2), new String[][]{{"openConnection", "java.net.Proxy", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c {getAuthority=example.com, getDefaultPort=80, getFile=/a?b=c, getHost=example.com, getPath=/a, getPort=-1, getProtocol=http, getQuery=b=c, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://examole.com/a"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://examole.com/a {getAuthority=examole.com, getDefaultPort=80, getFile=/a, getHost=examole.com, getPath=/a, getPort=-1, getProtocol=http, getQuery=null, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 3), new String[][]{{"getHost", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("example.com", String.valueOf(actual));
 }
 public void testGeneratedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c {getAuthority=example.com, getDefaultPort=80, getFile=/a?b=c, getHost=example.com, getPath=/a, getPort=-1, getProtocol=http, getQuery=b=c, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 1), new String[][]{{"getProtocol", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http", String.valueOf(actual));
 }
 public void testGeneratedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 1), new String[][]{{"getContent", "java.lang.Class[]", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 public void testGeneratedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 2), new String[][]{{"toExternalForm", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c", String.valueOf(actual));
 }
 public void testGeneratedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://examplecpm/a?b=c"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://examplecpm/a?b=c {getAuthority=examplecpm, getDefaultPort=80, getFile=/a?b=c, getHost=examplecpm, getPath=/a, getPort=-1, getProtocol=http, getQuery=b=c, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://exaaplecpm/a?b=c"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://exaaplecpm/a?b=c {getAuthority=exaaplecpm, getDefaultPort=80, getFile=/a?b=c, getHost=exaaplecpm, getPath=/a, getPort=-1, getProtocol=http, getQuery=b=c, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://exaaplecUm/a?b=c"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://exaaplecUm/a?b=c {getAuthority=exaaplecUm, getDefaultPort=80, getFile=/a?b=c, getHost=exaaplecUm, getPath=/a, getPort=-1, getProtocol=http, getQuery=b=c, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://exaapl"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://exaapl {getAuthority=exaapl, getDefaultPort=80, getFile=, getHost=exaapl, getPath=, getPort=-1, getProtocol=http, getQuery=null, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://exa"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://exa {getAuthority=exa, getDefaultPort=80, getFile=, getHost=exa, getPath=, getPort=-1, getProtocol=http, getQuery=null, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 2), new String[][]{{"getQuery", "", "5"}, {"getDefaultPort", "", "2"}, {"sameFile", "java.net.URL", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://exampie.com/a?b=c"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://exampie.com/a?b=c {getAuthority=exampie.com, getDefaultPort=80, getFile=/a?b=c, getHost=exampie.com, getPath=/a, getPort=-1, getProtocol=http, getQuery=b=c, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 1), new String[][]{{"getDefaultPort", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("80", String.valueOf(actual));
 }
 public void testGeneratedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"[Z"}, true);
  assertNull(actual);
 }
 public void testGeneratedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[Z"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Z {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=boolean[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], get...#535#-83576801", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[Z"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Z {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=boolean[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], get...#535#-83576801", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.7c=om/a?b=c"}, true, 0, null, 1), new String[][]{{"getHost", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("example.7c=om", String.valueOf(actual));
 }
 public void testGeneratedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 1), new String[][]{{"getHost", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("example.com", String.valueOf(actual));
 }
 public void testGeneratedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[Z"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Z {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=boolean[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], get...#535#-83576801", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[[Z"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [[Z {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=boolean[][], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], ...#538#377032594", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://exampke.com/a?d=c"}, true, 0, null, 2), new String[][]{{"toExternalForm", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://exampke.com/a?d=c", String.valueOf(actual));
 }
 public void testGeneratedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://examppke.com/a?d=c"}, true, 0, null, 2), new String[][]{{"toExternalForm", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://examppke.com/a?d=c", String.valueOf(actual));
 }
 public void testGeneratedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[Z"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Z {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=boolean[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], get...#535#-83576801", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[[Z"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [[Z {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=boolean[][], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], ...#538#377032594", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[B"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [B {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=byte[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDec...#532#-686490465", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[[[Z"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [[[Z {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=boolean[][][], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[...#541#-594982405", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[I"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [I {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDecl...#531#974044457", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[D"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [D {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=double[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getD...#534#922108216", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[D"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [D {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=double[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getD...#534#922108216", SearchInputFactory_scaffolding.observe(actual));
 }
}
