package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "union", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:3>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, , sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "subtract", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "addAll", new String[]{"java.util.Collection", "java.lang.Object[]"}, new String[]{"<sample:4>", "<sample:5>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "select", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate", "java.util.Collection"}, new String[]{"<null>", "<sample:1>", "<sample:3>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "addAll", new String[]{"java.util.Collection", "java.util.Iterator"}, new String[]{"<sample:2>", "<sample:2>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "exists", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:4>", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "removeAll", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:4>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "select", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:3>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "isEqualCollection", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:4>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "isProperSubCollection", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:0>", "<sample:10>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "maxSize", new String[]{"java.util.Collection"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "get", new String[]{"java.lang.Object", "int"}, new String[]{"<b:true>", "-10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "filter", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:2>", "<sample:1>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "sizeIsEmpty", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "countMatches", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:14>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "synchronizedCollection", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.collection.SynchronizedCollection", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "find", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:3>", "<sample:6>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "forAllDo", new String[]{"java.util.Collection", "org.apache.commons.collections.Closure"}, new String[]{"<sample:14>", "<sample:2>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "reverseArray", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "disjunction", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:8>", "<sample:14>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "addIgnoreNull", new String[]{"java.util.Collection", "java.lang.Object"}, new String[]{"<sample:0>", "<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "transform", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer"}, new String[]{"<sample:2>", "<sample:0>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer"}, new String[]{"<sample:2>", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[2, 2, 2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "index", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:1>", "<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "size", new String[]{"java.lang.Object"}, new String[]{"<s:bb>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "filter", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:5>", "<sample:0>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "filter", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:5>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "transformedCollection", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer"}, new String[]{"<sample:1>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.collection.TransformedCollection", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "selectRejected", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:8>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "containsAny", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:15>", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "exists", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<null>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "isEqualCollection", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:15>", "<sample:15>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "find", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:0>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "addIgnoreNull", new String[]{"java.util.Collection", "java.lang.Object"}, new String[]{"<sample:15>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "selectRejected", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:5>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "countMatches", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:3>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "get", new String[]{"java.lang.Object", "int"}, new String[]{"<i:-1>", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "containsAny", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:1>", "<sample:16>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Iterator", "org.apache.commons.collections.Transformer"}, new String[]{"<null>", "<sample:2>"}, true), new String[][]{{"set", "int,java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Iterator", "org.apache.commons.collections.Transformer", "java.util.Collection"}, new String[]{"<sample:0>", "<null>", "<sample:1>"}, true, 0, null, 1), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "transform", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer"}, new String[]{"<sample:8>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "addAll", new String[]{"java.util.Collection", "java.util.Enumeration"}, new String[]{"<sample:10>", "<sample:2>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "index", new String[]{"java.lang.Object", "int"}, new String[]{"<s:jey>", "4177959"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("jey", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "transform", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer"}, new String[]{"<null>", "<sample:0>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "typedCollection", new String[]{"java.util.Collection", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.collection.PredicatedCollection", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "isEqualCollection", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:2>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "intersection", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:16>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "containsAny", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:9>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "isFull", new String[]{"java.util.Collection"}, new String[]{"<sample:15>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "exists", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:6>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "isNotEmpty", new String[]{"java.util.Collection"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer", "java.util.Collection"}, new String[]{"<null>", "<sample:6>", "<sample:6>"}, true), new String[][]{{"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "retainAll", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:8>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "unmodifiableCollection", new String[]{"java.util.Collection"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.collection.UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "find", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:0>", "<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "size", new String[]{"java.lang.Object"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "predicatedCollection", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:0>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.collection.PredicatedCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "select", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate", "java.util.Collection"}, new String[]{"<sample:4>", "<sample:6>", "<sample:8>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "cardinality", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<null>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "isProperSubCollection", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:10>", "<sample:18>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "filter", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<null>", "<sample:8>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "countMatches", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:15>", "<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "containsAny", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:0>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "isNotEmpty", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "exists", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:18>", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "cardinality", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:a>", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "selectRejected", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:11>", "<sample:0>"}, true), new String[][]{{"add", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "isProperSubCollection", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:6>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "isNotEmpty", new String[]{"java.util.Collection"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "isFull", new String[]{"java.util.Collection"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "select", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:17>", "<null>"}, true), new String[][]{{"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "get", new String[]{"java.lang.Object", "int"}, new String[]{"<null>", "4177919"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "countMatches", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<null>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "maxSize", new String[]{"java.util.Collection"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "addAll", new String[]{"java.util.Collection", "java.util.Iterator"}, new String[]{"<null>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "find", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<null>", "<sample:1>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "selectRejected", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate", "java.util.Collection"}, new String[]{"<null>", "<sample:10>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "forAllDo", new String[]{"java.util.Collection", "org.apache.commons.collections.Closure"}, new String[]{"<sample:20>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "addAll", new String[]{"java.util.Collection", "java.util.Enumeration"}, new String[]{"<null>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "isSubCollection", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:4>", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "disjunction", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:1>", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "index", new String[]{"java.lang.Object", "int"}, new String[]{"<s:keryy>", "-16379"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("keryy", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "addIgnoreNull", new String[]{"java.util.Collection", "java.lang.Object"}, new String[]{"<sample:4>", "<b:true>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "addAll", new String[]{"java.util.Collection", "java.lang.Object[]"}, new String[]{"<sample:4>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "disjunction", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:17>", "<sample:16>"}, true, 0, null, 1), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "forAllDo", new String[]{"java.util.Collection", "org.apache.commons.collections.Closure"}, new String[]{"<sample:4>", "<sample:1>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "getCardinalityMap", new String[]{"java.util.Collection"}, new String[]{"<sample:8>"}, true, 0, null, 2), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "isSubCollection", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:2>", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "getCardinalityMap", new String[]{"java.util.Collection"}, new String[]{"<sample:5>"}, true, 0, null, 3), new String[][]{{"replace", "java.lang.Object,java.lang.Object", "7"}, {"entrySet", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[0=1, a=1, sample=1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "union", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:0>", "<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "maxSize", new String[]{"java.util.Collection"}, new String[]{"<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "selectRejected", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:10>", "<sample:3>"}, true, 0, null, 1), new String[][]{{"clone", "", "3"}, {"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Iterator", "org.apache.commons.collections.Transformer", "java.util.Collection"}, new String[]{"<empty>", "<sample:3>", "<sample:18>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "select", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate", "java.util.Collection"}, new String[]{"<sample:3>", "<sample:8>", "<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.collections.FunctorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer", "java.util.Collection"}, new String[]{"<sample:16>", "<sample:2>", "<sample:17>"}, true, 0, null, 3), new String[][]{{"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample, b, b]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "selectRejected", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:4>", "<sample:5>"}, true, 0, null, 2), new String[][]{{"listIterator", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "filter", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:4>", "<sample:1>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "addAll", new String[]{"java.util.Collection", "java.lang.Object[]"}, new String[]{"<sample:7>", "<empty>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "union", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:4>", "<sample:2>"}, true, 0, null, 3), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "synchronizedCollection", new String[]{"java.util.Collection"}, new String[]{"<sample:12>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.collection.SynchronizedCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "addAll", new String[]{"java.util.Collection", "java.lang.Object[]"}, new String[]{"<sample:8>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "countMatches", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:8>", "<sample:4>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.collections.FunctorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "predicatedCollection", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:8>", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "get", new String[]{"java.lang.Object", "int"}, new String[]{"<s:->", "-25"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "select", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:7>", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "isNotEmpty", new String[]{"java.util.Collection"}, new String[]{"<sample:8>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "getCardinalityMap", new String[]{"java.util.Collection"}, new String[]{"<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{=1, sample=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "disjunction", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:9>", "<sample:8>"}, true, 0, null, 3), new String[][]{{"lastIndexOf", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "addAll", new String[]{"java.util.Collection", "java.lang.Object[]"}, new String[]{"<sample:15>", "<sample:5>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer", "java.util.Collection"}, new String[]{"<sample:10>", "<sample:2>", "<sample:10>"}, true, 0, null, 1), new String[][]{{"removeAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "find", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:1>", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer", "java.util.Collection"}, new String[]{"<sample:12>", "<sample:2>", "<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample, , b]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "size", new String[]{"java.lang.Object"}, new String[]{"<s:jtey>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "exists", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:3>", "<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "isEmpty", new String[]{"java.util.Collection"}, new String[]{"<sample:16>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "addAll", new String[]{"java.util.Collection", "java.util.Enumeration"}, new String[]{"<sample:7>", "<sample:0>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Iterator", "org.apache.commons.collections.Transformer"}, new String[]{"<sample:0>", "<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "transformedCollection", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer"}, new String[]{"<empty>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "exists", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:18>", "<sample:9>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "getCardinalityMap", new String[]{"java.util.Collection"}, new String[]{"<sample:8>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{0=1, =1, a=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Iterator", "org.apache.commons.collections.Transformer", "java.util.Collection"}, new String[]{"<sample:2>", "<sample:5>", "<sample:5>"}, true, 0, null, 3), new String[][]{{"add", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "unmodifiableCollection", new String[]{"java.util.Collection"}, new String[]{"<sample:10>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.collection.UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "size", new String[]{"java.lang.Object"}, new String[]{"<s:jey>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "unmodifiableCollection", new String[]{"java.util.Collection"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "isEqualCollection", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:9>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "unmodifiableCollection", new String[]{"java.util.Collection"}, new String[]{"<sample:18>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.collection.UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "get", new String[]{"java.lang.Object", "int"}, new String[]{"<s:>", "-1"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "sizeIsEmpty", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "sizeIsEmpty", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "addAll", new String[]{"java.util.Collection", "java.util.Iterator"}, new String[]{"<sample:1>", "<sample:2>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "union", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:13>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Iterator", "org.apache.commons.collections.Transformer", "java.util.Collection"}, new String[]{"<sample:2>", "<sample:0>", "<sample:10>"}, true, 0, null, 2), new String[][]{{"trimToSize", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "index", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:-1.5>", "<i:-2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer", "java.util.Collection"}, new String[]{"<sample:1>", "<sample:6>", "<sample:1>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.collections.FunctorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "get", new String[]{"java.lang.Object", "int"}, new String[]{"<s:jeyH>", "4177996"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "isEqualCollection", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:5>", "<sample:16>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "disjunction", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:9>", "<sample:10>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, a, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "containsAny", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:0>", "<sample:14>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "getCardinalityMap", new String[]{"java.util.Collection"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{0=1, a=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "maxSize", new String[]{"java.util.Collection"}, new String[]{"<sample:16>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "filter", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:4>", "<sample:5>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Iterator", "org.apache.commons.collections.Transformer", "java.util.Collection"}, new String[]{"<sample:2>", "<sample:2>", "<sample:3>"}, true, 0, null, 2), new String[][]{{"add", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "disjunction", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:2>", "<sample:14>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "predicatedCollection", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:10>", "<sample:3>"}, true, 0, null, 1), new String[][]{{"contains", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "countMatches", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:7>", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "isEqualCollection", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:14>", "<sample:14>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "isSubCollection", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:5>", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "containsAny", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:2>", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "get", new String[]{"java.lang.Object", "int"}, new String[]{"<s:key>", "131071"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "retainAll", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:2>", "<sample:3>"}, true, 0, null, 1), new String[][]{{"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "size", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "addAll", new String[]{"java.util.Collection", "java.util.Enumeration"}, new String[]{"<sample:12>", "<sample:0>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "removeAll", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:7>", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "index", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:3>", "<i:23>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "forAllDo", new String[]{"java.util.Collection", "org.apache.commons.collections.Closure"}, new String[]{"<sample:1>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.collections.FunctorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "cardinality", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "union", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<null>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "disjunction", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<null>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "addAll", new String[]{"java.util.Collection", "java.util.Enumeration"}, new String[]{"<sample:0>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "exists", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:1>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "getCardinalityMap", new String[]{"java.util.Collection"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "subtract", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:4>", "<sample:8>"}, true), new String[][]{{"subList", "int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "reverseArray", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "containsAny", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:7>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Iterator", "org.apache.commons.collections.Transformer", "java.util.Collection"}, new String[]{"<sample:2>", "<sample:0>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "transform", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer"}, new String[]{"<sample:6>", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.collections.FunctorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "getCardinalityMap", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{0=1, =1, sample=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer", "java.util.Collection"}, new String[]{"<sample:7>", "<sample:6>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.collections.FunctorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "transformedCollection", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer"}, new String[]{"<null>", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer", "java.util.Collection"}, new String[]{"<sample:4>", "<sample:2>", "<sample:16>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, a, b, b]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "disjunction", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:13>", "<sample:5>"}, true), new String[][]{{"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "synchronizedCollection", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.collection.SynchronizedCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "typedCollection", new String[]{"java.util.Collection", "java.lang.Class"}, new String[]{"<sample:10>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer", "java.util.Collection"}, new String[]{"<sample:18>", "<sample:1>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample, 1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer", "java.util.Collection"}, new String[]{"<sample:1>", "<sample:4>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Iterator", "org.apache.commons.collections.Transformer"}, new String[]{"<sample:8>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "union", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:16>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, 0, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "transformedCollection", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer"}, new String[]{"<sample:0>", "<sample:0>"}, true), new String[][]{{"contains", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "selectRejected", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate", "java.util.Collection"}, new String[]{"<sample:3>", "<sample:0>", "<sample:6>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "isSubCollection", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:4>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "countMatches", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:4>", "<sample:8>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.collections.FunctorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "subtract", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:4>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer"}, new String[]{"<sample:5>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[2, 2, 2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Iterator", "org.apache.commons.collections.Transformer", "java.util.Collection"}, new String[]{"<empty>", "<sample:5>", "<sample:15>"}, true), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "disjunction", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:7>", "<sample:2>"}, true), new String[][]{{"addAll", "int,java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "addAll", new String[]{"java.util.Collection", "java.lang.Object[]"}, new String[]{"<sample:16>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "getCardinalityMap", new String[]{"java.util.Collection"}, new String[]{"<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{0=1, =1, a=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "getCardinalityMap", new String[]{"java.util.Collection"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{sample=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "isSubCollection", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:7>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "disjunction", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:2>", "<sample:14>"}, true), new String[][]{{"listIterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "subtract", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:0>", "<sample:13>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer", "java.util.Collection"}, new String[]{"<sample:3>", "<sample:7>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, true]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer"}, new String[]{"<null>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "selectRejected", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:5>", "<sample:7>"}, true), new String[][]{{"lastIndexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "isSubCollection", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:3>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "select", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:2>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "select", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:1>", "<sample:7>"}, true), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "getCardinalityMap", new String[]{"java.util.Collection"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{0=1, a=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer", "java.util.Collection"}, new String[]{"<sample:2>", "<sample:2>", "<sample:5>"}, true), new String[][]{{"clone", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample, b, b, b]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "find", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:1>", "<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "synchronizedCollection", new String[]{"java.util.Collection"}, new String[]{"<sample:15>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.collection.SynchronizedCollection", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Iterator", "org.apache.commons.collections.Transformer", "java.util.Collection"}, new String[]{"<sample:14>", "<sample:1>", "<sample:4>"}, true), new String[][]{{"clone", "", "1"}, {"clear", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "disjunction", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:1>", "<sample:4>"}, true), new String[][]{{"contains", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "disjunction", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:5>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "index", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:jeby>", "<s:b4_>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("jeby", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "selectRejected", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:5>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.collections.FunctorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Iterator", "org.apache.commons.collections.Transformer", "java.util.Collection"}, new String[]{"<sample:7>", "<sample:8>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.collections.FunctorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Iterator", "org.apache.commons.collections.Transformer", "java.util.Collection"}, new String[]{"<sample:2>", "<sample:6>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "intersection", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:7>", "<sample:4>"}, true), new String[][]{{"listIterator", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "transformedCollection", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer"}, new String[]{"<sample:5>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.collection.TransformedCollection", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer", "java.util.Collection"}, new String[]{"<sample:10>", "<sample:4>", "<sample:15>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Iterator", "org.apache.commons.collections.Transformer"}, new String[]{"<null>", "<sample:0>"}, true), new String[][]{{"indexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "disjunction", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:9>", "<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "index", new String[]{"java.lang.Object", "int"}, new String[]{"<s:Xa>", "-147451"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Xa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "select", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:6>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.collections.FunctorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "index", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:key>", "<i:-2147483648>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "isEmpty", new String[]{"java.util.Collection"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "index", new String[]{"java.lang.Object", "int"}, new String[]{"<s:bba>", "-4"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bba", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "subtract", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:15>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer"}, new String[]{"<sample:6>", "<sample:0>"}, true), new String[][]{{"contains", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "intersection", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:14>", "<sample:2>"}, true), new String[][]{{"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "disjunction", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:4>", "<sample:0>"}, true), new String[][]{{"retainAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "isNotEmpty", new String[]{"java.util.Collection"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "find", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:7>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.collections.FunctorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "index", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:b?n>", "<i:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b?n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Iterator", "org.apache.commons.collections.Transformer", "java.util.Collection"}, new String[]{"<sample:0>", "<sample:2>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "index", new String[]{"java.lang.Object", "int"}, new String[]{"<null>", "40"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Iterator", "org.apache.commons.collections.Transformer", "java.util.Collection"}, new String[]{"<sample:8>", "<sample:2>", "<sample:16>"}, true), new String[][]{{"isEmpty", "", "4"}, {"indexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "index", new String[]{"java.lang.Object", "int"}, new String[]{"<s:>", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "cardinality", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<i:1>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "exists", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:9>", "<sample:8>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.collections.FunctorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer", "java.util.Collection"}, new String[]{"<sample:7>", "<sample:5>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "getCardinalityMap", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "selectRejected", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:9>", "<sample:3>"}, true), new String[][]{{"listIterator", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "predicatedCollection", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:15>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "addAll", new String[]{"java.util.Collection", "java.util.Iterator"}, new String[]{"<sample:9>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "selectRejected", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<null>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "retainAll", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:8>", "<sample:1>"}, true), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer"}, new String[]{"<sample:7>", "<sample:0>"}, true), new String[][]{{"ensureCapacity", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "transformedCollection", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer"}, new String[]{"<sample:8>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.collection.TransformedCollection", actual.getClass().getName());
  assertEquals("[, a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer"}, new String[]{"<sample:3>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[true]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "subtract", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:7>", "<sample:8>"}, true), new String[][]{{"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "disjunction", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:6>", "<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "predicatedCollection", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:18>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.collections.FunctorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "intersection", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:2>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "select", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:10>", "<sample:3>"}, true), new String[][]{{"lastIndexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "filter", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:5>", "<sample:8>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.collections.FunctorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "intersection", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:5>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "intersection", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:10>", "<sample:10>"}, true), new String[][]{{"addAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "transformedCollection", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer"}, new String[]{"<sample:1>", "<sample:1>"}, true), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "intersection", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:6>", "<sample:2>"}, true), new String[][]{{"listIterator", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer"}, new String[]{"<empty>", "<sample:0>"}, true), new String[][]{{"trimToSize", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "union", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:6>", "<sample:2>"}, true), new String[][]{{"remove", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "intersection", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:19>", "<sample:16>"}, true), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "unmodifiableCollection", new String[]{"java.util.Collection"}, new String[]{"<sample:15>"}, true), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.UnmodifiableIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer"}, new String[]{"<sample:0>", "<sample:0>"}, true), new String[][]{{"ensureCapacity", "int", "1"}, {"get", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "unmodifiableCollection", new String[]{"java.util.Collection"}, new String[]{"<sample:7>"}, true), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "predicatedCollection", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:5>", "<sample:9>"}, true), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "predicatedCollection", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:2>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.collection.PredicatedCollection", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer", "java.util.Collection"}, new String[]{"<sample:10>", "<sample:3>", "<sample:16>"}, true), new String[][]{{"listIterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "find", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:6>", "<sample:11>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "index", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:/jey>", "<s:b>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/jey", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "intersection", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:14>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer", "java.util.Collection"}, new String[]{"<sample:4>", "<sample:1>", "<empty>"}, true), new String[][]{{"addAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "containsAny", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:6>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "removeAll", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:1>", "<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "select", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:7>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "retainAll", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:5>", "<sample:16>"}, true), new String[][]{{"listIterator", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "countMatches", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:5>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "unmodifiableCollection", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.collection.UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Iterator", "org.apache.commons.collections.Transformer", "java.util.Collection"}, new String[]{"<null>", "<sample:3>", "<empty>"}, true), new String[][]{{"add", "int,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer"}, new String[]{"<sample:7>", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.collections.FunctorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "index", new String[]{"java.lang.Object", "int"}, new String[]{"<sample:1>", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "subtract", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:2>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "unmodifiableCollection", new String[]{"java.util.Collection"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "getCardinalityMap", new String[]{"java.util.Collection"}, new String[]{"<sample:9>"}, true), new String[][]{{"containsValue", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "getCardinalityMap", new String[]{"java.util.Collection"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{=1, sample=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "collect", new String[]{"java.util.Iterator", "org.apache.commons.collections.Transformer", "java.util.Collection"}, new String[]{"<empty>", "<sample:9>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "transformedCollection", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer"}, new String[]{"<sample:2>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.collection.TransformedCollection", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "index", new String[]{"java.lang.Object", "int"}, new String[]{"<sample:3>", "-50"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "synchronizedCollection", new String[]{"java.util.Collection"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.collection.SynchronizedCollection", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "index", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:bb>", "<i:-1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bb", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "removeAll", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:0>", "<sample:4>"}, true), new String[][]{{"subList", "int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "union", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:10>", "<sample:13>"}, true), new String[][]{{"trimToSize", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, a, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "index", new String[]{"java.lang.Object", "int"}, new String[]{"<b:false>", "1023"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "index", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<s:i>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "predicatedCollection", new String[]{"java.util.Collection", "org.apache.commons.collections.Predicate"}, new String[]{"<sample:1>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.collection.PredicatedCollection", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "index", new String[]{"java.lang.Object", "int"}, new String[]{"<i:-512>", "-2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-512", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "unmodifiableCollection", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.collection.UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "retainAll", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:18>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "subtract", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:2>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "index", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-1>", "<d:1.451>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "retainAll", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:5>", "<sample:11>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "index", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:3b>", "<i:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "reverseArray", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "transformedCollection", new String[]{"java.util.Collection", "org.apache.commons.collections.Transformer"}, new String[]{"<sample:21>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.collection.TransformedCollection", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "removeAll", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:15>", "<sample:13>"}, true), new String[][]{{"addAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "retainAll", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<null>", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "union", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:10>", "<sample:5>"}, true), new String[][]{{"indexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.CollectionUtils", "org.apache.commons.collections.CollectionUtils", "retainAll", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:14>", "<sample:15>"}, true), new String[][]{{"addAll", "int,java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
}
