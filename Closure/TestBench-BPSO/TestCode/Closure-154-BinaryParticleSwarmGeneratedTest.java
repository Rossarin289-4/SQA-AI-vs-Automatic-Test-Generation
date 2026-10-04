package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:0>", "<sample:5>", "<sample:0>", " angtment(s)"}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectString", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:7>", "<sample:9>", "Ti3tle"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:3>", "<sample:0>", "<sample:7>", "assinmentwith requires an object"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:8>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:7>", "<sample:8>", "<sample:7>", "1E.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.TypeCheck", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanOverride", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:0>", "<sample:4>", "<sample:0>", "--0", "<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:9>", "<null>", "<sample:5>", "t"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:1>", "<sample:5>", "<sample:4>", "1E-51e10S"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:7>", "<sample:5>", "<sample:6>", "<sample:3>", "<sample:1>", "10"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:0>", "<sample:6>", "<sample:1>", "<sample:7>", "<sample:1>", "-268435355"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:4>", "<sample:0>", "<sample:4>", "'in' requ_res an object"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "check", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:2>", "true"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "getTypedPercent", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "getTypedPercent", ""}}), new String[][]{{"shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:0>", "<sample:3>", "<sample:8>", "assignment"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:5>", "<sample:5>", "1.1334567"}, false, 3, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanOverride", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:2>", "<sample:2>", "<sample:12>", "1.s334567", "<sample:8>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:11>", "<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "check", "com.google.javascript.rhino.Node,boolean", "<sample:10>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:7>", "<sample:9>", "<sample:6>", "<sample:4>", "<null>", "-1"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "setShouldReport", "boolean", "true"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:5>", "<sample:3>", "<sample:5>", "1.12345667890123456"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:4>", "<sample:6>", "<sample:4>", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:5>", "<null>", "<sample:11>", "2020-01-11"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:9>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:2>", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:2>", "<sample:2>", "<sample:8>", "<sample:0>", "<sample:9>", "12:30a5"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<sample:5>", "<sample:0>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:3>", "<sample:4>", "<sample:6>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<sample:3>", "<null>", "<null>"}, {"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:2>", "<sample:3>", "<sample:12>", "<null>", "<sample:6>", "25"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visitName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:12>", "<sample:5>", "<sample:9>"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "getTypedPercent", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<sample:2>", "<sample:11>", "20020-01-11", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "processForTesting", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:2>", "<sample:5>", "<null>", "20200,02-30T25:61:61"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:1>", "<null>", "1.1234567890123456", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanOverride", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>", "<sample:2>", "<sample:0>", "<sample:6>", ".5z", "<sample:6>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:7>", "<sample:0>", "<sample:5>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:3>", "<sample:7>", "<sample:11>", "JSC_BAD_DELETE_OPERAND'in' requires an object"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<sample:4>", "<sample:2>", "<sample:0>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:5>", "<sample:2>", "<sample:6>", ""}, false, 2, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:0>", "<sample:9>", "<null>", "<sample:1>", "JIB_BAD_DELETE_OPERAND"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:1>", "<sample:4>", "<sample:9>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "getTypedPercent", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:7>", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:0>", "<sample:3>", "<sample:1>", "<sample:6>", "<sample:1>", "2147483648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visitName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:8>", "<sample:5>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<null>", "<sample:2>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:7>", "<sample:7>", "<sample:3>", "<sample:11>", "<sample:6>", ", or "}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<sample:3>", "<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:3>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:6>", "<sample:6>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:2>"}, {"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:12>", "<sample:7>", "<sample:2>", "20020-01-111"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:5>", "<sample:5>", "<sample:7>", " rgument(s)"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:6>", "<sample:5>", "<sample:12>", "<sample:2>", "<sample:9>", "20020-01-1111E-5"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:1>", "<sample:3>", "<null>", "<sample:12>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:1>", "<sample:2>", "<sample:4>", "<sample:7>", "<sample:1>", "left side of co6parison"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"2147483647", "<null>", "<sample:9>", "<null>", "right sideTof conparison", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "+L", "<sample:6>", "<sample:11>", "<sample:4>", "1.5e400", "<sample:6>"}, {"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:10>", "<sample:8>", "12:30r5", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<null>", "<sample:2>", "<sample:11>", "<sample:0>", "<null>", "-126"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:0>", "<sample:9>", "<sample:13>", "<sample:8>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<null>", "<sample:4>", "<sample:9>", "<sample:2>", "<sample:2>", "163"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:8>", "<sample:2>", "<sample:0>", "1.5d"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:7>", "<sample:4>", "<sample:12>", "left!ooerand"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<null>", "<sample:9>", "<null>", "1E-51e1"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:12>", "<sample:3>", "<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:4>", "<null>", "<sample:0>", "  "}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:2>", "<sample:1>", "<sample:0>", "2:30a5"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:0>", "<sample:9>", "<sample:11>", "1.12345678901234567123456789012345678901234567890"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanOverride", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>", "<null>", "<sample:7>", "<sample:14>", "nDuil", "<sample:3>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<null>", "<sample:1>", "<sample:0>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:12>", "<null>", "<sample:15>", "+c1"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:5>", "<sample:10>", "<sample:2>", "iJSC_BAD_DELETE_OPERAND"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:3>", "<sample:4>", "<sample:7>", "<sample:1>", " and no more thqan "}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:1>"}, {"com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", "boolean", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.TypeCheck", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visitName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:3>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visitName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:0>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "check", "com.google.javascript.rhino.Node,boolean", "<sample:9>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "processForTesting", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:11>", "<sample:13>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "getTypedPercent", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>", "<sample:5>", "<sample:8>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:3>", "<sample:12>", "5.2147483647", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:5>", "<sample:8>", "<sample:14>", "<sample:1>", "<null>", "1.1234567890123456"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "getTypedPercent", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:11>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:9>", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visitName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "<sample:3>", "<sample:13>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:11>", "<sample:7>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:3>"}, {"com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", "boolean", "false"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:4>", "<null>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:11>", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:10>", "<sample:3>", "<null>", "<sample:15>", "<sample:5>", "-1.5"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:2>", "<sample:1>", "<sample:6>", "<sample:4>", "<sample:12>", ".-0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:0>", "<sample:11>", "12:30n5"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<null>", "<sample:11>", "<sample:0>", "1.12q345678901234567123456789012345678901234567890"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "setShouldReport", "boolean", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:11>", "<sample:9>", "<sample:12>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", "boolean", "false"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "check", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:4>", "false"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:6>", "<sample:11>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:8>", "<sample:0>", "<sample:5>", "<sample:3>", "<sample:4>", "99"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:3>", "<sample:2>", "<sample:7>", "12:30:45"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:10>", "<sample:11>", "<null>", "12:30:45"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:6>", "<sample:2>", "<sample:11>", "-,1"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:8>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:7>", "<sample:5>", "<sample:4>", "<sample:2>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{}), new String[][]{{"visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"1.25", "<sample:3>", "<sample:10>", "<sample:5>", "15e400", "<sample:7>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:1>", "<sample:1>", "<sample:9>", "<sample:4>"}, {"com.google.javascript.jscomp.TypeValidator", "expectNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<null>", "<sample:3>", "<sample:3>", "2020-02-30T25:61:611.12345678901234567"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:4>", "<sample:7>", "<sample:7>", "20020-01-111"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:0>", "<sample:9>", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:0>", "<sample:12>", "<sample:10>", "lXeft operand0xFFFFFFFF"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:0>", "<sample:0>", "<sample:9>", "1", "<sample:11>"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:6>", "<sample:9>", "<sample:3>", "<sample:3>", "<sample:1>", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:3>", "<sample:10>", "<sample:4>", "<sample:6>", "<sample:12>", "inconsistent return type"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:10>", "<sample:1>", "<sample:14>", "1.5e300"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:5>", "<sample:13>"}, false, 2, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<sample:7>", "<sample:15>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:1>", "<sample:10>", "<sample:4>", "<sample:2>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectString", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:9>", "<sample:14>", "1.s334567"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:0>", "<null>", "<sample:12>", "<sample:3>"}, {"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:15>", "<sample:7>", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:10>", "<sample:4>", "<sample:6>", "2020--01-01"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:10>", "<sample:0>", "<sample:13>", "", "<sample:10>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:1>", "<sample:9>", "<sample:8>", "2020-02-30T25:61:61-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:5>", "<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:2>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:4>", "<sample:1>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:2>", "<sample:4>", "<sample:6>", "iocement/decrement"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:3>", "<sample:1>", "<sample:16>", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:0>", "<sample:6>", "<sample:1>", "<sample:3>", "(misring)"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "processForTesting", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:11>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "check", "com.google.javascript.rhino.Node,boolean", "<sample:11>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "setShouldReport", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:7>", "<sample:5>", "<sample:2>", "<sample:0>", "<sample:1>", "-2146959360"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<sample:2>", "<sample:2>", "<sample:0>"}, {"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "right operand", "<sample:7>", "<sample:4>", "<sample:1>", "/x12", "<sample:11>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visitName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<null>", "<sample:13>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visitName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:14>", "<sample:3>"}, {"com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", "boolean", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:2>", "<sample:15>", "<sample:1>", "2p47483647"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:0>", "<sample:12>", "<sample:15>", "2"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:11>", "<sample:11>", "<sample:2>", "0x123455789"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:15>", "<sample:13>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", "boolean", "true"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:7>", "<sample:0>", "<sample:14>", "<sample:4>", "<sample:1>", "1.5e"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:8>", "<sample:4>", "<sample:10>", " has no properties", "<sample:15>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:0>", "<sample:8>", ""}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:11>", "<sample:3>", "<sample:12>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:10>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visitName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:0>", "<sample:14>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:1>", "<sample:1>", "<sample:15>", "'in' reu_res an object"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:13>", "<sample:4>", "<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:6>", "<sample:7>", "<sample:15>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"true"}, false), new String[][]{{"processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:1>", "<null>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<null>", "<sample:11>", "<sample:3>", "JSC_BAD_DELETE_OPERAND"}, {"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:13>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "check", "com.google.javascript.rhino.Node,boolean", "<null>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:2>", "<null>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:5>", "<sample:8>", "<sample:12>", "<sample:2>", "<sample:10>", "2147483647"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:7>", "<sample:6>", "<sample:14>", "<sample:1>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:6>", "<null>", "t.ru"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:13>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "check", "com.google.javascript.rhino.Node,boolean", "<sample:0>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{".0", "<sample:12>", "<sample:6>", "<sample:8>", "tz", "<sample:12>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:4>", "<sample:11>", "<sample:6>", "<sample:5>", "<sample:11>", ", pr "}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:4>", "<sample:15>", "<sample:14>", "<sample:11>", "<sample:11>", "1EF5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "processForTesting", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:11>", "<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"0x1F has no propertiesJSC_DETERMINISTIC_TEST", "<sample:2>", "<sample:8>", "<sample:4>", "2147", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:2>", "<null>", "<sample:8>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:10>", "<sample:3>", "<sample:1>", "<sample:11>", "initializing variable"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:0>", "<sample:2>", "<sample:3>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:15>", "<sample:5>", "TITtE"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>", "<sample:8>", "<sample:11>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:4>", "true"}, {"com.google.javascript.jscomp.TypeValidator", "setShouldReport", "boolean", "false"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visitName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:13>", "<sample:15>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "getTypedPercent", ""}}, 3), new String[][]{{"processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:2>", "<sample:7>", "<sample:13>", "<sample:14>", "<sample:3>", "1.5"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:0>", "<null>", "1.s334567"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:10>", "true"}, {"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "'in' requ_res an object--1", "<sample:2>", "<sample:8>", "<sample:4>", "left sie of 'in'", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:5>", "<sample:7>", "<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:5>", "<sample:8>", "<sample:9>", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"1.12345677901234567", "<sample:17>", "<sample:3>", "<sample:3>", "1.5e40S1.5f", "<sample:4>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:5>", "<sample:5>", "<sample:6>", "<sample:7>", "<sample:5>", "left side oe u'in'"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:10>", "<sample:0>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:15>", "<sample:13>"}, {"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:9>", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>", "<sample:4>", "<sample:10>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:12>", "<sample:0>", "<sample:3>", "2020-01-012020-02-30T25:61:610x1F"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:12>", "<sample:3>", "<sample:15>", "<sample:1>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:15>", "<sample:15>", "<sample:11>", "<sample:14>", "<sample:7>", "2130706431"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:10>", "<sample:4>", "<sample:15>", "01"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "getTypedPercent", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanOverride", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>", "<sample:6>", "<sample:11>", "<sample:7>", "aa", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<null>", "<sample:1>", "<sample:6>", "right operand"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "getTypedPercent", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:6>", "<sample:0>", "<sample:7>", "<sample:11>", "<sample:0>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:6>", "<sample:1>", "<sample:8>", "1.4f"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>", "<sample:5>", "<sample:1>", "<sample:9>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:11>", "<sample:6>", "<sample:11>", "JSC_DETERMINISTIC_T"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:5>", "<sample:9>", "<sample:11>", "<sample:7>", "<sample:11>", "JSC_BAD_DELETE_OPERAND2020-02-30T25:61:61"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:4>", "<sample:8>", "<sample:13>", "left op6era<nd"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:0>", "<sample:4>", "<sample:1>", "JSC_BAD_DELETE_OPERAND'in' requires an object"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:3>", "<sample:10>", "<sample:1>", "<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:2>", "<sample:2>", "<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<sample:4>", "<sample:9>", ">", "<sample:15>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:1>", "<sample:6>", "<sample:13>", "1.12)4e67"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<sample:2>", "<sample:11>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:4>", "<sample:9>", "<sample:7>", "1.24"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "check", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:5>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:3>", "<sample:8>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:10>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:10>", "<sample:13>", "<sample:10>"}, {"com.google.javascript.jscomp.TypeCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:7>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:2>", "<sample:6>", "<sample:0>", "<sample:2>"}, {"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<null>", "<sample:13>", "<sample:2>", ", or "}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(sample.<boolean>, Function.prototype)]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:2>", "<sample:10>", "<sample:4>", "<sample:8>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:0>", "<sample:2>", "<sample:7>", "<sample:11>", "1.5300", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<sample:1>", "<sample:11>", "<sample:6>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:0>", "<sample:5>", "<sample:7>", "<sample:8>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:0>", "<sample:10>", "<sample:5>", "sign operator"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:4>", "<sample:6>", "<null>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectString", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:4>", "<sample:18>", "1.12345667890b123456-1.5"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:13>", "true"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<null>", "<sample:0>", "<sample:6>", "<sample:9>", "1.5300"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:6>", "<sample:3>", "<sample:11>", "<sample:13>", "1.12345671L"}, {"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:13>", "<sample:17>", "<sample:14>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "getTypedPercent", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", "boolean", "false"}, {"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "check", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:10>", "false"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:14>", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:12>"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"get", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "setShouldReport", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:9>", "<sample:9>", "<sample:8>", "iJSC_BBD_DELETE_OPERAND010"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<null>", "<sample:1>", "<sample:15>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:12>", "<sample:6>", "<sample:6>", "<sample:11>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "check", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:6>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "check", "com.google.javascript.rhino.Node,boolean", "<sample:12>", "true"}, {"com.google.javascript.jscomp.TypeCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:2>", "<sample:10>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:5>", "<sample:2>", "<sample:0>", "<sample:1>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "setShouldReport", "boolean", "false"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:10>", "<sample:15>", "<sample:9>", "<sample:17>", "Eprototyp", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:8>", "<sample:6>", "<sample:1>", "<sample:0>", "<sample:11>", "-1"}, {"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:6>", "<sample:5>", "n"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:1>", "<sample:10>", "<sample:8>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<null>", "<sample:2>", "<sample:10>", " has zo properties"}}), new String[][]{{"lastIndexOf", "java.lang.Object", "5"}, {"contains", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:4>", "<sample:9>", "<null>", "m1.25"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<sample:4>", "<sample:4>", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:15>", "<null>", "<sample:5>", "--00"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(function (new:0, *, *, *): 0, string)]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:13>", "<sample:6>", "<null>", "11.5f"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:2>", "<sample:4>", "Eprototyp'in' requires an object-1.5"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:14>", "<sample:0>", "<sample:13>", "<sample:17>", "100.0"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<null>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectString", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:11>", "<sample:4>", "<sample:4>", "iSC_BAD_DELETE_OPERANDleft operand"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:0>", "<sample:5>", "<null>", "<sample:13>", "<sample:11>", "_"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "setShouldReport", "boolean", "false"}, {"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:1>", "<sample:7>", "<sample:2>", "<sample:4>"}}), new String[][]{{"lastIndexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:9>", "<sample:7>", "<sample:14>", "<sample:17>", "<sample:7>", "123456789012345678901234567890"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:11>", "<sample:4>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:10>", "<sample:10>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:3>", "<sample:10>", "<sample:16>", "<sample:2>", "-1"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:4>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:10>", "<sample:6>", "<sample:10>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visitName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:10>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<sample:5>", "<sample:2>", "<sample:13>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visitName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:3>", "<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:10>", "<sample:8>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectString", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:10>", "<sample:9>", "<null>", "+1 and no more than "}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<sample:10>", "<sample:2>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "processForTesting", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:10>", "<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "setShouldReport", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:10>", "<sample:9>", "<sample:10>", "`"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectString", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:4>", "<sample:2>", "<sample:6>", "with requires an object"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:3>", "<sample:4>", "<sample:9>", "202F0-01-01"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeCheck", "getTypedPercent", ""}}, 1), new String[][]{{"check", "com.google.javascript.rhino.Node,boolean", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:6>", "<sample:7>", "-6"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:10>", "<sample:5>", "<sample:9>", "<sample:6>", "1.2r"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:13>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:11>", "<sample:10>", "<sample:7>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visitName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:13>", "<sample:10>", "<sample:4>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visitName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:13>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeCheck", "visitName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:12>", "<sample:10>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:3>", "<sample:12>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:0>", "<sample:0>"}, {"com.google.javascript.jscomp.TypeCheck", "check", "com.google.javascript.rhino.Node,boolean", "<sample:5>", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<null>", "false"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:9>", "<sample:6>", "<sample:1>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:6>", "<sample:1>", "<sample:3>"}, {"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:10>", "<sample:9>", "<sample:15>", "12:A0:45"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanOverride", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:12>", "<sample:13>", "<sample:16>", "<sample:3>", "1.5e4001.5f", "<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:5>", "<sample:0>", "<sample:4>", "1.1234467890123456+1"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:5>", "<sample:1>", "<sample:15>", "<sample:5>", "<sample:11>", "217483647"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:10>", "<sample:9>", "<sample:0>", "1.1q345678"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<null>", "<sample:13>", "<sample:9>", "<sample:12>", "i4"}}), new String[][]{{"add", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:12>", "<sample:6>", "<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:2>", "<sample:5>", "-B-1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "sigo operator", "<sample:0>", "<sample:9>", "<sample:0>", "iwith requires an object", "<sample:17>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<null>", "<sample:9>", "<sample:5>", "<sample:10>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "setShouldReport", "boolean", "false"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visitName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:1>", "<sample:6>"}, {"com.google.javascript.jscomp.TypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:10>", "<sample:10>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.TypeCheck", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:8>", "<sample:13>", "a(missing)"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:12>", "<null>", "<sample:16>", "increm>nt/decrement", "<sample:10>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<sample:1>", "<sample:8>", "<null>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:1>", "<sample:4>", "<sample:4>", "left operand"}, {"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:14>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", "boolean", "false"}, {"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:10>", "<sample:6>", "<sample:10>"}}, 1), new String[][]{{"visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:11>", "<sample:7>", "<sample:2>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "check", "com.google.javascript.rhino.Node,boolean", "<sample:4>", "true"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanOverride", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>", "<sample:9>", "<sample:6>", "<sample:1>", "--", "<sample:13>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<null>", "<sample:17>", "1.251E-5"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectString", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:8>", "<sample:12>", "tsue"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:14>", "<sample:1>", "<sample:14>", "E"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:0>", "<null>", "<sample:8>", "<sample:1>", "<sample:5>", "t1.5d"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:15>", "<sample:10>", "<sample:3>"}, {"com.google.javascript.jscomp.TypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:11>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.TypeCheck", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:7>"}}, 3), new String[][]{{"process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "processForTesting", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<null>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:10>", "<sample:16>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<null>", "<sample:1>", "<sample:1>", "prrototype"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:1>", "<sample:0>", "<sample:6>", "12:30r50x123456789"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:12>", "<sample:15>", "<sample:17>", "<null>", "<sample:11>", "1E-44"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "12:A0:4512:30:45", "<sample:10>", "<sample:13>", "<sample:8>", "1.12)4e67left side of comparison1", "<sample:8>"}, {"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:0>", "<sample:5>", "<sample:8>", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<sample:4>", "<sample:1>", "<sample:15>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>", "<sample:8>", "<sample:8>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<sample:17>", "<sample:14>", "<sample:4>"}, {"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<sample:10>", "<sample:3>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:4>", "<sample:9>", "<sample:13>", "<sample:8>", "1.1234566780"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:11>", "<sample:3>", "<sample:15>", "<sample:5>", "<sample:16>", "-2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:12>", "<sample:6>", "<sample:4>", "<sample:11>", "31477483647"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"0xFFFFFFFF", "<sample:13>", "<sample:11>", "<null>", "11L1E-5", "<sample:8>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:4>", "<sample:13>", "TITLE"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:11>", "true"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:10>", "<sample:9>", "<sample:3>", "<sample:14>"}, {"com.google.javascript.jscomp.TypeValidator", "expectNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:5>", "<sample:9>", "<sample:7>", "12:A0:45 1E-5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:10>", "<null>", "<null>", ",\037or ", "<sample:16>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<null>", "<null>", "<sample:0>", "0x1234567789"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<sample:15>", "<sample:4>", "<sample:9>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:4>", "<sample:6>", "'in' requ_ress an object(missing)"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:4>", "<sample:3>", "<sample:8>", "<sample:0>", "202\n-02-30T25:61:61-1"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:8>", "<sample:9>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "getTypedPercent", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:15>", "<sample:3>"}, {"com.google.javascript.jscomp.TypeCheck", "visitName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:14>", "<sample:15>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("100.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:4>", "<sample:1>", "<null>", "<sample:15>", "<sample:13>", "A1"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:3>", "<sample:18>", "<sample:5>", "prototype1L"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "<null>", "<sample:0>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:12>", "<sample:15>", "<sample:9>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:5>", "<sample:5>", "<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:9>", "<sample:3>", "<sample:6>", "1.12345678", "<sample:9>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:1>", "<sample:3>", "<sample:1>", "nl"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:5>", "<sample:1>", "<sample:10>", "<sample:10>", "-1.5"}, {"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<null>", "<sample:7>", "<sample:15>", "1em00"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"1.5", "<null>", "<sample:4>", "<sample:6>", "t", "<sample:7>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:9>", "<sample:11>", "<sample:4>", "<sample:0>", "<sample:0>", "prototyoe"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "<sample:17>", "<sample:13>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:4>", "<sample:2>", "<sample:1>", "1.1234568890123456a", "<sample:1>"}}, 2), new String[][]{{"clear", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:3>", "<sample:16>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:15>", "<sample:2>", "<sample:3>", "asrignment"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<sample:2>", "<sample:1>", "<sample:1>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<sample:0>", "<sample:16>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<sample:11>", "<null>", "<sample:4>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:1>", "<sample:7>", "<sample:14>", "<sample:5>", "<sample:17>", "0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"addAll", "java.util.Collection", "6"}, {"remove", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{}, 2), new String[][]{{"process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:12>", "<sample:7>"}}, 1), new String[][]{{"shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "setShouldReport", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:6>", "<sample:17>", "<sample:11>", "'in' requ_rfs an object"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "processForTesting", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:13>", "<null>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<null>", "<sample:5>", "<sample:1>", "1.4"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<null>", "<null>", "<sample:3>", "100-0"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:7>", "<sample:7>", "<sample:0>", "1.12T345667"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:15>", "<sample:14>", "<null>", "1E-5"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:1>", "<sample:13>", "<sample:12>", "<sample:14>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"addAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:10>", "<sample:5>", "<sample:0>", "160.j0"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:10>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<null>", "<sample:15>", "<sample:1>", "ight ope)rand"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:13>", "<sample:5>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:10>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:11>", "<sample:1>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:6>", "<sample:14>", "<sample:0>", "<sample:9>", "<sample:2>", "Epqototyp"}}, 3), new String[][]{{"get", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:13>", "<sample:13>", "<sample:10>", "'in' requires am object", "<null>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "check", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:4>", "true"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:10>", "<sample:15>", "<null>", "<sample:18>"}}, 1), new String[][]{{"listIterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "check", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:2>", "false"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanOverride", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<sample:11>", "<null>", "<sample:1>", "assinmentSwith requires!an object", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:1>", "true"}, {"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:1>", "<sample:9>", "<sample:1>", "<sample:14>", "<sample:8>", "92"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<sample:6>", "<sample:17>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:15>", "<sample:4>", "19;30a5", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visitName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:8>", "<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", "boolean", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:6>", "<sample:15>", "<sample:10>", "<null>", "<sample:10>", "sign operator"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:9>", "<sample:17>", "<sample:4>", "assinlentwhth requires an object"}, {"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:11>", "<sample:13>", "<sample:1>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>", "<sample:11>", "<null>", "<sample:14>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "getTypedPercent", ""}}, 2), new String[][]{{"process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<null>", "<sample:12>", "<sample:10>", " has no properties"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:1>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:2>", "<sample:5>", "<null>", "1.12345678902234567123456789012345678901234567890"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:9>", "<sample:1>", "<sample:4>", "<sample:15>", "1.5300"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:7>", "<null>", "<sample:8>", "-1"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "null", "<sample:13>", "<sample:4>", "<sample:3>", "1.1234567890123456", "<sample:10>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<null>", "<sample:17>", "<sample:15>", "left!ooerandJSC_DETERMINISTIC_TEST"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:11>", "<sample:11>", "<sample:16>", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:3>", "<sample:11>", "<sample:5>", "trueJSC_CETERMINISTIC_TEST"}}, 3), new String[][]{{"retainAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{}, 2), new String[][]{{"shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:4>", "<sample:11>", "<sample:10>", "<sample:10>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:0>", "<sample:9>", "<sample:13>", "-0"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "getTypedPercent", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:15>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("100.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<null>", "<sample:0>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:8>"}, {"com.google.javascript.jscomp.TypeCheck", "check", "com.google.javascript.rhino.Node,boolean", "<sample:7>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:2>", "<sample:14>"}}, 3), new String[][]{{"shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "0"}, {"shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:9>", "<sample:8>", "<null>", "Hello, Worl5"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "setShouldReport", "boolean", "false"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:15>", "<sample:17>", "<sample:10>", "<sample:13>", "", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:7>", "<null>", "<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:0>", "<sample:2>", "<sample:2>", "_2F"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<sample:3>", "<sample:4>", "<null>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:15>", "<sample:6>", "<sample:5>", "<sample:10>", "-1"}, {"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:10>", "<sample:7>", "<sample:5>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:1>", "<sample:4>", "<sample:13>", " rgument(s)"}, {"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}}, 2), new String[][]{{"get", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "getTypedPercent", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visitName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:10>", "<sample:2>", "<sample:8>"}, {"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:15>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("100.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}}, 3), new String[][]{{"lastIndexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:3>", "<sample:13>", "<sample:15>", "<sample:5>", "<sample:4>", "1"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:1>", "<sample:10>", "<sample:8>", "*L"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>", "<sample:8>", "<sample:11>", "<sample:0>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:14>", "<sample:13>", "<sample:7>", " rgument(s)"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:4>", "<sample:15>", "<null>", "(missing*"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:12>", "<sample:8>", "<sample:12>", "1TL3"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:10>", "<sample:11>", "<sample:11>", "right side of comparison2147483647"}, {"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:11>", "<sample:18>", "<sample:5>", "<sample:2>"}}, 2), new String[][]{{"clone", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(function (new:0, *, *, *): 0, Function.prototype)]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:5>", "<sample:12>", "<sample:1>", "s)gn operator"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "check", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:5>", "false"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:17>", "<sample:12>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanOverride", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>", "<sample:10>", "<sample:12>", "<null>", "20020-01-11", "<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:4>", "false"}, {"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:15>", "<sample:2>", "<sample:6>", "2020-02-30T25:61:61-10x1F"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:10>", "<sample:6>", "<sample:15>", "<sample:18>", "<sample:14>", "-2147483648"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:2>", "<sample:15>", "<sample:14>", "<sample:14>", "<sample:8>", "2147352574"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visitName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:3>", "<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visitName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:3>", "<sample:17>"}, {"com.google.javascript.jscomp.TypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:10>", "<sample:11>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:4>", "<sample:15>", "<sample:1>"}, {"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}}, 3), new String[][]{{"get", "int", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.TypeValidator$TypeMismatch", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:1>", "<sample:1>", "<null>", "(miss\ning)"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:7>", "<sample:3>", "<sample:8>", "pnull"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:0>", "<sample:9>", "<sample:5>", "<sample:10>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:9>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:3>", "<sample:18>", "<sample:13>", "wiXh requires an object"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:10>", "<sample:11>", "<null>", "abc", "<sample:10>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:8>", "<sample:14>", "<sample:8>", "2", "<sample:14>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectString", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<null>", "<null>", "020-01-01"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<null>", "<sample:8>", "<sample:3>", "i-C"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:8>", "<sample:1>", "<sample:3>", "<sample:8>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:10>", "<sample:14>", "<null>", "0x123456789\r"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:10>", "<sample:10>", "<sample:16>", "<null>", "c1a"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:11>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"+T", "<sample:4>", "<sample:13>", "<null>", " and fno more thqan ", "<sample:13>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "setShouldReport", "boolean", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:15>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:4>", "<sample:11>", "<null>", "left!podrand"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"add", "int,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:4>", "<sample:11>", "<sample:1>", "1null"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<null>", "<sample:5>", "<sample:6>", "<null>", "<sample:19>", "inconsistent return typeTITLE"}, {"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:9>", "<sample:13>", "<sample:18>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<null>", "<sample:13>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:3>"}, {"com.google.javascript.jscomp.TypeCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:10>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:14>", "<sample:4>", "<sample:13>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<null>", "<sample:15>", "<sample:13>", "1.12)4e75."}}, 2), new String[][]{{"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
}
