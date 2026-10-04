package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readAgain", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{"char[]", "int", "int"}, new String[]{"<sample:1>", "2147483647", "-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{"char[]", "int", "int"}, new String[]{"<sample:1>", "2147483647", "-2147483648"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{"char[]", "int", "int"}, new String[]{"<sample:1>", "-2147483648", "-1073741310"}, false, 0, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readAgain", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" x \t y ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", "char[],int,int", "<sample:0>", "0", "-2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "read", "char[],int,int", "<sample:0>", "0", "-2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "read", "char[],int,int", "<sample:0>", "0", "-2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(",b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a><b>t</b></a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"a\":1}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x \t y ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ine1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{"char[]", "int", "int"}, new String[]{"<empty>", "2147483647", "-2147483647"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("123", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("108", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1,2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", "char[],int,int", "<sample:0>", "0", "1"}, {"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ne1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", "char[],int,int", "<sample:0>", "0", "1"}, {"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", "char[],int,int", "<sample:0>", "0", "1"}, {"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", "char[],int,int", "<sample:0>", "0", "1"}, {"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "-39", "-2147483648"}, false, 14, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "21", "-2147483648"}, false, 14, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readAgain", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "read", "char[],int,int", "<empty>", "-3", "-1073741310"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readAgain", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "read", "char[],int,int", "<empty>", "-3", "-1073741310"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readAgain", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "read", "char[],int,int", "<empty>", "-3", "-1073741310"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("98", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "read", "char[],int,int", "<sample:0>", "-3", "-1"}, {"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("98", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "read", "char[],int,int", "<sample:0>", "-3", "-1"}, {"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("49", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "read", "char[],int,int", "<sample:0>", "-3", "-1"}, {"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "read", "char[],int,int", "<empty>", "0", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "read", "char[],int,int", "<sample:1>", "0", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("108", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "read", "char[],int,int", "<sample:1>", "0", "1"}, {"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("44", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{"char[]", "int", "int"}, new String[]{"<sample:2>", "2", "1"}, false, 7, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readAgain", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("98", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", new String[]{}, new String[]{}, false, 21, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(",b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "read", "char[],int,int", "<empty>", "-2147483648", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readAgain", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("98", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readAgain", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("62", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readAgain", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("125", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readAgain", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "32825", "-2147483648"}, false, 1, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "read", "char[],int,int", "<sample:2>", "-1073741310", "-1073741310"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("120", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{"char[]", "int", "int"}, new String[]{"<sample:1>", "2147483647", "0"}, false, 0, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("123", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" x \t y ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("line1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readAgain", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("62", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readAgain", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("125", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readAgain", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readAgain", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readAgain", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readAgain", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readAgain", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readAgain", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readAgain", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "read", "char[],int,int", "<sample:1>", "1", "0"}, {"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("98", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readAgain", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("108", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readAgain", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readAgain", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("123", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("108", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("123", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", "char[],int,int", "<sample:0>", "-1073741310", "1"}, {"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", "char[],int,int", "<sample:0>", "-1073741310", "1"}, {"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", "char[],int,int", "<sample:0>", "-1073741310", "1"}, {"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("44", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("123", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("108", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "0", "10"}, false, 0, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readAgain", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readAgain", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readAgain", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("123", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readAgain", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readAgain", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("108", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", "char[],int,int", "<sample:4>", "0", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", "char[],int,int", "<sample:4>", "0", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", "char[],int,int", "<sample:4>", "0", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readAgain", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "read", "char[],int,int", "<sample:0>", "-1", "-2"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "read", "char[],int,int", "<sample:0>", "0", "-2"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" x \t y ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("line1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("44", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readAgain", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", "char[],int,int", "<sample:1>", "10", "-2"}, {"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("49", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("123", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("108", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("108", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("34", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", "char[],int,int", "<null>", "0", "0"}, {"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("105", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", "char[],int,int", "<null>", "0", "0"}, {"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("98", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{"char[]", "int", "int"}, new String[]{"<sample:1>", "0", "1"}, false, 0, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{"char[]", "int", "int"}, new String[]{"<sample:1>", "0", "1"}, false, 0, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "1", "0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "0", "-2"}, false, 1, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{"char[]", "int", "int"}, new String[]{"<sample:1>", "-41", "0"}, false, 14, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readAgain", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "read", "char[],int,int", "<sample:0>", "-2", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readAgain", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readAgain", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", "char[],int,int", "<sample:2>", "1", "-3"}, {"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("98", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readAgain", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", "char[],int,int", "<sample:2>", "1", "-3"}, {"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{"char[]", "int", "int"}, new String[]{"<empty>", "-2147483647", "0"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "readLine", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "read", "char[],int,int", "<sample:2>", "0", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "0", "1"}, false, 0, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "0", "1"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{"char[]", "int", "int"}, new String[]{"<sample:2>", "1", "1"}, false, 0, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{"char[]", "int", "int"}, new String[]{"<sample:1>", "0", "2"}, false, 6, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{"char[]", "int", "int"}, new String[]{"<sample:2>", "0", "3"}, false, 5, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{"char[]", "int", "int"}, new String[]{"<sample:2>", "2", "1"}, false, 0, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "getLineNumber", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readLine", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{"char[]", "int", "int"}, new String[]{"<sample:2>", "0", "1"}, false, 12, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", ""}, {"org.apache.commons.csv.ExtendedBufferedReader", "readAgain", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{"char[]", "int", "int"}, new String[]{"<sample:1>", "0", "2"}, false, 5, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "lookAhead", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{"char[]", "int", "int"}, new String[]{"<sample:2>", "0", "2"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.ExtendedBufferedReader", "org.apache.commons.csv.ExtendedBufferedReader", "read", new String[]{"char[]", "int", "int"}, new String[]{"<sample:2>", "0", "3"}, false, 2, new String[][]{{"org.apache.commons.csv.ExtendedBufferedReader", "read", "char[],int,int", "<sample:2>", "-3", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
}
