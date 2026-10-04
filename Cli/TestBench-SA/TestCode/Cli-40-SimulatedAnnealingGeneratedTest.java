package generated.algorithm;

import junit.framework.TestCase;

public class SimulatedAnnealingGeneratedTest extends TestCase {
 public void testGeneratedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFiles", new String[]{"java.lang.String"}, new String[]{"1e10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"null"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"\u00ea\u00ea"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"010"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 public void testGeneratedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.5d"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 public void testGeneratedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"5."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
 }
 public void testGeneratedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"8n"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"8"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 public void testGeneratedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"7"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 public void testGeneratedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"a,b,c", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"a,b,c", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,c", String.valueOf(actual));
 }
 public void testGeneratedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"a,b,c", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"a,b,c", "<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createDate", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"5.", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5.", String.valueOf(actual));
 }
 public void testGeneratedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{">"}, true), new String[][]{{"listFiles", "java.io.FileFilter", "2"}});
  assertNull(actual);
 }
 public void testGeneratedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"{\"a\":1}", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"TITLEaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"\"10x"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"1.1234567890123456", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567890123456", String.valueOf(actual));
 }
 public void testGeneratedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{".5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
 }
 public void testGeneratedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{".52147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.52147483648", String.valueOf(actual));
 }
 public void testGeneratedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{".52147482648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.52147482648", String.valueOf(actual));
 }
 public void testGeneratedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{".52247482648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.52247482648", String.valueOf(actual));
 }
 public void testGeneratedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"-..224648<2648T.12345678"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFiles", new String[]{"java.lang.String"}, new String[]{"9"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"Unable to find file: "}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"Title"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"j"}, true);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("j {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-40/20261003-064650-386-ba506aa.., getCanonicalPath=/workspace/output/ai-runs/Cli-40/20261003-064650-38...#378#-1945174661", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFiles", new String[]{"java.lang.String"}, new String[]{"-3.I"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"/a/b"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"/a/b"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"H?e?lmp, WHello, World", "<s:>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"l70", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"[1,2]", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2]", String.valueOf(actual));
 }
 public void testGeneratedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"[1,1]", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,1]", String.valueOf(actual));
 }
 public void testGeneratedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"Y-", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Y-", String.valueOf(actual));
 }
 public void testGeneratedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"Y,", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Y,", String.valueOf(actual));
 }
 public void testGeneratedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"Unable to find file: ", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Unable to find file: ", String.valueOf(actual));
 }
 public void testGeneratedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"Unable to find file: a", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Unable to find file: a", String.valueOf(actual));
 }
 public void testGeneratedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"1", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 public void testGeneratedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"0", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"010"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 public void testGeneratedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"000"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"001"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 public void testGeneratedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"0008"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 public void testGeneratedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.12345678", String.valueOf(actual));
 }
 public void testGeneratedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.12355678"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.12355678", String.valueOf(actual));
 }
 public void testGeneratedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.02355678"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.02355678", String.valueOf(actual));
 }
 public void testGeneratedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"Not yet implemented", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"5Vnabld to find file;l ", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5Vnabld to find file;l ", String.valueOf(actual));
 }
 public void testGeneratedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"5V4nabld to find fi_le;l ", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5V4nabld to find fi_le;l ", String.valueOf(actual));
 }
 public void testGeneratedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"\t", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"1.5f"}, true);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("1.5f {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-40/20261003-064650-386-ba506aa.., getCanonicalPath=/workspace/output/ai-runs/Cli-40/20261003-064650...#387#-894066177", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"1.5ff"}, true);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("1.5ff {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-40/20261003-064650-386-ba506aa.., getCanonicalPath=/workspace/output/ai-runs/Cli-40/20261003-06465...#390#1793028589", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"5."}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"", "<i:37>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"0xFFFFFGFF", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFFFGFF", String.valueOf(actual));
 }
 public void testGeneratedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"0xFFFFGFF", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFFGFF", String.valueOf(actual));
 }
 public void testGeneratedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"0xFFFFGF", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFFGF", String.valueOf(actual));
 }
 public void testGeneratedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"/a/b", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a/b", String.valueOf(actual));
 }
 public void testGeneratedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"?/a/b", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?/a/b", String.valueOf(actual));
 }
 public void testGeneratedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"?/", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?/", String.valueOf(actual));
 }
 public void testGeneratedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"?_/", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?_/", String.valueOf(actual));
 }
 public void testGeneratedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"E-5", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("E-5", String.valueOf(actual));
 }
 public void testGeneratedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"EE-5", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("EE-5", String.valueOf(actual));
 }
 public void testGeneratedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"1.25", "<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"1.25", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.25", String.valueOf(actual));
 }
 public void testGeneratedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"/a/b", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a/b", String.valueOf(actual));
 }
 public void testGeneratedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"/a00b", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a00b", String.valueOf(actual));
 }
 public void testGeneratedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"/a/0b", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a/0b", String.valueOf(actual));
 }
 public void testGeneratedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createDate", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"1E-p1"}, true, 0, null, 3), new String[][]{{"canWrite", "", "4"}, {"getCanonicalFile", "", "5"}, {"mkdir", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"I"}, true, 0, null, 3), new String[][]{{"canWrite", "", "4"}, {"getCanonicalFile", "", "5"}, {"mkdir", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"-.1"}, true, 0, null, 2), new String[][]{{"canWrite", "", "4"}, {"getCanonicalFile", "", "5"}, {"mkdir", "", "7"}, {"mkdir", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"13456789012345678901234467890"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createDate", new String[]{"java.lang.String"}, new String[]{".5Titme"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"--1"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"-1.5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.5", String.valueOf(actual));
 }
 public void testGeneratedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"1234567890123456789012445678f90", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1234567890123456789012445678f90", String.valueOf(actual));
 }
 public void testGeneratedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{".5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
 }
 public void testGeneratedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{".4"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.4", String.valueOf(actual));
 }
 public void testGeneratedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 public void testGeneratedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"T.tle"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3), new String[][]{{"canWrite", "", "6"}, {"length", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"Helmo, Wprld"}, true, 0, null, 3), new String[][]{{"canWrite", "", "6"}, {"toPath", "", "5"}});
  assertNotNull(actual);
  assertEquals("sun.nio.fs.UnixPath", actual.getClass().getName());
  assertEquals("Helmo, Wprld {getNameCount=1, isAbsolute=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, true, 0, null, 3), new String[][]{{"canWrite", "", "6"}, {"toPath", "", "5"}});
  assertNotNull(actual);
  assertEquals("sun.nio.fs.UnixPath", actual.getClass().getName());
  assertEquals("\u00e9 {getNameCount=1, isAbsolute=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createDate", new String[]{"java.lang.String"}, new String[]{"4"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"1U.25it;Le010"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("1U.25it;Le010 {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-40/20261003-064650-386-ba506aa.., getCanonicalPath=/workspace/output/ai-runs/Cli-40/202610...#414#-465565870", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"AU.2[lt;Le/"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("AU.2[lt;Le {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-40/20261003-064650-386-ba506aa.., getCanonicalPath=/workspace/output/ai-runs/Cli-40/20261003-...#405#1270222030", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"AU.2[lt;;Le/"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("AU.2[lt;;Le {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-40/20261003-064650-386-ba506aa.., getCanonicalPath=/workspace/output/ai-runs/Cli-40/20261003...#408#887826881", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"AU.2[lt;;Le/"}, true, 0, null, 3), new String[][]{{"compareTo", "java.io.File", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("18", String.valueOf(actual));
 }
 public void testGeneratedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"a\037a"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"0xxFFFFFFFF1"}, true, 0, null, 2), new String[][]{{"getCanonicalFile", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("/workspace/output/ai-runs/Cli-40/20261003-064650-386-ba506aa9/algorithm-sa/evaluation/fitness/search-fixed/0xxFFFFFFFF1 {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/out...#625#-1817153488", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c {getAuthority=example.com, getDefaultPort=80, getFile=/a?b=c, getHost=example.com, getPath=/a, getPort=-1, getProtocol=http, getQuery=b=c, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://exampple.com/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://exampple.com/a?b=c {getAuthority=exampple.com, getDefaultPort=80, getFile=/a?b=c, getHost=exampple.com, getPath=/a, getPort=-1, getProtocol=http, getQuery=b=c, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://e4xampple.com/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://e4xampple.com/a?b=c {getAuthority=e4xampple.com, getDefaultPort=80, getFile=/a?b=c, getHost=e4xampple.com, getPath=/a, getPort=-1, getProtocol=http, getQuery=b=c, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://exampple..com/aHb=c-10"}, true), new String[][]{{"getFile", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/aHb=c-10", String.valueOf(actual));
 }
 public void testGeneratedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"010"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 public void testGeneratedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 public void testGeneratedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"`,6b,c2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("`,6b,c2147483648 {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-40/20261003-064650-386-ba506aa.., getCanonicalPath=/workspace/output/ai-runs/Cli-40/202...#423#1015212725", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"`,6b,c2214"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("`,6b,c2214 {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-40/20261003-064650-386-ba506aa.., getCanonicalPath=/workspace/output/ai-runs/Cli-40/20261003-...#405#-702102765", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"`,6bb,c2214"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("`,6bb,c2214 {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-40/20261003-064650-386-ba506aa.., getCanonicalPath=/workspace/output/ai-runs/Cli-40/20261003...#408#1030305185", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"+,6bb,c2214"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("+,6bb,c2214 {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-40/20261003-064650-386-ba506aa.., getCanonicalPath=/workspace/output/ai-runs/Cli-40/20261003...#408#1666175638", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"+,6bb,c2204"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("+,6bb,c2204 {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-40/20261003-064650-386-ba506aa.., getCanonicalPath=/workspace/output/ai-runs/Cli-40/20261003...#408#1542611893", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFiles", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"i", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
 }
 public void testGeneratedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"2020-01-01", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-01", String.valueOf(actual));
 }
 public void testGeneratedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"3"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 public void testGeneratedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 2), new String[][]{{"getUserInfo", "", "1"}});
  assertNull(actual);
 }
 public void testGeneratedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"p.12345788"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"0NFFFFFF", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"Not yet implemented", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"UiEle"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("UiEle {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-40/20261003-064650-386-ba506aa.., getCanonicalPath=/workspace/output/ai-runs/Cli-40/20261003-06465...#390#-1985846885", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"Uii-le"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("Uii-le {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-40/20261003-064650-386-ba506aa.., getCanonicalPath=/workspace/output/ai-runs/Cli-40/20261003-0646...#393#2127909942", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"Uii-Dl"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("Uii-Dl {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-40/20261003-064650-386-ba506aa.., getCanonicalPath=/workspace/output/ai-runs/Cli-40/20261003-0646...#393#-349742071", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"Vii-Dl"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("Vii-Dl {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-40/20261003-064650-386-ba506aa.., getCanonicalPath=/workspace/output/ai-runs/Cli-40/20261003-0646...#393#817820044", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"Vi-DI"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("Vi-DI {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-40/20261003-064650-386-ba506aa.., getCanonicalPath=/workspace/output/ai-runs/Cli-40/20261003-06465...#390#51503718", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"Vi-DJ"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("Vi-DJ {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-40/20261003-064650-386-ba506aa.., getCanonicalPath=/workspace/output/ai-runs/Cli-40/20261003-06465...#390#-1331622235", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"Vi-DJ0x123456789"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("Vi-DJ0x123456789 {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-40/20261003-064650-386-ba506aa.., getCanonicalPath=/workspace/output/ai-runs/Cli-40/202...#423#-1278226398", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"11i4748WITE", "<sample:11>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"7", "<sample:11>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 public void testGeneratedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"247383647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("247383647", String.valueOf(actual));
 }
 public void testGeneratedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"5."}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
 }
 public void testGeneratedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"2147483648"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.0234567"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0234567", String.valueOf(actual));
 }
 public void testGeneratedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c {getAuthority=example.com, getDefaultPort=80, getFile=/a?b=c, getHost=example.com, getPath=/a, getPort=-1, getProtocol=http, getQuery=b=c, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"-1.5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.5", String.valueOf(actual));
 }
 public void testGeneratedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
 }
 public void testGeneratedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5E300", String.valueOf(actual));
 }
 public void testGeneratedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"-1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.12345678", String.valueOf(actual));
 }
 public void testGeneratedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"0xFFFFFFFF", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"1.25"}, true, 0, null, 3), new String[][]{{"close", "", "3"}, {"readNBytes", "byte[],int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"1.25"}, true), new String[][]{{"read", "byte[]", "3"}, {"readNBytes", "byte[],int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 1), new String[][]{{"toExternalForm", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c", String.valueOf(actual));
 }
 public void testGeneratedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://examplf.com/a?b=c[1,2]"}, true, 0, null, 1), new String[][]{{"toExternalForm", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://examplf.com/a?b=c[1,2]", String.valueOf(actual));
 }
 public void testGeneratedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true), new String[][]{{"getAuthority", "", "1"}, {"getRef", "", "6"}, {"getQuery", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b=c", String.valueOf(actual));
 }
 public void testGeneratedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.dom/a?=ctrue"}, true);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://example.dom/a?=ctrue {getAuthority=example.dom, getDefaultPort=80, getFile=/a?=ctrue, getHost=example.dom, getPath=/a, getPort=-1, getProtocol=http, getQuery==ctrue, getRef=null, getUserInfo=nu...#203#-1124062149", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://Hxample.dom/a?=ctrue"}, true);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://Hxample.dom/a?=ctrue {getAuthority=Hxample.dom, getDefaultPort=80, getFile=/a?=ctrue, getHost=Hxample.dom, getPath=/a, getPort=-1, getProtocol=http, getQuery==ctrue, getRef=null, getUserInfo=nu...#203#-1988222120", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://Hxample.dom/a?=ctrue"}, true), new String[][]{{"getQuery", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=ctrue", String.valueOf(actual));
 }
 public void testGeneratedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"1.25"}, true, 0, null, 3), new String[][]{{"readAllBytes", "", "4"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
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
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"0"}, true, 0, null, 2), new String[][]{{"transferTo", "java.io.OutputStream", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"i"}, true, 0, null, 2), new String[][]{{"available", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 1), new String[][]{{"openConnection", "java.net.Proxy", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.io.FileInputStream", actual.getClass().getName());
 }
 public void testGeneratedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://examle.ccomH/a?b=c2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://examle.ccomH/a?b=c2147483648 {getAuthority=examle.ccomH, getDefaultPort=80, getFile=/a?b=c2147483648, getHost=examle.ccomH, getPath=/a, getPort=-1, getProtocol=http, getQuery=b=c2147483648, get...#227#320075096", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://examle.ccomH/a?b=c2147483648"}, true, 0, null, 1), new String[][]{{"sameFile", "java.net.URL", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"i"}, true, 0, null, 3), new String[][]{{"skip", "long", "7"}, {"read", "byte[]", "1"}, {"getChannel", "", "0"}});
  assertNotNull(actual);
  assertEquals("sun.nio.ch.FileChannelImpl", actual.getClass().getName());
  assertEquals("{isOpen=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 2), new String[][]{{"getPath", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a", String.valueOf(actual));
 }
 public void testGeneratedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http:///example.bom/a?b=c"}, true, 0, null, 2), new String[][]{{"getPath", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/example.bom/a", String.valueOf(actual));
 }
 public void testGeneratedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http:///examole.bom/a?b=c"}, true, 0, null, 2), new String[][]{{"getPath", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/examole.bom/a", String.valueOf(actual));
 }
 public void testGeneratedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http:///examolebom/a?b=c"}, true, 0, null, 2), new String[][]{{"getPath", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/examolebom/a", String.valueOf(actual));
 }
 public void testGeneratedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http:/]/examolebom/b?b=c"}, true, 0, null, 2), new String[][]{{"getPath", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/]/examolebom/b", String.valueOf(actual));
 }
 public void testGeneratedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http:/]0examolebom/b?b=c"}, true, 0, null, 2), new String[][]{{"getPath", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/]0examolebom/b", String.valueOf(actual));
 }
 public void testGeneratedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 1), new String[][]{{"openStream", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 public void testGeneratedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.comm/a?b="}, true, 0, null, 3), new String[][]{{"getUserInfo", "", "6"}});
  assertNull(actual);
 }
 public void testGeneratedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.comm/a?b="}, true, 0, null, 3), new String[][]{{"getContent", "java.lang.Class[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.net.UnknownHostException", thrown.getClass().getName());
 }
 public void testGeneratedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://ewample.com/a?b=c"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://ewample.com/a?b=c {getAuthority=ewample.com, getDefaultPort=80, getFile=/a?b=c, getHost=ewample.com, getPath=/a, getPort=-1, getProtocol=http, getQuery=b=c, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://eewample.com/a?b=c"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://eewample.com/a?b=c {getAuthority=eewample.com, getDefaultPort=80, getFile=/a?b=c, getHost=eewample.com, getPath=/a, getPort=-1, getProtocol=http, getQuery=b=c, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://eewample.com/a?b=c"}, true, 0, null, 3), new String[][]{{"getHost", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("eewample.com", String.valueOf(actual));
 }
 public void testGeneratedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b="}, true, 0, null, 3), new String[][]{{"getContent", "java.lang.Class[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 public void testGeneratedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"[I"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[I"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [I {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDecl...#531#974044457", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[I"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [I {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDecl...#531#974044457", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[J"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [J {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=long[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDec...#532#-359210829", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[I"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [I {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDecl...#531#974044457", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[I"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [I {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDecl...#531#974044457", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[[I"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [[I {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int[][], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getD...#534#-566145892", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[D"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [D {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=double[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getD...#534#922108216", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[Z"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Z {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=boolean[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], get...#535#-83576801", SearchInputFactory_scaffolding.observe(actual));
 }
}
