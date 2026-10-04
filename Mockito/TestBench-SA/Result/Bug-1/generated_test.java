package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "toString", ""}}, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "toString", ""}}, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", "org.mockito.invocation.Invocation", "<sample:0>"}, {"org.mockito.internal.invocation.InvocationMatcher", "toString", ""}}, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getMethod", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", "org.mockito.invocation.Invocation", "<sample:4>"}, {"org.mockito.internal.invocation.InvocationMatcher", "toString", ""}}, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getMethod", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", "org.mockito.invocation.Invocation", "<sample:4>"}, {"org.mockito.internal.invocation.InvocationMatcher", "toString", ""}}, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false), new String[][]{{"getMock", "", "1"}, {"getSequenceNumber", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getMock", "", "1"}, {"getSequenceNumber", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getLocation", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMatchers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "matches", "org.mockito.invocation.Invocation", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[\"b\", 2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMatchers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "matches", "org.mockito.invocation.Invocation", "<sample:5>"}}), new String[][]{{"add", "int,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMatchers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "matches", "org.mockito.invocation.Invocation", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[\"b\", 2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMatchers", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "matches", "org.mockito.invocation.Invocation", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMatchers", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMatchers", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[\"key\"]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMatchers", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMatchers", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMatchers", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "matches", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", "org.mockito.invocation.Invocation", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "matches", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", "org.mockito.invocation.Invocation", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "matches", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", "org.mockito.invocation.Invocation", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"getArgumentAt", "int,java.lang.Class", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3), new String[][]{{"getArgumentAt", "int,java.lang.Class", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "matches", "org.mockito.invocation.Invocation", "<sample:1>"}}, 3), new String[][]{{"getArgumentAt", "int,java.lang.Class", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "matches", "org.mockito.invocation.Invocation", "<sample:1>"}}, 3), new String[][]{{"getArgumentAt", "int,java.lang.Class", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "matches", "org.mockito.invocation.Invocation", "<sample:0>"}}), new String[][]{{"getArgumentAt", "int,java.lang.Class", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false, 10, new String[][]{}), new String[][]{{"getArguments", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[0, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false, 11, new String[][]{}), new String[][]{{"getArguments", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false, 12, new String[][]{}), new String[][]{{"getArguments", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[key]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false, 13, new String[][]{}), new String[][]{{"getArguments", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[2, key, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getMatchers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getMatchers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getMatchers", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "getMatchers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getInvocation", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", "org.mockito.invocation.Invocation", "<sample:2>"}, {"org.mockito.internal.invocation.InvocationMatcher", "matches", "org.mockito.invocation.Invocation", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "createFrom", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "createFrom", new String[]{"java.util.List"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "createFrom", new String[]{"java.util.List"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "matches", "org.mockito.invocation.Invocation", "<sample:0>"}, {"org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", "org.mockito.invocation.Invocation", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMatchers", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", "org.mockito.invocation.Invocation", "<sample:5>"}, {"org.mockito.internal.invocation.InvocationMatcher", "getMatchers", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "matches", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", "org.mockito.invocation.Invocation", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "toString", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "toString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMethod", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.reflect.Method", actual.getClass().getName());
  assertEquals("public static java.util.List java.util.Arrays.asList(java.lang.Object[]) {getAnnotatedExceptionTypes=[], getAnnotatedParameterTypes=?, getAnnotations=?, getDeclaredAnnotations=?, getExceptionTypes=[],...#479#1579258602", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMethod", new String[]{}, new String[]{}, false), new String[][]{{"getParameterAnnotations", "", "2"}});
  assertNotNull(actual);
  assertEquals("[[Ljava.lang.annotation.Annotation;", actual.getClass().getName());
  assertEquals("[[]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMethod", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getParameterAnnotations", "", "2"}});
  assertNotNull(actual);
  assertEquals("[[Ljava.lang.annotation.Annotation;", actual.getClass().getName());
  assertEquals("[[], []]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMethod", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getParameterAnnotations", "", "2"}});
  assertNotNull(actual);
  assertEquals("[[Ljava.lang.annotation.Annotation;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getLocation", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getMatchers", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", "org.mockito.invocation.Invocation", "<sample:6>"}, {"org.mockito.internal.invocation.InvocationMatcher", "getMatchers", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", "org.mockito.invocation.Invocation", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "matches", "org.mockito.invocation.Invocation", "<sample:4>"}, {"org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", "org.mockito.invocation.Invocation", "<sample:6>"}, {"org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", "org.mockito.invocation.Invocation", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "matches", "org.mockito.invocation.Invocation", "<sample:4>"}, {"org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", "org.mockito.invocation.Invocation", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getMethod", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getLocation", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "matches", "org.mockito.invocation.Invocation", "<sample:2>"}}, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getLocation", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", "org.mockito.invocation.Invocation", "<sample:2>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", "org.mockito.invocation.Invocation", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<sample:6>"}, false, 8, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "toString", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", "org.mockito.invocation.Invocation", "<sample:6>"}, {"org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", "org.mockito.invocation.Invocation", "<sample:2>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<null>"}, false, 8, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", "org.mockito.invocation.Invocation", "<sample:6>"}, {"org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", "org.mockito.invocation.Invocation", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMethod", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", "org.mockito.invocation.Invocation", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.reflect.Method", actual.getClass().getName());
  assertEquals("public static java.util.List java.util.Arrays.asList(java.lang.Object[]) {getAnnotatedExceptionTypes=[], getAnnotatedParameterTypes=?, getAnnotations=?, getDeclaredAnnotations=?, getExceptionTypes=[],...#479#1579258602", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMethod", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", "org.mockito.invocation.Invocation", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.reflect.Method", actual.getClass().getName());
  assertEquals("public char java.lang.String.charAt(int) {getAnnotatedExceptionTypes=[], getAnnotatedParameterTypes=?, getAnnotations=[], getDeclaredAnnotations=[], getExceptionTypes=[], getGenericExceptionTypes=[], ...#423#47668453", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMethod", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getMatchers", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", "org.mockito.invocation.Invocation", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.reflect.Method", actual.getClass().getName());
  assertEquals("public java.lang.String java.lang.Object.toString() {getAnnotatedExceptionTypes=[], getAnnotatedParameterTypes=[], getAnnotations=[], getDeclaredAnnotations=[], getExceptionTypes=[], getGenericExcepti...#421#-14821254", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMethod", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getMatchers", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", "org.mockito.invocation.Invocation", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.reflect.Method", actual.getClass().getName());
  assertEquals("public int java.lang.String.length() {getAnnotatedExceptionTypes=[], getAnnotatedParameterTypes=[], getAnnotations=[], getDeclaredAnnotations=[], getExceptionTypes=[], getGenericExceptionTypes=[], get...#404#1666314520", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMatchers", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getInvocation", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMethod", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getMatchers", ""}}), new String[][]{{"invoke", "java.lang.Object,java.lang.Object[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMethod", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "matches", "org.mockito.invocation.Invocation", "<sample:0>"}}), new String[][]{{"getAnnotationsByType", "java.lang.Class", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "createFrom", new String[]{"java.util.List"}, new String[]{"<empty>"}, true), new String[][]{{"listIterator", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "matches", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getMethod", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "matches", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "matches", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", "org.mockito.invocation.Invocation", "<sample:0>"}, {"org.mockito.internal.invocation.InvocationMatcher", "getLocation", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMatchers", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[\"b\", 2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMatchers", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMatchers", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[\"key\"]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMethod", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getMethod", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.reflect.Method", actual.getClass().getName());
  assertEquals("public char java.lang.String.charAt(int) {getAnnotatedExceptionTypes=[], getAnnotatedParameterTypes=?, getAnnotations=[], getDeclaredAnnotations=[], getExceptionTypes=[], getGenericExceptionTypes=[], ...#423#47668453", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMethod", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getMethod", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.reflect.Method", actual.getClass().getName());
  assertEquals("public java.lang.String java.lang.Object.toString() {getAnnotatedExceptionTypes=[], getAnnotatedParameterTypes=[], getAnnotations=[], getDeclaredAnnotations=[], getExceptionTypes=[], getGenericExcepti...#421#-14821254", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", "org.mockito.invocation.Invocation", "<sample:7>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", "org.mockito.invocation.Invocation", "<sample:9>"}, {"org.mockito.internal.invocation.InvocationMatcher", "getLocation", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "createFrom", new String[]{"java.util.List"}, new String[]{"<empty>"}, true), new String[][]{{"pollLast", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "createFrom", new String[]{"java.util.List"}, new String[]{"<sample:4>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "createFrom", new String[]{"java.util.List"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "createFrom", new String[]{"java.util.List"}, new String[]{"<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "createFrom", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", "org.mockito.invocation.Invocation", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<sample:6>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getMethod", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "createFrom", new String[]{"java.util.List"}, new String[]{"<empty>"}, true), new String[][]{{"descendingIterator", "", "3"}, {"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "createFrom", new String[]{"java.util.List"}, new String[]{"<empty>"}, true, 0, null, 2), new String[][]{{"descendingIterator", "", "0"}, {"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "createFrom", new String[]{"java.util.List"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", "org.mockito.invocation.Invocation", "<sample:6>"}, {"org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", "org.mockito.invocation.Invocation", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", "org.mockito.invocation.Invocation", "<sample:6>"}, {"org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", "org.mockito.invocation.Invocation", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getMatchers", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", "org.mockito.invocation.Invocation", "<sample:6>"}, {"org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", "org.mockito.invocation.Invocation", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", "org.mockito.invocation.Invocation", "<sample:2>"}, {"org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", "org.mockito.invocation.Invocation", "<sample:3>"}}, 1), new String[][]{{"getLocation", "", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "toString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "createFrom", new String[]{"java.util.List"}, new String[]{"<empty>"}, true, 0, null, 2), new String[][]{{"element", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "createFrom", new String[]{"java.util.List"}, new String[]{"<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "createFrom", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "createFrom", new String[]{"java.util.List"}, new String[]{"<empty>"}, true), new String[][]{{"indexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMatchers", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getMethod", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", "org.mockito.invocation.Invocation", "<sample:4>"}}, 2), new String[][]{{"retainAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMatchers", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", "org.mockito.invocation.Invocation", "<sample:5>"}, {"org.mockito.internal.invocation.InvocationMatcher", "matches", "org.mockito.invocation.Invocation", "<sample:0>"}, {"org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", "org.mockito.invocation.Invocation", "<sample:4>"}}, 2), new String[][]{{"retainAll", "java.util.Collection", "2"}, {"containsAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMatchers", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", "org.mockito.invocation.Invocation", "<sample:5>"}, {"org.mockito.internal.invocation.InvocationMatcher", "getMethod", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", "org.mockito.invocation.Invocation", "<sample:4>"}}, 3), new String[][]{{"retainAll", "java.util.Collection", "2"}, {"containsAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMatchers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", "org.mockito.invocation.Invocation", "<sample:5>"}, {"org.mockito.internal.invocation.InvocationMatcher", "getMethod", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", "org.mockito.invocation.Invocation", "<sample:4>"}}, 3), new String[][]{{"retainAll", "java.util.Collection", "2"}, {"containsAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMatchers", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", "org.mockito.invocation.Invocation", "<sample:5>"}, {"org.mockito.internal.invocation.InvocationMatcher", "getMethod", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", "org.mockito.invocation.Invocation", "<sample:4>"}}, 3), new String[][]{{"listIterator", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getLocation", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "toString", ""}}, 1), new String[][]{{"isVerified", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getLocation", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "toString", ""}}, 1), new String[][]{{"isVerified", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getLocation", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "toString", ""}}, 1), new String[][]{{"getArguments", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[true]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getLocation", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "toString", ""}}, 1), new String[][]{{"getArguments", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[key]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getLocation", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "toString", ""}}, 1), new String[][]{{"getArguments", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[-1, 1.5, value]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "matches", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", "org.mockito.invocation.Invocation", "<sample:1>"}, {"org.mockito.internal.invocation.InvocationMatcher", "getMatchers", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", "org.mockito.invocation.Invocation", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "matches", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "matches", "org.mockito.invocation.Invocation", "<sample:3>"}, {"org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", "org.mockito.invocation.Invocation", "<sample:2>"}, {"org.mockito.internal.invocation.InvocationMatcher", "getMatchers", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMethod", new String[]{}, new String[]{}, false, 17, new String[][]{}, 3), new String[][]{{"getGenericReturnType", "", "6"}, {"canAccess", "java.lang.Object", "0"}, {"getGenericExceptionTypes", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMethod", new String[]{}, new String[]{}, false, 20, new String[][]{}, 3), new String[][]{{"getGenericReturnType", "", "6"}, {"canAccess", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", "org.mockito.invocation.Invocation", "<sample:6>"}, {"org.mockito.internal.invocation.InvocationMatcher", "getMethod", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", "org.mockito.invocation.Invocation", "<sample:0>"}}, 2), new String[][]{{"getArguments", "", "5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[0, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", "org.mockito.invocation.Invocation", "<sample:6>"}, {"org.mockito.internal.invocation.InvocationMatcher", "getMethod", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", "org.mockito.invocation.Invocation", "<sample:0>"}}, 2), new String[][]{{"getArguments", "", "5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[key]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getMethod", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", "org.mockito.invocation.Invocation", "<sample:0>"}}, 2), new String[][]{{"getArguments", "", "5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[true]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMatchers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getLocation", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMatchers", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getLocation", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"isIgnoredForVerification", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"isIgnoredForVerification", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMethod", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", "org.mockito.invocation.Invocation", "<sample:3>"}}, 2), new String[][]{{"getParameterTypes", "", "2"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[class java.lang.String, class [Ljava.lang.Object;]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMethod", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", "org.mockito.invocation.Invocation", "<sample:3>"}}, 2), new String[][]{{"getParameterTypes", "", "2"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMethod", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", "org.mockito.invocation.Invocation", "<sample:4>"}}, 2), new String[][]{{"getParameterTypes", "", "2"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[int]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "matches", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", "org.mockito.invocation.Invocation", "<sample:5>"}, {"org.mockito.internal.invocation.InvocationMatcher", "getMatchers", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", "org.mockito.invocation.Invocation", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "matches", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", "org.mockito.invocation.Invocation", "<sample:3>"}, {"org.mockito.internal.invocation.InvocationMatcher", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMethod", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getLocation", ""}}, 3), new String[][]{{"getAnnotationsByType", "java.lang.Class", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMatchers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "toString", ""}}, 1), new String[][]{{"get", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMethod", new String[]{}, new String[]{}, false, 14, new String[][]{}, 2), new String[][]{{"isSynthetic", "", "1"}, {"getDeclaringClass", "", "1"}, {"getAnnotations", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.annotation.Annotation;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"getArgumentAt", "int,java.lang.Class", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "createFrom", new String[]{"java.util.List"}, new String[]{"<empty>"}, true), new String[][]{{"addAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", "org.mockito.invocation.Invocation", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<sample:0>"}, false, 11, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getMethod", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", "org.mockito.invocation.Invocation", "<sample:1>"}, {"org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", "org.mockito.invocation.Invocation", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getMethod", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", "org.mockito.invocation.Invocation", "<sample:1>"}, {"org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", "org.mockito.invocation.Invocation", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "toString", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", "org.mockito.invocation.Invocation", "<null>"}, {"org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", "org.mockito.invocation.Invocation", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMethod", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", "org.mockito.invocation.Invocation", "<sample:7>"}, {"org.mockito.internal.invocation.InvocationMatcher", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.reflect.Method", actual.getClass().getName());
  assertEquals("public static java.util.List java.util.Arrays.asList(java.lang.Object[]) {getAnnotatedExceptionTypes=[], getAnnotatedParameterTypes=?, getAnnotations=?, getDeclaredAnnotations=?, getExceptionTypes=[],...#479#1579258602", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMethod", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", "org.mockito.invocation.Invocation", "<sample:7>"}, {"org.mockito.internal.invocation.InvocationMatcher", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.reflect.Method", actual.getClass().getName());
  assertEquals("public char java.lang.String.charAt(int) {getAnnotatedExceptionTypes=[], getAnnotatedParameterTypes=?, getAnnotations=[], getDeclaredAnnotations=[], getExceptionTypes=[], getGenericExceptionTypes=[], ...#423#47668453", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMethod", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", "org.mockito.invocation.Invocation", "<sample:11>"}, {"org.mockito.internal.invocation.InvocationMatcher", "getLocation", ""}}, 3), new String[][]{{"isAccessible", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMethod", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", "org.mockito.invocation.Invocation", "<sample:11>"}, {"org.mockito.internal.invocation.InvocationMatcher", "getLocation", ""}}, 3), new String[][]{{"getParameters", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Parameter;", actual.getClass().getName());
  assertEquals("[java.lang.String arg0, java.lang.Object... arg1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMethod", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", "org.mockito.invocation.Invocation", "<sample:11>"}, {"org.mockito.internal.invocation.InvocationMatcher", "getLocation", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "matches", "org.mockito.invocation.Invocation", "<sample:7>"}}, 3), new String[][]{{"getParameters", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Parameter;", actual.getClass().getName());
  assertEquals("[int arg0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMatchers", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getMatchers", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", "org.mockito.invocation.Invocation", "<sample:4>"}}, 1), new String[][]{{"indexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMethod", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"getDeclaringClass", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMethod", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getLocation", ""}}, 1), new String[][]{{"getDeclaringClass", "", "4"}, {"getDeclaredAnnotations", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.annotation.Annotation;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "createFrom", new String[]{"java.util.List"}, new String[]{"<empty>"}, true), new String[][]{{"removeAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "matches", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<sample:3>"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "toString", ""}}, 1), new String[][]{{"getSequenceNumber", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "toString", ""}}, 1), new String[][]{{"getSequenceNumber", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "createFrom", new String[]{"java.util.List"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "createFrom", new String[]{"java.util.List"}, new String[]{"<empty>"}, true, 0, null, 1), new String[][]{{"peek", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "createFrom", new String[]{"java.util.List"}, new String[]{"<empty>"}, true, 0, null, 3), new String[][]{{"peek", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "createFrom", new String[]{"java.util.List"}, new String[]{"<empty>"}, true, 0, null, 3), new String[][]{{"peek", "", "6"}, {"addLast", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", "org.mockito.invocation.Invocation", "<sample:2>"}, {"org.mockito.internal.invocation.InvocationMatcher", "toString", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "getLocation", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<sample:0>"}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "matches", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getMatchers", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "getMatchers", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMatchers", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"retainAll", "java.util.Collection", "6"}, {"contains", "java.lang.Object", "3"}, {"clear", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMatchers", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1), new String[][]{{"retainAll", "java.util.Collection", "6"}, {"contains", "java.lang.Object", "3"}, {"clear", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<null>"}, false, 13, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMethod", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getMatchers", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", "org.mockito.invocation.Invocation", "<null>"}}, 1), new String[][]{{"getAnnotatedReceiverType", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMethod", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getMatchers", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", "org.mockito.invocation.Invocation", "<null>"}}, 1), new String[][]{{"getAnnotatedReceiverType", "", "0"}});
  assertNotNull(actual);
  assertEquals("sun.reflect.annotation.AnnotatedTypeFactory$AnnotatedTypeBaseImpl", actual.getClass().getName());
  assertEquals("{getAnnotations=[], getDeclaredAnnotations=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<null>"}, false, 14, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getInvocation", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "getMethod", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", "org.mockito.invocation.Invocation", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMatchers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getMethod", ""}}, 1), new String[][]{{"removeAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMatchers", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getMethod", ""}}, 1), new String[][]{{"removeAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"markStubbed", "org.mockito.invocation.StubInfo", "5"}, {"getRawReturnType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"markStubbed", "org.mockito.invocation.StubInfo", "5"}, {"getSequenceNumber", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"markStubbed", "org.mockito.invocation.StubInfo", "5"}, {"getSequenceNumber", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"markStubbed", "org.mockito.invocation.StubInfo", "5"}, {"getSequenceNumber", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", "org.mockito.invocation.Invocation", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMatchers", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[\"b\", 2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMatchers", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMatchers", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[\"key\"]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMatchers", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMatchers", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", "org.mockito.invocation.Invocation", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "createFrom", new String[]{"java.util.List"}, new String[]{"<empty>"}, true), new String[][]{{"addLast", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMethod", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "toString", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "toString", ""}}, 1), new String[][]{{"isBridge", "", "0"}, {"getGenericExceptionTypes", "", "7"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMethod", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", "org.mockito.invocation.Invocation", "<sample:1>"}, {"org.mockito.internal.invocation.InvocationMatcher", "getMatchers", ""}}, 1), new String[][]{{"getParameterTypes", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[int]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMethod", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getMatchers", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", "org.mockito.invocation.Invocation", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.reflect.Method", actual.getClass().getName());
  assertEquals("public char java.lang.String.charAt(int) {getAnnotatedExceptionTypes=[], getAnnotatedParameterTypes=?, getAnnotations=[], getDeclaredAnnotations=[], getExceptionTypes=[], getGenericExceptionTypes=[], ...#423#47668453", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMethod", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getMatchers", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", "org.mockito.invocation.Invocation", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.reflect.Method", actual.getClass().getName());
  assertEquals("public static java.lang.String java.lang.String.format(java.lang.String,java.lang.Object[]) {getAnnotatedExceptionTypes=[], getAnnotatedParameterTypes=?, getAnnotations=[], getDeclaredAnnotations=[], ...#611#-1053877474", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getMatchers", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", "org.mockito.invocation.Invocation", "<sample:6>"}, {"org.mockito.internal.invocation.InvocationMatcher", "matches", "org.mockito.invocation.Invocation", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "hasSameMethod", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getMatchers", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "captureArgumentsFrom", "org.mockito.invocation.Invocation", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "getInvocation", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getInvocation", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", "org.mockito.invocation.Invocation", "<sample:7>"}}, 3), new String[][]{{"getRawReturnType", "", "0"}, {"getMethod", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.reflect.Method", actual.getClass().getName());
  assertEquals("public static java.util.List java.util.Arrays.asList(java.lang.Object[]) {getAnnotatedExceptionTypes=[], getAnnotatedParameterTypes=?, getAnnotations=?, getDeclaredAnnotations=?, getExceptionTypes=[],...#479#1579258602", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", new String[]{"org.mockito.invocation.Invocation"}, new String[]{"<null>"}, false, 16, new String[][]{{"org.mockito.internal.invocation.InvocationMatcher", "getMethod", ""}, {"org.mockito.internal.invocation.InvocationMatcher", "matches", "org.mockito.invocation.Invocation", "<sample:3>"}, {"org.mockito.internal.invocation.InvocationMatcher", "hasSimilarMethod", "org.mockito.invocation.Invocation", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "createFrom", new String[]{"java.util.List"}, new String[]{"<empty>"}, true, 0, null, 3), new String[][]{{"listIterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "createFrom", new String[]{"java.util.List"}, new String[]{"<empty>"}, true, 0, null, 2), new String[][]{{"pollFirst", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "createFrom", new String[]{"java.util.List"}, new String[]{"<empty>"}, true, 0, null, 3), new String[][]{{"peekFirst", "", "7"}, {"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "createFrom", new String[]{"java.util.List"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "createFrom", new String[]{"java.util.List"}, new String[]{"<empty>"}, true, 0, null, 1), new String[][]{{"set", "int,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "createFrom", new String[]{"java.util.List"}, new String[]{"<empty>"}, true, 0, null, 3), new String[][]{{"iterator", "", "0"}, {"previous", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "createFrom", new String[]{"java.util.List"}, new String[]{"<empty>"}, true, 0, null, 1), new String[][]{{"descendingIterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList$DescendingIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "createFrom", new String[]{"java.util.List"}, new String[]{"<empty>"}, true, 0, null, 1), new String[][]{{"peekFirst", "", "2"}, {"peekFirst", "", "3"}, {"listIterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "createFrom", new String[]{"java.util.List"}, new String[]{"<empty>"}, true, 0, null, 2), new String[][]{{"addAll", "java.util.Collection", "7"}, {"add", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "createFrom", new String[]{"java.util.List"}, new String[]{"<empty>"}, true, 0, null, 1), new String[][]{{"offerLast", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.invocation.InvocationMatcher", "org.mockito.internal.invocation.InvocationMatcher", "createFrom", new String[]{"java.util.List"}, new String[]{"<empty>"}, true, 0, null, 2), new String[][]{{"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
}
