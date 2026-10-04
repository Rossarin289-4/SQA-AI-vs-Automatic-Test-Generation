package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:4>", "<sample:3>", "+(1"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:1>", "<sample:4>", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:6>", "true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanOverride", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<sample:5>", "<sample:6>", "<sample:4>", "JC_MISSING_EXTENDS_TA", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:7>", "<sample:3>", "<sample:3>", "Hello, World"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:5>", "<sample:3>", "<sample:3>", "struct1.25"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:2>", "<null>", "<sample:2>", "<sample:0>", "JSSC_INVALID_CASTa"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:6>", "<sample:3>", "<sample:4>", "<sample:2>", "<sample:0>", "5."}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<sample:0>", "<sample:1>", "<sample:6>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<sample:7>", "<sample:5>", "<sample:4>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:0>", "<sample:3>", "<sample:0>", "<sample:4>", "dupliate"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:3>", "<sample:5>", "<sample:10>", "1.5ddu", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:8>", "<sample:2>", "<sample:3>", "25020-01-01"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:6>", "<sample:4>", "<sample:0>", "<sample:8>", "<sample:5>", "-1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:5>", "false"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:9>", "<sample:3>", "<sample:2>", "YI"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectString", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:5>", "<sample:3>", "<null>", "a,b,c"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<null>", "<sample:4>", "<sample:6>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<sample:3>", "<sample:4>", "<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:3>", "<sample:9>", "<sample:4>", "<sample:11>", "<sample:6>", "1073741823"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanOverride", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:3>", "<sample:10>", "<sample:6>", "-< of ", "<sample:2>"}, false, 5, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:4>", "<sample:10>", "<sample:2>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<sample:11>", "<sample:6>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:0>", "<sample:0>", "<sample:3>", "0x123456789"}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:0>", "<sample:10>", "1.0234567"}, false, 3, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanOverride", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<sample:7>", "<sample:3>", "<sample:10>", "\037", "<sample:6>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:4>", "<sample:13>", "<sample:7>", "<sample:6>"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:6>", "<sample:3>", "<sample:2>", "1.d", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:3>", "<sample:8>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<sample:10>", "<sample:7>", "2020-02-30T25:51:61function", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:15>", "<sample:5>", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:4>", "<sample:0>", "<sample:10>", "<sample:7>", "<sample:2>", "2147483647"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:3>", "<sample:4>", "<sample:0>", "5-struct"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:3>", "<sample:7>", "1.251"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:9>", "<sample:6>", "<sample:5>", "<sample:7>", "<sample:7>", "1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:2>", "false"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "setShouldReport", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<sample:8>", "<sample:9>", "<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:8>", "<sample:1>", "<sample:2>", "-0.02020-02-30T25:61:61"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<null>", "<sample:4>", "<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}, {"com.google.javascript.jscomp.TypeValidator", "setShouldReport", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "setShouldReport", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectString", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:15>", "<sample:1>", "D1.0234567"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:3>", "<sample:13>", "<sample:0>", "<sample:3>", "nmull"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<sample:8>", "<sample:6>", "<sample:7>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:9>", "<sample:13>", "<sample:3>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:7>", "<sample:7>", "<sample:2>", "<sample:8>", "<sample:6>", "'_]'"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:9>", "<sample:2>", "<sample:8>", "function"}, {"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:5>", "<sample:6>", ")", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "setShouldReport", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "b(1", "<sample:5>", "<sample:2>", "<sample:3>", "<null>", "/", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:7>", "<sample:3>", "PT1H"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:10>", "<sample:7>", "<sample:5>", "<sample:6>", "<sample:15>", "`"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:8>", "<sample:10>", "<sample:1>", "<sample:6>", "<sample:5>", "resricted index typ,"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:0>", "<sample:4>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:6>", "<sample:4>", "<null>", "<sample:6>", "<sample:12>", "-35"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:9>", "<sample:5>", "<sample:6>", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:12>", "<sample:0>", ""}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:14>", "<sample:0>", "`2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:5>", "<sample:5>", "<sample:7>", "<sample:3>", "<sample:12>", "-4"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:2>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<sample:0>", "<sample:3>", "<sample:7>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:3>", "<sample:4>", "<sample:1>", "D2.0234567"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.jscomp.CompilerInput", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"struct125", "<sample:3>", "<sample:3>", "<sample:17>", "<sample:7>", "JC_MISSIMG_EXTENDS_TA", "<sample:10>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:3>", "<sample:5>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var null{null} {getInputName=<non-file>, getName=null, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=!NullPointerException, isLocal=!NullPointerException, isN...#236#918273423", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:4>", "<sample:0>", "<sample:6>", "<sample:1>", "<sample:12>", "JJSC_INVALID_CAST"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<sample:3>", "<sample:0>", "<sample:7>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:10>", "<sample:2>", "<sample:1>"}, {"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:1>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:10>", "<sample:2>", "<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:7>", "<sample:6>", "<sample:10>", "2020-02-30T25:61:61"}, {"com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,java.lang.String", "<sample:4>", "<null>", "D1.0234567"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:4>", "<sample:0>", "<sample:5>", "D1.0234567"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:1>", "<sample:2>", "<sample:5>", "1.5e3000"}, {"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "5", "<sample:2>", "<sample:13>", "<sample:7>", "<null>", "Hello\r, World", "<sample:10>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:0>", "<sample:4>", "<sample:9>", "/"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:11>", "<sample:0>", "<sample:9>", "<sample:4>", "property access", "<sample:3>"}, {"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:4>", "<sample:4>", "Hello\r0, World2020-02-30T25:61:61"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:8>", "<sample:0>", "<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:6>", "<sample:2>", "<sample:2>"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:13>", "<sample:0>", "<sample:9>", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:1>", "<sample:0>", ""}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:9>", "<sample:12>", "<sample:3>", "-0.A0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:9>", "<sample:13>", "<sample:6>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:1>", "<sample:14>", "<sample:5>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<sample:6>", "<sample:3>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:5>", "<sample:5>", "<sample:5>", "1E-5"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:10>", "<sample:16>", "<sample:9>", "restricted index type1", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>", "<sample:9>", "<sample:0>", "<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:3>", "<sample:0>", "<sample:3>", "D2.0234567"}, {"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:9>", "<sample:10>", "<sample:6>", "D.0234567"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:2>", "<null>", "<sample:0>", "<sample:10>", "<sample:2>", "-30"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:7>", "<sample:6>", "<sample:8>", "<sample:1>", "<sample:13>", "0"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:2>", "<sample:17>", "<null>", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:10>", "<sample:12>", "<sample:7>", "<sample:0>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:3>", "<sample:3>", "<sample:7>", "JSC_UNKNOWN_TYEOF_VALUE"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectString", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:9>", "<sample:10>", "JSC_TYPE_MIS\rMATCH"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:4>", "<sample:14>", "<sample:4>", "<sample:2>", "<sample:4>", "\036"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:10>", "<sample:6>", "<sample:3>", "<sample:6>", "<sample:5>", "-39"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:1>", "<null>", "<sample:8>", "<sample:8>", "<sample:15>", "1e10"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:3>", "<sample:4>", "<sample:6>"}, {"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:16>", "<sample:3>", "<sample:1>", "1.5e400"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:5>", "<sample:4>", "1.5"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:15>", "<sample:3>", "<sample:6>", "<sample:2>", "assignment to property "}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:7>", "<sample:16>", "<sample:10>", "<null>", "assignment to pr+operty "}, {"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:10>", "<sample:17>", "<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:0>", "<sample:16>", "<null>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:10>", "<sample:3>", "<sample:1>", "1"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:5>", "<sample:12>", "<sample:11>", "5-strucs"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:9>", "<sample:3>", "<null>", ", "}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:1>", "<sample:0>", "<sample:7>", "+1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:8>", "<sample:10>", "<sample:11>", "<sample:10>"}, {"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:9>", "<sample:18>", "<sample:9>", "a,b,c2020-02-30T25:61:61"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:0>", "<sample:6>", "<sample:1>", "<sample:8>", "<sample:1>", "5-s"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:10>", "<sample:3>", "<sample:7>", "<sample:2>", "<sample:0>", "-35"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:5>", "<null>", "<sample:7>", "restricted index type", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanOverride", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:1>", "<sample:11>", "<null>", "(PT1H+1", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:5>", "<sample:1>", "<sample:9>", "nul["}, {"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:10>", "<sample:2>", "<sample:4>", "<sample:2>", "T1tle", "<sample:1>"}}, 3), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:9>", "<sample:15>", "<sample:1>", "<sample:10>", "<sample:16>", "1.15"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:1>", "<sample:15>", "<sample:5>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:3>", "<null>", "<sample:2>", "0.5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>", "<null>", "<sample:5>", "<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:5>", "<sample:11>", "<sample:0>", "<sample:13>", "<sample:7>", "JSC_TYPE_MISMATCH"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.jscomp.CompilerInput", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"bbc", "<sample:1>", "<sample:4>", "<sample:14>", "<sample:8>", "duplicate", "<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var null{null} {getInputName=<non-file>, getName=null, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=!NullPointerException, isLocal=!NullPointerException, isN...#236#918273423", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:8>", "<sample:11>", "<sample:5>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:16>", "<sample:14>", "<sample:0>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.jscomp.CompilerInput", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"Dull0x123456789", "<sample:0>", "<sample:10>", "<sample:6>", "<sample:3>", "1E-", "<sample:2>"}, false, 1, new String[][]{}), new String[][]{{"getInputName", "", "6"}, {"getParentNode", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:12>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:1>", "<sample:16>", "<sample:0>", "'", "<sample:11>"}, {"com.google.javascript.jscomp.TypeValidator", "expectNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:9>", "<sample:11>", "<sample:3>", "5-stucs"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.jscomp.CompilerInput", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"trve", "<sample:4>", "<sample:5>", "<sample:9>", "<sample:1>", "property access..", "<sample:10>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:3>", "<sample:4>", "<sample:0>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var null{null} {getInputName=<non-file>, getName=null, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=!NullPointerException, isLocal=!NullPointerException, isN...#236#918273423", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectString", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:16>", "<sample:3>", "<sample:7>", "+1"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "setShouldReport", "boolean", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "setShouldReport", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:15>", "true"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:9>", "<sample:9>", "<sample:7>", "<sample:7>", "<sample:6>", "-6"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:5>", "<sample:12>", "<sample:1>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:5>", "<null>", "<sample:3>", "strut"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:11>", "<sample:1>", "<sample:3>", "<sample:12>", "1.12345679", "<sample:5>"}, {"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:5>", "<sample:3>", "-1", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanOverride", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<sample:16>", "<sample:3>", "<sample:11>", "function", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<null>", "<sample:9>", "<sample:3>", "<sample:9>", "<sample:4>", "1"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>", "<sample:6>", "<sample:6>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:10>", "<sample:10>", "<sample:3>", "2020-01-0u"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<sample:5>", "<sample:11>", "<null>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "1-5", "<sample:5>", "<sample:17>", "<sample:14>", "<sample:2>", "1.12345671.1234567890123456JSC_INVALID_CAST", "<sample:4>"}, {"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:18>", "<sample:14>", "<sample:2>", "abbc1.12345678"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:13>", "<sample:7>", "<sample:6>", "Uitle"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:14>", "<sample:10>", "<sample:5>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:11>", "<sample:3>", "<sample:7>", "<sample:8>", "'[]'1.5e300"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<null>", "<sample:0>", "<sample:2>", "<sample:12>", "<sample:8>", "1.123456789012356"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:1>", "<sample:4>", "<sample:5>", "<sample:3>", "<sample:9>", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:18>", "<sample:14>", "<sample:7>", "0ux12345679"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,java.lang.String", "<sample:7>", "<sample:17>", "1E-5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:11>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:4>", "<null>", "<sample:8>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:10>", "<sample:3>", "<sample:10>", "'[]'"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false), new String[][]{{"set", "int,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.jscomp.CompilerInput", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"/", "<sample:2>", "<sample:9>", "<sample:0>", "<sample:3>", ".12345678", "<sample:9>"}, false), new String[][]{{"isGlobal", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:4>", "<sample:9>", "<null>", "Title"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<sample:16>", "<sample:17>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeValidator", "expectNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:1>", "<sample:14>", "<sample:4>", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:3>", "<sample:11>", "resricted\037ndex typ,"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:5>", "<sample:1>", "<sample:3>", "JSCTYPE_MISMATCH"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<null>", "<sample:5>", "<sample:0>", "Hello\r0, World2020-02-30T25:61:611.5e300"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:9>", "<sample:17>", "<sample:10>", "D1.0234567"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:10>", "<sample:2>", "<sample:4>", ".5e3000"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:6>", "<null>", "<sample:5>", "<sample:9>", "<sample:8>", "1e10"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:0>", "<sample:17>", "<sample:8>", "<sample:2>", ".", "<sample:8>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:8>", "<sample:5>", "<sample:11>", "<sample:4>", "<sample:9>", "0x123456789"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:16>", "<sample:0>", "<sample:0>", "a", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:2>", "<sample:7>", "<sample:0>", "\n1"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:7>", "<sample:17>", "<sample:4>", "'_]'"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>", "<sample:13>", "<sample:12>", "<sample:4>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:0>", "<sample:6>", "<sample:6>", "--1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:9>", "<null>", "<sample:1>", "<sample:7>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:1>", "<sample:10>", "<sample:12>", "2020-L02-30T25:51:61function-1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:1>", "<sample:1>", "<sample:4>", "01.5e30y0"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:8>", "<sample:2>", "Hello\r0, World2020-028-30T25:61:61", "<sample:10>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:0>", "<sample:3>", "<sample:8>", "JSC_UNKNOWN_TYPDOF_VALUE", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<null>", "<sample:10>", "rJSSC_INV@LID_CASTa"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<sample:5>", "<sample:13>", "<sample:2>"}, {"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:9>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:8>", "<sample:4>", "<sample:11>", "c(1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "setShouldReport", "boolean", "false"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:9>", "<sample:1>", "<sample:10>", "JSC_AUP_VAR_DECLARATJON"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "-1", "<null>", "<sample:6>", "<sample:11>", "<sample:1>", "2520-01-01", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<sample:5>", "<sample:12>", "<sample:1>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:15>", "<sample:11>", "<sample:8>", "<sample:8>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:4>", "<sample:16>", "<sample:1>", "<sample:6>", "<null>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:4>", "<sample:7>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:16>", "<sample:11>", "<sample:13>", "JSC_MISSING_EXTENDS_TAG"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:16>", "<sample:2>", "<null>", "0xFFFFEFFF"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,java.lang.String", "<null>", "<sample:5>", "null"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:12>", "<sample:4>", "<sample:7>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:5>", "<sample:16>", "<sample:9>", "Helko\r0, World3020-02-30T25:61:61"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "setShouldReport", "boolean", "false"}, {"com.google.javascript.jscomp.TypeValidator", "expectNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:5>", "<sample:4>", "<sample:12>", "JSC_UNKNOWN_TYPEOF_VALUE"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:11>", "<sample:9>", "<sample:1>", "<sample:2>", "<sample:11>", "-1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:14>", "<sample:13>", "<sample:12>", "<sample:1>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:2>", "<sample:7>", "<sample:8>", "<sample:9>", "1.12345678901234567"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:7>", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<sample:13>", "<sample:1>", "<sample:4>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:5>", "<sample:3>", "<sample:0>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:4>", "<sample:9>", "<sample:1>", "<sample:7>", "<sample:2>", ")"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<sample:12>", "<sample:3>", "<sample:14>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:4>", "<sample:14>", "<sample:4>", "<sample:11>"}, {"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:13>", "<sample:16>", "<sample:9>", "'[^'", "<sample:8>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:12>", "<sample:2>", "<sample:12>", "<sample:11>", "<sample:1>", "1e10restricted index type"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:10>", "<sample:5>", "<sample:1>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:11>", "<sample:11>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:8>", "<sample:2>", "<sample:4>", "Hello, orld"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:10>", "<sample:13>", "<sample:6>", "\n0x1F"}, {"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:12>", "<sample:10>", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>", "<sample:0>", "<sample:13>", "<sample:7>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:15>", "<sample:11>", "<sample:4>", "D.023456"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:13>", "<sample:13>", "<sample:8>", "<sample:13>", "11E-5"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:11>", "<sample:9>", "<sample:11>", "1.5e3f000", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:11>", "<sample:8>", "<sample:0>", "<sample:7>", "<sample:15>", "1.5e3001"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:15>", "<sample:3>", "<sample:1>", "Hello\r0, World2020-02-30T25:61:61"}, {"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<sample:4>", "<sample:10>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:2>", "<sample:7>", "0x1G"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<sample:12>", "<sample:6>", "<sample:12>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:0>", "<sample:11>", "<sample:8>", "<sample:11>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:0>", "<sample:14>", "<sample:6>", "1234567890123567890123456890"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:5>", "<sample:6>", "<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:4>", "<sample:3>", "<sample:13>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:14>", "<sample:7>", "<sample:10>", "1.5e30L00JSC_TYPE_MISMATCH"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:14>", "<sample:17>", "<sample:9>", "<sample:8>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:5>", "<sample:0>", ".25"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:0>", "<sample:1>", "<sample:8>", "<sample:10>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:13>", "<sample:16>", "<sample:13>", "<sample:8>", "<sample:12>", "1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:16>", "<sample:12>", "<sample:13>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:8>", "<sample:5>", "<sample:13>", "<sample:9>", "1.123456789012345671.25"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<null>", "<sample:16>", "`-0.0"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:7>", "<sample:16>", "<sample:8>", "PT]"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<sample:1>", "<sample:7>", "<sample:6>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:0>", "<sample:6>", "<sample:8>", "", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>", "<sample:9>", "<sample:6>", "+1JSC_TYPE_MISMATCH", "<sample:3>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:11>", "<sample:1>", "<sample:2>", "0x1F"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false), new String[][]{{"remove", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanOverride", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<sample:5>", "<sample:14>", "<sample:4>", "-0/0", "<sample:10>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:4>", "<sample:10>", "<sample:8>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"remove", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:17>", "<sample:11>", "1."}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:16>", "<sample:12>", "<sample:5>", "<sample:3>", "11E-5"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectString", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:16>", "<sample:1>", "<sample:3>", "0uE-5"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:11>", "<sample:8>", "<sample:8>", "strut+1"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:13>", "true"}, {"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:11>", "<sample:0>", "<sample:0>", "Hello,aWorld"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:12>", "<sample:12>", "function214748368", "<sample:2>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:10>", "false"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:4>", "<sample:15>", "<sample:2>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:8>", "<sample:0>", "<sample:6>", "1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:6>", "<sample:8>", "<null>", "array access"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<sample:17>", "<sample:8>", "1.5e300duplicateHello, World", "<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<null>", "<sample:9>", "<sample:7>", "<sample:9>"}, {"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:3>", "<sample:1>", "<sample:1>", "1.2"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"removeAll", "java.util.Collection", "1"}, {"removeAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:5>", "<sample:12>", "<sample:1>", "1.5e44I0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:2>", "<sample:0>", "<sample:5>", "1L"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>", "<null>", "<sample:7>", "<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:16>", "<sample:16>", "<sample:2>", "<sample:1>", "12345678901234567 8901234567890", "<sample:1>"}, {"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<sample:11>", "<sample:6>", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:4>", "<sample:11>", "<sample:2>", "<sample:5>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.jscomp.CompilerInput", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"5-strucsI", "<sample:2>", "<sample:13>", "<sample:1>", "<sample:5>", "21S47483648", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:8>", "<sample:3>", "<sample:10>", "5.+1"}, {"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<sample:4>", "<sample:4>", "<sample:2>"}}), new String[][]{{"getInputName", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<non-file>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:13>", "<sample:16>", "<sample:15>", "<sample:2>"}}, 1), new String[][]{{"indexOf", "java.lang.Object", "1"}, {"addAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectString", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:14>", "<sample:1>", "<sample:10>", "0nxFFFFFFEF"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:7>", "<sample:11>", "<sample:5>", "<sample:4>"}, {"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:8>", "<sample:9>", "<sample:0>", "1E-5property access"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:0>", "<sample:2>", "<sample:1>", "Hello\r, World"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:1>", "<sample:12>", "<sample:0>", "<sample:9>", "b(1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:1>", "<sample:15>", "<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:1>", "<sample:15>", "<sample:2>", "1.25"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:2>", "<sample:5>", "<sample:4>", "<sample:5>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,java.lang.String", "<sample:6>", "<sample:3>", "1.1234567"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:13>", "<sample:10>", "<sample:3>", "<sample:7>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,java.lang.String", "<sample:0>", "<sample:14>", "-1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:4>", "<sample:5>", "<sample:0>", "<sample:11>", "<sample:7>", "5"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:13>", "<sample:5>", "<sample:0>", "<sample:7>", "<sample:5>", "\n"}, {"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:3>", "<sample:16>", "<sample:6>", "<sample:5>", "<sample:9>", "0"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:1>", "<sample:7>", "restricted index tyXe"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:6>", "<sample:10>", "function"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<sample:0>", "<sample:7>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:10>", "<sample:5>", "<sample:7>", "<sample:0>"}, {"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectString", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:11>", "<sample:16>", "<sample:7>", "dubliate"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:0>", "<sample:14>", "<sample:8>", "<sample:8>", "D2.234567"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:10>", "<sample:14>", "<sample:3>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<null>", "<sample:6>", "<sample:13>", "1.J"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:11>", "<sample:8>", "<sample:12>", ">0}"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:10>", "<sample:10>", "<sample:7>", "1.Vf"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:16>", "<sample:19>", "<sample:2>", "1.l255"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanOverride", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>", "<sample:12>", "<sample:8>", "<sample:4>", "1.12334567890123456", "<sample:12>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:11>", "<sample:3>", "<sample:9>", "array acicess", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanOverride", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<sample:5>", "<sample:12>", "<sample:2>", "acc", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:13>", "<sample:11>", "<sample:2>", "0x1F "}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "setShouldReport", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:6>", "<sample:12>", "<sample:4>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:3>", "<sample:17>", "<sample:7>", "restricted index type1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "setShouldReport", "boolean", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:1>", "false"}}, 3), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<null>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:16>", "<sample:0>", "<sample:6>", "11E-5+1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:13>", "<sample:10>", "<sample:12>", "<sample:9>", "<sample:13>", "2147483647"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:2>", "false"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:11>", "<sample:14>", "<sample:7>", "/"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:3>", "<sample:17>", "<sample:4>", "1.d"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanOverride", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:10>", "<sample:2>", "<sample:14>", "<sample:12>", "1.5e3f001", "<sample:10>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:8>", "<sample:5>", "<null>", "<sample:10>"}, {"com.google.javascript.jscomp.TypeValidator", "expectNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:0>", "<sample:3>", "<sample:1>", "1"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:7>", "<sample:8>", "<sample:5>", "<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:9>", "<sample:3>", "<null>", "1230:45"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:14>", "<sample:13>", "<sample:8>", "0x123456789l", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:10>", "<sample:11>", "<sample:9>", "-o1"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:9>", "<sample:2>", "<sample:15>", "`"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:11>", "<sample:0>", "<sample:6>", "<sample:11>", "unlnown type: {0}abc"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:0>", "<sample:16>", "<sample:3>", "Hello\r0, World2020-02-30T25:61:61"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:9>", "<sample:4>", "ISC_INVALID_CAST", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:4>", "<sample:3>", "<sample:3>", "Li"}, {"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:16>", "<sample:10>", "<sample:13>", "1e180"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:9>", "<sample:11>", "<sample:11>", "-"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<null>", "<sample:5>", "<sample:3>", "<sample:4>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:11>", "<sample:17>", "<sample:11>", "<sample:7>", "<sample:14>", "63"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:5>", "<sample:20>", "Hello\r0, World2020-02-30T25:61:61"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectString", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<null>", "<sample:11>", "<sample:4>", "25020E01-/1"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:9>", "<sample:10>", "<sample:5>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "00", "<sample:2>", "<sample:9>", "<sample:2>", "<sample:1>", ", array access", "<sample:2>"}, {"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:10>", "<sample:9>", "<sample:15>", "<sample:4>"}}, 3), new String[][]{{"ensureCapacity", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<null>", "<sample:7>", "<sample:8>", "<sample:4>"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:8>", "<null>", "<sample:5>", "<sample:2>", "`"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(function (new:0, *=, *=, *=): 0, boolean)]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:16>", "<sample:0>", "<sample:7>", "1e10", "<sample:7>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:13>", "<sample:1>", "<sample:15>", "<sample:8>", "JSC_TYPE_MISMATCH", "<sample:13>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:10>", "<sample:4>", "122456789012345678901234567890"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:3>", "<sample:9>", "<sample:0>", "1.0234567"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:9>", "<sample:3>", "<sample:11>", "<sample:4>", "1.1234577890123456"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<sample:9>", "<sample:8>", "<sample:1>"}}), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:0>", "<sample:8>", "<sample:10>", "<sample:7>", "(array access"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:10>", "<sample:2>", "<sample:6>", "<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:9>", "<sample:14>", "<sample:5>", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<sample:3>", "<sample:6>", "<sample:9>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:10>", "<sample:7>", "<sample:4>", "struct"}, {"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "", "<sample:0>", "<sample:4>", "<sample:17>", "<sample:0>", "-", "<sample:12>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,java.lang.String", "<sample:13>", "<sample:6>", "1E-5"}}, 3), new String[][]{{"remove", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:15>", "<sample:15>", "<sample:5>", "<sample:3>", "duplicate123456789012345678901234567890JSC_UNKNOWN_TYPEOF_VALUE"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:13>", "<sample:0>", "<sample:16>", "1.12345678"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<null>", "<sample:4>", "duplicate"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<sample:13>", "<sample:8>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:3>", "<sample:8>", "<sample:7>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:11>", "<sample:7>", "<sample:8>", "-M2"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:11>", "<sample:9>", "<sample:0>", "1EJ-5"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "setShouldReport", "boolean", "false"}, {"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:3>", "<sample:12>", "1L"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<null>", "<sample:6>", "<sample:13>", "L"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<sample:10>", "<sample:12>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "setShouldReport", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:3>", "<sample:4>", "<sample:18>"}, {"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "function", "<null>", "<sample:1>", "<sample:17>", "<sample:2>", "I", "<null>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:9>", "<sample:7>", ""}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<null>", "<sample:5>", "<sample:12>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:9>", "<sample:12>", "<sample:12>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<null>", "false"}, {"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:16>", "<sample:1>", "<sample:18>", "2020-01-01.5"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.jscomp.CompilerInput", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"property access", "<sample:4>", "<sample:6>", "<sample:12>", "<sample:0>", "PS1H", "<sample:0>"}, false, 6, new String[][]{}, 3), new String[][]{{"getNameNode", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:10>", "<sample:16>", "<sample:13>", "stquct125"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:13>", "<sample:14>", "<sample:12>", "a,b,c"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,java.lang.String", "<sample:8>", "<sample:14>", "0x22F"}}, 3), new String[][]{{"lastIndexOf", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<sample:11>", "<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:6>", "<sample:5>", "<sample:7>", "1.123456789_012345670xFFFFFFFF"}, {"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:6>", "<sample:11>", "<sample:18>", "JSC_UNKNOWN_TYPEOF_VALUEHello, World"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.jscomp.CompilerInput", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"1c/25", "<sample:3>", "<sample:14>", "<sample:13>", "<null>", "1.11234567", "<sample:9>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<null>", "<sample:5>", "assignment to propert "}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:17>", "<sample:2>", "<sample:11>", "JSC_TYPE_MISMATCH"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.jscomp.CompilerInput", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{" nfe", "<sample:5>", "<sample:15>", "<sample:5>", "<sample:0>", "3array acceYss", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:6>", "<sample:19>", "<sample:4>", " "}}), new String[][]{{"isTypeInferred", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:4>", "<sample:4>", "<sample:21>", ".-1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:12>", "<sample:4>", "<sample:8>", "("}, {"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false), new String[][]{{"addAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:2>", "<sample:11>", "<sample:7>", " "}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:11>", "<sample:16>", "<sample:3>", "<sample:1>"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:10>", "<sample:3>", "<sample:12>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<sample:4>", "<sample:1>", "<null>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:7>", "<sample:9>", "<sample:2>", "1.134567890123456"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>", "<sample:2>", "<sample:4>", "PT1H", "<sample:13>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<sample:2>", "<sample:2>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:10>", "<sample:12>", "<sample:3>", "<sample:7>", "18.5di"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:4>", "<sample:6>", "<sample:0>", ",o1"}, {"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:0>", "<sample:15>", "<sample:2>", "/ "}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:13>", "<sample:14>", "<sample:8>", "<sample:6>", "1.5e3f/0"}, {"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:12>", "<sample:5>", "<sample:7>", "D1.023467"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:16>", "<sample:12>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "setShouldReport", "boolean", "false"}, {"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:7>", "<sample:13>", "1.5e3g000"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.jscomp.CompilerInput", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"dvplicate", "<sample:2>", "<sample:10>", "<sample:6>", "<sample:3>", "1./234567", "<sample:10>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:5>", "<sample:8>", "<sample:11>", "<null>", "ol1"}}, 2), new String[][]{{"getJSDocInfo", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.jscomp.CompilerInput", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"JSC_DUP_VAR_DECLARATION20220-02-30T25:61:61", "<sample:5>", "<sample:14>", "<sample:14>", "<sample:1>", "ab", "<sample:1>"}, false, 0, null, 3), new String[][]{{"isTypeInferred", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<null>", "<sample:11>", "<sample:7>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:7>", "<sample:12>", "<sample:4>", "Dd.0264567"}, {"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:5>", "<sample:17>", "<sample:8>", "Hello\rr0- World2020-02-30T25:61:61"}}, 2), new String[][]{{"add", "int,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:8>", "<sample:15>", "<sample:1>", "<sample:1>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "1.12345678901234561.5f", "<sample:0>", "<sample:1>", "<sample:14>", "<sample:2>", "", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
}
