package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "getActingCallback", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MethodCompilerPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.InlineGetters$InlineTrivialAccessors", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "getActingCallback", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MethodCompilerPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:2>"}}, 2), new String[][]{{"shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.VariableMap", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "getSignatureStore", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "getSignatureStore", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"removeSignature", "java.lang.String", "2"}, {"removeSignature", "java.lang.String", "0"}, {"removeSignature", "java.lang.String", "6"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "getActingCallback", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MethodCompilerPass", "getSignatureStore", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.InlineGetters$InlineTrivialAccessors", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "getActingCallback", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.MethodCompilerPass", "getSignatureStore", ""}}), new String[][]{{"shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:0>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:7>"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:5>"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:6>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}}, 3), new String[][]{{"save", "java.lang.String", "1"}, {"getNewNameToOriginalNameMap", "", "2"}, {"entrySet", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableMap$UnmodifiableEntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "getActingCallback", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "3"}, {"visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "2"}, {"shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "getSignatureStore", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.MethodCompilerPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<null>"}, {"com.google.javascript.jscomp.MethodCompilerPass", "getActingCallback", ""}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "getSignatureStore", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.MethodCompilerPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<null>"}, {"com.google.javascript.jscomp.MethodCompilerPass", "getActingCallback", ""}, {"com.google.javascript.jscomp.MethodCompilerPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:4>"}}, 1), new String[][]{{"reset", "", "6"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "getSignatureStore", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.MethodCompilerPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<null>"}, {"com.google.javascript.jscomp.MethodCompilerPass", "getActingCallback", ""}, {"com.google.javascript.jscomp.MethodCompilerPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:3>"}}, 2);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:8>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:1>"}, {"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:5>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:0>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.MethodCompilerPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:3>"}}, 3), new String[][]{{"lookupNewName", "java.lang.String", "3"}, {"getOriginalNameToNewNameMap", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false), new String[][]{{"getNewNameToOriginalNameMap", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}, {"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:5>"}}, 3), new String[][]{{"lookupNewName", "java.lang.String", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}, {"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.VariableMap", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:5>"}, {"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}}, 3), new String[][]{{"toBytes", "", "6"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:5>"}, {"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}, {"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}}), new String[][]{{"toBytes", "", "6"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:5>"}, {"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}, {"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}}, 1), new String[][]{{"toBytes", "", "7"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:0>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.MethodCompilerPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:3>"}, {"com.google.javascript.jscomp.MethodCompilerPass", "getActingCallback", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:8>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MethodCompilerPass", "getSignatureStore", ""}, {"com.google.javascript.jscomp.MethodCompilerPass", "getSignatureStore", ""}, {"com.google.javascript.jscomp.MethodCompilerPass", "getSignatureStore", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.VariableMap", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.VariableMap", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:0>"}}, 1), new String[][]{{"lookupSourceName", "java.lang.String", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:2>"}, {"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:0>"}}), new String[][]{{"lookupSourceName", "java.lang.String", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "getActingCallback", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.InlineGetters$InlineTrivialAccessors", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MethodCompilerPass", "getActingCallback", ""}, {"com.google.javascript.jscomp.MethodCompilerPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MethodCompilerPass", "getActingCallback", ""}, {"com.google.javascript.jscomp.MethodCompilerPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "getSignatureStore", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "getActingCallback", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.MethodCompilerPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:1>"}}, 1), new String[][]{{"shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}}, 1), new String[][]{{"getOriginalNameToNewNameMap", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}}), new String[][]{{"getNewNameToOriginalNameMap", "", "1"}, {"putIfAbsent", "java.lang.Object,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:2>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}}), new String[][]{{"save", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MethodCompilerPass", "com.google.javascript.jscomp.InlineGetters", "getActingCallback", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.InlineGetters$InlineTrivialAccessors", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:2>"}, {"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}, {"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:9>"}}, 2), new String[][]{{"lookupSourceName", "java.lang.String", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}}, 3), new String[][]{{"getNewNameToOriginalNameMap", "", "0"}, {"clear", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:4>"}}, 2), new String[][]{{"getOriginalNameToNewNameMap", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:4>"}}, 2), new String[][]{{"getOriginalNameToNewNameMap", "", "2"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:0>"}}, 2), new String[][]{{"getNewNameToOriginalNameMap", "", "2"}, {"containsValue", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 22, new String[][]{{"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:6>"}, {"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}, {"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:5>"}}, 2), new String[][]{{"getNewNameToOriginalNameMap", "", "7"}, {"size", "", "2"}, {"clear", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:8>"}}), new String[][]{{"getNewNameToOriginalNameMap", "", "7"}, {"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:8>"}}, 3), new String[][]{{"getNewNameToOriginalNameMap", "", "7"}, {"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:3>"}, {"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:8>"}}, 2), new String[][]{{"toBytes", "", "7"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}, {"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:7>"}}, 1), new String[][]{{"getNewNameToOriginalNameMap", "", "3"}, {"keySet", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}, {"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:9>"}}), new String[][]{{"getNewNameToOriginalNameMap", "", "3"}, {"keySet", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 22, new String[][]{{"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:3>"}}), new String[][]{{"getNewNameToOriginalNameMap", "", "0"}, {"entrySet", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableMap$UnmodifiableEntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:1>"}}, 1), new String[][]{{"getOriginalNameToNewNameMap", "", "5"}, {"put", "java.lang.Object,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:4>"}, {"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:4>"}, {"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}}, 3), new String[][]{{"getOriginalNameToNewNameMap", "", "3"}, {"keySet", "", "5"}, {"containsAll", "java.util.Collection", "5"}, {"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.RenameVars", "getVariableMap", ""}, {"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:4>"}}, 1), new String[][]{{"getOriginalNameToNewNameMap", "", "2"}, {"keySet", "", "5"}, {"containsAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:5>"}, {"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:10>"}, {"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:1>"}}, 1), new String[][]{{"getOriginalNameToNewNameMap", "", "2"}, {"keySet", "", "4"}, {"iterator", "", "3"}, {"next", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameVars", "com.google.javascript.jscomp.RenameVars", "getVariableMap", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.RenameVars", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:3>"}}, 2), new String[][]{{"getOriginalNameToNewNameMap", "", "4"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
}
