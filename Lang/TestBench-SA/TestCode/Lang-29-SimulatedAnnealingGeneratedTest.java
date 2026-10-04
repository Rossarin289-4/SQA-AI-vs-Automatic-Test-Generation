package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSNameMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Title", "java.class.version"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSNameMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TIitle", "1E-3"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaAwtHeadless", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"ht0tp://example.com/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"ht0tp:/4/xample.com/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 4, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"\n"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"11E-5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[11, 5, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"12E-5java.awt.fonts"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[12, 5, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSMatch", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"1.5d", "java.io.tmpdir", "a,b,c", "1.25"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSMatch", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"1.5euse.dis", "j`vaio", "C,,c", "1.1234567890p2F34567"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("2020.23", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"2020-02-40T25:61:61"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("2020.24", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"20200-02-40T25:61:61"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("20200.24", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"20p2/W02-40T25:61:61a"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("20.22", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"2-p2/W/-40T25:61:61a"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("2.24", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionAtLeast", new String[]{"int"}, new String[]{"2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionAtLeast", new String[]{"int"}, new String[]{"10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSNameMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"3", "java.awt.graphicsenv"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c12:30:45"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1545", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c12:30:45"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1545", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"http:]//exam"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{".5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("500", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"1.5d"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"2.5d"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2, 5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"createNewFile", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"1.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"1.a"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"d1.b1.5d"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"d<-b15d"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("15.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"d<bi5dA"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"fPTfile.separatorjava.class/pathtrue"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"fPTfile.separatorjava.class/pathtrue"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"gPTfile.separatorjava.class/pathtrue.5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"1e10"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"1e"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"11"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("11.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.53", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"http:/.exanple.com/a?b=c.5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"ttp:/.exanple.com/a?b=c.4"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("4.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"jva.kruntime.versiAn"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionAtLeast", new String[]{"float"}, new String[]{"-3.4028235E38"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionAtLeast", new String[]{"float"}, new String[]{"-Infinity"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"PT1H"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c12:30:45"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[12, 30, 45, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c12:30:45"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[12, 30, 45, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c02:30:45"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2, 30, 45, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"ht4p://example.coma?bc/2:30:45"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[4, 2, 30, 45, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSNameMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.25", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Hello, World", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c12:E0:45"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1245", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"http://e1.5d"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("150", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"http://e1.5djava.endorse1.1234567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("151", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"http:/5e1.5djava.endorse1.1234567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("515", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"http:/5e1.5djava.endorse1.1234567"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("515", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"010"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"0e10"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"java.awt.he3dless"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"java.awt.he4dless"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("400", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"ja;a.ext/dins"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"java.ruotime.version0x1F"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"[-2]"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("200", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionAtLeast", new String[]{"float"}, new String[]{"-0.672"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionAtLeast", new String[]{"float"}, new String[]{"2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"1e11"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 11]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionAtLeast", new String[]{"float"}, new String[]{"Infinity"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionAtLeast", new String[]{"float"}, new String[]{"-0.5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"/", "\u00e9"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true), new String[][]{{"canWrite", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true), new String[][]{{"canWrite", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionAtLeast", new String[]{"float"}, new String[]{"Infinity"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionAtLeast", new String[]{"float"}, new String[]{"-15.0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionAtLeast", new String[]{"float"}, new String[]{"15.0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"java.compiler"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"fPTfile.separatorjava.class/pathtrud"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"fPTfile.separatorjtava.class/pathtrud0x123456789"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSMatch", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"java.Puntime.version", "b-5", "<null>", "05"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"eello, Worle0x1F", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1234567890123456789012345678u0", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSNameMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "0a/Ebb"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionAtLeast", new String[]{"int"}, new String[]{"3"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"java.`wwu.crinte6job--0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaAwtHeadless", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"0x1F"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true), new String[][]{{"canExecute", "", "0"}, {"getAbsoluteFile", "", "3"}, {"renameTo", "java.io.File", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionAtLeast", new String[]{"int"}, new String[]{"63"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionAtLeast", new String[]{"int"}, new String[]{"2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSMatch", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"Hello, World", "a b", "Hello, World", "java.compiler"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSMatch", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"H.llo, World", "http://example.com/a?b=c1.1234i567890123456", "Helko, orld1.5d", "java.comp"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaAwtHeadless", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true), new String[][]{{"getCanonicalFile", "", "7"}, {"getPath", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/workspace/output/ai-runs/Lang-29/20261003-193249-095-23b38fd1/algorithm-sa/evaluation/fitness/search-fixed", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"1.X5d"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"1\\X5djxva.awt.headless1.5f"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.51", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"010"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"020"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("20.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true), new String[][]{{"getParent", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/opt/java", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"getAbsolutePath", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/opt/java/openjdk", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"getAbsolutePath", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/workspace/output/ai-runs/Lang-29/20261003-193249-095-23b38fd1/algorithm-sa/evaluation/fitness/search-fixed", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionAtLeast", new String[]{"int"}, new String[]{"2147483646"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"listFiles", "java.io.FilenameFilter", "5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.io.File;", actual.getClass().getName());
  assertEquals("[/tmp/jansi-2.4.3-bb333ecbff74a1f7-libjansi.so.lck, /tmp/jansi-2.4.3-bb333ecbff74a1f7-libjansi.so, /tmp/tomcat.8080.17597536642731864978, /tmp/tomcat.8080.4052791338623087315, /tmp/hsperfdata_root, /t...#351#802813531", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"listFiles", "java.io.FilenameFilter", "5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.io.File;", actual.getClass().getName());
  assertEquals("[/opt/java/openjdk/bin, /opt/java/openjdk/lib, /opt/java/openjdk/jmods, /opt/java/openjdk/legal, /opt/java/openjdk/conf, /opt/java/openjdk/release, /opt/java/openjdk/include, /opt/java/openjdk/man, /o...#223#-991007599", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"listFiles", "java.io.FilenameFilter", "5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.io.File;", actual.getClass().getName());
  assertEquals("[/root/.bashrc, /root/.profile, /root/.subversion, /root/.java, /root/.m2, /root/.cpanm, /root/.wget-hsts]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true), new String[][]{{"listFiles", "java.io.FilenameFilter", "5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.io.File;", actual.getClass().getName());
  assertEquals("[/root/.bashrc, /root/.profile, /root/.subversion, /root/.java, /root/.m2, /root/.cpanm, /root/.wget-hsts]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true), new String[][]{{"mkdir", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true), new String[][]{{"getAbsolutePath", "", "5"}, {"list", "java.io.FilenameFilter", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c12:30:45"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1545", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"{\"a\"\"h:11}"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1100", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"p2"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("200", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"q3"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"1.1234567890:234567"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-538988321", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"vava.e8ndorsed.dirs", "--1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSNameMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "a b"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"createNewFile", "", "7"}, {"compareTo", "java.io.File", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("14", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionAtLeast", new String[]{"int"}, new String[]{"1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionAtLeast", new String[]{"int"}, new String[]{"2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"1.5f"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("150", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true), new String[][]{{"getParentFile", "", "7"}, {"getFreeSpace", "", "2"}, {"setWritable", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"+1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true), new String[][]{{"getAbsolutePath", "", "4"}, {"setWritable", "boolean", "0"}, {"getCanonicalPath", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/tmp", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"getAbsolutePath", "", "4"}, {"setWritable", "boolean", "0"}, {"getCanonicalPath", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/workspace/output/ai-runs/Lang-29/20261003-193249-095-23b38fd1/algorithm-sa/evaluation/fitness/search-fixed", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("2.14748365E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true), new String[][]{{"getParentFile", "", "5"}, {"mkdir", "", "3"}, {"getParent", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/opt", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaAwtHeadless", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"user.home"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"-1.5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 5, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"-1.6"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 6, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"1.6"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 6]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"11.6"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[11, 6]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"11.5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[11, 5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"5."}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"Thtle1.5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("150", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"0a/iD\rc1.25"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.125", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"0p/iD\rc1.2"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.12", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"2147483648"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"java.aw-t.fontsuser.di-1.5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"3ava.aow-t.fontsser.di-1.5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("3.15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c12:30:45"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("12.3045", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"http://example.icom/a?b=LcB2::30:45"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("2.3045", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSNameMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"ava.runtime.versiou3er.home", ""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true), new String[][]{{"canWrite", "", "5"}, {"isDirectory", "", "1"}, {"toURL", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("file:/root/ {getAuthority=, getDefaultPort=-1, getFile=/root/, getHost=, getPath=/root/, getPort=-1, getProtocol=file, getQuery=null, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true), new String[][]{{"canWrite", "", "5"}, {"isDirectory", "", "1"}, {"toURL", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("file:/workspace/output/ai-runs/Lang-29/20261003-193249-095-23b38fd1/algorithm-sa/evaluation/fitness/search-fixed/ {getAuthority=, getDefaultPort=-1, getFile=/workspace/output/ai-runs/Lang-29/20261003-...#378#2026233550", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1/d", "2020-02-40T25:c1:661"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", ""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionFloat", new String[]{"java.lang.String"}, new String[]{"0xFFFFFEFyF1.12345678901234567"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSMatch", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "1", "java.home"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"0xx1E"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"ile.sepjratmEr1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("200", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"jaua.runtime.versionfil.3e.separatnr"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true), new String[][]{{"deleteOnExit", "", "2"}, {"listFiles", "java.io.FilenameFilter", "1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.io.File;", actual.getClass().getName());
  assertEquals("[/workspace/output/ai-runs/Lang-29/20261003-193249-095-23b38fd1/algorithm-sa/evaluation/fitness/search-fixed/build.xml, /workspace/output/ai-runs/Lang-29/20261003-193249-095-23b38fd1/algorithm-sa/eval...#2100#-1796112691", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"yy{\"a\":1}"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSNameMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"java.rsuntime.veCsion", ""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"1.123456890133456"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSNameMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5", ""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true), new String[][]{{"listFiles", "java.io.FilenameFilter", "6"}});
  assertNotNull(actual);
  assertEquals("[Ljava.io.File;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSMatch", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"java.awt.graphicsenv", "[^\\v]", "1E-5", ";+1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x1F", ""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"jaua.encorsed.dirs123456789012345678901234567890"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true), new String[][]{{"list", "", "7"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[bin, lib, jmods, legal, conf, release, include, man, NOTICE]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true), new String[][]{{"toURL", "", "0"}, {"toURI", "", "1"}, {"getPath", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/root/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true), new String[][]{{"toURL", "", "0"}, {"toURI", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.net.URI", actual.getClass().getName());
  assertEquals("file:/root/ {getAuthority=null, getFragment=null, getHost=null, getPath=/root/, getPort=-1, getQuery=null, getRawAuthority=null, getRawFragment=null, getRawPath=/root/, getRawQuery=null, getRawSchemeS...#321#1767106166", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true), new String[][]{{"toURL", "", "0"}, {"sameFile", "java.net.URL", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"vv2t4748348", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"lastModified", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionInt", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"21:477ve 3647java.ext/dirsjava.library.pathjava.ext.dirsa"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[21, 477, 3647, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSMatch", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"PT1Hjava.cla5s.", "1.5d", "", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true), new String[][]{{"renameTo", "java.io.File", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "toJavaVersionIntArray", new String[]{"java.lang.String"}, new String[]{"1_1234567890123456 awtAtoolkit2020-02-30T25:61:61user.home"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true), new String[][]{{"deleteOnExit", "", "3"}, {"canWrite", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"mkdir", "", "6"}, {"renameTo", "java.io.File", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true), new String[][]{{"toURL", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("file:/tmp/ {getAuthority=, getDefaultPort=-1, getFile=/tmp/, getHost=, getPath=/tmp/, getPort=-1, getProtocol=file, getQuery=null, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"isHidden", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"isHidden", "", "4"}, {"getAbsolutePath", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/tmp", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true), new String[][]{{"listFiles", "java.io.FileFilter", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.io.File;", actual.getClass().getName());
  assertEquals("[/tmp/jansi-2.4.3-bb333ecbff74a1f7-libjansi.so.lck, /tmp/jansi-2.4.3-bb333ecbff74a1f7-libjansi.so, /tmp/tomcat.8080.17597536642731864978, /tmp/tomcat.8080.4052791338623087315, /tmp/hsperfdata_root, /t...#351#802813531", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true), new String[][]{{"deleteOnExit", "", "7"}, {"getAbsolutePath", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/opt/java/openjdk", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSMatch", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"file-encodinf4123456789", "<null>", "ijava.home", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"setExecutable", "boolean,boolean", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"setExecutable", "boolean,boolean", "2"}, {"getPath", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/root", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"getParentFile", "", "5"}, {"listFiles", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.io.File;", actual.getClass().getName());
  assertEquals("[/var, /dev, /home, /media, /lib64, /sbin, /sys, /tmp, /mnt, /srv, /opt, /lib, /boot, /bin, /usr, /proc, /etc, /root, /run, /a, /a0, /.dockerenv, /workspace, /__cacert_entrypoint.sh]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.a", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "\010"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-1-02", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true), new String[][]{{"getPath", "", "2"}, {"toPath", "", "5"}});
  assertNotNull(actual);
  assertEquals("sun.nio.fs.UnixPath", actual.getClass().getName());
  assertEquals("/tmp {getNameCount=1, isAbsolute=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"setExecutable", "boolean,boolean", "3"}, {"getCanonicalFile", "", "1"}, {"mkdir", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"getName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("tmp", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"getName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("root", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"setWritable", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true), new String[][]{{"setReadable", "boolean,boolean", "1"}, {"getParent", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"getTotalSpace", "", "1"}, {"canExecute", "", "6"}, {"list", "java.io.FilenameFilter", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSMatch", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"mul", "-.", "", ""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"getTotalSpace", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("983349346304", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"isDirectory", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"isDirectory", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSMatch", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"abc", "5.", "", "5."}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"isHidden", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"canWrite", "", "3"}, {"toURL", "", "5"}, {"getPort", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"canExecute", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"compareTo", "java.io.File", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"compareTo", "java.io.File", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("22", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"canExecute", "", "7"}, {"getParent", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"canExecute", "", "7"}, {"getParent", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/workspace/output/ai-runs/Lang-29/20261003-193249-095-23b38fd1/algorithm-sa/evaluation/fitness", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSNameMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"j8va.e_corsedd.dirrn2:30:45user.homefile.separator1.5", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"isHidden", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"compareTo", "java.io.File", "4"}, {"isHidden", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"isAbsolute", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"getParentFile", "", "4"}, {"isAbsolute", "", "7"}, {"getFreeSpace", "", "2"}, {"setReadable", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSNameMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{">/5", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"getParent", "", "2"}, {"length", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSNameMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"listFiles", "java.io.FileFilter", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.io.File;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"toURL", "", "2"}, {"getContent", "", "2"}});
  assertNotNull(actual);
  assertEquals("sun.net.www.content.text.PlainTextInputStream", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"listFiles", "java.io.FilenameFilter", "7"}});
  assertNotNull(actual);
  assertEquals("[Ljava.io.File;", actual.getClass().getName());
  assertEquals("[/workspace/output/ai-runs/Lang-29/20261003-193249-095-23b38fd1/algorithm-sa/evaluation/fitness/search-fixed/build.xml, /workspace/output/ai-runs/Lang-29/20261003-193249-095-23b38fd1/algorithm-sa/eval...#2100#-1796112691", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"getAbsolutePath", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/opt/java/openjdk", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"setExecutable", "boolean", "2"}, {"getName", "", "7"}, {"delete", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"canExecute", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"renameTo", "java.io.File", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"setReadable", "boolean,boolean", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"lastModified", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"mkdir", "", "4"}, {"compareTo", "java.io.File", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("22", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"getAbsoluteFile", "", "5"}, {"list", "java.io.FilenameFilter", "1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[bin, lib, jmods, legal, conf, release, include, man, NOTICE]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"compareTo", "java.io.File", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("22", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"listFiles", "", "7"}});
  assertNotNull(actual);
  assertEquals("[Ljava.io.File;", actual.getClass().getName());
  assertEquals("[/tmp/jansi-2.4.3-bb333ecbff74a1f7-libjansi.so.lck, /tmp/jansi-2.4.3-bb333ecbff74a1f7-libjansi.so, /tmp/tomcat.8080.17597536642731864978, /tmp/tomcat.8080.4052791338623087315, /tmp/hsperfdata_root, /t...#351#802813531", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"compareTo", "java.io.File", "6"}, {"isFile", "", "0"}, {"getAbsolutePath", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/opt/java/openjdk", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"toPath", "", "1"}});
  assertNotNull(actual);
  assertEquals("sun.nio.fs.UnixPath", actual.getClass().getName());
  assertEquals("/tmp {getNameCount=1, isAbsolute=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"toPath", "", "1"}, {"getName", "int", "2"}});
  assertNotNull(actual);
  assertEquals("sun.nio.fs.UnixPath", actual.getClass().getName());
  assertEquals("tmp {getNameCount=1, isAbsolute=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"toURL", "", "3"}, {"getProtocol", "", "3"}, {"toURI", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.net.URI", actual.getClass().getName());
  assertEquals("file:/tmp/ {getAuthority=null, getFragment=null, getHost=null, getPath=/tmp/, getPort=-1, getQuery=null, getRawAuthority=null, getRawFragment=null, getRawPath=/tmp/, getRawQuery=null, getRawSchemeSpec...#316#1712548665", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSNameMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"java.class.path", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"getName", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("openjdk", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"getName", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("root", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"canRead", "", "3"}, {"getFreeSpace", "", "6"}, {"getParent", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/opt/java", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSMatch", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"java.class.version", "2147483647", "", ""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"getCanonicalPath", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/root", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"toPath", "", "7"}, {"relativize", "java.nio.file.Path", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.file.ProviderMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"setExecutable", "boolean,boolean", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSMatch", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"Hello, World", "12:30:46", "<null>", ":"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"toURL", "", "2"}, {"toURI", "", "2"}, {"getPath", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/tmp/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaHome", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"delete", "", "3"}, {"listFiles", "java.io.FilenameFilter", "7"}});
  assertNotNull(actual);
  assertEquals("[Ljava.io.File;", actual.getClass().getName());
  assertEquals("[/opt/java/openjdk/bin, /opt/java/openjdk/lib, /opt/java/openjdk/jmods, /opt/java/openjdk/legal, /opt/java/openjdk/conf, /opt/java/openjdk/release, /opt/java/openjdk/include, /opt/java/openjdk/man, /o...#223#-991007599", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"delete", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getJavaIoTmpDir", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"getFreeSpace", "", "3"}, {"lastModified", "", "0"}, {"list", "java.io.FilenameFilter", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[jansi-2.4.3-bb333ecbff74a1f7-libjansi.so.lck, jansi-2.4.3-bb333ecbff74a1f7-libjansi.so, tomcat.8080.17597536642731864978, tomcat.8080.4052791338623087315, hsperfdata_root, tb-check2, tomcat.8080.2508...#301#97503157", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"getFreeSpace", "", "0"}, {"setExecutable", "boolean", "6"}, {"isHidden", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSMatch", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "/a/b", "<null>", "a b"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserDir", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"getUsableSpace", "", "5"}, {"toURL", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("file:/workspace/output/ai-runs/Lang-29/20261003-193249-095-23b38fd1/algorithm-sa/evaluation/fitness/search-fixed/ {getAuthority=, getDefaultPort=-1, getFile=/workspace/output/ai-runs/Lang-29/20261003-...#378#2026233550", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"getParent", "", "2"}, {"canRead", "", "5"}, {"getParent", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"exists", "", "4"}, {"canWrite", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isOSMatch", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"1.ig", "java.awt.fonts", "<null>", "ijava.home"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "getUserHome", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"toPath", "", "5"}});
  assertNotNull(actual);
  assertEquals("sun.nio.fs.UnixPath", actual.getClass().getName());
  assertEquals("/root {getNameCount=1, isAbsolute=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SystemUtils", "org.apache.commons.lang3.SystemUtils", "isJavaVersionMatch", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\t", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
