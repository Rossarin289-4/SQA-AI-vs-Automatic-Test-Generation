package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1630186666", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
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
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"2147483648\" {getKey=0, getValue=2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "<null>"}}), new String[][]{{"setKey", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("a {getKey=a, getValue=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getKey=0, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "1e10"}, {"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "html", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1e10 {getKey=1e10, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "Title"}, {"org.jsoup.nodes.Attribute", "hashCode", ""}}), new String[][]{{"setKey", "java.lang.String", "2"}, {"html", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "Title=\"0\" {getKey=Title, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{"java.lang.String"}, new String[]{"data-ismap"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "default"}, {"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:a>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "default {getKey=default, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 38, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "00"}, {"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<d:3.0>"}, {"org.jsoup.nodes.Attribute", "isDataAttribute", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("47664", String.valueOf(actual));
  assertEquals("receiver state after the call", "00=\"0\" {getKey=00, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}}, 3), new String[][]{{"getKey", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}}, 3), new String[][]{{"getKey", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}}, 3), new String[][]{{"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 9, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.String", "java.lang.String", "java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"-1", "-1.5", "<sample:2>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.String", "java.lang.String", "java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"-1", "-1.6", "<sample:3>", "<sample:0>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{"java.lang.String"}, new String[]{"PT1H"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"v{\"a\":n1~", "2020-01-011.5f", "<sample:10>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x \t y=\"line1\n\nline3\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "x \t y=\"line1\n\nline3\" {getKey=x \t y, getValue=line1\n\nline3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("line1\n\nline3=\"\n\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "line1\n\nline3=\"\n\" {getKey=line1\n\nline3, getValue=\n}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:2>"}, {"org.jsoup.nodes.Attribute", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"defer", " "}, true, 0, null, 2), new String[][]{{"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("defer=\" \" {getKey=defer, getValue= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample=\"\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "1.12345678901234567"}, {"org.jsoup.nodes.Attribute", "getKey", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678901234567=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "1.12345678901234567=\"sample\" {getKey=1.12345678901234567, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "1.12345678901234567"}, {"org.jsoup.nodes.Attribute", "getKey", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678901234567=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "1.12345678901234567=\"{&quot;a&quot;:1}\" {getKey=1.12345678901234567, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "1.12345678901234567"}, {"org.jsoup.nodes.Attribute", "getKey", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678901234567=\" x \t y \"", String.valueOf(actual));
  assertEquals("receiver state after the call", "1.12345678901234567=\" x \t y \" {getKey=1.12345678901234567, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "1.12345678901234567"}, {"org.jsoup.nodes.Attribute", "getKey", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678901234567", String.valueOf(actual));
  assertEquals("receiver state after the call", "1.12345678901234567 {getKey=1.12345678901234567, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}=\" x \t y \"", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("null {getKey=null, getValue=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:7>"}}, 2), new String[][]{{"setKey", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{"java.lang.String"}, new String[]{"1r1abc"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{"java.lang.String"}, new String[]{"declare"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}, {"org.jsoup.nodes.Attribute", "getValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"async"}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}, {"org.jsoup.nodes.Attribute", "getValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "async {getKey=async, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"2147483648\" {getKey=0, getValue=2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "2u147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"2u147483648\" {getKey=0, getValue=2u147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-12>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-12>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"def=er", "-1"}, true, 0, null, 2), new String[][]{{"html", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("def=er=\"-1\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"  ", "declar8e", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"  ", "declar8e", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.String", "java.lang.String", "java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"123456778901234578", "10/L", "<sample:1>", "<sample:4>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 14, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"\tautofocush"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "dat"}, {"org.jsoup.nodes.Attribute", "isDataAttribute", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "html", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:3>"}, {"org.jsoup.nodes.Attribute", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample=\"\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>", "<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>", "<sample:5>"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "<a>b</a>"}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a>b</a>=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a>b</a>=\"0\" {getKey=<a>b</a>, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "<a>b</a"}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a>b</a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a>b</a=\"0\" {getKey=<a>b</a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample=\"\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 15, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:7.5>"}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "html", ""}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false), new String[][]{{"getKey", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 9, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "i"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "i=\"0\" {getKey=i, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "ik"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ik=\"0\" {getKey=ik, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "ii"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ii=\"0\" {getKey=ii, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3055", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-909673606", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1864843158", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "getValue", ""}, {"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("43599560", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1608105752", String.valueOf(actual));
  assertEquals("receiver state after the call", "x \t y=\"line1\n\nline3\" {getKey=x \t y, getValue=line1\n\nline3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.String", "java.lang.String", "java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"-1", "-1.5", "<null>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.String", "java.lang.String", "java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"-1", "-1.5", "<sample:1>", "<sample:3>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample=\"\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "1.5f=\"0\" {getKey=1.5f, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{".5f"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", ".5f=\"0\" {getKey=.5f, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{".5f1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", ".5f1=\"0\" {getKey=.5f1, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "TITLE=\"0\" {getKey=TITLE, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{"java.lang.String"}, new String[]{"1E-5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 15, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "x \t y=\"line1\n\nline3\" {getKey=x \t y, getValue=line1\n\nline3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "line1\n\nline3=\"\n\" {getKey=line1\n\nline3, getValue=\n}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "null"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "null"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"null\" {getKey=0, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:5>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" x \t y ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"{\"a\":1}", "2020-01-01", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false), new String[][]{{"setValue", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"setValue", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("null {getKey=null, getValue=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<null>"}, {"org.jsoup.nodes.Attribute", "html", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}=\" x \t y \"", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<null>"}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "i"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"i\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"i\" {getKey=0, getValue=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "<sample:7>"}, false, 6, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}, {"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"defer", " "}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("defer=\" \" {getKey=defer, getValue= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample=\"\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{"java.lang.String"}, new String[]{"1e10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "-0.0 {getKey=-0.0, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}, {"org.jsoup.nodes.Attribute", "getValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("line1\n\nline3", String.valueOf(actual));
  assertEquals("receiver state after the call", "x \t y=\"line1\n\nline3\" {getKey=x \t y, getValue=line1\n\nline3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"HH111", "obs1.6multipl{e", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:8>"}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "0x1F"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "0x1F"}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "Title"}, {"org.jsoup.nodes.Attribute", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Title {getKey=Title, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getKey", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"010", "-1"}, true), new String[][]{{"html", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("010=\"-1\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"defer", "-1"}, true), new String[][]{{"html", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("defer=\"-1\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"def=er", "-1"}, true), new String[][]{{"html", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("def=er=\"-1\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>"}, false, 15, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"setKey", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("a=\"sample\" {getKey=a, getValue=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:key>"}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "<null>"}}), new String[][]{{"setKey", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("a=\"{&quot;a&quot;:1}\" {getKey=a, getValue={\"a\":1}}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "1e10"}, {"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:key>"}}), new String[][]{{"setKey", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("a=\"{&quot;a&quot;:1}\" {getKey=a, getValue={\"a\":1}}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1e10=\"{&quot;a&quot;:1}\" {getKey=1e10, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:0>"}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "1e10"}, {"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:key>"}}), new String[][]{{"setKey", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("a=\"sample\" {getKey=a, getValue=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1e10=\"sample\" {getKey=1e10, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x \t y=\"line1\n\nline3\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "x \t y=\"line1\n\nline3\" {getKey=x \t y, getValue=line1\n\nline3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "<sample:3>"}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "i"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "data-"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "<a>b</a>"}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a>b</a>=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a>b</a>=\"0\" {getKey=<a>b</a>, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"async"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"async\" {getKey=0, getValue=async}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"asznc"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"asznc\" {getKey=0, getValue=asznc}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"asyBnc"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"asyBnc\" {getKey=0, getValue=asyBnc}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "x \t y=\"line1\n\nline3\" {getKey=x \t y, getValue=line1\n\nline3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "Hello, World"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, World", String.valueOf(actual));
  assertEquals("receiver state after the call", "Hello, World=\"sample\" {getKey=Hello, World, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "Hello, World"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, World", String.valueOf(actual));
  assertEquals("receiver state after the call", "Hello, World=\" x \t y \" {getKey=Hello, World, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "Hello, World"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, World", String.valueOf(actual));
  assertEquals("receiver state after the call", "Hello, World {getKey=Hello, World, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "Hello, World"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, World", String.valueOf(actual));
  assertEquals("receiver state after the call", "Hello, World=\"{&quot;a&quot;:1}\" {getKey=Hello, World, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "Hello, World"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, World", String.valueOf(actual));
  assertEquals("receiver state after the call", "Hello, World=\"{&quot;a&quot;:1}\" {getKey=Hello, World, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "Hello, World"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, World", String.valueOf(actual));
  assertEquals("receiver state after the call", "Hello, World=\"sample\" {getKey=Hello, World, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}=\" x \t y \"", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<b:true>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<b:false>"}, {"org.jsoup.nodes.Attribute", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<b:false>"}, {"org.jsoup.nodes.Attribute", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x \t y", String.valueOf(actual));
  assertEquals("receiver state after the call", "x \t y=\"line1\n\nline3\" {getKey=x \t y, getValue=line1\n\nline3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x \t y", String.valueOf(actual));
  assertEquals("receiver state after the call", "x \t y=\"line1\n\nline3\" {getKey=x \t y, getValue=line1\n\nline3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"Hello, Xorle"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"Hello, Xorle\" {getKey=0, getValue=Hello, Xorle}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"Hello, Xorle1.5"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"Hello, Xorle1.5\" {getKey=0, getValue=Hello, Xorle1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "async"}, {"org.jsoup.nodes.Attribute", "html", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "async=\" x \t y \" {getKey=async, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.String", "java.lang.String", "java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"ismap", "1.12345678901234567", "<null>", "<sample:7>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "Title"}, {"org.jsoup.nodes.Attribute", "hashCode", ""}}, 3), new String[][]{{"setKey", "java.lang.String", "2"}, {"html", "", "3"}, {"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Title=\"0\" {getKey=Title, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "Title"}}, 3), new String[][]{{"setKey", "java.lang.String", "2"}, {"html", "", "3"}, {"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "Title {getKey=Title, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "Title"}}, 3), new String[][]{{"setKey", "java.lang.String", "2"}, {"html", "", "3"}, {"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "Title=\"{&quot;a&quot;:1}\" {getKey=Title, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "Title"}}, 3), new String[][]{{"setKey", "java.lang.String", "2"}, {"html", "", "3"}, {"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "Title=\"sample\" {getKey=Title, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "Title"}}, 3), new String[][]{{"setKey", "java.lang.String", "2"}, {"html", "", "3"}, {"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" x \t y ", String.valueOf(actual));
  assertEquals("receiver state after the call", "Title=\" x \t y \" {getKey=Title, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "Title"}}, 3), new String[][]{{"setKey", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 20, new String[][]{}, 3), new String[][]{{"getValue", "", "0"}, {"html", "", "3"}, {"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("x \t y=\"line1\n\nline3\" {getKey=x \t y, getValue=line1\n\nline3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "x \t y=\"line1\n\nline3\" {getKey=x \t y, getValue=line1\n\nline3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"getValue", "", "0"}, {"html", "", "3"}, {"clone", "", "4"}, {"clone", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("null {getKey=null, getValue=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample=\"\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "ismap"}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<null>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1630186666", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "ismap"}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<null>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100505026", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"ismap\" {getKey=0, getValue=ismap}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "ismap"}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<null>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("43599560", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "<sample:1>"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{"java.lang.String"}, new String[]{"mutedallowfaul1.5d"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>", "<sample:7>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "declar"}, {"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "I"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "I=\"0\" {getKey=I, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "J"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "J=\"0\" {getKey=J, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"w1urxp5"}, false, 9, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"w1urxp5\" {getKey=0, getValue=w1urxp5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"1urxp5"}, false, 9, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"1urxp5\" {getKey=0, getValue=1urxp5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"1v"}, false, 9, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"1v\" {getKey=0, getValue=1v}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"1vX"}, false, 9, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}, {"org.jsoup.nodes.Attribute", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"1vX\" {getKey=0, getValue=1vX}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 9, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}, {"org.jsoup.nodes.Attribute", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"abc\" {getKey=0, getValue=abc}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"hcdfz"}, false, 9, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}, {"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:b>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"hcdfz\" {getKey=0, getValue=hcdfz}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"hdfz"}, false, 9, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}, {"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:b>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"hdfz\" {getKey=0, getValue=hdfz}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"hdFfz"}, false, 9, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}, {"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:a>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"hdFfz\" {getKey=0, getValue=hdFfz}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"hdFfz"}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}, {"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:a>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"hdFffz"}, false, 9, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}, {"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:a>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"hdFffz\" {getKey=0, getValue=hdFffz}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"hdGffz"}, false, 9, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}, {"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:b>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"hdGffz\" {getKey=0, getValue=hdGffz}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{"java.lang.String"}, new String[]{"inert"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{"java.lang.String"}, new String[]{"+mers"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"compact", "=\""}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("compact=\"=&quot;\" {getKey=compact, getValue==\"}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"comIpact", "=\""}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("comIpact=\"=&quot;\" {getKey=comIpact, getValue==\"}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"comIpact", "=\""}, true), new String[][]{{"getKey", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("comIpact", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"bcomIpact", "=\""}, true), new String[][]{{"getKey", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bcomIpact", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:key>"}, {"org.jsoup.nodes.Attribute", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:key>"}, {"org.jsoup.nodes.Attribute", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:mey>"}, {"org.jsoup.nodes.Attribute", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:mey>"}, {"org.jsoup.nodes.Attribute", "clone", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:mey>"}, {"org.jsoup.nodes.Attribute", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:m,y>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"a b"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a b=\"0\" {getKey=a b, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"b b"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "b b=\"0\" {getKey=b b, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFG"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0xFFFFFFFG=\"0\" {getKey=0xFFFFFFFG, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"true\" {getKey=0, getValue=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "tru0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"tru0\" {getKey=0, getValue=tru0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3055", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-909673606", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "TITLE"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1565168242", String.valueOf(actual));
  assertEquals("receiver state after the call", "TITLE=\"sample\" {getKey=TITLE, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "TITLE"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1820123960", String.valueOf(actual));
  assertEquals("receiver state after the call", "TITLE=\"\" {getKey=TITLE, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "TITLE"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1820123960", String.valueOf(actual));
  assertEquals("receiver state after the call", "TITLE=\"\" {getKey=TITLE, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "TITLE"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1820123960", String.valueOf(actual));
  assertEquals("receiver state after the call", "TITLE {getKey=TITLE, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "async"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1408021244", String.valueOf(actual));
  assertEquals("receiver state after the call", "async {getKey=async, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "async"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1444792066", String.valueOf(actual));
  assertEquals("receiver state after the call", "async=\"{&quot;a&quot;:1}\" {getKey=async, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}, {"org.jsoup.nodes.Attribute", "getValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}, {"org.jsoup.nodes.Attribute", "html", ""}, {"org.jsoup.nodes.Attribute", "getValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<null>"}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "defer"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("defer=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "defer=\"sample\" {getKey=defer, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<null>"}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "defer"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("defer", String.valueOf(actual));
  assertEquals("receiver state after the call", "defer {getKey=defer, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<null>"}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "defer"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("defer=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "defer=\"{&quot;a&quot;:1}\" {getKey=defer, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<null>"}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "deferdeclare"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("deferdeclare=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "deferdeclare=\"{&quot;a&quot;:1}\" {getKey=deferdeclare, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<null>"}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "eferdeclare"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("eferdeclare=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "eferdeclare=\"{&quot;a&quot;:1}\" {getKey=eferdeclare, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<null>"}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "eferdeclare"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("eferdeclare=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "eferdeclare=\"sample\" {getKey=eferdeclare, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "<sample:6>"}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "<sample:4>"}, {"org.jsoup.nodes.Attribute", "html", ""}}, 1), new String[][]{{"getKey", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "<sample:6>"}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "<sample:4>"}, {"org.jsoup.nodes.Attribute", "html", ""}}, 1), new String[][]{{"getKey", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "<sample:6>"}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "<sample:4>"}, {"org.jsoup.nodes.Attribute", "html", ""}}, 1), new String[][]{{"getKey", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "<sample:6>"}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "<sample:4>"}, {"org.jsoup.nodes.Attribute", "html", ""}}, 1), new String[][]{{"getKey", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "<sample:6>"}, {"org.jsoup.nodes.Attribute", "html", ""}}, 1), new String[][]{{"getKey", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "123456789012345678901234567890=\"0\" {getKey=123456789012345678901234567890, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"12345"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "12345=\"0\" {getKey=12345, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" x \t y ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:7>"}, {"org.jsoup.nodes.Attribute", "html", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("line1\n\nline3", String.valueOf(actual));
  assertEquals("receiver state after the call", "x \t y=\"line1\n\nline3\" {getKey=x \t y, getValue=line1\n\nline3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 22, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("line1\n\nline3=\"\n\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "line1\n\nline3=\"\n\" {getKey=line1\n\nline3, getValue=\n}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}=\" x \t y \"", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<i:-67108864>"}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "2020-01-01"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "x \t y=\"line1\n\nline3\" {getKey=x \t y, getValue=line1\n\nline3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<i:-67108864>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "line1\n\nline3=\"\n\" {getKey=line1\n\nline3, getValue=\n}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "-"}, {"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}}, 1), new String[][]{{"setKey", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
}
