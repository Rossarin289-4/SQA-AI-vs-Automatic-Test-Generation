package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:3>", "<sample:3>", " of "}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:1>", "<sample:7>", " 3of "}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<null>", "<sample:7>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:1>", "<sample:3>", " 3o9f c"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:0>", "<sample:1>", "<sample:2>", " 3o9f c-0.0"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:0>", "<sample:4>", "<sample:7>", "{0}", "<sample:4>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:2>", "<sample:1>", "<sample:7>", " 3o9f8c-0.0"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:6>", "<sample:3>", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<null>", "<sample:7>", "<sample:2>", "("}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<null>", "<sample:7>", "<sample:2>", "("}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:0>", "<null>", "<sample:7>", "<sample:7>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:4>", "<sample:5>", "a,b,c"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:4>", "<sample:1>", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:4>", "<sample:5>", "a,b,c"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:4>", "<sample:1>", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:7>", "<sample:8>", "a,b,c"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:0>", "<sample:6>", "<sample:5>", "<sample:1>", "<sample:4>", "restricted index type"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:4>", "<sample:1>", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:7>", "<sample:7>", "a,b,c"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:0>", "<sample:6>", "<sample:5>", "<sample:0>", "<sample:3>", "restricted indey type"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:4>", "<sample:1>", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:7>", "<sample:7>", "a,b,c"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:0>", "<sample:6>", "<sample:5>", "<sample:1>", "<sample:3>", "restricted indey type"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:4>", "<sample:1>", "<sample:3>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:9>", "<sample:1>", "<sample:1>", "a,b,"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "0x1F", "<sample:5>", "<sample:0>", "<sample:4>", "<sample:2>", "TITLE", "<sample:8>"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:4>", "<sample:1>", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:8>", "<sample:3>", "<sample:1>", "a,b,"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "0x1F", "<sample:7>", "<sample:0>", "<sample:3>", "<sample:2>", "TITLE", "<sample:8>"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:4>", "<sample:1>", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:4>", "<sample:3>", "<sample:8>", "a+b,)"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:1>", "<sample:7>", "2020-01-01", "<sample:8>"}, {"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "0x1F", "<sample:5>", "<sample:0>", "<sample:3>", "<sample:2>", "TITLE", "<sample:8>"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:3>", "<sample:1>", "<sample:1>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:2>", "<sample:1>", "<null>", "1E-5"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:6>", "<sample:0>", "<sample:6>", "Title", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:3>", "<sample:11>", "a+b,)"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:1>", "<sample:7>", "2020-01-01", "<sample:8>"}, {"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "0x1F", "<sample:5>", "<sample:0>", "<sample:3>", "<sample:7>", "TITLE", "<sample:8>"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:3>", "<sample:1>", "<sample:1>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:4>", "<null>", "a+b,)"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:1>", "<sample:7>", "2020-01-01", "<sample:8>"}, {"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "0x1F", "<sample:5>", "<sample:0>", "<sample:3>", "<sample:7>", "TITLE", "<sample:8>"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:1>", "<sample:1>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:6>", "<sample:2>", "123456789012345678901234567890"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<null>", "<sample:7>", "<sample:7>", "<sample:5>", "<sample:4>", "0"}, {"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:4>", "<sample:6>", "<sample:1>", "123456789012345678901234567890"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<null>", "<sample:7>", "<sample:7>", "<sample:5>", "<sample:4>", "0"}, {"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}, {"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<null>", "<sample:2>", "<sample:3>", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:4>", "<sample:6>", "<sample:11>", "123456789012345678901234567890"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<null>", "<sample:7>", "<sample:7>", "<sample:5>", "<sample:4>", "0"}, {"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}, {"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<null>", "<sample:2>", "<sample:3>", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<null>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:3>", "<sample:4>", "<sample:8>", "1.1234567"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:3>", "<sample:4>", "<sample:11>", "TITLE"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:3>", "<sample:4>", "<sample:10>", "TITLE"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:4>", "<null>", "<sample:2>", "<sample:7>", "<sample:0>", "12:30:45"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:3>", "<sample:6>", "<sample:2>", "<sample:6>", "<sample:0>", "12:30:45"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:6>", "<sample:0>", "-0.0", "<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:6>", "<sample:3>", "<sample:3>", "1.25"}, {"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "2147483648", "<sample:7>", "<sample:6>", "<sample:6>", "<null>", "JSC_MISSING_EXTENDS_TAG", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:4>", "<sample:4>", "<sample:2>", "<sample:9>", "<sample:0>", "-1.4("}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:7>", "false"}, {"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:1>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:4>", "<sample:0>", "<sample:2>", "<sample:9>", "<sample:0>", "-1.4(D"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:7>", "false"}, {"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<null>", "<sample:0>", "<sample:8>", "struct"}, {"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:1>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:4>", "<sample:1>", "<sample:8>", "<null>", "<sample:4>", "-1.4(D"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<null>", "<sample:0>", "<sample:8>", " 3of "}, {"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:1>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:4>", "<sample:0>", "<sample:8>", "<sample:12>", "<sample:4>", "-1.4(D"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<null>", "<sample:0>", "<sample:8>", " 3of "}, {"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:1>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:4>", "<sample:0>", "<sample:8>", "<sample:1>", "<sample:4>", "-1.4(D"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<null>", "<sample:0>", "<sample:8>", " 3of "}, {"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:1>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<sample:9>", "<sample:6>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:9>", "<sample:3>", "<sample:3>", "<sample:11>", "<sample:3>", "1"}, {"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:0>", "<sample:1>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanOverride", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<sample:3>", "<sample:6>", "<sample:2>", " 3o9f8c-0.0", "<sample:2>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "setShouldReport", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<sample:11>", "<sample:6>", "<null>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:0>", "<sample:4>", "<sample:5>", "0xFFFFFFFF"}, {"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:3>", "<sample:6>", "<sample:2>", "<sample:11>", "<sample:3>", "-2147483648"}, {"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<null>", "<sample:8>", "1.1234567890123456", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:7>", "<sample:6>", "<sample:9>", "<sample:4>", "<sample:4>", "0"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<sample:3>", "<sample:6>", "<sample:3>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:3>", "<sample:6>", "<sample:2>", "<sample:11>", "<sample:3>", "-2147483648"}, {"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<null>", "<sample:0>", "1.1234567890123456", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<sample:6>", "<sample:2>", "<sample:3>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:3>", "<sample:6>", "<sample:2>", "<sample:11>", "<sample:3>", "-2147483648"}, {"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<null>", "<sample:0>", "1.1234567890123456", "<sample:2>"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:4>", "<sample:7>", "<sample:0>", "<sample:0>", "restricted index type"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<sample:8>", "<sample:2>", "<sample:2>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:3>", "<sample:6>", "<sample:7>", "<sample:11>", "<sample:3>", "-2147483648"}, {"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<null>", "<sample:0>", "1.1234567890123456", "<sample:1>"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:4>", "<sample:7>", "<sample:0>", "<sample:0>", "restricted index type"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:9>", "<sample:5>", "<sample:7>", "<sample:10>", "<sample:0>", "0"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:9>", "<sample:1>", "<sample:1>", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<null>", "<sample:6>", "<sample:6>", "<sample:0>", "JSC_UNKNOWN_TYPEOF_VALUE"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<null>", "<sample:1>", "<sample:0>", "1E-5"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:5>", "<sample:1>", "<sample:5>", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:2>", "<sample:4>", "<sample:2>", "<sample:1>", "<sample:2>", ""}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:2>", "<sample:0>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:1>", "<sample:6>", "<sample:6>", "<sample:11>", "<sample:1>", ""}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:1>", "<sample:10>", "<sample:2>"}, {"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:1>", "<sample:0>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:6>", "<sample:0>", "<sample:4>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectString", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:5>", "<sample:5>", "<sample:11>", ""}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:7>", "<sample:3>", "<sample:0>", "<sample:7>", "<sample:0>", "MMcc"}, false, 8, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:2>", "<sample:7>", "<sample:2>", "JSC_DUP_VAR_DECLARATION", "<sample:7>"}, {"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:2>", "<sample:0>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<sample:7>", "<sample:11>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "5.", "<sample:4>", "<sample:7>", "<sample:1>", "<sample:3>", "a,b,", "<sample:3>"}, {"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:6>", "<sample:3>", "<sample:4>", "<sample:8>", "<sample:6>", "struct"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:2>", "<sample:6>", "<sample:8>", "<sample:8>", "<sample:6>", "2147483647"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:9>", "<sample:5>", "<null>", "<sample:7>", "1L"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:9>", "<null>", "<sample:11>", "<null>", "<sample:6>", "0"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:5>", "<sample:5>", "<sample:0>", "<sample:0>"}, {"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:7>", "<sample:4>", "<sample:0>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:4>", "<sample:4>", "<sample:4>", "'[]'"}, false, 9, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:5>", "<sample:4>", "<sample:0>", "<sample:11>", "<sample:1>", "10"}, {"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:9>", "<sample:5>", "<sample:3>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:3>", "<sample:3>", "<sample:2>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:3>", "<sample:2>", "<sample:5>", "1.1234567"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:5>", "<sample:1>", "<sample:1>", "struct"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>", "<sample:3>", "<sample:0>", "<sample:11>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:0>", "<sample:7>", "1L"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:9>", "<sample:1>", "<sample:6>", "<sample:1>", "<sample:1>", "-2147483648"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:0>", "<sample:0>", "<sample:4>", "<sample:7>", "2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:0>", "<sample:1>", "I"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:11>", "<sample:1>", "<sample:6>", "<sample:1>", "<sample:1>", "2147483647"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:0>", "<sample:0>", "<sample:4>", "<sample:7>", "2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:5>", "<sample:0>", "<sample:0>", "I"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:11>", "<sample:1>", "<sample:6>", "<sample:1>", "<sample:1>", "2147483586"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:0>", "<sample:0>", "<sample:4>", "<sample:8>", "2147483648null"}, {"com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,java.lang.String", "<sample:4>", "<null>", "JSC_UNKNOWN_TYPEOF_VALUE"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:3>", "<sample:6>", "<sample:3>", "H"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:11>", "<sample:1>", "<sample:6>", "<sample:1>", "<sample:1>", "-2147483648"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:0>", "<null>", "<sample:4>", "<sample:8>", "2147483648null"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:3>", "<sample:9>", "b{0}"}, false, 15, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,java.lang.String", "<sample:2>", "<sample:6>", "TITLE"}, {"com.google.javascript.jscomp.TypeValidator", "setShouldReport", "boolean", "false"}, {"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:13>", "<sample:1>", "<sample:7>", "<sample:2>", "<sample:3>", "2147467202"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:0>", "<sample:6>", "<null>", "b"}, false, 16, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,java.lang.String", "<sample:2>", "<sample:6>", "TITLE"}, {"com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,java.lang.String", "<sample:5>", "<sample:0>", "E, "}, {"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:13>", "<sample:1>", "<sample:7>", "<sample:2>", "<sample:3>", "-2147467202"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<sample:4>", "<sample:10>", "<sample:10>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.jscomp.CompilerInput", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"1.5f", "<sample:4>", "<sample:3>", "<sample:3>", "<null>", "null", "<sample:3>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:0>", "<sample:5>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:4>", "<sample:2>", "<sample:10>", "1L"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:6>", "<null>", "<sample:9>", "2147483,c8"}, {"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:13>", "<sample:5>", "<sample:11>", "restricted indey type"}, {"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:5>", "<sample:1>", "<sample:7>", "<sample:2>", "<sample:1>", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:4>", "<sample:4>", "<sample:10>", ""}, false, 12, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:6>", "<null>", "<sample:9>", "2147483,c8"}, {"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:13>", "<sample:5>", "<sample:11>", "restricted indey type"}, {"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:5>", "<sample:1>", "<sample:7>", "<sample:2>", "<sample:1>", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanOverride", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>", "<sample:7>", "<sample:8>", "<sample:7>", "JSC_DUP_VAR_DECLARATION", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:6>", "<sample:3>", "<sample:11>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:7>", "<sample:4>", "i"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:2>", "<null>", "<sample:2>"}, {"com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,java.lang.String", "<sample:13>", "<sample:5>", "a+b,)"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:13>", "<sample:3>", "<sample:9>", "a,b,", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:0>", "<sample:3>", "<sample:9>", "a,b,", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<null>", "<sample:4>", "<sample:0>", "0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<sample:9>", "<sample:0>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<sample:13>", "<sample:0>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.jscomp.CompilerInput", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"-1.4(D", "<sample:7>", "<sample:5>", "<null>", "<sample:1>", "--1", "<sample:11>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var null{null} {getInputName=<non-file>, getName=null, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=!NullPointerException, isLocal=!NullPointerException, isN...#236#918273423", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:1>", "<sample:5>", "<sample:13>", "TTLE"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:2>", "<sample:5>", "<sample:1>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:5>", "<sample:1>", "<sample:7>", "<sample:1>", "<sample:2>", "-1073741791"}, {"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:1>", "<sample:1>", "<sample:1>", "1.1134567890123456"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:4>", "<sample:5>", "<sample:1>", "<sample:6>", "<sample:7>", "010"}}), new String[][]{{"add", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false), new String[][]{{"addAll", "java.util.Collection", "3"}, {"contains", "java.lang.Object", "7"}, {"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:9>", "<sample:3>", "<sample:9>", "1E-5"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:7>", "<sample:0>", "<sample:7>", "2020-02-30T25:61:61"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:5>", "<sample:4>", "<sample:10>", "JSC_INVALID_CAST"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:4>", "<sample:8>", "<sample:13>", "gnT/"}, false, 9, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:1>", "<sample:5>", "<sample:0>", "<sample:10>"}, {"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:5>", "<sample:1>", "<sample:7>", "<sample:1>", "<sample:2>", "-1073741791"}, {"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:1>", "<sample:0>", "<sample:1>", "1.1134567890123456"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:9>", "<sample:4>", "<sample:5>", "unknown type: {0}"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:13>", "<sample:6>", "<sample:10>", "<sample:1>", "<null>", "12:30:45"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:2>", "<sample:1>", "<null>", "1E-5"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:6>", "<sample:0>", "<sample:6>", "Title", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:11>", "<sample:7>", "<sample:11>", "JSC_MISSING_EXTENDS_TAG", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:11>", "<sample:7>", "<sample:11>", "JSC_MISSING_EXTENDS_TAG", "<sample:6>"}}), new String[][]{{"indexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:4>", "<sample:0>", "1.1134567890123456"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:3>", "true"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:0>", "<sample:3>", "<sample:4>", "0x1F"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}, {"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:7>", "<sample:8>", "0xFFFFFFFF", "<sample:13>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<sample:2>", "<sample:3>", "<sample:0>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:9>", "<sample:7>", "<sample:2>", "<sample:11>"}, {"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<sample:4>", "<sample:4>", "a", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,java.lang.String", "<null>", "<sample:5>", "+1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:11>", "<sample:5>", "<sample:8>", "1"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:5>", "<sample:3>", "<sample:3>", "2147483648"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:0>", "<sample:2>", "<sample:4>", "<sample:1>", "unknown type: {0}", "<sample:5>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:3>", "<sample:5>", "<sample:13>", "<sample:11>", "."}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<null>", "<sample:7>", "<sample:11>", "<sample:10>", "-1.4(D"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,java.lang.String", "<sample:9>", "<sample:1>", " 3o9f8c-0.0"}, {"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:0>", "<sample:7>", "a,b,c"}, {"com.google.javascript.jscomp.TypeValidator", "setShouldReport", "boolean", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:9>", "<sample:4>", "<null>", "<sample:2>", "<sample:1>", "-2147483648"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "1.5f", "<sample:6>", "<sample:4>", "<sample:4>", "<sample:0>", "TTLE", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:9>", "<sample:6>", "<sample:11>", "<sample:2>", "<sample:6>", "-2147483648"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:6>", "<sample:3>", "<sample:4>", "<sample:6>", "TITLE"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:6>", "<sample:5>", "<null>", "<sample:13>", "<sample:5>", "b{0}"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:9>", "<sample:6>", "<sample:3>", "<sample:15>", "<sample:6>", "2147483647"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:6>", "<sample:5>", "<null>", "<sample:13>", "<sample:5>", "b{0}"}, {"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<null>", "<sample:1>", "<sample:11>", "."}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:9>", "<sample:5>", "<sample:3>", "<sample:7>", "<sample:1>", "1073741823"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:6>", "<sample:5>", "<null>", "<sample:13>", "<sample:5>", "b{1~"}, {"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<null>", "<sample:1>", "<sample:10>", "."}, {"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:5>", "<sample:7>", "<sample:6>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:13>", "<sample:1>", "<sample:4>", "<sample:4>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:13>", "<null>", "<sample:10>", "<null>", "<null>", "<sample:4>"}, {"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}, {"com.google.javascript.jscomp.TypeValidator", "expectNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:7>", "<sample:1>", "<sample:15>", "a+b,)"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:1>", "<sample:7>", "<null>", " 3o9f c-0.0"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:13>", "<sample:2>", "<sample:15>", "{0}"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:15>", "<sample:0>", "<sample:8>", "<sample:6>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:5>", "<sample:1>", "<sample:5>", "<sample:3>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:2>", "<sample:6>", "<sample:3>", "<sample:4>", "<sample:2>", " of "}, {"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "JSC_MISSING_EXTENDS_TAG", "<sample:0>", "<null>", "<sample:0>", "<sample:3>", "JSC_DUP_VAR_DECLARATION", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:9>", "<sample:3>", "<sample:10>", "<sample:3>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "JSC_MISSING_EXTENDT_T6G", "<sample:0>", "<null>", "<sample:0>", "<sample:4>", "JSC_DUP_VAR_DECLARATION", "<sample:7>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:0>", "false"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<null>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:13>", "<null>", "<sample:9>", " of "}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<null>", "<sample:13>", "<sample:13>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:2>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:3>", "<sample:2>", "<sample:9>", " of "}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:5>", "false"}, false, 10, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:5>", "true"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:4>", "<sample:5>", "<sample:7>", "<sample:13>", "<sample:6>", "1L"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectString", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:5>", "<sample:3>", "a+b,)"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:6>", "<sample:4>", "<null>", "<sample:13>", "<sample:1>", ""}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:3>", "<sample:0>", "0x1F", "<sample:5>"}, {"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:6>", "<sample:6>", "<sample:0>", "array access"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:3>", "<sample:3>", "<sample:3>", "<sample:12>", "<sample:0>", "P"}, false, 14, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:3>", "<sample:5>", "0x1F", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<null>", "<sample:4>", "<sample:8>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:1>", "<null>", "<sample:3>", "<sample:13>", "<sample:3>", "2147467202"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<null>", "<sample:0>", "<sample:7>", "1.25"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:0>", "<sample:0>", "<sample:3>", ";32012:A30[:361.12345678"}, false, 14, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:4>", "<sample:5>", "<sample:6>", "<sample:8>", "<sample:6>", "2147483586"}, {"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:2>", "<sample:13>", "<null>"}, {"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:1>", "<sample:6>", "<sample:2>", "<sample:13>", "<sample:1>", "-2147483648"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:0>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<sample:6>", "<sample:3>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<null>", "<sample:3>", "restricted index type"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,java.lang.String", "<sample:0>", "<sample:5>", "1.25"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanOverride", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>", "<null>", "<null>", "<sample:1>", "TTLE", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:2>", "<sample:1>", "<sample:0>", "<null>", "123456789012345678901234567890"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<sample:5>", "<sample:1>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>", "<sample:5>", "<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:7>", "<sample:2>", "<sample:3>", "1.1234567"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:4>", "<sample:1>", "<sample:7>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:4>", "<sample:8>", "<sample:12>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:0>", "true"}, {"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:3>", "<sample:2>", "<sample:2>", "<sample:13>", "<sample:1>", "-2147483648"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:1>", "<sample:3>", "<sample:1>", "<sample:5>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:7>", "<sample:5>", "<sample:7>", "<sample:6>"}, {"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:1>", "<sample:0>", "<sample:4>"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:0>", "<sample:5>", "<sample:2>", "<sample:1>", "<sample:4>", "n1"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanOverride", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<sample:1>", "<null>", "<sample:1>", "1\re00null", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:11>", "<sample:4>", "<sample:4>", "123456789012345678901234567890"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanOverride", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<sample:2>", "<sample:6>", "<sample:1>", "1\re000null", "<sample:4>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:11>", "<sample:4>", "<sample:4>", "12346789012345678901234567890"}, {"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>", "<sample:5>", "<sample:4>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:6>", "<sample:0>", "<sample:5>", "<sample:13>", "1.12345678"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:6>", "<sample:5>", "<sample:1>", "<null>", "<sample:1>", " "}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:11>", "<sample:6>", "<sample:5>", "function"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,java.lang.String", "<sample:2>", "<sample:0>", "abc"}}), new String[][]{{"indexOf", "java.lang.Object", "0"}, {"subList", "int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:6>", "<sample:4>", "<sample:4>", "0xFFFFFFFF"}}, 1), new String[][]{{"remove", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:5>", "<sample:3>", "<sample:4>", "0xFFFFFFFF"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:5>", "<sample:4>", "<sample:4>", "0xF1FFFFFFF"}}, 1), new String[][]{{"addAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 17, new String[][]{}, 2), new String[][]{{"add", "int,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectString", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:0>", "<null>", "Title"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}, {"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:7>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectString", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:5>", "<sample:3>", "<sample:14>", "Thtlea,b,c"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>", "<null>", "<sample:11>", "<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:7>", "<sample:1>", "<sample:5>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.jscomp.CompilerInput", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"1.12345678", "<sample:3>", "<null>", "<sample:3>", "<sample:3>", "1E-5", "<sample:15>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<sample:3>", "<sample:4>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:13>", "<sample:5>", "<sample:7>", "<sample:4>", ")"}, {"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}, {"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:0>", "<sample:4>", "<null>", "1E-5"}}, 3), new String[][]{{"addAll", "java.util.Collection", "4"}, {"add", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:13>", "<sample:5>", "<sample:7>", "<sample:9>", ")"}, {"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}, {"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:0>", "<sample:4>", "<null>", "1E-5"}}, 3), new String[][]{{"addAll", "java.util.Collection", "4"}, {"clear", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"addAll", "java.util.Collection", "0"}, {"indexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:12>", "<sample:6>", "<sample:1>", "", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:3>", "<sample:9>", "<sample:8>", "property access", "<sample:16>"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:5>", "<sample:1>", "<sample:10>", "1.1234567"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>", "<sample:4>", "<null>", "tue", "<sample:15>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:13>", "<sample:6>", "<sample:15>", "1.12345678"}, {"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:2>", "<sample:4>", "<sample:15>", "<sample:11>", "<sample:3>", "-1"}, {"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:5>", "<sample:3>", "<sample:3>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:2>", "<sample:1>", "<sample:5>", "<sample:2>", "<sample:0>", "10"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:3>", "<sample:3>", "<sample:2>", "<sample:2>", "<sample:2>", "-1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:7>", "<sample:4>", "null"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:1>", "<sample:4>", "<sample:8>", "<sample:2>", "<sample:6>", "46"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<null>", "<sample:7>", "<sample:10>", "a"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:0>", "<sample:3>", "<sample:6>", "a,b,", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"remove", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>", "<sample:7>", "<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false), new String[][]{{"addAll", "java.util.Collection", "6"}, {"contains", "java.lang.Object", "4"}, {"contains", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "setShouldReport", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<null>", "<sample:8>", "<sample:1>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:7>", "<sample:10>", "1.5"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:1>", "<sample:0>", "010"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:1>", "<null>", "<sample:4>", "<null>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<null>", "<sample:4>", "<null>", "<sample:13>", "<sample:2>", "JSC_UNKNOWN_TYPEOF_VALUE"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:13>", "<sample:2>", "<sample:9>", "<sample:13>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:4>", "<sample:3>", "<sample:13>", ""}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<sample:10>", "<sample:4>", "<sample:2>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "setShouldReport", "boolean", "false"}, {"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:0>", "<sample:5>", "<sample:15>", "i"}, {"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:12>", "<sample:7>", "<sample:10>", "<sample:5>", "<sample:3>", "2147483630"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<sample:10>", "<sample:3>", "<sample:2>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "setShouldReport", "boolean", "false"}, {"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:12>", "<sample:7>", "<sample:10>", "<sample:5>", "<sample:3>", "2147483630"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>", "<sample:13>", "<sample:3>", "<sample:2>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:12>", "<sample:7>", "<sample:10>", "<sample:5>", "<sample:3>", "2147483630"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.jscomp.CompilerInput", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"{0}", "<sample:7>", "<sample:2>", "<sample:5>", "<sample:3>", "unknown type: {0}", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "0", "<sample:6>", "<sample:0>", "<sample:1>", "<sample:7>", "1.25", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var null{null} {getInputName=<non-file>, getName=null, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=!NullPointerException, isLocal=!NullPointerException, isN...#236#918273423", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<null>", "<sample:1>", " 3o9f8c-0.0"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "0x123456789", "<sample:2>", "<sample:0>", "<sample:5>", "<sample:0>", "JSC_UNKNOWN_TYPEOF_VALUE", "<null>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>", "<sample:13>", "<sample:15>", "<sample:2>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:8>", "<sample:7>", "<sample:10>", "<sample:5>", "<sample:3>", "-2147483648"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:6>", "<sample:6>", "<sample:10>", "<sample:10>", "1e10"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:14>", "<sample:0>", "<sample:1>", "<sample:3>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:11>", "<sample:4>", "<sample:8>", ", "}, {"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:12>", "<sample:6>", "<sample:10>", "<sample:7>", "<sample:5>", "-1073741824"}, {"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:4>", "<sample:10>", "<sample:2>", "2020-02-30T25;61:61"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:5>", "<null>", "<sample:8>", "<sample:13>", "ii"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:10>", "<sample:7>", "<sample:7>", "1.2"}, false, 8, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:10>", "true"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<null>", "<sample:5>", "<sample:5>", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:2>", "<sample:7>", "<null>", " 3o9f b-y.0JSCfUNKNOWN_TYPEOF_VALUE"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:6>", "true"}, {"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:9>", "<sample:10>", "<sample:8>", "1.25"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:9>", "<sample:4>", "<null>", "a,b,"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:0>", "<sample:4>", "<sample:6>", "<sample:7>", "'[]'"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<null>", "<sample:5>", "<sample:0>", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:0>", "<sample:4>", "<sample:6>", "<sample:0>", "'[^'"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<null>", "true"}, {"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<null>", "<sample:5>", "<sample:0>", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:4>", "<sample:3>", "<sample:1>", "Xa,b,a,x,"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<sample:2>", "<sample:1>", "<sample:2>"}, {"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:1>", "<sample:3>", "<sample:11>", "{0}"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>", "<sample:1>", "<sample:15>", "<sample:9>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:6>", "<sample:2>", "JSC_TYPE_MISMATCH"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.jscomp.CompilerInput", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"(", "<sample:6>", "<null>", "<sample:6>", "<sample:3>", "-1.4(D", "<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
