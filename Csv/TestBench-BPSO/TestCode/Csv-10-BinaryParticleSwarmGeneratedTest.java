package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printComment", new String[]{"java.lang.String"}, new String[]{"0w123456789"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "println", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "close", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "println", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "print", new String[]{"java.lang.Object"}, new String[]{"<d:3.0>"}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printRecord", "java.lang.Object[]", "<sample:0>"}, {"org.apache.commons.csv.CSVPrinter", "printRecords", "java.lang.Iterable", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "println", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.lang.Iterable"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printComment", new String[]{"java.lang.String"}, new String[]{"Unexpected Quote value: a,b,c1.5e300"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "println", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printRecords", "java.lang.Object[]", "<empty>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, false, 5, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecord", new String[]{"java.lang.Iterable"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printComment", "java.lang.String", "nout"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printRecord", "java.lang.Object[]", "<empty>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "getOut", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "getOut", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printComment", new String[]{"java.lang.String"}, new String[]{"-15"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printRecord", "java.lang.Object[]", "<sample:1>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "getOut", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "getOut", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printRecord", "java.lang.Object[]", "<sample:0>"}, {"org.apache.commons.csv.CSVPrinter", "printRecord", "java.lang.Object[]", "<sample:0>"}}), new String[][]{{"append", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("111", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "print", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printRecords", "java.lang.Object[]", "<sample:0>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "getOut", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVPrinter", "getOut", ""}, {"org.apache.commons.csv.CSVPrinter", "printRecord", "java.lang.Object[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("1", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "getOut", new String[]{}, new String[]{}, false), new String[][]{{"insert", "int,double", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecord", new String[]{"java.lang.Iterable"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVPrinter", "flush", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "close", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "getOut", new String[]{}, new String[]{}, false), new String[][]{{"appendCodePoint", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("\000", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "close", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "getOut", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printRecord", "java.lang.Iterable", "<null>"}}, 1), new String[][]{{"append", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("false", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "close", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "flush", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.sql.ResultSet"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "print", "java.lang.Object", "<i:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecord", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVPrinter", "getOut", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printRecords", "java.lang.Object[]", "<empty>"}, {"org.apache.commons.csv.CSVPrinter", "getOut", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "getOut", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"append", "char[]", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("a0", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "print", new String[]{"java.lang.Object"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVPrinter", "print", "java.lang.Object", "<null>"}, {"org.apache.commons.csv.CSVPrinter", "printComment", "java.lang.String", "J12:30:45"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecord", new String[]{"java.lang.Iterable"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVPrinter", "getOut", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printComment", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "getOut", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "close", ""}}), new String[][]{{"append", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("a", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "println", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVPrinter", "print", "java.lang.Object", "<s:ke>"}, {"org.apache.commons.csv.CSVPrinter", "printRecords", "java.sql.ResultSet", "<sample:4>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "getOut", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVPrinter", "print", "java.lang.Object", "<s:a>"}}, 3), new String[][]{{"append", "double", "6"}, {"append", "float", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("a-1.0Infinity", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printRecord", "java.lang.Object[]", "<sample:0>"}, {"org.apache.commons.csv.CSVPrinter", "printRecords", "java.lang.Object[]", "<sample:1>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "print", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.sql.ResultSet"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "getOut", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"append", "double", "7"}, {"append", "float", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("0.0-Infinity", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "getOut", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "print", "java.lang.Object", "<sample:2>"}, {"org.apache.commons.csv.CSVPrinter", "printRecords", "java.lang.Object[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("b\000b2", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printComment", "java.lang.String", "0"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecord", new String[]{"java.lang.Object[]"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "print", new String[]{"java.lang.Object"}, new String[]{"<s:c>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printRecords", "java.lang.Iterable", "<sample:2>"}, {"org.apache.commons.csv.CSVPrinter", "flush", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.lang.Iterable"}, new String[]{"<null>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printRecord", "java.lang.Iterable", "<empty>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "getOut", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"replace", "int,int,java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "println", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecord", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printRecords", "java.lang.Object[]", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "print", "java.lang.Object", "<s:b>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:10>"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printComment", "java.lang.String", "-2"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "getOut", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVPrinter", "print", "java.lang.Object", "<s:a>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "getOut", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printRecords", "java.sql.ResultSet", "<sample:0>"}}, 1), new String[][]{{"insert", "int,java.lang.CharSequence", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "getOut", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"insert", "int,java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sample", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "getOut", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVPrinter", "print", "java.lang.Object", "<d:3.0>"}}, 2), new String[][]{{"append", "double", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("3.00.0", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "getOut", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printRecords", "java.sql.ResultSet", "<null>"}}, 2), new String[][]{{"append", "double", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("-Infinity", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "getOut", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"appendCodePoint", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("\004", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "getOut", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"insert", "int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "getOut", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVPrinter", "flush", ""}, {"org.apache.commons.csv.CSVPrinter", "println", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("", SearchInputFactory_scaffolding.observe(actual));
 }
}
