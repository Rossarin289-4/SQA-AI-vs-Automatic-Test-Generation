package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"async1.25", "-1"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("async1.25=\"-1\" {getKey=async1.25, getValue=-1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false), new String[][]{{"setKey", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("0=\"0\" {getKey=0, getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<i:-19>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{"java.lang.String"}, new String[]{"data-"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:1>"}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "Hello, Worl"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Hello, Worl=\"sample\" {getKey=Hello, Worl, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "defer"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "defer=\"sample\" {getKey=defer, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:0e>"}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "default"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "default {getKey=default, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "-.0"}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "nores9e"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "nores9e {getKey=nores9e, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", ""}, {"org.jsoup.nodes.Attribute", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"\" {getKey=0, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{"java.lang.String"}, new String[]{"data-PT1Hnoresize"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{"java.lang.String"}, new String[]{".5inert"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TITLW", "asy5c"}, true, 0, null, 2), new String[][]{{"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("TITLW=\"asy5c\" {getKey=TITLW, getValue=asy5c}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "1=\"0\" {getKey=1, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "[1,2]"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2]=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "[1,2]=\"0\" {getKey=[1,2], getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-909673606", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}}, 3), new String[][]{{"setKey", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>", "<sample:4>"}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:6>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"getKey", "", "3"}, {"clone", "", "4"}, {"setValue", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "\014"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"de"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "de=\"0\" {getKey=de, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.String", "java.lang.String", "java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1.5e3000", "1e10a", "<sample:0>", "<sample:2>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}, {"org.jsoup.nodes.Attribute", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"getKey", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:b>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-19>"}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:0>"}, {"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5f", "nohrff"}, true, 0, null, 3), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nohrff", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<null>", "<sample:3>"}, {"org.jsoup.nodes.Attribute", "isDataAttribute", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}}, 1), new String[][]{{"html", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:key>"}, {"org.jsoup.nodes.Attribute", "toString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}, {"org.jsoup.nodes.Attribute", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{"java.lang.String"}, new String[]{"--1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648=\"sample\" {getKey=2147483648, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "<sample:4>"}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3055", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[1,2]=\"0\" {getKey=[1,2], getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{"java.lang.String"}, new String[]{"mull"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.String", "java.lang.String", "java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"mutedasync", "", "<sample:3>", "<sample:1>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:<>"}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:e>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}}, 2), new String[][]{{"getKey", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-19>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"[1,2]]"}, false, 6, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "aformnovalidate"}, {"org.jsoup.nodes.Attribute", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"nohref", "-1.5"}, true, 0, null, 3), new String[][]{{"html", "", "4"}, {"getKey", "", "4"}, {"setKey", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("a=\"-1.5\" {getKey=a, getValue=-1.5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "Tiule"}, {"org.jsoup.nodes.Attribute", "getValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Tiule", String.valueOf(actual));
  assertEquals("receiver state after the call", "Tiule {getKey=Tiule, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{"java.lang.String"}, new String[]{"nohref"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "5hecked"}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "chcked"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "chcked=\"sample\" {getKey=chcked, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"1/5f"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:key>"}, {"org.jsoup.nodes.Attribute", "isDataAttribute", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.String", "java.lang.String", "java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"W", "nohref", "<sample:0>", "<sample:4>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}, {"org.jsoup.nodes.Attribute", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}, {"org.jsoup.nodes.Attribute", "getValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"nohrefdefault123456789012345678901234567890", "allowfullscreen2020-01-01", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "12:3.0:45"}, {"org.jsoup.nodes.Attribute", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:3.0:45=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "12:3.0:45=\"0\" {getKey=12:3.0:45, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}}, 2), new String[][]{{"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "<sample:0>"}, {"org.jsoup.nodes.Attribute", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{"java.lang.String"}, new String[]{"s.5fismap"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-n", "formnovalidate1E-5"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("-n=\"formnovalidate1E-5\" {getKey=-n, getValue=formnovalidate1E-5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"\"a"}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3055", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-909673606", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{"java.lang.String"}, new String[]{"{\"a"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Hfllo, World", "i0x1F"}, true), new String[][]{{"html", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hfllo, World=\"i0x1F\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "disabled"}}), new String[][]{{"html", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<empty>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample=\"\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false), new String[][]{{"html", "", "3"}, {"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1630186666", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:53>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:kez>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "2020-01-01"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "2020-01-01=\"0\" {getKey=2020-01-01, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1864843158", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2147483548ismap", ""}, true), new String[][]{{"html", "", "2"}, {"setKey", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("0=\"\" {getKey=0, getValue=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"{\"a\":1}multiple", "ditabled"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("{\"a\":1}multiple=\"ditabled\" {getKey={\"a\":1}multiple, getValue=ditabled}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.String", "java.lang.String", "java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"x1G", "0", "<empty>", "<sample:0>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "de"}}), new String[][]{{"html", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"de\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"de\" {getKey=0, getValue=de}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"allowfullscreen", "1.5"}, true), new String[][]{{"html", "", "6"}, {"setValue", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2M", "{\"a\":_}"}, true), new String[][]{{"getValue", "", "4"}, {"getValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":_}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Hello, World=\"0\" {getKey=Hello, World, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}}), new String[][]{{"setValue", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2147483648a", "a,"}, true), new String[][]{{"html", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483648a=\"a,\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getKey", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"setKey", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.String", "java.lang.String", "java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{" 1.5f", "`c", "<sample:0>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"0x123456789compact"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x123456789compact=\"0\" {getKey=0x123456789compact, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "2147483648"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("2147483648=\"\" {getKey=2147483648, getValue=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2147483648=\"\" {getKey=2147483648, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:0.75>"}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"123456789012345678901234567890", "+2"}, true), new String[][]{{"setKey", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("0=\"+2\" {getKey=0, getValue=+2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>", "<sample:5>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{"java.lang.String"}, new String[]{"a,b,cF"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<empty>", "<sample:7>"}, {"org.jsoup.nodes.Attribute", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "1.12345678901234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1.12345678901234567=\"0\" {getKey=1.12345678901234567, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false), new String[][]{{"getKey", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"setKey", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("a {getKey=a, getValue=null}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"async", "\u00e9--1", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<d:-8.5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"formnovalidate"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "formnovalidate=\"0\" {getKey=formnovalidate, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:7>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "2147483640"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483640=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483640=\"0\" {getKey=2147483640, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample=\"\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"0x1F", "allowfulscreen", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "defeq"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "defeq=\"sample\" {getKey=defeq, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:o>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-19>"}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<sample:1>"}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "defauLt"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("defauLt=\"sample\" {getKey=defauLt, getValue=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "defauLt=\"sample\" {getKey=defauLt, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"0TITLE"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0TITLE=\"0\" {getKey=0TITLE, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "1f10"}}), new String[][]{{"getKey", "", "6"}, {"getKey", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"1f10\" {getKey=0, getValue=1f10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"10"}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "10=\"{&quot;a&quot;:1}\" {getKey=10, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "<null>"}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "{\"a\":1}"}}), new String[][]{{"getKey", "", "5"}, {"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\"\" {getKey={\"a\":1}, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "<sample:8>"}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"\tL"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"\tL\" {getKey=0, getValue=\tL}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{"java.lang.String"}, new String[]{"compact"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"\n\" {getKey=0, getValue=\n}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456inert"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"1.1234567890123456inert\" {getKey=0, getValue=1.1234567890123456inert}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "<sample:6>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "Hello, \norld"}, {"org.jsoup.nodes.Attribute", "html", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, \norld", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"Hello, \norld\" {getKey=0, getValue=Hello, \norld}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "1.2:3045"}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "defr"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("defr=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "defr=\"0\" {getKey=defr, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "Ihidden"}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "\t"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"\t\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"\t\" {getKey=0, getValue=\t}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1=\"0\" {getKey=-1, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"hiDden"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"hiDden\" {getKey=0, getValue=hiDden}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "<null>"}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "n{resize"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("n{resize", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"n{resize\" {getKey=0, getValue=n{resize}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "12"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"12\" {getKey=0, getValue=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "iDtem{cope"}, {"org.jsoup.nodes.Attribute", "isDataAttribute", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"[2,"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[2,=\"0\" {getKey=[2,, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"=", "w."}, true, 0, null, 2), new String[][]{{"getKey", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}, {"org.jsoup.nodes.Attribute", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"allowHullscreen", "1.5noresize"}, true, 0, null, 1), new String[][]{{"getValue", "", "4"}, {"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("allowHullscreen=\"1.5noresize\" {getKey=allowHullscreen, getValue=1.5noresize}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "/aCb"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/aCb", String.valueOf(actual));
  assertEquals("receiver state after the call", "/aCb=\"\" {getKey=/aCb, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "eata-"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("eata-=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "eata-=\"0\" {getKey=eata-, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:2.45>"}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}}, 1), new String[][]{{"html", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:4>", "<sample:6>"}}, 2), new String[][]{{"clone", "", "5"}, {"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"`utofocus", "compact"}, true, 0, null, 2), new String[][]{{"getKey", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`utofocus", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1-4", "d"}, true, 0, null, 2), new String[][]{{"clone", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("1-4=\"d\" {getKey=1-4, getValue=d}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "11.25"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "11.25=\"sample\" {getKey=11.25, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.String", "java.lang.String", "java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"aaaaaaaaaaaaaaaaaa`aaaaaaaaaaa", "1e10", "<sample:0>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"setValue", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.String", "java.lang.String", "java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"010", "hsmap", "<null>", "<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "\""}, {"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<i:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\"=\"0\" {getKey=\", getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"/a/b1.5e300", "\""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("/a/b1.5e300=\"&quot;\" {getKey=/a/b1.5e300, getValue=\"}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"nohref"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "nohref=\"sample\" {getKey=nohref, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "dompact"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"dompact\" {getKey=0, getValue=dompact}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1+345678901234567", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.5"}, true, 0, null, 3), new String[][]{{"getValue", "", "4"}, {"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("1.1+345678901234567=\"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.5\" {getKey=1.1+345678901234567, getValue=aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("2147483648 {getKey=2147483648, getValue=null}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2147483648 {getKey=2147483648, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1E-51E-51.1234567890123456", ".5", "<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:>"}}, 3), new String[][]{{"html", "", "2"}, {"setKey", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("0=\"\" {getKey=0, getValue=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "-"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "-=\"sample\" {getKey=-, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{"java.lang.String"}, new String[]{"\"b"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "a Ab"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a Ab", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"a Ab\" {getKey=0, getValue=a Ab}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "-1.52020-02-30T25:61:61"}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "12930:45"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12930:45", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"12930:45\" {getKey=0, getValue=12930:45}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"bsync1-25", "1E-5"}, true, 0, null, 3), new String[][]{{"html", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bsync1-25=\"1E-5\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "2147483648"}}, 1), new String[][]{{"clone", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("2147483648=\"sample\" {getKey=2147483648, getValue=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2147483648=\"sample\" {getKey=2147483648, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"hidddo", "-0.0"}, true, 0, null, 2), new String[][]{{"clone", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("hidddo=\"-0.0\" {getKey=hidddo, getValue=-0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "true"}, {"org.jsoup.nodes.Attribute", "isDataAttribute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "true=\"sample\" {getKey=true, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"isnao", "data-hidden"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("isnao=\"data-hidden\" {getKey=isnao, getValue=data-hidden}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"html", "", "7"}, {"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:4>", "<sample:4>"}}, 2), new String[][]{{"html", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:6>"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"df", "axnc"}, true, 0, null, 2), new String[][]{{"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("axnc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"ismp", "PT0H"}, true, 0, null, 2), new String[][]{{"getKey", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ismp", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}}, 3), new String[][]{{"setKey", "java.lang.String", "5"}, {"html", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{"java.lang.String"}, new String[]{"muted"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "1.15"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"1.15\" {getKey=0, getValue=1.15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "inert"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("inert=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "inert=\"sample\" {getKey=inert, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "data-"}, {"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("data-=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "data-=\"sample\" {getKey=data-, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<i:-19>"}}, 3), new String[][]{{"getKey", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "<sample:3>"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.4", "0x1F"}, true, 0, null, 2), new String[][]{{"getKey", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}, {"org.jsoup.nodes.Attribute", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:2>"}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "/"}}, 3), new String[][]{{"html", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/=\"\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "/=\"\" {getKey=/, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<i:0>"}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "disabI\"led"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("disabI\"led=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "disabI\"led=\"sample\" {getKey=disabI\"led, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-909673606", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "0xFFFFFFFF"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFFFFFF", String.valueOf(actual));
  assertEquals("receiver state after the call", "0xFFFFFFFF {getKey=0xFFFFFFFF, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"\" {getKey=0, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}}, 1), new String[][]{{"setKey", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}, {"org.jsoup.nodes.Attribute", "isDataAttribute", ""}}, 3), new String[][]{{"html", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"irmaphidden"}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"irmaphidden\" {getKey=0, getValue=irmaphidden}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}, {"org.jsoup.nodes.Attribute", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "/a/b"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a/b=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "/a/b=\"0\" {getKey=/a/b, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<empty>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "<sample:9>"}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<b:true>"}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "/a/b"}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-863331675", String.valueOf(actual));
  assertEquals("receiver state after the call", "/a/b=\"sample\" {getKey=/a/b, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1=\"0\" {getKey=1, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "getKey", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1..5", ""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("1..5=\"\" {getKey=1..5, getValue=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "data-"}, {"org.jsoup.nodes.Attribute", "getValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"data-\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"data-\" {getKey=0, getValue=data-}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "-11"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1440764783", String.valueOf(actual));
  assertEquals("receiver state after the call", "-11=\"{&quot;a&quot;:1}\" {getKey=-11, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"/a/bi"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "/a/bi=\"0\" {getKey=/a/bi, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:>"}, {"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<d:1.5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample=\"\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "decla4e"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"decla4e\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"decla4e\" {getKey=0, getValue=decla4e}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "1.1234567"}, {"org.jsoup.nodes.Attribute", "getKey", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"1.1234567\" {getKey=0, getValue=1.1234567}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "1L"}, {"org.jsoup.nodes.Attribute", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1L=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "1L=\"0\" {getKey=1L, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x123456789", "inert"}, true, 0, null, 1), new String[][]{{"getKey", "", "0"}, {"clone", "", "4"}, {"html", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x123456789=\"inert\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}, {"org.jsoup.nodes.Attribute", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{"java.lang.String"}, new String[]{"autofocus"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "deautofocus"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("deautofocus=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "deautofocus=\"0\" {getKey=deautofocus, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:4>"}, {"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1567", String.valueOf(actual));
  assertEquals("receiver state after the call", "1=\"0\" {getKey=1, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "TITLE "}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1565168242", String.valueOf(actual));
  assertEquals("receiver state after the call", "TITLE=\"sample\" {getKey=TITLE, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "1.T"}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", ",default"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", ",default=\"0\" {getKey=,default, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"disaxbled"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "disaxbled=\"sample\" {getKey=disaxbled, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "ITLE"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ITLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "ITLE=\"0\" {getKey=ITLE, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "0x12345689"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-555268932", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"0x12345689\" {getKey=0, getValue=0x12345689}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"null", "dec\u00e9lare2020-01-01"}, true, 0, null, 1), new String[][]{{"html", "", "5"}, {"getKey", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<i:-58>"}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "2020-02-30T25:61:61"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02-30T25:61:61=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "2020-02-30T25:61:61=\"0\" {getKey=2020-02-30T25:61:61, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "L"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3055", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}}, 1), new String[][]{{"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "isDataAttribute", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "0x123446889"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"0x123446889\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"0x123446889\" {getKey=0, getValue=0x123446889}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"dat>a-", "Hello, World"}, true, 0, null, 3), new String[][]{{"clone", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("dat>a-=\"Hello, World\" {getKey=dat>a-, getValue=Hello, World}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "Hello, World"}}, 1), new String[][]{{"getKey", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"Hello, World\" {getKey=0, getValue=Hello, World}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "http://example.com/a?b=c"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c", String.valueOf(actual));
  assertEquals("receiver state after the call", "http://example.com/a?b=c=\"{&quot;a&quot;:1}\" {getKey=http://example.com/a?b=c, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"html", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<null>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"{\"a\":1}", "Tdisabldd"}, true, 0, null, 1), new String[][]{{"setKey", "java.lang.String", "5"}, {"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Tdisabldd", String.valueOf(actual));
 }
}
