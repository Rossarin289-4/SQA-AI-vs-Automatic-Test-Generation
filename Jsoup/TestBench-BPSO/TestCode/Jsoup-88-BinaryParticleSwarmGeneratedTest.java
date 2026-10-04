package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"hidden"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "hidden {getKey=hidden, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"bb,cnull"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "bb,cnull=\"0\" {getKey=bb,cnull, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "2020-01-01"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "2020-01-01 {getKey=2020-01-01, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0=\"0\" {getKey=0, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{"java.lang.String"}, new String[]{"data-true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{"java.lang.String"}, new String[]{"data-"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "1E-51.1234567"}, {"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:b>"}}, 1), new String[][]{{"setKey", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("a=\"1E-51.1234567\" {getKey=a, getValue=1E-51.1234567}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0=\"1E-51.1234567\" {getKey=0, getValue=1E-51.1234567}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "autofocus"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "autofocus=\"sample\" {getKey=autofocus, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:4>"}, {"org.jsoup.nodes.Attribute", "isDataAttribute", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1864843158", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"0L"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0L {getKey=0L, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", ".25"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", ".25=\"0\" {getKey=.25, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "<sample:1>"}}, 3), new String[][]{{"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("null {getKey=null, getValue=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3055", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>", "<sample:3>"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "allowfullscseen"}, {"org.jsoup.nodes.Attribute", "getValue", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "allowfullscseen=\"sample\" {getKey=allowfullscseen, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"http://example.cpm/a?b=c", "1"}, true, 0, null, 3), new String[][]{{"html", "", "6"}, {"setKey", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("0=\"1\" {getKey=0, getValue=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"=\""}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "=\"=\"0\" {getKey==\", getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"data-"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "data-=\"sample\" {getKey=data-, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "11.W25"}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "11.W25=\"sample\" {getKey=11.W25, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFF"}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0xFFFFFFF {getKey=0xFFFFFFF, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "<sample:4>"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"Titvle", "aPc +1", "<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "Titlv"}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Titlv {getKey=Titlv, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3055", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"/a/b"}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "Tite"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "/a/b=\"sample\" {getKey=/a/b, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:5>", "<null>"}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"daaa-"}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "daaa-=\"sample\" {getKey=daaa-, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "12:30:45=\"sample\" {getKey=12:30:45, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"/a/b"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "\nnohref2147483648"}}, 1), new String[][]{{"getKey", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nohref2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "nohref2147483648=\"0\" {getKey=nohref2147483648, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"f1", "aPcl"}, true, 0, null, 1), new String[][]{{"setKey", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("sample=\"aPcl\" {getKey=sample, getValue=aPcl}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{"java.lang.String"}, new String[]{"formnovalidate"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.String", "java.lang.String", "java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"0x1Fdata-", "3.", "<sample:0>", "<sample:6>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"1_1234567"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "1_1234567=\"sample\" {getKey=1_1234567, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:5>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"http://example.com/a?b=cautofocus", "null"}, true, 0, null, 3), new String[][]{{"setKey", "java.lang.String", "5"}, {"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("a=\"null\" {getKey=a, getValue=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.String", "java.lang.String", "java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"3x", "checcked", "<sample:5>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "<sample:2>"}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "2147483648010"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{""}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{"java.lang.String"}, new String[]{"/c5/b"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-909673606", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"P,1Hdata-"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "P,1Hdata-=\"sample\" {getKey=P,1Hdata-, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<i:-1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"-1.e"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "-1.e=\"0\" {getKey=-1.e, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.123u5678", "http://example.com/a?b=c"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("1.123u5678=\"http://example.com/a?b=c\" {getKey=1.123u5678, getValue=http://example.com/a?b=c}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{"java.lang.String"}, new String[]{"1.5f"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:5>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"allowfullsctfen"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "allowfullsctfen=\"sample\" {getKey=allowfullsctfen, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "+12147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"+12147483648\" {getKey=0, getValue=+12147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"aPcc"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "aPcc=\"sample\" {getKey=aPcc, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"hidentrue", "0", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"noEresi", "async"}, true, 0, null, 1), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("async", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"formnovalidase", "1"}, true, 0, null, 2), new String[][]{{"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:4>", "<sample:0>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Hello, Worl", "n"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("Hello, Worl=\"n\" {getKey=Hello, Worl, getValue=n}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-2>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1.5f=\"0\" {getKey=1.5f, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"mu+tiple", "-1"}, true), new String[][]{{"getKey", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("mu+tiple", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"hhdden", "multiple"}, true), new String[][]{{"clone", "", "5"}, {"html", "", "1"}, {"setValue", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"/b/b"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "1.5e"}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/b/b=\"0\" {getKey=/b/b, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1.5e300=\"0\" {getKey=1.5e300, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{"java.lang.String"}, new String[]{"aPc"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3055", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{"java.lang.String"}, new String[]{"b,b,c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false), new String[][]{{"html", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"asyncTITLE"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "1.123256r7890123456"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "asyncTITLE=\"0\" {getKey=asyncTITLE, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:6>", "<sample:6>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"1.s25"}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1.s25=\"\" {getKey=1.s25, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.String", "java.lang.String", "java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"noresize", "hidenchecked", "<sample:2>", "<sample:5>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"3."}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "3.=\"sample\" {getKey=3., getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "11.25"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("46759585", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"11.25\" {getKey=0, getValue=11.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "15abc"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("15abc", String.valueOf(actual));
  assertEquals("receiver state after the call", "15abc=\"0\" {getKey=15abc, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"1.123456789X01234467"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "1.123456789X01234467=\"{&quot;a&quot;:1}\" {getKey=1.123456789X01234467, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"Z1,2]"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<i:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Z1,2]=\"0\" {getKey=Z1,2], getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}, {"org.jsoup.nodes.Attribute", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0ecompact", "0x11F"}, true), new String[][]{{"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("0ecompact=\"0x11F\" {getKey=0ecompact, getValue=0x11F}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "jsmbp"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample=\"\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "<null>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{"java.lang.String"}, new String[]{"nohref"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-909673606", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "1.12345678901234561.5f"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Hello, W\nrlc", "itmsc"}, true), new String[][]{{"html", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, W\nrlc=\"itmsc\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:4>", "<sample:6>"}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<i:-2147483648>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1630186666", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.String", "java.lang.String", "java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"0true", "<null>", "<null>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("null {getKey=null, getValue=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<empty>", "<sample:6>"}, {"org.jsoup.nodes.Attribute", "html", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<empty>", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "<sample:4>"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "data-20"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "data-20=\"sample\" {getKey=data-20, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"2020-01-011", "b,b,c", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "0null"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0null {getKey=0null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"iners", "1.12345678901234567itemscope"}, true), new String[][]{{"html", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("iners=\"1.12345678901234567itemscope\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"/a/b", "1e11"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("/a/b=\"1e11\" {getKey=/a/b, getValue=1e11}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "11.5e"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"11.5e\" {getKey=0, getValue=11.5e}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"ha/b", "1.123456789012345612:30:45"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("ha/b=\"1.123456789012345612:30:45\" {getKey=ha/b, getValue=1.123456789012345612:30:45}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:10>"}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"setValue", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5pe300", "fornovalidate0x1F"}, true), new String[][]{{"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("fornovalidate0x1F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "nusk"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"nusk\" {getKey=0, getValue=nusk}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "Jnoresize"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1752320395", String.valueOf(actual));
  assertEquals("receiver state after the call", "Jnoresize=\"sample\" {getKey=Jnoresize, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "x"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x", String.valueOf(actual));
  assertEquals("receiver state after the call", "x=\"sample\" {getKey=x, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "inert"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1184197090", String.valueOf(actual));
  assertEquals("receiver state after the call", "inert {getKey=inert, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1864843158", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample=\"\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"autofocus"}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "\n"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"autofocus\" {getKey=0, getValue=autofocus}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{".true", "alaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"5.TITLE"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"5.TITLE\" {getKey=0, getValue=5.TITLE}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "1.5e30/"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"1.5e30/\" {getKey=0, getValue=1.5e30/}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "TlTTLE"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1787791263", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"TlTTLE\" {getKey=0, getValue=TlTTLE}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}}), new String[][]{{"setKey", "java.lang.String", "7"}, {"getKey", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "aut"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "aut=\"sample\" {getKey=aut, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"getKey", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}}), new String[][]{{"html", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"hidde"}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}, {"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"hidde\" {getKey=0, getValue=hidde}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"th"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"th\" {getKey=0, getValue=th}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "nohref"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2118535444", String.valueOf(actual));
  assertEquals("receiver state after the call", "nohref {getKey=nohref, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "0x1Fmultiple"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"0x1Fmultiple\" {getKey=0, getValue=0x1Fmultiple}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "aPE"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-906706348", String.valueOf(actual));
  assertEquals("receiver state after the call", "aPE=\"sample\" {getKey=aPE, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"6"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"6\" {getKey=0, getValue=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "async"}, {"org.jsoup.nodes.Attribute", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("async=\"0\" {getKey=async, getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "async=\"0\" {getKey=async, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:2>"}, {"org.jsoup.nodes.Attribute", "getKey", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "autofo4us"}, {"org.jsoup.nodes.Attribute", "isDataAttribute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("autofo4us=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "autofo4us=\"sample\" {getKey=autofo4us, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.String", "java.lang.String", "java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"0xFFFFFFFF11234567890123456", "12:30:45", "<sample:0>", "<sample:0>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "1eP0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-861335306", String.valueOf(actual));
  assertEquals("receiver state after the call", "1eP0=\"sample\" {getKey=1eP0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "-0.0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("-0.0=\"sample\" {getKey=-0.0, getValue=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-0.0=\"sample\" {getKey=-0.0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{"java.lang.String"}, new String[]{"Titleautofocus"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "<sample:2>"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1L", "<null>", "<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5e300", "null"}, true, 0, null, 1), new String[][]{{"setKey", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("a=\"null\" {getKey=a, getValue=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}, {"org.jsoup.nodes.Attribute", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"ddfa"}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<i:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"ddfa\" {getKey=0, getValue=ddfa}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{"java.lang.String"}, new String[]{"9"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"/b/b"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/b/b=\"0\" {getKey=/b/b, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"a"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"a\" {getKey=0, getValue=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{"java.lang.String"}, new String[]{"decl`r9"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "/L1.12345678901234567"}, {"org.jsoup.nodes.Attribute", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/L1.12345678901234567=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "/L1.12345678901234567=\"sample\" {getKey=/L1.12345678901234567, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"/b/b"}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "noresxize"}, {"org.jsoup.nodes.Attribute", "clone", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/b/b {getKey=/b/b, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"/", "hhdden"}, true, 0, null, 1), new String[][]{{"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("/=\"hhdden\" {getKey=/, getValue=hhdden}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "<sample:2>"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"noh=ef", "=#"}, true, 0, null, 2), new String[][]{{"setValue", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.String", "java.lang.String", "java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"Hello<,\037World", "1.1234567", "<sample:2>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:4>", "<sample:1>"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:9>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"[1-,2]", ""}, true, 0, null, 2), new String[][]{{"getKey", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1-,2]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "trte"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "trte=\"sample\" {getKey=trte, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", ".5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", ".5=\"0\" {getKey=.5, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{".a/b"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "clone", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", ".a/b=\"0\" {getKey=.a/b, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}}, 1), new String[][]{{"setValue", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.String", "java.lang.String", "java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"10-25", "=\"", "<sample:3>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "decmbre"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"decmbre\" {getKey=0, getValue=decmbre}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:0>"}, {"org.jsoup.nodes.Attribute", "getValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-909673606", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>", "<sample:7>"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "<sample:5>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<null>"}, {"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}}, 1), new String[][]{{"html", "", "1"}, {"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{"java.lang.String"}, new String[]{"iTTLE"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"declareformnovalidate", "Hello, World"}, true, 0, null, 1), new String[][]{{"getValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"123456789012345578901234567890", "hhdden0x123456789", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "inert-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"inert-1\" {getKey=0, getValue=inert-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}, {"org.jsoup.nodes.Attribute", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"+1L"}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:he>"}, {"org.jsoup.nodes.Attribute", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"+1L\" {getKey=0, getValue=+1L}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"910", "<a>b</a>checked"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("910=\"<a>b</a>checked\" {getKey=910, getValue=<a>b</a>checked}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI", String.valueOf(actual));
  assertEquals("receiver state after the call", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI=\"0\" {getKey=aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{"java.lang.String"}, new String[]{"multiple"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "\n"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.25", "defer"}, true, 0, null, 2), new String[][]{{"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("1.25=\"defer\" {getKey=1.25, getValue=defer}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"iitemtcope", "4."}, true, 0, null, 3), new String[][]{{"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("iitemtcope=\"4.\" {getKey=iitemtcope, getValue=4.}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "\u00e8"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\u00e8=\"sample\" {getKey=\u00e8, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"J"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"J\" {getKey=0, getValue=J}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "itemscope"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("itemscope=\"0\" {getKey=itemscope, getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "itemscope=\"0\" {getKey=itemscope, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "1.1234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1586293913", String.valueOf(actual));
  assertEquals("receiver state after the call", "1.1234567=\"{&quot;a&quot;:1}\" {getKey=1.1234567, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.String", "java.lang.String", "java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"/\013", "2147483648", "<sample:3>", "<sample:2>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "-0./"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-866641018", String.valueOf(actual));
  assertEquals("receiver state after the call", "-0./=\"sample\" {getKey=-0./, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "/b/b1.25async"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "2020-01-01"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-215028156", String.valueOf(actual));
  assertEquals("receiver state after the call", "2020-01-01=\"\" {getKey=2020-01-01, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>", "<sample:3>"}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}, {"org.jsoup.nodes.Attribute", "html", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"d\tfer", "", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-909673606", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<i:-4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"00L", "itemscope"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("00L=\"itemscope\" {getKey=00L, getValue=itemscope}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a,,c", "hmuted"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("a,,c=\"hmuted\" {getKey=a,,c, getValue=hmuted}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:4>", "<sample:1>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "itemscoxpe"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("itemscoxpe=\"0\" {getKey=itemscoxpe, getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "itemscoxpe=\"0\" {getKey=itemscoxpe, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "0x1234567899"}, {"org.jsoup.nodes.Attribute", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2142922044", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x1234567899=\"0\" {getKey=0x1234567899, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:36>"}, false, 6, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}, {"org.jsoup.nodes.Attribute", "isDataAttribute", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "/a5btrue"}, {"org.jsoup.nodes.Attribute", "getKey", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a5btrue", String.valueOf(actual));
  assertEquals("receiver state after the call", "/a5btrue {getKey=/a5btrue, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"Hinert", "cb,b,c", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "itemscope"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"0x123457789"}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:5>"}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"0x123457789\" {getKey=0, getValue=0x123457789}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"012"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"012\" {getKey=0, getValue=012}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"html", "", "4"}, {"getKey", "", "5"}, {"html", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "b"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "b {getKey=b, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "allo"}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "<sample:8>"}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", ">1.123456m"}, {"org.jsoup.nodes.Attribute", "hashCode", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0=\">1.123456m\" {getKey=0, getValue=>1.123456m}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{"java.lang.String"}, new String[]{"checked"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"[1,2]o", "dfault"}, true, 0, null, 3), new String[][]{{"getValue", "", "1"}, {"html", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2]o=\"dfault\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.0 {getKey=0.0, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{"java.lang.String"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "<sample:5>"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<null>", "<sample:6>"}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"html", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{"java.lang.String"}, new String[]{"data-true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1630186666", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "<sample:0>"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "getKey", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", ""}, {"org.jsoup.nodes.Attribute", "html", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "muted"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"muted\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"muted\" {getKey=0, getValue=muted}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "autofpcus"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("autofpcus", String.valueOf(actual));
  assertEquals("receiver state after the call", "autofpcus=\"\" {getKey=autofpcus, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "a b"}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "-/.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-/.0=\"0\" {getKey=-/.0, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "1.5"}, {"org.jsoup.nodes.Attribute", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("50056", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"1.5\" {getKey=0, getValue=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "gormnovalidate"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "trueW"}, {"org.jsoup.nodes.Attribute", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "trueW=\"sample\" {getKey=trueW, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
}
