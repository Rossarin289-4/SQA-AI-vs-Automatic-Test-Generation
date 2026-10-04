package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "emptyOrderedMapIterator", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.EmptyOrderedMapIterator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "emptyOrderedIterator", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.EmptyOrderedIterator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "asIterable", new String[]{"java.util.Iterator"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "asMultipleUseIterable", new String[]{"java.util.Iterator"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "loopingListIterator", new String[]{"java.util.List"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<sample:4>", "<b:true>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "singletonListIterator", new String[]{"java.lang.Object"}, new String[]{"<s:N>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.SingletonListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "size", new String[]{"java.util.Iterator"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "toArray", new String[]{"java.util.Iterator", "java.lang.Class"}, new String[]{"<sample:1>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "isEmpty", new String[]{"java.util.Iterator"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "loopingIterator", new String[]{"java.util.Collection"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "collatedIterator", new String[]{"java.util.Comparator", "java.util.Iterator", "java.util.Iterator"}, new String[]{"<empty>", "<sample:3>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "filteredListIterator", new String[]{"java.util.ListIterator", "org.apache.commons.collections4.Predicate"}, new String[]{"<sample:1>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "emptyListIterator", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.EmptyListIterator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "matchesAny", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Predicate"}, new String[]{"<sample:8>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "toArray", new String[]{"java.util.Iterator", "java.lang.Class"}, new String[]{"<null>", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "toListIterator", new String[]{"java.util.Iterator"}, new String[]{"<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "matchesAll", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Predicate"}, new String[]{"<sample:7>", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "filteredIterator", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Predicate"}, new String[]{"<sample:1>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "toString", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Transformer", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "<sample:2>", "0xFFFrFFFFF2020-02-30T25:61:61", "2020-0\n-30T35:61:61", "1.1234567"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "filteredListIterator", new String[]{"java.util.ListIterator", "org.apache.commons.collections4.Predicate"}, new String[]{"<null>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "find", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Predicate"}, new String[]{"<sample:6>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "apply", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Closure"}, new String[]{"<sample:7>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "asEnumeration", new String[]{"java.util.Iterator"}, new String[]{"<sample:8>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.EmptyIterator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "nodeListIterator", new String[]{"org.w3c.dom.NodeList"}, new String[]{"<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "toArray", new String[]{"java.util.Iterator"}, new String[]{"<empty>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "isEmpty", new String[]{"java.util.Iterator"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "transformedIterator", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Transformer"}, new String[]{"<sample:4>", "<sample:9>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "toList", new String[]{"java.util.Iterator"}, new String[]{"<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<null>", "<i:-2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "size", new String[]{"java.util.Iterator"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "toString", new String[]{"java.util.Iterator"}, new String[]{"<sample:8>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "nodeListIterator", new String[]{"org.w3c.dom.Node"}, new String[]{"<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "collatedIterator", new String[]{"java.util.Comparator", "java.util.Collection"}, new String[]{"<null>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "filteredIterator", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Predicate"}, new String[]{"<sample:5>", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "asIterator", new String[]{"java.util.Enumeration", "java.util.Collection"}, new String[]{"<sample:2>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "asIterator", new String[]{"java.util.Enumeration"}, new String[]{"<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "collatedIterator", new String[]{"java.util.Comparator", "java.util.Iterator[]"}, new String[]{"<sample:1>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "transformedIterator", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Transformer"}, new String[]{"<sample:5>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "asIterator", new String[]{"java.util.Enumeration", "java.util.Collection"}, new String[]{"<empty>", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayListIterator", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "emptyMapIterator", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.EmptyMapIterator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "emptyMapIterator", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"setValue", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "boundedIterator", new String[]{"java.util.Iterator", "long", "long"}, new String[]{"<sample:1>", "9223372036854775807", "-9223372036854775808"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayIterator", new String[]{"java.lang.Object"}, new String[]{"<s:bW>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "emptyOrderedMapIterator", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"getValue", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "singletonListIterator", new String[]{"java.lang.Object"}, new String[]{"<s:keyC>"}, true, 0, null, 1), new String[][]{{"hasPrevious", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayListIterator", new String[]{"java.lang.Object", "int", "int"}, new String[]{"<i:-58>", "0", "10"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "objectGraphIterator", new String[]{"java.lang.Object", "org.apache.commons.collections4.Transformer"}, new String[]{"<s:N>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.ObjectGraphIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "zippingIterator", new String[]{"java.util.Iterator", "java.util.Iterator"}, new String[]{"<sample:8>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "emptyOrderedIterator", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.EmptyOrderedIterator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "toString", new String[]{"java.util.Iterator"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.SingletonIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "objectGraphIterator", new String[]{"java.lang.Object", "org.apache.commons.collections4.Transformer"}, new String[]{"<s:+x>", "<sample:5>"}, true, 0, null, 1), new String[][]{{"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayIterator", new String[]{"java.lang.Object[]", "int", "int"}, new String[]{"<sample:5>", "-1073741811", "2147483642"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.SingletonIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayListIterator", new String[]{"java.lang.Object[]", "int", "int"}, new String[]{"<sample:5>", "-2147483647", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "emptyListIterator", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.EmptyListIterator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "matchesAny", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Predicate"}, new String[]{"<sample:1>", "<sample:9>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "pushbackIterator", new String[]{"java.util.Iterator"}, new String[]{"<sample:4>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayListIterator", new String[]{"java.lang.Object[]", "int"}, new String[]{"<sample:1>", "-2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<i:-56>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.SingletonIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayIterator", new String[]{"java.lang.Object[]", "int"}, new String[]{"<sample:2>", "1"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayListIterator", new String[]{"java.lang.Object[]", "int", "int"}, new String[]{"<sample:2>", "17", "0"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayIterator", new String[]{"java.lang.Object[]"}, new String[]{"<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "emptyOrderedMapIterator", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"setValue", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "matchesAll", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Predicate"}, new String[]{"<empty>", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "objectGraphIterator", new String[]{"java.lang.Object", "org.apache.commons.collections4.Transformer"}, new String[]{"<sample:2>", "<sample:9>"}, true, 0, null, 2), new String[][]{{"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "asIterable", new String[]{"java.util.Iterator"}, new String[]{"<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "boundedIterator", new String[]{"java.util.Iterator", "long"}, new String[]{"<sample:0>", "0"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "pushbackIterator", new String[]{"java.util.Iterator"}, new String[]{"<sample:7>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "loopingIterator", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "unmodifiableListIterator", new String[]{"java.util.ListIterator"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.UnmodifiableListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayListIterator", new String[]{"java.lang.Object[]", "int", "int"}, new String[]{"<sample:5>", "-1073741824", "-10"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayIterator", new String[]{"java.lang.Object", "int"}, new String[]{"<d:-54.5>", "524298"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<i:-131097>"}, true, 0, null, 3), new String[][]{{"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-131097", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "boundedIterator", new String[]{"java.util.Iterator", "long"}, new String[]{"<sample:6>", "-1"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "size", new String[]{"java.util.Iterator"}, new String[]{"<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "asIterable", new String[]{"java.util.Iterator"}, new String[]{"<sample:6>"}, true, 0, null, 1), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayListIterator", new String[]{"java.lang.Object", "int"}, new String[]{"<b:true>", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayListIterator", new String[]{"java.lang.Object[]", "int"}, new String[]{"<sample:0>", "-1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "emptyIterator", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.EmptyIterator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayListIterator", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayIterator", new String[]{"java.lang.Object[]", "int"}, new String[]{"<empty>", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "asIterator", new String[]{"java.util.Enumeration", "java.util.Collection"}, new String[]{"<empty>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.EnumerationIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "boundedIterator", new String[]{"java.util.Iterator", "long"}, new String[]{"<sample:3>", "-68719476735"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "matchesAny", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Predicate"}, new String[]{"<sample:0>", "<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayListIterator", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.ObjectArrayListIterator", actual.getClass().getName());
  assertEquals("{getArray=[], getEndIndex=0, getStartIndex=0, hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "collatedIterator", new String[]{"java.util.Comparator", "java.util.Collection"}, new String[]{"<sample:4>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "asIterator", new String[]{"java.util.Enumeration", "java.util.Collection"}, new String[]{"<sample:1>", "<sample:0>"}, true), new String[][]{{"hasNext", "", "7"}, {"remove", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "toString", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Transformer"}, new String[]{"<sample:6>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayListIterator", new String[]{"java.lang.Object[]", "int", "int"}, new String[]{"<sample:1>", "-31", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "toString", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Transformer", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "<sample:5>", "5.", "-0.0\t0x123456789", "TITLEi"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0\t0x123456789TITLEi", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "loopingListIterator", new String[]{"java.util.List"}, new String[]{"<sample:4>"}, true), new String[][]{{"previous", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "chainedIterator", new String[]{"java.util.Collection"}, new String[]{"<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayListIterator", new String[]{"java.lang.Object", "int"}, new String[]{"<null>", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "nodeListIterator", new String[]{"org.w3c.dom.Node"}, new String[]{"<sample:7>"}, true), new String[][]{{"remove", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "find", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Predicate"}, new String[]{"<sample:3>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.collections4.FunctorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "peekingIterator", new String[]{"java.util.Iterator"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.PeekingIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "toString", new String[]{"java.util.Iterator"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "unmodifiableListIterator", new String[]{"java.util.ListIterator"}, new String[]{"<sample:1>"}, true), new String[][]{{"hasNext", "", "6"}, {"hasPrevious", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "chainedIterator", new String[]{"java.util.Iterator[]"}, new String[]{"<empty>"}, true), new String[][]{{"next", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayIterator", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayIterator", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, true), new String[][]{{"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "peekingIterator", new String[]{"java.util.Iterator"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "toList", new String[]{"java.util.Iterator"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "toListIterator", new String[]{"java.util.Iterator"}, new String[]{"<sample:11>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.ListIteratorWrapper", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayIterator", new String[]{"java.lang.Object[]", "int", "int"}, new String[]{"<sample:4>", "4106", "-1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "filteredListIterator", new String[]{"java.util.ListIterator", "org.apache.commons.collections4.Predicate"}, new String[]{"<sample:1>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.FilterListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<s:D/>"}, true), new String[][]{{"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("D/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "objectGraphIterator", new String[]{"java.lang.Object", "org.apache.commons.collections4.Transformer"}, new String[]{"<sample:2>", "<sample:7>"}, true), new String[][]{{"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "singletonIterator", new String[]{"java.lang.Object"}, new String[]{"<s:D>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.SingletonIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "unmodifiableIterator", new String[]{"java.util.Iterator"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.UnmodifiableIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "loopingIterator", new String[]{"java.util.Collection"}, new String[]{"<sample:4>"}, true), new String[][]{{"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "unmodifiableListIterator", new String[]{"java.util.ListIterator"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.UnmodifiableListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "unmodifiableIterator", new String[]{"java.util.Iterator"}, new String[]{"<sample:0>"}, true), new String[][]{{"hasNext", "", "1"}, {"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "singletonIterator", new String[]{"java.lang.Object"}, new String[]{"<i:-63>"}, true), new String[][]{{"next", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-63", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "zippingIterator", new String[]{"java.util.Iterator", "java.util.Iterator", "java.util.Iterator"}, new String[]{"<sample:1>", "<sample:2>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.ZippingIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayIterator", new String[]{"java.lang.Object", "int"}, new String[]{"<i:1>", "32725"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "asIterator", new String[]{"java.util.Enumeration"}, new String[]{"<sample:6>"}, true), new String[][]{{"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "skippingIterator", new String[]{"java.util.Iterator", "long"}, new String[]{"<sample:8>", "-9223372036720558080"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "toList", new String[]{"java.util.Iterator", "int"}, new String[]{"<sample:4>", "49"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<i:-59>"}, true), new String[][]{{"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-59", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayIterator", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.ObjectArrayIterator", actual.getClass().getName());
  assertEquals("{getArray=[b, 2], getEndIndex=2, getStartIndex=0, hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayIterator", new String[]{"java.lang.Object[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.ObjectArrayIterator", actual.getClass().getName());
  assertEquals("{getArray=[0, ], getEndIndex=2, getStartIndex=0, hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "pushbackIterator", new String[]{"java.util.Iterator"}, new String[]{"<sample:4>"}, true), new String[][]{{"hasNext", "", "1"}, {"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "objectGraphIterator", new String[]{"java.lang.Object", "org.apache.commons.collections4.Transformer"}, new String[]{"<sample:2>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.ObjectGraphIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "pushbackIterator", new String[]{"java.util.Iterator"}, new String[]{"<sample:7>"}, true), new String[][]{{"hasNext", "", "3"}, {"remove", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "chainedIterator", new String[]{"java.util.Iterator[]"}, new String[]{"<empty>"}, true), new String[][]{{"size", "", "2"}, {"remove", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "get", new String[]{"java.util.Iterator", "int"}, new String[]{"<null>", "10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "nodeListIterator", new String[]{"org.w3c.dom.NodeList"}, new String[]{"<sample:7>"}, true), new String[][]{{"next", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "filteredIterator", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Predicate"}, new String[]{"<sample:0>", "<sample:3>"}, true), new String[][]{{"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "nodeListIterator", new String[]{"org.w3c.dom.Node"}, new String[]{"<sample:1>"}, true), new String[][]{{"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DeferredElementImpl", actual.getClass().getName());
  assertEquals("[child: null] {getBaseURI=null, getChildElementCount=0, getLength=1, getLocalName=null, getNamespaceURI=null, getNodeIndex=3, getNodeName=child, getNodeType=1, getNodeValue=null, getPrefix=null, getRe...#314#717223561", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "loopingListIterator", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, true), new String[][]{{"add", "java.lang.Object", "3"}, {"hasPrevious", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "objectGraphIterator", new String[]{"java.lang.Object", "org.apache.commons.collections4.Transformer"}, new String[]{"<d:1.521>", "<sample:4>"}, true), new String[][]{{"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.521", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "toArray", new String[]{"java.util.Iterator", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[Lgenerated.algorithm.SearchInputFactory_scaffolding$GenericSub;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "pushbackIterator", new String[]{"java.util.Iterator"}, new String[]{"<sample:9>"}, true), new String[][]{{"hasNext", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayIterator", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.ObjectArrayIterator", actual.getClass().getName());
  assertEquals("{getArray=[], getEndIndex=0, getStartIndex=0, hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "skippingIterator", new String[]{"java.util.Iterator", "long"}, new String[]{"<sample:0>", "0"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.SkippingIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "matchesAll", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Predicate"}, new String[]{"<sample:9>", "<sample:8>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.collections4.FunctorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "boundedIterator", new String[]{"java.util.Iterator", "long", "long"}, new String[]{"<sample:2>", "0", "-5188146770730811392"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayIterator", new String[]{"java.lang.Object", "int", "int"}, new String[]{"<d:1.5>", "2147483647", "23"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "find", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Predicate"}, new String[]{"<sample:3>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, true), new String[][]{{"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "transformedIterator", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Transformer"}, new String[]{"<sample:1>", "<sample:6>"}, true), new String[][]{{"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, true), new String[][]{{"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "singletonListIterator", new String[]{"java.lang.Object"}, new String[]{"<d:1.65>"}, true), new String[][]{{"previous", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "chainedIterator", new String[]{"java.util.Collection"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "emptyOrderedMapIterator", new String[]{}, new String[]{}, true), new String[][]{{"getValue", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<i:12>"}, true), new String[][]{{"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "objectGraphIterator", new String[]{"java.lang.Object", "org.apache.commons.collections4.Transformer"}, new String[]{"<i:1>", "<sample:3>"}, true), new String[][]{{"next", "", "3"}, {"hasNext", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "emptyMapIterator", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.EmptyMapIterator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "singletonListIterator", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, true), new String[][]{{"remove", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "singletonIterator", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, true), new String[][]{{"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "loopingIterator", new String[]{"java.util.Collection"}, new String[]{"<sample:8>"}, true), new String[][]{{"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<s:P>"}, true), new String[][]{{"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "singletonListIterator", new String[]{"java.lang.Object"}, new String[]{"<s:/.>"}, true), new String[][]{{"nextIndex", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<i:-131073>"}, true), new String[][]{{"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-131073", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayListIterator", new String[]{"java.lang.Object", "int", "int"}, new String[]{"<i:-2147483648>", "-1073741823", "-62"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, true), new String[][]{{"next", "", "2"}, {"remove", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.SingletonIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "objectGraphIterator", new String[]{"java.lang.Object", "org.apache.commons.collections4.Transformer"}, new String[]{"<s:b>", "<sample:3>"}, true), new String[][]{{"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "singletonListIterator", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, true), new String[][]{{"add", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "singletonListIterator", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, true), new String[][]{{"hasPrevious", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "emptyMapIterator", new String[]{}, new String[]{}, true), new String[][]{{"getKey", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "singletonListIterator", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, true), new String[][]{{"nextIndex", "", "6"}, {"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "objectGraphIterator", new String[]{"java.lang.Object", "org.apache.commons.collections4.Transformer"}, new String[]{"<i:1>", "<sample:7>"}, true), new String[][]{{"next", "", "2"}, {"next", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "emptyMapIterator", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.EmptyMapIterator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayListIterator", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayIterator", new String[]{"java.lang.Object", "int"}, new String[]{"<s:ke7y>", "1"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "singletonListIterator", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, true, 0, null, 1), new String[][]{{"reset", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.SingletonListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "loopingIterator", new String[]{"java.util.Collection"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "toString", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Transformer", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "<sample:5>", "iteqator", "Entry des not exibt: ", "5.2020-02-30T25:61:61"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Entry des not exibt: 5.2020-02-30T25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "peekingIterator", new String[]{"java.util.Iterator"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.PeekingIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "loopingIterator", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, true), new String[][]{{"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
}
