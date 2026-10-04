package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:7>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "getActingCallback", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MethodCompilerPass", "getSignatureStore", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.InlineGetters$InlineTrivialAccessors", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "getSignatureStore", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.MethodCompilerPass", "getSignatureStore", ""}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:5>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:9>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "getSignatureStore", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"removeSignature", "java.lang.String", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "getActingCallback", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:5>"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.VariableMap", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "<sample:1>"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:3>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<null>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}}), new String[][]{{"save", "java.lang.String", "3"}, {"save", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "getSignatureStore", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.MethodCompilerPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:11>"}}, 2);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "getActingCallback", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "getActingCallback", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MethodCompilerPass", "getSignatureStore", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.InlineGetters$InlineTrivialAccessors", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "getSignatureStore", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MethodCompilerPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:2>"}, {"com.google.javascript.jscomp.MethodCompilerPass", "getSignatureStore", ""}}, 1);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MethodCompilerPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MethodCompilerPass", "getSignatureStore", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"lookupNewName", "java.lang.String", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:8>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:5>"}, {"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "getActingCallback", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.InlineGetters$InlineTrivialAccessors", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "getActingCallback", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.MethodCompilerPass", "getActingCallback", ""}, {"com.google.javascript.jscomp.MethodCompilerPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:8>"}}, 3), new String[][]{{"shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}}), new String[][]{{"getNewNameToOriginalNameMap", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:9>"}}, 1), new String[][]{{"getOriginalNameToNewNameMap", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "getActingCallback", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<null>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:9>"}, {"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}}), new String[][]{{"toBytes", "", "0"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<null>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "getActingCallback", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.MethodCompilerPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:9>"}}, 2), new String[][]{{"visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.InlineGetters$InlineTrivialAccessors", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}}, 1), new String[][]{{"lookupSourceName", "java.lang.String", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.VariableMap", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:4>"}}, 3), new String[][]{{"lookupSourceName", "java.lang.String", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}}, 1), new String[][]{{"toBytes", "", "7"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}, {"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.VariableMap", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.VariableMap", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false), new String[][]{{"getNewNameToOriginalNameMap", "", "1"}, {"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:12>", "<sample:7>"}}, 3), new String[][]{{"getNewNameToOriginalNameMap", "", "1"}, {"containsKey", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}}, 1), new String[][]{{"save", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:4>"}}, 2), new String[][]{{"getOriginalNameToNewNameMap", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:1>"}}, 3), new String[][]{{"getNewNameToOriginalNameMap", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}}, 3), new String[][]{{"save", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false), new String[][]{{"lookupNewName", "java.lang.String", "0"}, {"getNewNameToOriginalNameMap", "", "5"}, {"replace", "java.lang.Object,java.lang.Object,java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}}, 1), new String[][]{{"getOriginalNameToNewNameMap", "", "7"}, {"entrySet", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableMap$UnmodifiableEntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getNewNameToOriginalNameMap", "", "7"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "0"}, {"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}, {"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:8>"}}), new String[][]{{"getOriginalNameToNewNameMap", "", "2"}, {"values", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:4>"}}, 1), new String[][]{{"getNewNameToOriginalNameMap", "", "1"}, {"remove", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"toBytes", "", "5"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false), new String[][]{{"getNewNameToOriginalNameMap", "", "2"}, {"keySet", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<null>"}}, 3), new String[][]{{"toBytes", "", "0"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}, {"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:6>"}}, 3), new String[][]{{"getOriginalNameToNewNameMap", "", "4"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}}, 2), new String[][]{{"lookupNewName", "java.lang.String", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}}, 2), new String[][]{{"getNewNameToOriginalNameMap", "", "5"}, {"values", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"save", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}}, 2), new String[][]{{"getOriginalNameToNewNameMap", "", "3"}, {"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getNewNameToOriginalNameMap", "", "6"}, {"values", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"getOriginalNameToNewNameMap", "", "6"}, {"containsValue", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
}
