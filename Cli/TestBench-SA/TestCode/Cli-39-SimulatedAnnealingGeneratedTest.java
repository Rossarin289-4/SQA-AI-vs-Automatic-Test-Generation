package generated.algorithm;

import junit.framework.TestCase;

public class SimulatedAnnealingGeneratedTest extends TestCase {
 public void testGeneratedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"2020.01-01"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"http://example.com/a?b=c", "<b:true>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"http://example.com/a?b=c", "<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createDate", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createDate", new String[]{"java.lang.String"}, new String[]{"1.1234567889013345675."}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFiles", new String[]{"java.lang.String"}, new String[]{"0x1F"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"<null>", "<sample:3>"}, true);
  assertNull(actual);
 }
 public void testGeneratedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"?", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
 }
 public void testGeneratedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"1.1234567", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567", String.valueOf(actual));
 }
 public void testGeneratedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"/", "<sample:3>"}, true, 0, null, 1);
  assertNull(actual);
 }
 public void testGeneratedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"/", "<sample:5>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"< \t", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("< \t", String.valueOf(actual));
 }
 public void testGeneratedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"<\t", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<\t", String.valueOf(actual));
 }
 public void testGeneratedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"<<\t", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<<\t", String.valueOf(actual));
 }
 public void testGeneratedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"<<\t", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<<\t", String.valueOf(actual));
 }
 public void testGeneratedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"<<\t", "<sample:2>"}, true, 0, null, 3);
  assertNull(actual);
 }
 public void testGeneratedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"<<\t", "<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"Site", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Site", String.valueOf(actual));
 }
 public void testGeneratedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"Rite", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Rite", String.valueOf(actual));
 }
 public void testGeneratedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"Rit2", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Rit2", String.valueOf(actual));
 }
 public void testGeneratedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"1.5"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"?"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"A"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"5", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 public void testGeneratedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{".5"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"1>:11.>5::0u-1"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"I"}, true);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("I {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-39/20261003-064531-866-47c20ac.., getCanonicalPath=/workspace/output/ai-runs/Cli-39/20261003-064531-86...#378#900199676", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals(" {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-39/20261003-064531-866-47c20ac.., getCanonicalPath=/workspace/output/ai-runs/Cli-39/20261003-064531-866...#375#1264001513", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"2020.00-01"}, true);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("2020.00-01 {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-39/20261003-064531-866-47c20ac.., getCanonicalPath=/workspace/output/ai-runs/Cli-39/20261003-...#405#1753023477", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"2020.00-001"}, true);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("2020.00-001 {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-39/20261003-064531-866-47c20ac.., getCanonicalPath=/workspace/output/ai-runs/Cli-39/20261003...#408#246933359", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"1f61I"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"\u00e8"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1.1234<567", "<i:-1>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFiles", new String[]{"java.lang.String"}, new String[]{"\t"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createDate", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"\010\010\010", "<sample:3>"}, true, 0, null, 2);
  assertNull(actual);
 }
 public void testGeneratedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"\010\010\t", "<sample:5>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"\0106\010", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\0106\010", String.valueOf(actual));
 }
 public void testGeneratedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"\0105\010", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\0105\010", String.valueOf(actual));
 }
 public void testGeneratedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"\0104\010", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\0104\010", String.valueOf(actual));
 }
 public void testGeneratedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"\0104\010/a/b", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\0104\010/a/b", String.valueOf(actual));
 }
 public void testGeneratedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"\0104\010/<a/b", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\0104\010/<a/b", String.valueOf(actual));
 }
 public void testGeneratedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"\0104\010/<a/a", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\0104\010/<a/a", String.valueOf(actual));
 }
 public void testGeneratedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"010"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 public void testGeneratedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.25"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.25", String.valueOf(actual));
 }
 public void testGeneratedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1234567", String.valueOf(actual));
 }
 public void testGeneratedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.1235567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1235567", String.valueOf(actual));
 }
 public void testGeneratedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 public void testGeneratedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.12345678", String.valueOf(actual));
 }
 public void testGeneratedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.12344678"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.12344678", String.valueOf(actual));
 }
 public void testGeneratedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.12344668"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.12344668", String.valueOf(actual));
 }
 public void testGeneratedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"15/5f"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"+.\n"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.5f"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 public void testGeneratedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFiles", new String[]{"java.lang.String"}, new String[]{"PT1H"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFiles", new String[]{"java.lang.String"}, new String[]{"\ruu31.5e300"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"Title", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Title", String.valueOf(actual));
 }
 public void testGeneratedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"5.", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5.", String.valueOf(actual));
 }
 public void testGeneratedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"5i.", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5i.", String.valueOf(actual));
 }
 public void testGeneratedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"1.12345c678"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("1.12345c678 {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-39/20261003-064531-866-47c20ac.., getCanonicalPath=/workspace/output/ai-runs/Cli-39/20261003...#408#198779387", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"1.12345c679"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("1.12345c679 {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-39/20261003-064531-866-47c20ac.., getCanonicalPath=/workspace/output/ai-runs/Cli-39/20261003...#408#-74329350", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"o "}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"D-5cg", "<null>"}, true);
  assertNull(actual);
 }
 public void testGeneratedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"PT1H"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"", "<sample:11>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"Unabme to find file: "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("Unabme to find file:  {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-39/20261003-064531-866-47c20ac.., getCanonicalPath=/workspace/output/ai-runs/Cli-3...#438#-1369529837", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"+1", "<sample:11>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 public void testGeneratedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c {getAuthority=example.com, getDefaultPort=80, getFile=/a?b=c, getHost=example.com, getPath=/a, getPort=-1, getProtocol=http, getQuery=b=c, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"\u00e9", "<s:a>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"THTcLE"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createDate", new String[]{"java.lang.String"}, new String[]{"n10"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"a,b,d"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("a,b,d {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-39/20261003-064531-866-47c20ac.., getCanonicalPath=/workspace/output/ai-runs/Cli-39/20261003-06453...#390#12438902", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"aa,bd"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("aa,bd {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-39/20261003-064531-866-47c20ac.., getCanonicalPath=/workspace/output/ai-runs/Cli-39/20261003-06453...#390#2143694263", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"aa,cd"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("aa,cd {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-39/20261003-064531-866-47c20ac.., getCanonicalPath=/workspace/output/ai-runs/Cli-39/20261003-06453...#390#-2078504616", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"a3a,cd"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("a3a,cd {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-39/20261003-064531-866-47c20ac.., getCanonicalPath=/workspace/output/ai-runs/Cli-39/20261003-0645...#393#-152856529", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"aa+cd"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("aa+cd {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-39/20261003-064531-866-47c20ac.., getCanonicalPath=/workspace/output/ai-runs/Cli-39/20261003-06453...#390#-39358247", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"810"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("810", String.valueOf(actual));
 }
 public void testGeneratedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"10"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 public void testGeneratedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"11.12345678901234567"}, true, 0, null, 1), new String[][]{{"getName", "", "0"}, {"createNewFile", "", "5"}, {"listFiles", "", "7"}});
  assertNull(actual);
 }
 public void testGeneratedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"-.1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.1", String.valueOf(actual));
 }
 public void testGeneratedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"02146483648a,b,c"}, true, 0, null, 1), new String[][]{{"setWritable", "boolean,boolean", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"ssue", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ssue", String.valueOf(actual));
 }
 public void testGeneratedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"surue", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("surue", String.valueOf(actual));
 }
 public void testGeneratedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, true, 0, null, 1), new String[][]{{"canWrite", "", "0"}, {"getUsableSpace", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.io.FileInputStream", actual.getClass().getName());
 }
 public void testGeneratedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"+1aTht\"le[1,2]", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+1aTht\"le[1,2]", String.valueOf(actual));
 }
 public void testGeneratedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"1,.12345678\u00e990123456", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1,.12345678\u00e990123456", String.valueOf(actual));
 }
 public void testGeneratedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.4f"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.4", String.valueOf(actual));
 }
 public void testGeneratedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.44f"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.44", String.valueOf(actual));
 }
 public void testGeneratedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"0.44f"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.44", String.valueOf(actual));
 }
 public void testGeneratedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"true", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{".5", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".5", String.valueOf(actual));
 }
 public void testGeneratedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaabaaaaaaaaaanaaaa?-1.5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaabaaaaaaaaaanaaaa?-1.5 {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-39/20261003-064531-866-47c20ac.., getCanonicalPath=/workspace/output/...#477#1694383058", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"2 20-d02.330T25::1:60"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("2 20-d02.330T25::1:60 {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-39/20261003-064531-866-47c20ac.., getCanonicalPath=/workspace/output/ai-runs/Cli-3...#438#-654332526", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"C-5cg"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("C-5cg {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-39/20261003-064531-866-47c20ac.., getCanonicalPath=/workspace/output/ai-runs/Cli-39/20261003-06453...#390#1721039990", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createFile", new String[]{"java.lang.String"}, new String[]{"C-5ccg123456789012345678901234567890"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.io.File", actual.getClass().getName());
  assertEquals("C-5ccg123456789012345678901234567890 {canExecute=false, canRead=false, canWrite=false, getAbsolutePath=/workspace/output/ai-runs/Cli-39/20261003-064531-866-47c20ac.., getCanonicalPath=/workspace/outpu...#483#1429032098", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1234567890123457", String.valueOf(actual));
 }
 public void testGeneratedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 public void testGeneratedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"3.5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.5", String.valueOf(actual));
 }
 public void testGeneratedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"3."}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
 }
 public void testGeneratedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"-1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 2), new String[][]{{"toURI", "", "6"}, {"getPath", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a", String.valueOf(actual));
 }
 public void testGeneratedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"?"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{";x1F", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(";x1F", String.valueOf(actual));
 }
 public void testGeneratedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"x", "<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 public void testGeneratedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://exam9ple.com/a?b=c"}, true, 0, null, 2), new String[][]{{"getContent", "java.lang.Class[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.net.UnknownHostException", thrown.getClass().getName());
 }
 public void testGeneratedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5E300", String.valueOf(actual));
 }
 public void testGeneratedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true), new String[][]{{"getUserInfo", "", "5"}});
  assertNull(actual);
 }
 public void testGeneratedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true), new String[][]{{"getHost", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("example.com", String.valueOf(actual));
 }
 public void testGeneratedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true), new String[][]{{"getFile", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a?b=c", String.valueOf(actual));
 }
 public void testGeneratedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"-0.0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
 }
 public void testGeneratedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"-1.0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 public void testGeneratedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 public void testGeneratedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"--2", "<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 public void testGeneratedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true), new String[][]{{"getPort", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 3), new String[][]{{"readNBytes", "int", "3"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 1), new String[][]{{"readNBytes", "byte[],int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.6d"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.6", String.valueOf(actual));
 }
 public void testGeneratedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 public void testGeneratedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"-1", "<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 public void testGeneratedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1234567", String.valueOf(actual));
 }
 public void testGeneratedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createNumber", new String[]{"java.lang.String"}, new String[]{"5."}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
 }
 public void testGeneratedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true), new String[][]{{"openStream", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 public void testGeneratedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"--1"}, true, 0, null, 3), new String[][]{{"close", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.io.FileInputStream", actual.getClass().getName());
 }
 public void testGeneratedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"--1"}, true, 0, null, 3), new String[][]{{"close", "", "1"}, {"readAllBytes", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 public void testGeneratedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"{"}, true, 0, null, 1), new String[][]{{"read", "", "6"}, {"markSupported", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"B"}, true, 0, null, 3), new String[][]{{"available", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a??b=c"}, true, 0, null, 3), new String[][]{{"getDefaultPort", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("80", String.valueOf(actual));
 }
 public void testGeneratedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[D"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [D {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=double[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getD...#534#922108216", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"[D"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.ParseException", thrown.getClass().getName());
 }
 public void testGeneratedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[D"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [D {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=double[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getD...#534#922108216", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[[D"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [[D {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=double[][], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], g...#537#-2131343455", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true), new String[][]{{"getPath", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a", String.valueOf(actual));
 }
 public void testGeneratedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http:./example.com/a?b=c-0.0"}, true), new String[][]{{"getPath", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("./example.com/a", String.valueOf(actual));
 }
 public void testGeneratedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http:./example.com/a?b=c-0.0"}, true), new String[][]{{"getContent", "java.lang.Class[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http:./example.com/a?b=-0.0"}, true, 0, null, 3), new String[][]{{"getContent", "java.lang.Class[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 3), new String[][]{{"getQuery", "", "1"}, {"getContent", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 public void testGeneratedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://exaCpmf.com/a?b=c11.5f"}, true, 0, null, 3), new String[][]{{"getPath", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a", String.valueOf(actual));
 }
 public void testGeneratedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://exaDpmf.com/ab=c11.5f"}, true, 0, null, 3), new String[][]{{"getPath", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/ab=c11.5f", String.valueOf(actual));
 }
 public void testGeneratedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://exaDpmf.com/abb=c11.5f"}, true, 0, null, 3), new String[][]{{"getPath", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/abb=c11.5f", String.valueOf(actual));
 }
 public void testGeneratedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createObject", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 1), new String[][]{{"getContent", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 public void testGeneratedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "openFile", new String[]{"java.lang.String"}, new String[]{"/5"}, true, 0, null, 2), new String[][]{{"close", "", "4"}, {"readAllBytes", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 public void testGeneratedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[D"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [D {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=double[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getD...#534#922108216", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[D"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [D {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=double[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getD...#534#922108216", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[C"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [C {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=char[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDec...#532#-2083058414", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c2020.01-01"}, true, 0, null, 2), new String[][]{{"getPath", "", "5"}, {"getContent", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 public void testGeneratedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/`?b=c"}, true, 0, null, 1), new String[][]{{"toURI", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.net.URISyntaxException", thrown.getClass().getName());
 }
 public void testGeneratedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 1), new String[][]{{"sameFile", "java.net.URL", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c {getAuthority=example.com, getDefaultPort=80, getFile=/a?b=c, getHost=example.com, getPath=/a, getPort=-1, getProtocol=http, getQuery=b=c, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c {getAuthority=example.com, getDefaultPort=80, getFile=/a?b=c, getHost=example.com, getPath=/a, getPort=-1, getProtocol=http, getQuery=b=c, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c {getAuthority=example.com, getDefaultPort=80, getFile=/a?b=c, getHost=example.com, getPath=/a, getPort=-1, getProtocol=http, getQuery=b=c, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.dom/a?b="}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://example.dom/a?b= {getAuthority=example.dom, getDefaultPort=80, getFile=/a?b=, getHost=example.dom, getPath=/a, getPort=-1, getProtocol=http, getQuery=b=, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 1), new String[][]{{"getDefaultPort", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("80", String.valueOf(actual));
 }
 public void testGeneratedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 2), new String[][]{{"getUserInfo", "", "5"}});
  assertNull(actual);
 }
 public void testGeneratedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 2), new String[][]{{"getFile", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a?b=c", String.valueOf(actual));
 }
 public void testGeneratedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 1), new String[][]{{"getFile", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a?b=c", String.valueOf(actual));
 }
 public void testGeneratedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createURL", new String[]{"java.lang.String"}, new String[]{"http://example.comT/a?b=c"}, true, 0, null, 1), new String[][]{{"openStream", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.net.UnknownHostException", thrown.getClass().getName());
 }
 public void testGeneratedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[C"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [C {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=char[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDec...#532#-2083058414", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[[D"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [[D {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=double[][], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], g...#537#-2131343455", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[[C"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [[C {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=char[][], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], get...#535#-1042261061", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[[C"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [[C {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=char[][], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], get...#535#-1042261061", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[F"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [F {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=float[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDe...#533#734187519", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.TypeHandler", "org.apache.commons.cli.TypeHandler", "createClass", new String[]{"java.lang.String"}, new String[]{"[[D"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [[D {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=double[][], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], g...#537#-2131343455", SearchInputFactory_scaffolding.observe(actual));
 }
}
