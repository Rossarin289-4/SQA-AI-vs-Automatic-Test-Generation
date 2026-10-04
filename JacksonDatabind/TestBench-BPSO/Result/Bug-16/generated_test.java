package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[null]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[null] {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:2>", "<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("[null] {size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:8>", "<sample:4>"}, true), new String[][]{{"get", "java.lang.Class", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[null] {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:6>", "<sample:10>"}, true), new String[][]{{"annotations", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:5>", "<sample:9>"}, true), new String[][]{{"add", "java.lang.annotation.Annotation", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:10>", "<sample:10>"}, true), new String[][]{{"add", "java.lang.annotation.Annotation", "3"}, {"addIfNotPresent", "java.lang.annotation.Annotation", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[null]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[null] {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[null] {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[null] {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy} {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.Integer=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<empty>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "size", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[null] {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<empty>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[null] {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false), new String[][]{{"listIterator", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<sample:3>"}}), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:0>", "<sample:7>"}, true, 0, null, 1), new String[][]{{"size", "", "7"}, {"annotations", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:3>", "<sample:1>"}, true, 0, null, 2), new String[][]{{"annotations", "", "0"}, {"add", "int,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[null] {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:5>", "<sample:8>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("[null] {size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:0>", "<sample:8>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("[null] {size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericSub=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{class java.lang.String=GeneratedTestInputProxy}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.Integer=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"add", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{class java.lang.String=GeneratedTestInputProxy}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:3>", "<sample:8>"}, true, 0, null, 2), new String[][]{{"add", "java.lang.annotation.Annotation", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:1>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericSub=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy} {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericSub=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[null] {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:5>", "<sample:8>"}, true), new String[][]{{"add", "java.lang.annotation.Annotation", "0"}, {"annotations", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:5>", "<sample:2>"}, true), new String[][]{{"annotations", "", "4"}, {"addAll", "java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:0>", "<sample:8>"}, true, 0, null, 3), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:0>", "<sample:6>"}, true), new String[][]{{"annotations", "", "3"}, {"containsAll", "java.util.Collection", "1"}, {"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "size", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[null] {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:10>", "<sample:4>"}, true), new String[][]{{"annotations", "", "0"}, {"containsAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[null]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[null] {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:8>", "<sample:9>"}, true, 0, null, 2), new String[][]{{"addIfNotPresent", "java.lang.annotation.Annotation", "2"}, {"get", "java.lang.Class", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotationMap", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[null]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[null] {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:4>", "<sample:3>"}, true, 0, null, 1), new String[][]{{"get", "java.lang.Class", "2"}, {"add", "java.lang.annotation.Annotation", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false), new String[][]{{"retainAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[null] {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<null>", "<sample:3>"}, true), new String[][]{{"add", "java.lang.annotation.Annotation", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericSub=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[null] {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<empty>"}, {"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{interface java.util.List=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericSub=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:4>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.Integer=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{class generated.algorithm.SearchInputFactory_scaffolding$GenericSub=GeneratedTestInputProxy}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericSub=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:1>", "<sample:1>"}, true), new String[][]{{"size", "", "3"}, {"addIfNotPresent", "java.lang.annotation.Annotation", "1"}, {"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{class java.lang.Integer=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{} {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", ""}}, 3), new String[][]{{"contains", "java.lang.Object", "5"}, {"removeAll", "java.util.Collection", "1"}, {"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[null] {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[null] {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:9>", "<sample:10>"}, true, 0, null, 2), new String[][]{{"addIfNotPresent", "java.lang.annotation.Annotation", "6"}, {"annotations", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:0>", "<sample:1>"}, true, 0, null, 2), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<null>", "<sample:0>"}, true, 0, null, 3), new String[][]{{"annotations", "", "3"}, {"get", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "size", ""}}), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[null] {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:0>", "<sample:12>"}, true, 0, null, 2), new String[][]{{"addIfNotPresent", "java.lang.annotation.Annotation", "3"}, {"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:8>"}}), new String[][]{{"contains", "java.lang.Object", "4"}, {"contains", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class [Ljava.lang.String;=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:2>"}}), new String[][]{{"remove", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:9>", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("[null] {size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:1>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericSub=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "size", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", "java.lang.Class", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.Object=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericSub=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:6>", "<sample:9>"}, true, 0, null, 1), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{class java.lang.String=GeneratedTestInputProxy}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub=GeneratedTestInputProxy} {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{class java.lang.String=GeneratedTestInputProxy, class java.lang.Integer=GeneratedTestInputProxy}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy, class java.lang.Integer=GeneratedTestInputProxy} {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericSub=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", "java.lang.Class", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy} {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:1>", "<sample:3>"}, true, 0, null, 2), new String[][]{{"annotations", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", ""}}, 3), new String[][]{{"lastIndexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[null] {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:4>", "<sample:1>"}, true, 0, null, 1), new String[][]{{"addIfNotPresent", "java.lang.annotation.Annotation", "2"}, {"annotations", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{int=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", "java.lang.Class", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:4>", "<sample:9>"}, true), new String[][]{{"add", "java.lang.annotation.Annotation", "4"}, {"get", "java.lang.Class", "4"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "size", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub=GeneratedTestInputProxy} {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:4>"}, {"com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", "java.lang.Class", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.Integer=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:11>", "<sample:4>"}, true), new String[][]{{"annotations", "", "0"}, {"get", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{class java.lang.Integer=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<empty>"}}), new String[][]{{"removeAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{interface java.util.List=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:8>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class [Ljava.lang.String;=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<sample:3>"}}), new String[][]{{"iterator", "", "2"}, {"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<null>"}, {"com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{class java.lang.Object=GeneratedTestInputProxy, class java.lang.String=GeneratedTestInputProxy} {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericSub=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", "java.lang.Class", "<sample:4>"}, {"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.Object=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", "java.lang.Class", "<sample:4>"}, {"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy} {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[null] {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericSub=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"contains", "java.lang.Object", "7"}, {"size", "", "4"}, {"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[null] {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.Object=GeneratedTestInputProxy, class java.lang.String=GeneratedTestInputProxy, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy} {size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "size", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{interface java.util.List=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false), new String[][]{{"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[null] {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:2>"}}), new String[][]{{"annotationType", "", "3"}, {"annotationType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:1>"}, {"com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", "java.lang.Class", "<empty>"}}, 1), new String[][]{{"contains", "java.lang.Object", "7"}, {"remove", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericSub=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:5>", "<sample:9>"}, true, 0, null, 3), new String[][]{{"add", "java.lang.annotation.Annotation", "1"}, {"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{} {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:4>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.Integer=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{} {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:5>", "<sample:12>"}, true, 0, null, 1), new String[][]{{"annotations", "", "3"}, {"size", "", "4"}, {"removeAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:10>", "<sample:4>"}, true, 0, null, 3), new String[][]{{"addIfNotPresent", "java.lang.annotation.Annotation", "2"}, {"get", "java.lang.Class", "4"}, {"add", "java.lang.annotation.Annotation", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.Object=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:1>", "<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:8>", "<sample:3>"}, true, 0, null, 3), new String[][]{{"addIfNotPresent", "java.lang.annotation.Annotation", "0"}, {"addIfNotPresent", "java.lang.annotation.Annotation", "3"}, {"get", "java.lang.Class", "3"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:8>", "<sample:8>"}, true, 0, null, 3), new String[][]{{"annotations", "", "0"}, {"remove", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.Integer=GeneratedTestInputProxy, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub=GeneratedTestInputProxy} {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{class java.lang.Integer=GeneratedTestInputProxy}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.Integer=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericSub=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:10>", "<sample:1>"}, true, 0, null, 1), new String[][]{{"annotations", "", "3"}, {"remove", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<empty>"}, {"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:1>"}}), new String[][]{{"annotationType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub=GeneratedTestInputProxy} {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "size", ""}}, 3), new String[][]{{"addAll", "java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<null>"}}, 1), new String[][]{{"removeAll", "java.util.Collection", "6"}, {"containsAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "size", ""}}, 2), new String[][]{{"remove", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[null] {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{} {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{class java.lang.Integer=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "merge", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:12>", "<sample:5>"}, true, 0, null, 1), new String[][]{{"get", "java.lang.Class", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[null] {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"addAll", "java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[null] {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:2>"}}, 3), new String[][]{{"annotationType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", "java.lang.Class", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"listIterator", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", ""}}, 2), new String[][]{{"isEmpty", "", "4"}, {"listIterator", "", "6"}, {"previous", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"listIterator", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "size", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:2>"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{interface java.util.List=GeneratedTestInputProxy}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{interface java.util.List=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericSub=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericSub=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:2>"}}, 1), new String[][]{{"clear", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"add", "int,java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<empty>"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{class generated.algorithm.SearchInputFactory_scaffolding$GenericSub=GeneratedTestInputProxy}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericSub=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy} {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<sample:0>"}}, 2), new String[][]{{"annotationType", "", "0"}, {"annotationType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[null] {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<sample:3>"}}, 2), new String[][]{{"annotationType", "", "0"}, {"annotationType", "", "6"}, {"annotationType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericLe.., get...#705#1439182783", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:3>"}}, 3), new String[][]{{"annotationType", "", "7"}, {"annotationType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericLe.., get...#705#1439182783", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "size", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[null] {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"addAll", "int,java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{class generated.algorithm.SearchInputFactory_scaffolding$GenericSub=GeneratedTestInputProxy}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericSub=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:1>"}, {"com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericSub=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{class java.lang.Integer=GeneratedTestInputProxy}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.Integer=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<sample:4>"}, {"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<empty>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy, class java.lang.Integer=GeneratedTestInputProxy} {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{class generated.algorithm.SearchInputFactory_scaffolding$GenericSub=GeneratedTestInputProxy}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericSub=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"lastIndexOf", "java.lang.Object", "7"}, {"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[null] {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:0>"}}, 2), new String[][]{{"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$ValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[null] {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{class java.lang.Object=GeneratedTestInputProxy}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.Object=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<null>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "size", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"listIterator", "int", "2"}, {"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.Object=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{class java.lang.Object=GeneratedTestInputProxy}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.Object=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<empty>"}, {"com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", "java.lang.Class", "<sample:2>"}}), new String[][]{{"clear", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"retainAll", "java.util.Collection", "2"}, {"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[null] {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "size", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{int=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericSub=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:3>"}}, 2), new String[][]{{"contains", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "size", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "size", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "size", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:1>"}}, 2), new String[][]{{"remove", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericSub=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericSub=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{interface java.util.List=GeneratedTestInputProxy}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{interface java.util.List=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<sample:3>"}}, 3), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{class java.lang.String=GeneratedTestInputProxy}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:0>"}}, 1), new String[][]{{"removeAll", "java.util.Collection", "4"}, {"size", "", "3"}, {"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{interface java.util.List=GeneratedTestInputProxy}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{interface java.util.List=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "size", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericSub=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", "java.lang.Class", "<sample:1>"}}, 1), new String[][]{{"indexOf", "java.lang.Object", "5"}, {"lastIndexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[null] {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{class java.lang.Object=GeneratedTestInputProxy}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.Object=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.Integer=GeneratedTestInputProxy, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub=GeneratedTestInputProxy} {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("receiver state after the call", "{class java.lang.Integer=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<empty>"}, {"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:2>"}}, 1), new String[][]{{"annotationType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy} {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{class java.lang.Integer=GeneratedTestInputProxy}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.Integer=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:1>"}}, 3), new String[][]{{"isEmpty", "", "4"}, {"retainAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<empty>"}}, 1), new String[][]{{"annotationType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", ""}}, 3), new String[][]{{"removeAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "size", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{interface java.util.List=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.Integer=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<sample:5>"}}, 3), new String[][]{{"isEmpty", "", "0"}, {"size", "", "0"}, {"remove", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.Object=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<sample:1>"}, {"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("receiver state after the call", "{class java.lang.Integer=GeneratedTestInputProxy, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub=GeneratedTestInputProxy} {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<sample:2>"}}, 1), new String[][]{{"contains", "java.lang.Object", "1"}, {"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{interface java.util.List=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:0>"}}, 3), new String[][]{{"annotationType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:3>"}}, 1), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$ValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub=GeneratedTestInputProxy} {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:6>"}}, 1), new String[][]{{"annotationType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{interface java.util.List=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericSub=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{class [Ljava.lang.String;=GeneratedTestInputProxy}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class [Ljava.lang.String;=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{int=GeneratedTestInputProxy}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{int=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "annotations", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{int=GeneratedTestInputProxy}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{int=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{interface java.util.List=GeneratedTestInputProxy}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{interface java.util.List=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class java.lang.String=GeneratedTestInputProxy, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy} {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{int=GeneratedTestInputProxy}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{int=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{class [Ljava.lang.String;=GeneratedTestInputProxy}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{class [Ljava.lang.String;=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<sample:6>"}}), new String[][]{{"annotationType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{interface java.util.List=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<sample:7>"}}), new String[][]{{"annotationType", "", "0"}, {"annotationType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{int=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "size", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotationMap", "add", "java.lang.annotation.Annotation", "<sample:6>"}}, 2), new String[][]{{"annotationType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{interface java.util.List=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "get", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "_add", "java.lang.annotation.Annotation", "<sample:6>"}}, 3), new String[][]{{"annotationType", "", "1"}, {"annotationType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{interface java.util.List=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotationMap", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "addIfNotPresent", "java.lang.annotation.Annotation", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{int=GeneratedTestInputProxy}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{int=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
}
