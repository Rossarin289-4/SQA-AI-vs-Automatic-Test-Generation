package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:0>", "<sample:5>", "1.5e300"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:0>", "<sample:4>", "1.5e300"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:1>", "<null>", "<sample:3>", "<sample:2>", "<sample:7>", "1.12345678901234567"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:1>", "<sample:6>", "<sample:3>", "<sample:2>", "<sample:7>", "1.12345678901234567"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:1>", "<sample:9>", "<sample:3>", "<sample:5>", "<sample:7>", "1.12345678901234567"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:1>", "<sample:9>", "<sample:5>", "<sample:5>", "<sample:7>", "1.12345678901234567"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<sample:6>", "<sample:0>", "<sample:0>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:0>", "<sample:5>", "<null>", "<sample:0>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:4>", "<sample:1>", "<sample:7>", "1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:0>", "<sample:5>", "<null>", "<sample:0>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:4>", "<sample:1>", "<sample:7>", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:0>", "<sample:4>", "<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:4>", "<sample:3>", "<sample:7>", "<sample:7>", "JSC_DETERMINISTIC_TEST", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:1>", "<sample:4>", "<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:4>", "<sample:3>", "<sample:7>", "<sample:7>", "JSC_DEjTERMINISTIC_TEST", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:1>", "<sample:6>", "<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:4>", "<sample:3>", "<sample:7>", "<sample:7>", "JSC_DEjTERMINISTIC_TEST", "<sample:5>"}, {"com.google.javascript.jscomp.TypeValidator", "setShouldReport", "boolean", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:1>", "<sample:0>", "<null>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:4>", "<sample:3>", "<sample:7>", "<sample:7>", "JSC_DEjTERMINISTIC_TEST", "<sample:5>"}, {"com.google.javascript.jscomp.TypeValidator", "setShouldReport", "boolean", "false"}, {"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:6>", "<null>", "<sample:1>", " "}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:0>"}, {"com.google.javascript.jscomp.TypeCheck", "visitName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:2>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.TypeCheck", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "getTypedPercent", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:1>"}, {"com.google.javascript.jscomp.TypeCheck", "getTypedPercent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "getTypedPercent", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:1>"}, {"com.google.javascript.jscomp.TypeCheck", "getTypedPercent", ""}, {"com.google.javascript.jscomp.TypeCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:6>", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "getTypedPercent", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:1>"}, {"com.google.javascript.jscomp.TypeCheck", "getTypedPercent", ""}, {"com.google.javascript.jscomp.TypeCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:6>", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "getTypedPercent", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:1>"}, {"com.google.javascript.jscomp.TypeCheck", "getTypedPercent", ""}, {"com.google.javascript.jscomp.TypeCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:6>", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"true", "<sample:2>", "<sample:9>", "<sample:4>", "'in' requires an object", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:1>", "<null>", "true"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:2>", "<sample:0>", "<sample:3>", "left side of c_omparison"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:2>", "<sample:0>", "<sample:3>", "left side of c_omparison"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<null>", "<sample:6>", "'in' requires an object"}, {"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:2>", "<sample:0>", "<sample:3>", "left side of c_omparison"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<null>", "<sample:6>", "'in' requires an object"}, {"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}, {"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:7>", "<null>", "<sample:7>", "--1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:0>", "<sample:0>", "<sample:7>", "left side of c_omparison"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<null>", "<sample:7>", "<sample:6>", "<sample:1>"}, {"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<null>", "<sample:6>", "'in' requires an object"}, {"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:7>", "<null>", "<sample:7>", "--1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:1>", "<sample:0>", "<sample:6>", "left side of 6omparison"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<null>", "<sample:7>", "<sample:6>", "<sample:1>"}, {"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:7>", "<sample:3>", "<null>", "--1"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:1>", "<sample:0>", "<sample:6>", "left side of 6omparison"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<null>", "<sample:7>", "<sample:6>", "<sample:0>"}, {"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:7>", "<sample:2>", "<null>", "--1"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:1>", "<sample:3>", "<sample:6>", "left side of 6omparison"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<null>", "<sample:7>", "<sample:6>", "<sample:0>"}, {"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:9>", "<sample:3>", "-0.0", "<sample:7>"}, {"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:7>", "<sample:2>", "<null>", "--1"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:4>", "<sample:4>", "<sample:3>", "left sideof 6oomparison1.1234567"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<null>", "<sample:7>", "<sample:6>", "<sample:3>"}, {"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:4>", "<sample:9>", "<sample:3>", "-0.0", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:6>", "<sample:1>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:8>", "<sample:6>", "<sample:0>", "left shdeofe 6nomprison0.1234567"}, false, 12, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "1.5", "<sample:2>", "<sample:1>", "<sample:7>", "true", "<null>"}, {"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:4>", "<sample:9>", "<sample:3>", "-0.0", "<sample:7>"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:7>", "<sample:5>", "<sample:1>", ", or ", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:3>", "<sample:4>", "<sample:3>", "1.1234567"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeCheck", "check", "com.google.javascript.rhino.Node,boolean", "<sample:7>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:0>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeCheck", "check", "com.google.javascript.rhino.Node,boolean", "<sample:7>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<sample:9>", "<null>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:0>", "<sample:6>", "<sample:2>", "JSC_DETERMINISTIC_TEST"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:0>", "<sample:4>", "<sample:2>", "JSC_DETERMINISTIC_TEST"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:0>", "<sample:4>", "<sample:2>", "JSC_DETERMINISTIC_TEST"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<null>", "<sample:9>", "<sample:7>", "<sample:0>", "<sample:9>", "10"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<null>", "<sample:4>", "<sample:5>", "JSC_ETERMINISTIC_TESTabc"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<null>", "<sample:9>", "<sample:7>", "<sample:0>", "<sample:9>", "10"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<null>", "<sample:3>", "<sample:5>", "JSC_ETERMINISTIC_TESTabb"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<null>", "<sample:9>", "<sample:7>", "<sample:0>", "<sample:9>", "10"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:9>", "<null>", "<sample:1>", "0x1F"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visitName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:9>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:4>"}, {"com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visitName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:3>"}, {"com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", "boolean", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visitName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<sample:7>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:3>"}, {"com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visitName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:6>", "<null>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:3>"}, {"com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", "boolean", "false"}, {"com.google.javascript.jscomp.TypeCheck", "getTypedPercent", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visitName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:1>", "<sample:7>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:3>"}, {"com.google.javascript.jscomp.TypeCheck", "getTypedPercent", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:1>", "<sample:2>", "<null>", "<sample:1>", " "}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<null>", "<sample:0>", "<sample:0>", "<sample:0>", "<sample:1>", "99"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:5>", "<sample:4>", "<sample:6>", "PT1H"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:2>", "true"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:5>", "<sample:0>", "<sample:6>", "PT1H"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:2>", "false"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:5>", "<sample:2>", "<sample:6>", "P"}, false, 8, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:5>", "false"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:8>", "<sample:0>", "<sample:6>", "--1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:0>", "<sample:7>", "Q"}, false, 9, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:6>", "true"}, {"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<sample:3>", "<sample:2>", "<null>"}, {"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:1>", "<sample:4>", "<sample:4>", "JSC_DEjTERMINISTIC_TEST"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<sample:9>", "<sample:2>", "inconsistent return type", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:3>", "<sample:5>", "<sample:0>", "Q"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:6>", "<sample:7>", "true0x123456789"}, false, 8, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<null>", "<sample:4>", "+1"}, {"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:4>", "true"}, {"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:1>", "<sample:4>", "<sample:4>", "JSC_DEjTERMINISTIC_TEST"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:5>", "<sample:6>", "<sample:7>", "<sample:6>", "<sample:1>", "10"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:6>", "<sample:5>", "assignment"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:8>", "<sample:0>", "<null>", "PT1*"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:5>", "<sample:0>", "<sample:2>", "Q"}, {"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:11>", "<sample:2>", "<sample:1>", ">+"}, {"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:4>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:5>", "<sample:8>", "<sample:4>", "Pb1+"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:11>", "<sample:9>", "<sample:3>", "w+"}, {"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:4>", "true"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:0>", "<sample:6>", "<sample:1>", "<null>", "true0x123456789"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<sample:2>", "<sample:7>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:2>", "<sample:8>", "<sample:5>", "initializing variable"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<sample:3>", "<sample:4>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<sample:6>", "<sample:4>", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"abc", "<sample:5>", "<sample:0>", "<sample:7>", "-1.5", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<sample:6>", "<sample:3>", "<null>"}, {"com.google.javascript.jscomp.TypeValidator", "setShouldReport", "boolean", "false"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:1>", "<sample:1>", "<sample:3>", "-1.5"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:4>", "<sample:3>", "<sample:6>", "1.5f", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<sample:9>", "<sample:6>", "<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:4>", "<sample:3>", "<sample:0>"}, {"com.google.javascript.jscomp.TypeValidator", "setShouldReport", "boolean", "false"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanOverride", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>", "<sample:0>", "<sample:6>", "<sample:7>", "right operand", "<sample:4>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:1>", "<sample:1>", "<sample:6>", "-0.0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "check", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:3>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:5>", "<sample:3>", "<sample:0>", "<sample:5>", "true"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:7>", "<sample:8>", "<sample:4>", "<sample:7>", "Title"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:5>", "<sample:5>", "<sample:3>", "1.1234567"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:8>", "<sample:5>", "<sample:5>", "truue1.5e>00"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:4>", "<sample:5>", "<sample:3>", "<sample:5>", "5i5", "<sample:3>"}, {"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:0>", "true"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:6>", "<sample:9>", "<sample:1>", "<sample:2>", "<sample:7>", "-2147483648"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<null>", "<sample:2>", "<sample:4>", "JSCj_BAD_DELETE_OPERAND"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:8>", "<sample:3>", "<sample:5>", "truue1.5e>00"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:4>", "<sample:5>", "<sample:1>", "<sample:5>", "5i5", "<sample:5>"}, {"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:5>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:0>", "<null>", "<sample:7>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:8>", "<sample:5>", "<sample:4>", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:0>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "processForTesting", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "setShouldReport", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:2>", "<sample:0>", "<sample:6>", "Hello, World"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:11>", "<sample:1>", "<sample:6>", "Title"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<null>", "<sample:2>", ""}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<null>", "<sample:9>", "<sample:5>", "right operand"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:2>", "<null>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:8>", "<sample:9>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:4>", "<sample:6>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:0>"}, {"com.google.javascript.jscomp.TypeCheck", "getTypedPercent", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:2>", "<sample:6>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:0>"}, {"com.google.javascript.jscomp.TypeCheck", "getTypedPercent", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:3>", "<sample:5>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:0>"}, {"com.google.javascript.jscomp.TypeCheck", "getTypedPercent", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:10>", "<sample:1>", "<sample:2>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:0>"}, {"com.google.javascript.jscomp.TypeCheck", "getTypedPercent", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "<sample:3>", "<sample:5>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:10>", "<sample:4>", "<sample:3>"}, {"com.google.javascript.jscomp.TypeCheck", "getTypedPercent", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "<sample:0>", "<sample:5>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:10>", "<sample:4>", "<sample:3>"}, {"com.google.javascript.jscomp.TypeCheck", "getTypedPercent", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:8>", "<sample:8>", "<sample:4>", "abc"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:4>", "<sample:6>", "<sample:6>", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "getTypedPercent", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:0>", "<sample:3>", "<sample:7>", "<sample:4>", "<sample:6>", "101"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:5>", "<null>", "<sample:7>", "assignment"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:8>", "<null>", "<sample:6>", "<sample:2>", ", or ", "<sample:1>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:0>", "<sample:3>", "<sample:7>", "<sample:7>", "<sample:6>", "101"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:5>", "<null>", "<sample:7>", "assignment"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:8>", "<null>", "<sample:6>", "<sample:2>", ", or ", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<sample:2>", "<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<null>", "<sample:8>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:4>", "<sample:0>", "<sample:5>", "<sample:6>", "<sample:8>", "right side of comparison"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:8>", "<sample:5>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:7>", "<sample:4>", "<sample:4>", "<sample:4>", "<sample:6>", "10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>", "<sample:7>", "<sample:2>", "right side of comparison has no properties", "<sample:1>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:6>", "<sample:2>", "010012:30:45"}, {"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<null>", "<null>", "<sample:10>", "<sample:4>", "<sample:5>", "2147483646"}, {"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:7>", "<sample:4>", "<sample:5>", "1L"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectString", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:3>", "<sample:6>", "<sample:0>", "left sideof 6oomparison1.1234567"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<sample:7>", "<sample:9>", "right side of 'omparion has no properties", "<sample:2>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:11>", "<null>", "<sample:10>", "<sample:4>", "<sample:5>", "2147483646"}, {"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:3>", "<sample:9>", "<sample:5>", "left opesand"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:9>", "false"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "check", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:5>", "true"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visitName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:5>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:2>", "<sample:7>", "<sample:7>", "<sample:7>", "<null>", "101"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<null>", "<sample:7>", "<sample:9>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:4>", "<sample:0>", "<sample:10>", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<null>", "<sample:0>", "<sample:9>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:4>", "<sample:0>", "<sample:10>", "<sample:7>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<sample:10>", "<null>", "<sample:6>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:11>", "<sample:1>", "<sample:10>", "<sample:1>", "", "<sample:2>"}, {"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:4>", "<sample:6>", "<sample:4>", "abc", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectString", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:10>", "<sample:1>", "<sample:10>", "with requires an object"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:5>", "<sample:9>", "<sample:1>", "true"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:8>", "<sample:0>", "<sample:6>", "<sample:4>", "abc"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:0>", "<sample:0>", "<sample:2>", "<sample:2>", "<sample:1>", "inconsistent return type"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:2>", "<sample:1>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<null>", "<sample:0>", "<sample:6>", "<sample:3>", "<sample:4>", "'in' requifres an objecu1"}, false, 8, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:6>", "<sample:6>", "<sample:5>", "100.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:2>", "<sample:6>", "<sample:10>", "<sample:1>", "<sample:6>", "2020-02-30T25:61:61"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:7>", "<sample:5>", "<null>"}, {"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:10>", "<sample:3>", "<sample:1>", "JSC_ETERMINISTIC_TESTabc"}, {"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<null>", "<sample:1>", "<sample:7>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:1>", "<sample:6>", "<sample:8>", "<sample:9>", "<sample:4>", "1."}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:1>", "<sample:6>", "<null>", "<sample:9>", "<sample:4>", "1."}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:5>", "<sample:4>", "JSC_BAD_DELETE_OPERAND"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:12>", "<sample:8>", "<sample:11>", "<sample:3>", "<sample:9>", "2147483647"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}, {"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<null>", "<sample:1>", "<sample:9>"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:0>", "<sample:3>", "<sample:5>", "<sample:3>", "1.12345678", "<sample:2>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:6>", "<sample:8>", "<sample:10>", "<sample:3>", "<sample:4>", "2147483647"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:11>", "<sample:0>", "<null>", "right side of 'omparion has no properties"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:10>", "<sample:3>", "<sample:1>", "Pb1+"}, {"com.google.javascript.jscomp.TypeValidator", "setShouldReport", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:8>", "<null>", "<null>", " argument(s)"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "Title", "<null>", "<sample:2>", "<null>", "JSC_DEjTERMINISTIC_TEST", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:0>", "<null>", "<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:0>", "<sample:2>", "<sample:10>", "<sample:0>", "<sample:4>", "left shdeofe 6nomprison0.1234567"}, {"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:11>", "<null>", "<sample:3>", "Pb1+"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:3>", "<sample:5>", "<sample:2>", "<sample:4>", "i"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:1>", "<sample:2>", "<sample:1>", "1.25", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<sample:4>", "<sample:10>", "<sample:9>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<sample:3>", "<null>", "2020-01-01", "<sample:10>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:4>", "<sample:7>", "<sample:0>", "<sample:9>", "JSC_DEjTERMINISTIC_TEST", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:1>", "<sample:3>", "<sample:1>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:1>", "<sample:1>", "<sample:11>", "<sample:1>", "<sample:1>", "1073741825"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:4>", "<sample:1>", "<sample:2>"}, {"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:9>", "<sample:5>", "1E2:30:445", "<sample:5>"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:8>", "<sample:6>", "<sample:7>", "<sample:7>", "<sample:12>", "truueCx23456789"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<null>", "<sample:12>", "<sample:4>", "<sample:9>", "+1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:8>", "<sample:1>", "<sample:4>", "<sample:3>", "assignment"}, {"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "w+", "<sample:6>", "<sample:0>", "<sample:6>", "JSC_DETERMINISTIC_TEST", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:1>", "<sample:3>", "<sample:11>", "<sample:1>", "<sample:1>", "1073741825"}, false, 15, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:4>", "<sample:1>", "<sample:2>"}, {"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:9>", "<sample:5>", "1E2:30:445", "<sample:5>"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:8>", "<sample:6>", "<sample:0>", "<sample:7>", "<sample:12>", "trueCx23456789"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanOverride", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>", "<sample:6>", "<sample:1>", "<sample:6>", "1", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:3>", "<sample:12>", "<sample:10>", "(missing)"}, {"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<null>", "<sample:5>", "<sample:1>", "Pb1+"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<null>", "<sample:9>", "<sample:2>", "i"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:8>", "<sample:9>", "<null>", "left shdeofe 6nomprison0.1234567"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<null>", "<sample:9>", "<sample:2>", "a"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "processForTesting", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:1>", "<null>"}, {"com.google.javascript.jscomp.TypeCheck", "visitName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:10>", "<sample:7>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}, {"add", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:2>", "<sample:10>", "1E-5"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:4>", "<sample:1>", "<sample:3>", "<sample:5>", "Title", "<sample:7>"}, {"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:12>", "<sample:6>", "left operand", "<sample:9>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<sample:6>", "<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:1>", "<sample:6>", "<sample:1>", "--1"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:1>", "<sample:9>", "prototype"}, false, 13, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:5>", "<sample:1>", "<sample:1>", "initializing variable"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "processForTesting", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visitName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:9>", "<sample:2>"}, {"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:1>", "<sample:9>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectString", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:10>", "<sample:7>", "<null>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:5>", "<sample:7>", "<sample:6>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<null>", "<sample:4>", "<sample:1>", "right side of 'omparion has no properties"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:11>", "<sample:7>", "<sample:10>", "Pb1+"}, {"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:11>", "<sample:6>", "<sample:10>", "0", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.TypeCheck", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 2), new String[][]{{"process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2), new String[][]{{"processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:2>", "<sample:1>"}}), new String[][]{{"processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "getTypedPercent", ""}}), new String[][]{{"shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:4>", "<sample:2>", "<sample:9>", "initializing variable"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:10>", "<sample:3>", "<sample:1>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "check", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:5>", "false"}, false, 14, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "getTypedPercent", ""}, {"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:3>"}, {"com.google.javascript.jscomp.TypeCheck", "check", "com.google.javascript.rhino.Node,boolean", "<null>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:8>", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<null>", "false"}, false, 14, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:4>", "<null>", "<sample:10>", "<sample:11>"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:6>", "<sample:2>", "<sample:7>", "truueCx23456789", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:8>", "<sample:6>", "<sample:1>", "1.12345678"}}), new String[][]{{"listIterator", "", "2"}, {"set", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:12>", "false"}, false, 9, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:9>", "<sample:5>", "<sample:0>", "<sample:11>", "Hello, World"}, {"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:11>", "<sample:11>", "1cEc:30:345", "<sample:4>"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<null>", "<sample:4>", "<sample:3>", "<sample:4>", "JSC_BAD_DELETE_OPERAND"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<null>", "true"}, false, 8, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:1>", "<sample:2>", "<sample:11>", "<sample:4>"}, {"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:8>", "<sample:11>", "<sample:10>", "1cEc:30:345", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>", "<sample:12>", "<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:11>", "<sample:7>", "<sample:11>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:5>", "<sample:3>", "<sample:9>", "<sample:11>", "<sample:8>", "1.5"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:17>", "true"}, false, 10, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "setShouldReport", "boolean", "false"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:4>", "<sample:2>", "<sample:1>", "<sample:11>", "left opesand"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:9>", "<sample:10>", "<sample:1>", "<sample:7>", "<sample:8>", "1/E2:30:445"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:16>", "true"}, false, 10, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "setShouldReport", "boolean", "false"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:2>", "<sample:10>", "<sample:1>", "<sample:7>", "<sample:8>", "1/E2:30:445"}, {"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:5>", "<sample:7>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:7>", "false"}, false, 12, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:2>", "<sample:10>", "<sample:1>", "<sample:11>", "<sample:7>", "1/E2:30:445"}, {"com.google.javascript.jscomp.TypeValidator", "expectNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:6>", "<sample:10>", "<sample:9>", "prototype"}, {"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:4>", "<sample:5>", "<sample:9>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "processForTesting", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:10>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<sample:8>", "<sample:12>", "<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<null>", "false"}, false, 8, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:11>", "<sample:7>", "<sample:1>", "<sample:4>", "<sample:5>", "w,"}, {"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:16>", "<sample:16>", "<sample:3>", "<sample:3>"}, {"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:4>", "<sample:2>", "<sample:11>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:9>", "true"}, {"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:3>", "<sample:12>", "<sample:3>", ".5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(sample.<boolean>, Object)]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:0>", "<sample:12>", "<sample:6>", "<sample:11>", "2147483647"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<null>", "false"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:11>", "<sample:6>", "<sample:5>", "<sample:1>", "<sample:16>", "+1"}, {"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:5>", "<sample:18>", "<sample:7>", "<sample:3>"}, {"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:4>", "<sample:13>", "<sample:9>", "<sample:12>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:9>", "<sample:5>", "<sample:0>", "left sidof 6oomparison1.1234567vith requires an object"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:11>", "<sample:9>", "<sample:1>", "<sample:9>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:0>", "<sample:4>", "<sample:6>", "<sample:5>", "left sidof 6oomparison1.1234567vith requires an object"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:0>", "<sample:9>", "<sample:5>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:10>", "<sample:7>", "<sample:3>", "null", "<sample:4>"}}), new String[][]{{"lastIndexOf", "java.lang.Object", "0"}, {"addAll", "int,java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1), new String[][]{{"lastIndexOf", "java.lang.Object", "0"}, {"addAll", "int,java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"iterator", "", "1"}, {"remove", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "processForTesting", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "check", "com.google.javascript.rhino.Node,boolean", "<sample:0>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectString", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<null>", "<sample:0>", "<null>", "left side of 'in'"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:4>", "<sample:0>", "<sample:4>", "1.12345678901234567", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectString", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<null>", "<sample:1>", "left side\037of 'in'"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:4>", "<sample:0>", "<sample:4>", "1.1234578901234567", "<sample:2>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<sample:16>", "<sample:7>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<sample:4>", "<sample:4>", "<sample:0>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:12>", "<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:0>", "<null>", "<sample:2>", "<sample:3>", "<sample:5>", "JSC_ETERMINISTIC_TESTabc"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<null>", "<sample:3>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:0>", "<null>", "<sample:1>", "<sample:9>", "<null>", "JSC`ETERMINISTIC_TESTabc"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:4>", "<sample:0>", "<sample:6>", "1/E2:30:445"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "getTypedPercent", ""}}), new String[][]{{"visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:5>", "<sample:9>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanOverride", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<sample:16>", "<sample:0>", "<sample:7>", "1e10", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:0>", "<sample:2>", "<sample:0>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:3>", "true"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:17>", "<sample:0>", "<sample:8>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:3>"}, {"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:6>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:16>", "<sample:6>", "<sample:8>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "check", "com.google.javascript.rhino.Node,boolean", "<sample:1>", "false"}, {"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:0>", "<sample:8>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "check", "com.google.javascript.rhino.Node,boolean", "<sample:1>", "false"}, {"com.google.javascript.jscomp.TypeCheck", "visitName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:5>", "<null>"}, {"com.google.javascript.jscomp.TypeCheck", "check", "com.google.javascript.rhino.Node,boolean", "<sample:9>", "true"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:6>", "<sample:10>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", "boolean", "false"}, {"com.google.javascript.jscomp.TypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:10>"}, {"com.google.javascript.jscomp.TypeCheck", "visitName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:5>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:8>", "<sample:11>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visitName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:4>", "<sample:1>"}, {"com.google.javascript.jscomp.TypeCheck", "visitName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<null>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:11>", "<sample:4>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visitName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:4>", "<sample:0>"}, {"com.google.javascript.jscomp.TypeCheck", "visitName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:3>", "<null>"}, {"com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", "boolean", "true"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<sample:2>", "<sample:16>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:8>", "<sample:2>", "<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:15>", "<sample:10>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visitName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:13>", "<sample:16>", "<sample:4>"}, {"com.google.javascript.jscomp.TypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<null>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:5>", "<sample:10>", "<null>", "right side of comparison"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:13>", "<null>", "<sample:7>", "Q"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:2>", "<sample:3>", "<sample:9>", "<null>", "<sample:15>", "+1"}, {"com.google.javascript.jscomp.TypeValidator", "expectNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:3>", "<sample:0>", "<sample:5>", "TITLE"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:1>", "<sample:3>", "<sample:10>", "0x1F"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:10>", "<sample:17>", "<sample:4>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:9>"}, {"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:9>", "<sample:14>"}, {"com.google.javascript.jscomp.TypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:8>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>", "<sample:16>", "<sample:9>", "<sample:1>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:5>", "<sample:14>", "<sample:1>", "<sample:0>", "<sample:8>", "left operand"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<sample:11>", "<sample:4>", ",\037or  ", "<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "left ope(rand", "<sample:10>", "<sample:4>", "<sample:7>", "inconsistent return type", "<sample:0>"}, {"com.google.javascript.jscomp.TypeValidator", "expectNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:7>", "<sample:5>", "<sample:3>", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"J10-.00", "<sample:13>", "<null>", "<sample:7>", "4JSC_;", "<null>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "023456789012345678901234567890", "<sample:9>", "<sample:15>", "<sample:1>", "PT1H", "<null>"}, {"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:16>", "<sample:11>", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:11>", "<sample:10>", "<sample:5>", "i"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<null>", "<sample:7>", "<sample:9>", "<sample:1>", "<sample:15>", "null"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:4>", "<sample:16>", "<sample:5>", "<sample:11>", "<sample:4>", "13"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:2>", "false"}, {"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:6>", "<sample:12>", "<sample:11>", "Title"}}), new String[][]{{"contains", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "setShouldReport", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:8>", "<sample:8>", "<sample:7>", "<sample:6>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "setShouldReport", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:8>", "<sample:17>", "<sample:6>", "<sample:6>", "JSC_DEjTERMINISTIC_TEST", "<sample:4>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "setShouldReport", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectString", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:0>", "<sample:18>", "<sample:6>", "110.0--z1.5"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:0>", "<sample:2>", "<sample:3>", ""}, {"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:11>", "<sample:11>", "<sample:1>", "<sample:10>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "getTypedPercent", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:17>"}, {"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:2>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "getTypedPercent", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:17>"}, {"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:2>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "check", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:13>", "true"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:11>", "<sample:16>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<sample:5>", "<sample:5>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:3>", "<sample:6>", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:13>", "<sample:17>"}, {"com.google.javascript.jscomp.TypeCheck", "getTypedPercent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.TypeCheck", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanOverride", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:13>", "<sample:9>", "<sample:5>", "<sample:9>", "010", "<sample:11>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:0>", "<sample:16>", "<sample:6>", "1.25"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:6>", "<sample:2>", "<sample:8>", "<sample:7>", "<null>", "1ER-t5"}, false, 12, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:5>", "<sample:10>", "<sample:5>", "<sample:3>"}, {"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:13>", "<sample:5>", "<sample:5>", "", "<sample:11>"}, {"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:12>", "<sample:16>", "<sample:10>", "<sample:11>", "<sample:15>", "2147483646"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:0>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:1>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeCheck", "check", "com.google.javascript.rhino.Node,boolean", "<sample:17>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visitName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<null>", "<sample:14>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "check", "com.google.javascript.rhino.Node,boolean", "<sample:1>", "false"}, {"com.google.javascript.jscomp.TypeCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:12>", "<sample:16>"}, {"com.google.javascript.jscomp.TypeCheck", "check", "com.google.javascript.rhino.Node,boolean", "<sample:0>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:13>", "<sample:15>", "<sample:3>", "<sample:7>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "setShouldReport", "boolean", "false"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:8>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visitName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:10>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<sample:12>", "<sample:5>", "<sample:4>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<sample:10>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:15>", "<sample:0>"}, {"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:15>", "<sample:8>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<sample:4>", "<sample:4>", " argument(s)", "<sample:11>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:6>", "<null>", "<null>", "<sample:9>", "1E-5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:14>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:17>", "<sample:2>"}, {"com.google.javascript.jscomp.TypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:10>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:2>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:17>", "<sample:2>"}, {"com.google.javascript.jscomp.TypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:10>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:19>", "<sample:12>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visitName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:8>", "<sample:17>"}, {"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:17>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:14>", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanOverride", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>", "<sample:12>", "<sample:0>", "<sample:9>", "1.5e300", "<sample:2>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"left sideof 6oomparison1.1234567", "<sample:10>", "<sample:8>", "<sample:4>", "left side of 'iln'", "<sample:10>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:8>", "<sample:2>", "<sample:10>", "J10-.00"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:13>", "<sample:12>", "<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:10>", "<sample:3>", "<sample:1>"}, {"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:5>", "<sample:3>", "0xFFFFFFFF"}, {"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:1>", "<sample:10>", "010", "<sample:6>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:4>", "<sample:8>", "<sample:5>", "<sample:11>", "right side of comparison"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:16>", "<sample:7>", "<sample:10>", "-1", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:3>", "<null>", "<sample:2>", "null"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<null>", "<sample:9>", "<sample:4>", "2020-01-01"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:4>", "<sample:4>", "<sample:7>", "12:30:45"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(function (new:0, *, *, *): 0, (number|string))]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visitName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:16>", "<sample:12>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:17>", "<sample:12>"}, {"com.google.javascript.jscomp.TypeCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:4>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visitName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:14>", "<sample:3>", "<sample:14>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:17>", "<sample:12>"}, {"com.google.javascript.jscomp.TypeCheck", "visitName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:1>", "<sample:10>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visitName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:14>", "<sample:3>", "<sample:14>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:17>", "<sample:12>"}, {"com.google.javascript.jscomp.TypeCheck", "visitName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:0>", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visitName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:8>", "<sample:7>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:15>", "<sample:6>"}, {"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:17>", "<sample:3>"}, {"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:13>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visitName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:3>", "<sample:5>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:15>", "<sample:9>"}, {"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:17>", "<sample:3>"}, {"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:10>", "<sample:12>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:17>", "<null>", "TITLE"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "getTypedPercent", ""}, {"com.google.javascript.jscomp.TypeCheck", "check", "com.google.javascript.rhino.Node,boolean", "<sample:17>", "true"}}, 2), new String[][]{{"shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:8>", "<sample:1>", "<sample:9>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<sample:1>", "<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:5>", "<sample:1>", "<sample:1>", " has no properties"}, {"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:4>", "<sample:17>", "<sample:4>", "Pb1+"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:1>", "<sample:12>", "<sample:9>", "<sample:10>", "left operand"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:3>", "<sample:0>", "<sample:0>", "1.1234567890123456"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:9>", "<sample:0>", "<sample:2>"}, {"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:8>", "<sample:12>", "<sample:6>", "<sample:4>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visitName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:5>", "<sample:0>"}, {"com.google.javascript.jscomp.TypeCheck", "check", "com.google.javascript.rhino.Node,boolean", "<sample:1>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
}
