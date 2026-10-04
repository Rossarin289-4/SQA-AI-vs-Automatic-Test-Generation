package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "asIterator", new String[]{"java.util.Enumeration", "java.util.Collection"}, new String[]{"<sample:2>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.EnumerationIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "asIterator", new String[]{"java.util.Enumeration", "java.util.Collection"}, new String[]{"<sample:0>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "emptyListIterator", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.EmptyListIterator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "loopingListIterator", new String[]{"java.util.List"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "loopingListIterator", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.LoopingListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "zippingIterator", new String[]{"java.util.Iterator", "java.util.Iterator"}, new String[]{"<sample:3>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.ZippingIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "asIterable", new String[]{"java.util.Iterator"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.IteratorIterable", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "asIterable", new String[]{"java.util.Iterator"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "asEnumeration", new String[]{"java.util.Iterator"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.IteratorEnumeration", actual.getClass().getName());
  assertEquals("{hasMoreElements=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "asEnumeration", new String[]{"java.util.Iterator"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "skippingIterator", new String[]{"java.util.Iterator", "long"}, new String[]{"<sample:0>", "9223372036854775807"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.SkippingIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "emptyOrderedIterator", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.EmptyOrderedIterator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "toList", new String[]{"java.util.Iterator", "int"}, new String[]{"<empty>", "-1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "chainedIterator", new String[]{"java.util.Iterator", "java.util.Iterator"}, new String[]{"<empty>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.IteratorChain", actual.getClass().getName());
  assertEquals("{hasNext=true, isLocked=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "singletonListIterator", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.SingletonListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "get", new String[]{"java.util.Iterator", "int"}, new String[]{"<sample:2>", "1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "get", new String[]{"java.util.Iterator", "int"}, new String[]{"<sample:1>", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "unmodifiableMapIterator", new String[]{"org.apache.commons.collections4.MapIterator"}, new String[]{"<sample:4>"}, true, 0, null, 2), new String[][]{{"next", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "collatedIterator", new String[]{"java.util.Comparator", "java.util.Iterator[]"}, new String[]{"<sample:0>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.CollatingIterator", actual.getClass().getName());
  assertEquals("{getIteratorIndex=!IllegalStateException, hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "matchesAll", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Predicate"}, new String[]{"<empty>", "<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "collatedIterator", new String[]{"java.util.Comparator", "java.util.Iterator[]"}, new String[]{"<null>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.CollatingIterator", actual.getClass().getName());
  assertEquals("{getIteratorIndex=!IllegalStateException, hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "matchesAll", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Predicate"}, new String[]{"<null>", "<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "matchesAll", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Predicate"}, new String[]{"<sample:4>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "zippingIterator", new String[]{"java.util.Iterator[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.ZippingIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "asIterator", new String[]{"java.util.Enumeration"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.EnumerationIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "asIterator", new String[]{"java.util.Enumeration"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayIterator", new String[]{"java.lang.Object[]", "int"}, new String[]{"<sample:3>", "0"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.ObjectArrayIterator", actual.getClass().getName());
  assertEquals("{getArray=[key], getEndIndex=1, getStartIndex=0, hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "filteredListIterator", new String[]{"java.util.ListIterator", "org.apache.commons.collections4.Predicate"}, new String[]{"<sample:2>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.FilterListIterator", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "toArray", new String[]{"java.util.Iterator", "java.lang.Class"}, new String[]{"<null>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "filteredIterator", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Predicate"}, new String[]{"<sample:2>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.FilterIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "nodeListIterator", new String[]{"org.w3c.dom.Node"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.NodeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "matchesAny", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Predicate"}, new String[]{"<sample:0>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "nodeListIterator", new String[]{"org.w3c.dom.NodeList"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "nodeListIterator", new String[]{"org.w3c.dom.NodeList"}, new String[]{"<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.NodeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "emptyOrderedMapIterator", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.EmptyOrderedMapIterator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "asIterator", new String[]{"java.util.Enumeration", "java.util.Collection"}, new String[]{"<sample:3>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "size", new String[]{"java.util.Iterator"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.SingletonIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.EmptyIterator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "collatedIterator", new String[]{"java.util.Comparator", "java.util.Collection"}, new String[]{"<sample:3>", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.CollatingIterator", actual.getClass().getName());
  assertEquals("{getIteratorIndex=!IllegalStateException, hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "transformedIterator", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Transformer"}, new String[]{"<sample:2>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.TransformIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "find", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Predicate"}, new String[]{"<sample:4>", "<sample:7>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "toArray", new String[]{"java.util.Iterator", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[Lgenerated.algorithm.SearchInputFactory_scaffolding$GenericBase;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "toListIterator", new String[]{"java.util.Iterator"}, new String[]{"<sample:11>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.ListIteratorWrapper", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "asMultipleUseIterable", new String[]{"java.util.Iterator"}, new String[]{"<sample:13>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.IteratorIterable", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "collatedIterator", new String[]{"java.util.Comparator", "java.util.Iterator", "java.util.Iterator"}, new String[]{"<sample:2>", "<sample:4>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.CollatingIterator", actual.getClass().getName());
  assertEquals("{getIteratorIndex=!IllegalStateException, hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "boundedIterator", new String[]{"java.util.Iterator", "long"}, new String[]{"<sample:9>", "0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.BoundedIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "unmodifiableIterator", new String[]{"java.util.Iterator"}, new String[]{"<sample:6>"}, true, 0, null, 3), new String[][]{{"next", "", "5"}, {"hasNext", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "toString", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Transformer", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "<sample:7>", "[1,2]", "/LL0b", ", "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/LL0b, ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayListIterator", new String[]{"java.lang.Object[]"}, new String[]{"<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.ObjectArrayListIterator", actual.getClass().getName());
  assertEquals("{getArray=[1.5], getEndIndex=1, getStartIndex=0, hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "zippingIterator", new String[]{"java.util.Iterator", "java.util.Iterator", "java.util.Iterator"}, new String[]{"<sample:11>", "<sample:0>", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.ZippingIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "toString", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Transformer", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "<sample:1>", "{!a\":1}Entry does not exist: ", "Hello, World", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "matchesAll", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Predicate"}, new String[]{"<sample:1>", "<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "isEmpty", new String[]{"java.util.Iterator"}, new String[]{"<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "isEmpty", new String[]{"java.util.Iterator"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "loopingIterator", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayListIterator", new String[]{"java.lang.Object[]", "int", "int"}, new String[]{"<sample:11>", "1", "1"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.ObjectArrayListIterator", actual.getClass().getName());
  assertEquals("{getArray=[a, 1, b], getEndIndex=1, getStartIndex=1, hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "toString", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Transformer", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "<sample:3>", "<null>", "I", "]"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "apply", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Closure"}, new String[]{"<sample:12>", "<sample:9>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "boundedIterator", new String[]{"java.util.Iterator", "long"}, new String[]{"<sample:0>", "-1"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "boundedIterator", new String[]{"java.util.Iterator", "long", "long"}, new String[]{"<null>", "9223372036854775807", "-9223372036854775808"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "zippingIterator", new String[]{"java.util.Iterator", "java.util.Iterator"}, new String[]{"<sample:3>", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.ZippingIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "zippingIterator", new String[]{"java.util.Iterator", "java.util.Iterator"}, new String[]{"<sample:3>", "<sample:1>"}, true, 0, null, 1), new String[][]{{"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "zippingIterator", new String[]{"java.util.Iterator", "java.util.Iterator"}, new String[]{"<sample:2>", "<sample:1>"}, true, 0, null, 1), new String[][]{{"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "zippingIterator", new String[]{"java.util.Iterator", "java.util.Iterator"}, new String[]{"<sample:2>", "<sample:4>"}, true, 0, null, 1), new String[][]{{"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "skippingIterator", new String[]{"java.util.Iterator", "long"}, new String[]{"<sample:0>", "2"}, true, 0, null, 3), new String[][]{{"remove", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "skippingIterator", new String[]{"java.util.Iterator", "long"}, new String[]{"<sample:0>", "-42"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "skippingIterator", new String[]{"java.util.Iterator", "long"}, new String[]{"<sample:2>", "524280"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.SkippingIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "skippingIterator", new String[]{"java.util.Iterator", "long"}, new String[]{"<sample:5>", "524280"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.SkippingIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "toList", new String[]{"java.util.Iterator", "int"}, new String[]{"<sample:0>", "0"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "toList", new String[]{"java.util.Iterator", "int"}, new String[]{"<empty>", "524283"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "toList", new String[]{"java.util.Iterator", "int"}, new String[]{"<empty>", "524282"}, true, 0, null, 2), new String[][]{{"retainAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayIterator", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayIterator", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "singletonListIterator", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, true, 0, null, 3), new String[][]{{"previousIndex", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "singletonListIterator", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, true, 0, null, 3), new String[][]{{"previousIndex", "", "5"}, {"remove", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "get", new String[]{"java.util.Iterator", "int"}, new String[]{"<sample:7>", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "get", new String[]{"java.util.Iterator", "int"}, new String[]{"<sample:6>", "1"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "emptyMapIterator", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.EmptyMapIterator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "emptyMapIterator", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"getKey", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayListIterator", new String[]{"java.lang.Object", "int", "int"}, new String[]{"<sample:0>", "-2147483648", "-1"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "unmodifiableMapIterator", new String[]{"org.apache.commons.collections4.MapIterator"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "unmodifiableMapIterator", new String[]{"org.apache.commons.collections4.MapIterator"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.UnmodifiableMapIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "unmodifiableMapIterator", new String[]{"org.apache.commons.collections4.MapIterator"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.UnmodifiableMapIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "unmodifiableMapIterator", new String[]{"org.apache.commons.collections4.MapIterator"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "unmodifiableMapIterator", new String[]{"org.apache.commons.collections4.MapIterator"}, new String[]{"<sample:2>"}, true, 0, null, 2), new String[][]{{"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "unmodifiableMapIterator", new String[]{"org.apache.commons.collections4.MapIterator"}, new String[]{"<sample:1>"}, true, 0, null, 2), new String[][]{{"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "unmodifiableMapIterator", new String[]{"org.apache.commons.collections4.MapIterator"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"next", "", "7"}, {"setValue", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "unmodifiableMapIterator", new String[]{"org.apache.commons.collections4.MapIterator"}, new String[]{"<sample:5>"}, true, 0, null, 2), new String[][]{{"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "asIterator", new String[]{"java.util.Enumeration"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.EnumerationIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "asIterator", new String[]{"java.util.Enumeration"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "asIterator", new String[]{"java.util.Enumeration"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.EnumerationIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "asIterator", new String[]{"java.util.Enumeration"}, new String[]{"<sample:1>"}, true, 0, null, 3), new String[][]{{"getEnumeration", "", "6"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "asIterable", new String[]{"java.util.Iterator"}, new String[]{"<empty>"}, true, 0, null, 2), new String[][]{{"iterator", "", "7"}, {"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "asIterable", new String[]{"java.util.Iterator"}, new String[]{"<sample:5>"}, true, 0, null, 2), new String[][]{{"iterator", "", "7"}, {"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayIterator", new String[]{"java.lang.Object[]", "int"}, new String[]{"<sample:5>", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.ObjectArrayIterator", actual.getClass().getName());
  assertEquals("{getArray=[, true, c], getEndIndex=3, getStartIndex=0, hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "toString", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Transformer"}, new String[]{"<sample:4>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayListIterator", new String[]{"java.lang.Object", "int", "int"}, new String[]{"<s:b>", "-2147483524", "524229"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "toString", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Transformer", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "<null>", "0xFFFFFFFF", "-X0.0", "1.5"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "loopingListIterator", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"reset", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.LoopingListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "loopingListIterator", new String[]{"java.util.List"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "loopingListIterator", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"reset", "", "1"}, {"add", "java.lang.Object", "5"}, {"add", "java.lang.Object", "0"}, {"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "filteredIterator", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Predicate"}, new String[]{"<empty>", "<sample:7>"}, true, 0, null, 2), new String[][]{{"getPredicate", "", "0"}, {"evaluate", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayListIterator", new String[]{"java.lang.Object[]", "int"}, new String[]{"<sample:2>", "61"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "nodeListIterator", new String[]{"org.w3c.dom.Node"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "nodeListIterator", new String[]{"org.w3c.dom.Node"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.NodeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "nodeListIterator", new String[]{"org.w3c.dom.Node"}, new String[]{"<sample:1>"}, true, 0, null, 1), new String[][]{{"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DeferredElementImpl", actual.getClass().getName());
  assertEquals("[child: null] {getBaseURI=null, getChildElementCount=0, getLength=1, getLocalName=null, getNamespaceURI=null, getNodeIndex=3, getNodeName=child, getNodeType=1, getNodeValue=null, getPrefix=null, getRe...#314#717223561", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "nodeListIterator", new String[]{"org.w3c.dom.Node"}, new String[]{"<sample:2>"}, true, 0, null, 1), new String[][]{{"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DeferredTextImpl", actual.getClass().getName());
  assertEquals("[#text: text] {getBaseURI=null, getData=text, getLength=4, getLocalName=null, getNamespaceURI=null, getNodeIndex=4, getNodeName=#text, getNodeType=3, getNodeValue=text, getPrefix=null, getReadOnly=fal...#319#36935126", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "boundedIterator", new String[]{"java.util.Iterator", "long"}, new String[]{"<sample:9>", "-9223372036854775808"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayIterator", new String[]{"java.lang.Object", "int", "int"}, new String[]{"<d:25.5>", "1073741916", "1048566"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "skippingIterator", new String[]{"java.util.Iterator", "long"}, new String[]{"<null>", "-9223372036854775323"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "skippingIterator", new String[]{"java.util.Iterator", "long"}, new String[]{"<empty>", "22"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.SkippingIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "toString", new String[]{"java.util.Iterator"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "toString", new String[]{"java.util.Iterator"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "loopingListIterator", new String[]{"java.util.List"}, new String[]{"<sample:6>"}, true), new String[][]{{"previousIndex", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "loopingListIterator", new String[]{"java.util.List"}, new String[]{"<sample:8>"}, true), new String[][]{{"previousIndex", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "loopingListIterator", new String[]{"java.util.List"}, new String[]{"<sample:10>"}, true), new String[][]{{"previousIndex", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "loopingListIterator", new String[]{"java.util.List"}, new String[]{"<empty>"}, true), new String[][]{{"previousIndex", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "boundedIterator", new String[]{"java.util.Iterator", "long", "long"}, new String[]{"<null>", "9223372036854775807", "-9223372036854775808"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "boundedIterator", new String[]{"java.util.Iterator", "long", "long"}, new String[]{"<sample:2>", "1", "9223372036854775807"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.BoundedIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "zippingIterator", new String[]{"java.util.Iterator", "java.util.Iterator"}, new String[]{"<empty>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "asIterable", new String[]{"java.util.Iterator"}, new String[]{"<sample:3>"}, true), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "singletonIterator", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.SingletonIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "singletonIterator", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, true), new String[][]{{"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "singletonIterator", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, true), new String[][]{{"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "singletonIterator", new String[]{"java.lang.Object"}, new String[]{"<s:kex>"}, true), new String[][]{{"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("kex", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "singletonIterator", new String[]{"java.lang.Object"}, new String[]{"<s:ex>"}, true), new String[][]{{"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ex", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "singletonIterator", new String[]{"java.lang.Object"}, new String[]{"<s:fx>"}, true), new String[][]{{"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("fx", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "singletonIterator", new String[]{"java.lang.Object"}, new String[]{"<s:fx>"}, true), new String[][]{{"next", "", "5"}, {"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "singletonIterator", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, true), new String[][]{{"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "skippingIterator", new String[]{"java.util.Iterator", "long"}, new String[]{"<sample:0>", "-1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "skippingIterator", new String[]{"java.util.Iterator", "long"}, new String[]{"<sample:0>", "2"}, true), new String[][]{{"remove", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "toList", new String[]{"java.util.Iterator", "int"}, new String[]{"<empty>", "1048564"}, true), new String[][]{{"retainAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayIterator", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayIterator", new String[]{"java.lang.Object"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "chainedIterator", new String[]{"java.util.Iterator", "java.util.Iterator"}, new String[]{"<null>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "chainedIterator", new String[]{"java.util.Iterator", "java.util.Iterator"}, new String[]{"<empty>", "<sample:0>"}, true), new String[][]{{"addIterator", "java.util.Iterator", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.IteratorChain", actual.getClass().getName());
  assertEquals("{hasNext=false, isLocked=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "get", new String[]{"java.util.Iterator", "int"}, new String[]{"<sample:7>", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "emptyMapIterator", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.EmptyMapIterator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayListIterator", new String[]{"java.lang.Object[]", "int", "int"}, new String[]{"<sample:0>", "0", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "unmodifiableMapIterator", new String[]{"org.apache.commons.collections4.MapIterator"}, new String[]{"<sample:0>"}, true), new String[][]{{"next", "", "4"}, {"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "unmodifiableMapIterator", new String[]{"org.apache.commons.collections4.MapIterator"}, new String[]{"<sample:5>"}, true), new String[][]{{"next", "", "4"}, {"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "unmodifiableMapIterator", new String[]{"org.apache.commons.collections4.MapIterator"}, new String[]{"<sample:4>"}, true), new String[][]{{"next", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "collatedIterator", new String[]{"java.util.Comparator", "java.util.Iterator[]"}, new String[]{"<sample:0>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "skippingIterator", new String[]{"java.util.Iterator", "long"}, new String[]{"<sample:1>", "127"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.SkippingIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "pushbackIterator", new String[]{"java.util.Iterator"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "asIterator", new String[]{"java.util.Enumeration"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.EnumerationIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "emptyMapIterator", new String[]{}, new String[]{}, true), new String[][]{{"setValue", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "asIterable", new String[]{"java.util.Iterator"}, new String[]{"<empty>"}, true), new String[][]{{"iterator", "", "7"}, {"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "asIterable", new String[]{"java.util.Iterator"}, new String[]{"<sample:5>"}, true), new String[][]{{"iterator", "", "7"}, {"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayIterator", new String[]{"java.lang.Object[]", "int"}, new String[]{"<sample:0>", "524283"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayIterator", new String[]{"java.lang.Object[]", "int"}, new String[]{"<sample:5>", "0"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.ObjectArrayIterator", actual.getClass().getName());
  assertEquals("{getArray=[, true, c], getEndIndex=3, getStartIndex=0, hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayIterator", new String[]{"java.lang.Object[]", "int"}, new String[]{"<sample:5>", "0"}, true), new String[][]{{"getArray", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[, true, c]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "zippingIterator", new String[]{"java.util.Iterator", "java.util.Iterator"}, new String[]{"<sample:2>", "<sample:3>"}, true), new String[][]{{"hasNext", "", "2"}, {"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "zippingIterator", new String[]{"java.util.Iterator", "java.util.Iterator"}, new String[]{"<sample:2>", "<sample:2>"}, true), new String[][]{{"hasNext", "", "2"}, {"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "singletonListIterator", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.SingletonListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayListIterator", new String[]{"java.lang.Object", "int"}, new String[]{"<i:0>", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "singletonListIterator", new String[]{"java.lang.Object"}, new String[]{"<s:26Z:>"}, true), new String[][]{{"remove", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayIterator", new String[]{"java.lang.Object", "int"}, new String[]{"<s:>", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "toString", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Transformer", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "<null>", "0xFFFFFFFF", "-0.0", "1.5"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "loopingListIterator", new String[]{"java.util.List"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.LoopingListIterator", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false, size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayIterator", new String[]{"java.lang.Object[]", "int", "int"}, new String[]{"<empty>", "-1", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "loopingListIterator", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, true), new String[][]{{"reset", "", "1"}, {"add", "java.lang.Object", "5"}, {"add", "java.lang.Object", "0"}, {"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "filteredIterator", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Predicate"}, new String[]{"<sample:2>", "<sample:6>"}, true), new String[][]{{"getPredicate", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.functors.FalsePredicate", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "filteredIterator", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Predicate"}, new String[]{"<sample:1>", "<sample:5>"}, true), new String[][]{{"getPredicate", "", "0"}, {"evaluate", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayListIterator", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayListIterator", new String[]{"java.lang.Object[]", "int"}, new String[]{"<sample:2>", "61"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "emptyIterator", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.EmptyIterator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayListIterator", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayIterator", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayIterator", new String[]{"java.lang.Object[]", "int"}, new String[]{"<null>", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayListIterator", new String[]{"java.lang.Object", "int", "int"}, new String[]{"<s:key>", "-2147483648", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "boundedIterator", new String[]{"java.util.Iterator", "long"}, new String[]{"<sample:1>", "-9223372036854775808"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayIterator", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.ObjectArrayIterator", actual.getClass().getName());
  assertEquals("{getArray=[], getEndIndex=0, getStartIndex=0, hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayIterator", new String[]{"java.lang.Object[]"}, new String[]{"<sample:3>"}, true), new String[][]{{"reset", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.ObjectArrayIterator", actual.getClass().getName());
  assertEquals("{getArray=[key], getEndIndex=1, getStartIndex=0, hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayIterator", new String[]{"java.lang.Object", "int", "int"}, new String[]{"<d:1.5>", "-2147483648", "-1073741851"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "zippingIterator", new String[]{"java.util.Iterator[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "collatedIterator", new String[]{"java.util.Comparator", "java.util.Iterator", "java.util.Iterator"}, new String[]{"<empty>", "<sample:1>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "size", new String[]{"java.util.Iterator"}, new String[]{"<sample:10>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayIterator", new String[]{"java.lang.Object", "int", "int"}, new String[]{"<s:key>", "524283", "1"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<i:2147483647>"}, true), new String[][]{{"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<i:536870970>"}, true), new String[][]{{"hasNext", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<s:|>"}, true), new String[][]{{"remove", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayListIterator", new String[]{"java.lang.Object", "int"}, new String[]{"<b:true>", "0"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, true), new String[][]{{"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<s:\">"}, true, 0, null, 1), new String[][]{{"remove", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<s:`?>"}, true, 0, null, 1), new String[][]{{"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayListIterator", new String[]{"java.lang.Object", "int"}, new String[]{"<null>", "10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<s:,`lf>"}, true, 0, null, 3), new String[][]{{"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<i:-536871394>"}, true, 0, null, 3), new String[][]{{"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-536871394", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<i:-268435720>"}, true, 0, null, 3), new String[][]{{"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-268435720", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<i:-268435676>"}, true, 0, null, 3), new String[][]{{"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-268435676", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, true, 0, null, 3), new String[][]{{"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, true, 0, null, 3), new String[][]{{"next", "", "5"}, {"remove", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.SingletonIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<s:XBA>"}, true, 0, null, 3), new String[][]{{"next", "", "5"}, {"remove", "", "0"}, {"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, true, 0, null, 2), new String[][]{{"hasNext", "", "5"}, {"remove", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<s:9I>"}, true), new String[][]{{"next", "", "6"}, {"reset", "", "2"}, {"hasNext", "", "0"}, {"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("9I", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<s:8I>"}, true), new String[][]{{"next", "", "6"}, {"reset", "", "2"}, {"hasNext", "", "0"}, {"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8I", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, true, 0, null, 1), new String[][]{{"next", "", "6"}, {"reset", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.SingletonIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, true, 0, null, 2), new String[][]{{"next", "", "6"}, {"reset", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.SingletonIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<i:-526>"}, true), new String[][]{{"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-526", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<i:-580>"}, true), new String[][]{{"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-580", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, true, 0, null, 1), new String[][]{{"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<s:4>"}, true, 0, null, 1), new String[][]{{"next", "", "3"}, {"remove", "", "5"}, {"hasNext", "", "4"}, {"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<i:32>"}, true, 0, null, 2), new String[][]{{"next", "", "6"}, {"remove", "", "5"}, {"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<s:lkj>"}, true, 0, null, 1), new String[][]{{"next", "", "6"}, {"remove", "", "5"}, {"reset", "", "7"}, {"reset", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.SingletonIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<s:i>"}, true, 0, null, 2), new String[][]{{"next", "", "6"}, {"remove", "", "5"}, {"reset", "", "7"}, {"hasNext", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<s:}{s3T>"}, true, 0, null, 2), new String[][]{{"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, true, 0, null, 2), new String[][]{{"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, true, 0, null, 2), new String[][]{{"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "filteredIterator", new String[]{"java.util.Iterator", "org.apache.commons.collections4.Predicate"}, new String[]{"<sample:1>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayListIterator", new String[]{"java.lang.Object", "int"}, new String[]{"<i:1>", "524283"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "singletonListIterator", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.SingletonListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "getIterator", new String[]{"java.lang.Object"}, new String[]{"<s:ley->"}, true, 0, null, 1), new String[][]{{"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ley-", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayIterator", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "arrayListIterator", new String[]{"java.lang.Object", "int", "int"}, new String[]{"<null>", "524283", "0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.IteratorUtils", "org.apache.commons.collections4.IteratorUtils", "emptyOrderedMapIterator", new String[]{}, new String[]{}, true), new String[][]{{"getKey", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
}
