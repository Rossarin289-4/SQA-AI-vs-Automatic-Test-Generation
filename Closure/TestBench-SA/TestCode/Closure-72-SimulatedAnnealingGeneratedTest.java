package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameLabels", "com.google.javascript.jscomp.RenameLabels", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:2>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.RenameLabels", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameLabels", "com.google.javascript.jscomp.RenameLabels", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.RenameLabels", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:3>"}, {"com.google.javascript.jscomp.RenameLabels", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionToBlockMutator", "com.google.javascript.jscomp.FunctionToBlockMutator", "mutate", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "java.lang.String", "boolean", "boolean"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:5>", "<sample:4>", "5.", "false", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameLabels", "com.google.javascript.jscomp.RenameLabels", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameLabels", "com.google.javascript.jscomp.RenameLabels", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.RenameLabels", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:4>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameLabels", "com.google.javascript.jscomp.RenameLabels", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:0>"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionToBlockMutator", "com.google.javascript.jscomp.FunctionToBlockMutator", "mutate", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "java.lang.String", "boolean", "boolean"}, new String[]{",1", "<null>", "<sample:7>", "--[1m2]", "true", "false"}, false, 9, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionToBlockMutator", "com.google.javascript.jscomp.FunctionToBlockMutator", "mutate", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "java.lang.String", "boolean", "boolean"}, new String[]{"1.02345678", "<sample:0>", "<sample:6>", "123456789012345678901234567890", "false", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FunctionToBlockMutator", "mutate", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,boolean,boolean", "a,b,c", "<sample:7>", "<sample:7>", "0", "true", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionToBlockMutator", "com.google.javascript.jscomp.FunctionToBlockMutator", "mutate", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "java.lang.String", "boolean", "boolean"}, new String[]{"I", "<sample:4>", "<sample:3>", "1-5", "false", "true"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionToBlockMutator", "com.google.javascript.jscomp.FunctionToBlockMutator", "mutate", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "java.lang.String", "boolean", "boolean"}, new String[]{"-0.0", "<sample:1>", "<sample:0>", "3?57473648", "true", "true"}, false, 11, new String[][]{{"com.google.javascript.jscomp.FunctionToBlockMutator", "mutate", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,boolean,boolean", "0", "<sample:6>", "<null>", "\n", "true", "true"}, {"com.google.javascript.jscomp.FunctionToBlockMutator", "mutate", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,boolean,boolean", "inline_", "<sample:4>", "<sample:7>", "21474833648", "true", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameLabels", "com.google.javascript.jscomp.RenameLabels", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<null>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.RenameLabels", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:3>"}, {"com.google.javascript.jscomp.RenameLabels", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameLabels", "com.google.javascript.jscomp.RenameLabels", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.RenameLabels", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameLabels", "com.google.javascript.jscomp.RenameLabels", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:5>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenameLabels", "com.google.javascript.jscomp.RenameLabels", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionToBlockMutator", "com.google.javascript.jscomp.FunctionToBlockMutator", "mutate", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "java.lang.String", "boolean", "boolean"}, new String[]{"JSCompiler_inline_label_", "<null>", "<sample:7>", "null", "true", "true"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionToBlockMutator", "com.google.javascript.jscomp.FunctionToBlockMutator", "mutate", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "java.lang.String", "boolean", "boolean"}, new String[]{"a banon", "<null>", "<sample:4>", "1\u00e923456788012345678901234567890TITLE", "false", "false"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionToBlockMutator", "com.google.javascript.jscomp.FunctionToBlockMutator", "mutate", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "java.lang.String", "boolean", "boolean"}, new String[]{"{\"a\":1}", "<null>", "<sample:0>", "", "true", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FunctionToBlockMutator", "mutate", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,boolean,boolean", "1.5e300", "<sample:1>", "<null>", "1e.5d", "true", "true"}, {"com.google.javascript.jscomp.FunctionToBlockMutator", "mutate", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,boolean,boolean", "TITLE", "<sample:2>", "<sample:1>", "/a/bb", "true", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
