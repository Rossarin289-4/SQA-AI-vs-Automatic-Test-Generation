package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "clone", new String[]{"java.io.Serializable"}, new String[]{"<i:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "clone", new String[]{"java.io.Serializable"}, new String[]{"<i:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "serialize", new String[]{"java.io.Serializable", "java.io.OutputStream"}, new String[]{"<s:key>", "<sample:1>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "clone", new String[]{"java.io.Serializable"}, new String[]{"<i:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "clone", new String[]{"java.io.Serializable"}, new String[]{"<i:-1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "clone", new String[]{"java.io.Serializable"}, new String[]{"<i:-36>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-36", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "clone", new String[]{"java.io.Serializable"}, new String[]{"<i:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "clone", new String[]{"java.io.Serializable"}, new String[]{"<b:true>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "clone", new String[]{"java.io.Serializable"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "clone", new String[]{"java.io.Serializable"}, new String[]{"<i:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "deserialize", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "clone", new String[]{"java.io.Serializable"}, new String[]{"<i:-26>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-26", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "deserialize", new String[]{"java.io.InputStream"}, new String[]{"<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.lang3.SerializationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "deserialize", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.lang3.SerializationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "deserialize", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "serialize", new String[]{"java.io.Serializable"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-84, -19, 0, 5, 112]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "deserialize", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.lang3.SerializationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "deserialize", new String[]{"byte[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "serialize", new String[]{"java.io.Serializable"}, new String[]{"<s:}>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-84, -19, 0, 5, 116, 0, 1, 125]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "deserialize", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.lang3.SerializationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "serialize", new String[]{"java.io.Serializable", "java.io.OutputStream"}, new String[]{"<i:2>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "serialize", new String[]{"java.io.Serializable", "java.io.OutputStream"}, new String[]{"<sample:1>", "<sample:1>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "serialize", new String[]{"java.io.Serializable", "java.io.OutputStream"}, new String[]{"<b:true>", "<sample:3>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "deserialize", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.lang3.SerializationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "serialize", new String[]{"java.io.Serializable"}, new String[]{"<i:17>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-84, -19, 0, 5, 115, 114, 0, 17, 106, 97, 118, 97, 46, 108, 97, 110, 103, 46, 73, 110, 116, 101, 103, 101, 114, 18, -30, -96, -92, -9, -127, -121, 56, 2, 0, 1, 73, 0, 5, 118, 97, 108, 117, 101, 120, ...#358#-2115427981", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "deserialize", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "clone", new String[]{"java.io.Serializable"}, new String[]{"<b:false>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "clone", new String[]{"java.io.Serializable"}, new String[]{"<b:true>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "clone", new String[]{"java.io.Serializable"}, new String[]{"<i:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "clone", new String[]{"java.io.Serializable"}, new String[]{"<i:8>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "clone", new String[]{"java.io.Serializable"}, new String[]{"<i:-8>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "clone", new String[]{"java.io.Serializable"}, new String[]{"<i:-32>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-32", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "clone", new String[]{"java.io.Serializable"}, new String[]{"<i:-16>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-16", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "clone", new String[]{"java.io.Serializable"}, new String[]{"<i:-32784>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-32784", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "clone", new String[]{"java.io.Serializable"}, new String[]{"<s:>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "serialize", new String[]{"java.io.Serializable", "java.io.OutputStream"}, new String[]{"<b:true>", "<sample:0>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "deserialize", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "clone", new String[]{"java.io.Serializable"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "deserialize", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.lang3.SerializationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "serialize", new String[]{"java.io.Serializable", "java.io.OutputStream"}, new String[]{"<i:5>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "deserialize", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.lang3.SerializationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "serialize", new String[]{"java.io.Serializable", "java.io.OutputStream"}, new String[]{"<null>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "clone", new String[]{"java.io.Serializable"}, new String[]{"<i:11>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "clone", new String[]{"java.io.Serializable"}, new String[]{"<i:22>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("22", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "clone", new String[]{"java.io.Serializable"}, new String[]{"<i:-67108842>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-67108842", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "clone", new String[]{"java.io.Serializable"}, new String[]{"<i:-67108876>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-67108876", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "deserialize", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.lang3.SerializationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "clone", new String[]{"java.io.Serializable"}, new String[]{"<s:>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "clone", new String[]{"java.io.Serializable"}, new String[]{"<s:n/>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("n/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "clone", new String[]{"java.io.Serializable"}, new String[]{"<s:n>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "clone", new String[]{"java.io.Serializable"}, new String[]{"<s:r>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("r", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "clone", new String[]{"java.io.Serializable"}, new String[]{"<s:lr>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("lr", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "clone", new String[]{"java.io.Serializable"}, new String[]{"<s:l-r>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("l-r", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "clone", new String[]{"java.io.Serializable"}, new String[]{"<s:l-rr>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("l-rr", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "clone", new String[]{"java.io.Serializable"}, new String[]{"<i:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "serialize", new String[]{"java.io.Serializable", "java.io.OutputStream"}, new String[]{"<s:kke>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "deserialize", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "clone", new String[]{"java.io.Serializable"}, new String[]{"<s:WzH\u00e9>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("WzH\u00e9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "clone", new String[]{"java.io.Serializable"}, new String[]{"<d:1.5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "serialize", new String[]{"java.io.Serializable"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-84, -19, 0, 5, 112]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "deserialize", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", "deserialize", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
}
