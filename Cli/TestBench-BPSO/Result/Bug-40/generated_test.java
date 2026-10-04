package generated.algorithm;

import junit.framework.TestCase;

public class BinaryParticleSwarmGeneratedTest extends TestCase {
 public void testGeneratedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createDate", new String[]{"java.lang.String"}, new String[]{"1E-50"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"0105."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("105.0", String.valueOf(actual));
 }
 public void testGeneratedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{""}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFiles", new String[]{"java.lang.String"}, new String[]{"-0-"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"-11"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createDate", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFiles", new String[]{"java.lang.String"}, new String[]{"ttp://example.com/a?b=c"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"0x123456789", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x123456789", String.valueOf(actual));
 }
 public void testGeneratedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"null"}, true);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("null {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-40/20261003-064650-386-ba506aa.., getCanonicalPath=/workspace/output/ai-runs/Cli-40/20261003-064650...#387#959269716", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"-2", "<i:47>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"0105.+1\t"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1E.501"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"[1,2]0xFFFFFFFF"}, true, 0, null, 3), new String[][]{{"listFiles", "java.io.FileFilter", "1"}});
  assertNull(actual);
 }
 public void testGeneratedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"t"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"0", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"2147483648", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"<a>b</a>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a>b</a>", String.valueOf(actual));
 }
 public void testGeneratedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"a b "}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{".5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
 }
 public void testGeneratedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1234567890123456789012345678901.1234567890123456"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.2345678901234568E30", String.valueOf(actual));
 }
 public void testGeneratedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1234567890123457", String.valueOf(actual));
 }
 public void testGeneratedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFiles", new String[]{"java.lang.String"}, new String[]{"`I"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", String.valueOf(actual));
 }
 public void testGeneratedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"2147483648", "<sample:4>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 public void testGeneratedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{",-1", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"1.5f"}, true);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("1.5f {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-40/20261003-064650-386-ba506aa.., getCanonicalPath=/workspace/output/ai-runs/Cli-40/20261003-064650...#387#-894066177", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"1", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 public void testGeneratedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1234567", String.valueOf(actual));
 }
 public void testGeneratedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"1e10"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createDate", new String[]{"java.lang.String"}, new String[]{"2021-01-01"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createDate", new String[]{"java.lang.String"}, new String[]{"1E-50"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"2020-0<1-01", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-0<1-01", String.valueOf(actual));
 }
 public void testGeneratedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"1.51"}, true, 0, null, 3), new String[][]{{"getCanonicalPath", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/workspace/output/ai-runs/Cli-40/20261003-064650-386-ba506aa9/algorithm-pso/evaluation/fitness/search-fixed/1.51", String.valueOf(actual));
 }
 public void testGeneratedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"115."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("115.0", String.valueOf(actual));
 }
 public void testGeneratedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"2147483648", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"-0.0", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
 }
 public void testGeneratedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"{\"a\":>1}"}, true), new String[][]{{"toURI", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.net.URI", actual.getClass().getName());
  assertEquals("file:/workspace/output/ai-runs/Cli-40/20261003-064650-386-ba506aa9/algorithm-pso/evaluation/fitness/search-fixed/%7B%22a%22:%3E1%7D {getAuthority=null, getFragment=null, getHost=null, getPath=/workspa...#665#991496972", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"Title"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"-0-i1.25", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0-i1.25", String.valueOf(actual));
 }
 public void testGeneratedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"01.5e300"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"\u00e9", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9", String.valueOf(actual));
 }
 public void testGeneratedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"1.5f"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"<null>", "<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"\\1,2]"}, true), new String[][]{{"toURL", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("file:/workspace/output/ai-runs/Cli-40/20261003-064650-386-ba506aa9/algorithm-pso/evaluation/fitness/search-fixed/\\1,2] {getAuthority=, getDefaultPort=-1, getFile=/workspace/output/ai-runs/Cli-40/20261...#383#-2040230233", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"-0-", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"1e1X0", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1e1X0", String.valueOf(actual));
 }
 public void testGeneratedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c\u00e9"}, true, 0, null, 3), new String[][]{{"exists", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"a"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFiles", new String[]{"java.lang.String"}, new String[]{"+1"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"2020-02-30T25:61:61", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02-30T25:61:61", String.valueOf(actual));
 }
 public void testGeneratedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"2137483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2137483648", String.valueOf(actual));
 }
 public void testGeneratedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c {getAuthority=example.com, getDefaultPort=80, getFile=/a?b=c, getHost=example.com, getPath=/a, getPort=-1, getProtocol=http, getQuery=b=c, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"1E-}0"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1), new String[][]{{"getCanonicalFile", "", "7"}, {"getName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("search-fixed", String.valueOf(actual));
 }
 public void testGeneratedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"-0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"4."}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.0", String.valueOf(actual));
 }
 public void testGeneratedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"abc"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"1.25"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"http://ex`mple.com/a?b=c"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("http:/ex`mple.com/a?b=c {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-40/20261003-064650-386-ba506aa.., getCanonicalPath=/workspace/output/ai-runs/Cli...#439#238939007", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{".5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
 }
 public void testGeneratedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"-1 "}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("-1  {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-40/20261003-064650-386-ba506aa.., getCanonicalPath=/workspace/output/ai-runs/Cli-40/20261003-064650-...#384#1996001641", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"1234567890123456r89012.4567890", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1234567890123456r89012.4567890", String.valueOf(actual));
 }
 public void testGeneratedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"SITLE", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SITLE", String.valueOf(actual));
 }
 public void testGeneratedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 public void testGeneratedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"-11"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-11", String.valueOf(actual));
 }
 public void testGeneratedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"2B4748c648", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2B4748c648", String.valueOf(actual));
 }
 public void testGeneratedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"PT1H", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT1H", String.valueOf(actual));
 }
 public void testGeneratedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"Not yet mplementd", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Not yet mplementd", String.valueOf(actual));
 }
 public void testGeneratedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
 }
 public void testGeneratedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 public void testGeneratedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"\u00e9\u00e91.5e300"}, true, 0, null, 2), new String[][]{{"compareTo", "java.io.File", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("186", String.valueOf(actual));
 }
 public void testGeneratedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"-0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.35e300"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.35E300", String.valueOf(actual));
 }
 public void testGeneratedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 2), new String[][]{{"getContent", "java.lang.Class[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 public void testGeneratedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"Not\037yet implemented", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Not\037yet implemented", String.valueOf(actual));
 }
 public void testGeneratedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{" 123456789012345678901234567890"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals(" 123456789012345678901234567890 {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-40/20261003-064650-386-ba506aa.., getCanonicalPath=/workspace/output/ai-...#468#626891060", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"a", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 public void testGeneratedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{" ", "<i:-1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"Not yet implemented", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Not yet implemented", String.valueOf(actual));
 }
 public void testGeneratedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{".5", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".5", String.valueOf(actual));
 }
 public void testGeneratedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"http://example.com/a?b=c", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c", String.valueOf(actual));
 }
 public void testGeneratedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"5/"}, true, 0, null, 3), new String[][]{{"compareTo", "java.io.File", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 public void testGeneratedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"<<", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<<", String.valueOf(actual));
 }
 public void testGeneratedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"E2:30:45"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("E2:30:45 {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-40/20261003-064650-386-ba506aa.., getCanonicalPath=/workspace/output/ai-runs/Cli-40/20261003-06...#399#1229265782", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"<null>", "<sample:0>"}, true, 0, null, 3);
  assertNull(actual);
 }
 public void testGeneratedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"+1", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+1", String.valueOf(actual));
 }
 public void testGeneratedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"6"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 public void testGeneratedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.25"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.25", String.valueOf(actual));
 }
 public void testGeneratedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"50"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("50", String.valueOf(actual));
 }
 public void testGeneratedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"trte"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"true", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"-1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5E300", String.valueOf(actual));
 }
 public void testGeneratedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1234567890123456"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1234567890123456", String.valueOf(actual));
 }
 public void testGeneratedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"0x1F", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x1F", String.valueOf(actual));
 }
 public void testGeneratedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"tqe", "<i:6>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://examole.com/a?b=c"}, true, 0, null, 3), new String[][]{{"getPort", "", "4"}, {"getAuthority", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("examole.com", String.valueOf(actual));
 }
 public void testGeneratedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", String.valueOf(actual));
 }
 public void testGeneratedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"aaaaaaaaaaaaaaaLaaaaaaaaaaaaaa", "<sample:5>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"-11"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-11", String.valueOf(actual));
 }
 public void testGeneratedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"<a>b</a>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a>b</a>", String.valueOf(actual));
 }
 public void testGeneratedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 1), new String[][]{{"getFile", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a?b=c", String.valueOf(actual));
 }
 public void testGeneratedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"1.25"}, true, 0, null, 1), new String[][]{{"toPath", "", "1"}, {"compareTo", "java.nio.file.Path", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c {getAuthority=example.com, getDefaultPort=80, getFile=/a?b=c, getHost=example.com, getPath=/a, getPort=-1, getProtocol=http, getQuery=b=c, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"5."}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
 }
 public void testGeneratedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"a", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"Hello, World", "<sample:11>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true), new String[][]{{"sameFile", "java.net.URL", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"214748", "<sample:11>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("214748", String.valueOf(actual));
 }
 public void testGeneratedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"010.5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.5", String.valueOf(actual));
 }
 public void testGeneratedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("1.12345678901234567 {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-40/20261003-064650-386-ba506aa.., getCanonicalPath=/workspace/output/ai-runs/Cli-40/...#432#1185392041", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 1), new String[][]{{"getAuthority", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("example.com", String.valueOf(actual));
 }
 public void testGeneratedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"/x1F"}, true);
  assertNotNull(actual);
  assertEquals("java.io.FileInputStream", actual.getClass().getName());
 }
 public void testGeneratedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://exampHe.com/a?b=c"}, true, 0, null, 2), new String[][]{{"getQuery", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b=c", String.valueOf(actual));
 }
 public void testGeneratedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true), new String[][]{{"getPort", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true), new String[][]{{"getFile", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a?b=c", String.valueOf(actual));
 }
 public void testGeneratedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true), new String[][]{{"getRef", "", "5"}});
  assertNull(actual);
 }
 public void testGeneratedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 2), new String[][]{{"getFile", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a?b=c", String.valueOf(actual));
 }
 public void testGeneratedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://eExample.com/a?b=c"}, true, 0, null, 3), new String[][]{{"getQuery", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b=c", String.valueOf(actual));
 }
 public void testGeneratedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://exampDle.com/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://exampDle.com/a?b=c {getAuthority=exampDle.com, getDefaultPort=80, getFile=/a?b=c, getHost=exampDle.com, getPath=/a, getPort=-1, getProtocol=http, getQuery=b=c, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"0105.", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"4.", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://examplf.com/a?b=c"}, true, 0, null, 2), new String[][]{{"getContent", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.net.UnknownHostException", thrown.getClass().getName());
 }
 public void testGeneratedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 1), new String[][]{{"getQuery", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b=c", String.valueOf(actual));
 }
 public void testGeneratedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://exaple.com/a?b=c"}, true), new String[][]{{"toExternalForm", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://exaple.com/a?b=c", String.valueOf(actual));
 }
 public void testGeneratedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"/6"}, true, 0, null, 2), new String[][]{{"readNBytes", "int", "3"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http:/8/example.com/a?b=c"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http:/8/example.com/a?b=c {getAuthority=null, getDefaultPort=80, getFile=/8/example.com/a?b=c, getHost=, getPath=/8/example.com/a, getPort=-1, getProtocol=http, getQuery=b=c, getRef=null, getUserInfo=...#205#934816475", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, true), new String[][]{{"read", "byte[]", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"/x1F"}, true, 0, null, 2), new String[][]{{"reset", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 public void testGeneratedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://examp"}, true, 0, null, 2), new String[][]{{"getPath", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 1), new String[][]{{"getContent", "java.lang.Class[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 public void testGeneratedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, true), new String[][]{{"skip", "long", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 public void testGeneratedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"112:30:45"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.io.FileInputStream", actual.getClass().getName());
 }
 public void testGeneratedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 3), new String[][]{{"getPort", "", "7"}, {"getFile", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a?b=c", String.valueOf(actual));
 }
 public void testGeneratedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c0xFFFFFFFF"}, true, 0, null, 3), new String[][]{{"getPath", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a", String.valueOf(actual));
 }
 public void testGeneratedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 1), new String[][]{{"toURI", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.net.URI", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c {getAuthority=example.com, getFragment=null, getHost=example.com, getPath=/a, getPort=-1, getQuery=b=c, getRawAuthority=example.com, getRawFragment=null, getRawPath=/a, getRaw...#371#-166747814", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, true, 0, null, 3), new String[][]{{"getFD", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.io.FileDescriptor", actual.getClass().getName());
 }
 public void testGeneratedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 3), new String[][]{{"getProtocol", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http", String.valueOf(actual));
 }
 public void testGeneratedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"/5"}, true), new String[][]{{"markSupported", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://exampe.com/a?b=c"}, true, 0, null, 1), new String[][]{{"toExternalForm", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://exampe.com/a?b=c", String.valueOf(actual));
 }
 public void testGeneratedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://e-xample.com/a?b=c"}, true, 0, null, 2), new String[][]{{"sameFile", "java.net.URL", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"/x1F"}, true, 0, null, 1), new String[][]{{"skip", "long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 public void testGeneratedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http:/1example;com/a?b=c"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http:/1example;com/a?b=c {getAuthority=null, getDefaultPort=80, getFile=/1example;com/a?b=c, getHost=, getPath=/1example;com/a, getPort=-1, getProtocol=http, getQuery=b=c, getRef=null, getUserInfo=nul...#202#-1029479592", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, true), new String[][]{{"available", "", "5"}, {"transferTo", "java.io.OutputStream", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"/x1F"}, true, 0, null, 2), new String[][]{{"transferTo", "java.io.OutputStream", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"  "}, true, 0, null, 1), new String[][]{{"readNBytes", "int", "4"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[I"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [I {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDecl...#531#974044457", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"[I"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[I"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [I {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDecl...#531#974044457", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[I"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [I {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDecl...#531#974044457", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[[I"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [[I {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int[][], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getD...#534#-566145892", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[I"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [I {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDecl...#531#974044457", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[[I"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [[I {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int[][], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getD...#534#-566145892", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[J"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [J {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=long[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDec...#532#-359210829", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, true, 0, null, 1), new String[][]{{"readNBytes", "byte[],int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[J"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [J {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=long[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDec...#532#-359210829", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[J"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [J {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=long[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDec...#532#-359210829", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[[J"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [[J {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=long[][], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], get...#535#2012859164", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[J"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [J {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=long[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDec...#532#-359210829", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[[I"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [[I {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int[][], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getD...#534#-566145892", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[D"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [D {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=double[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getD...#534#922108216", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[[I"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [[I {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int[][], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getD...#534#-566145892", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[F"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [F {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=float[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDe...#533#734187519", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[B"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [B {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=byte[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDec...#532#-686490465", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[D"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [D {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=double[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getD...#534#922108216", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[F"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [F {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=float[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDe...#533#734187519", SearchInputFactory_scaffolding.observe(actual));
 }
}
