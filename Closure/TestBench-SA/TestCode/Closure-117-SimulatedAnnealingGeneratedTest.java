package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:5>", "<sample:0>", "JSC_TYPE_MISMATCH"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:5>", "<sample:0>", "JSC_TYPE_MISMATCH"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:6>", "<sample:0>", "JSC_TYPE_MISMATBH"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:0>", "<sample:6>", "<sample:0>", "JSC_TYPE_MISMATBH"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:7>", "<sample:1>", "<sample:3>", "+1"}, {"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:2>", "<null>", "<sample:7>", "."}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<sample:1>", "<sample:0>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<null>", "<sample:2>", "<sample:2>", "2020-02-30T25:61:61"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:5>", "<sample:1>", "<sample:2>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:4>", "<sample:4>", "<sample:1>", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:0>", "<sample:5>", "<sample:5>", "2020-02-30T25:61:61"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:5>", "<sample:1>", "<sample:2>", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:0>", "<sample:5>", "<sample:5>", "2020-02-0T5:61:61"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<null>", "<sample:4>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:6>", "<sample:1>", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:5>", "<sample:5>", "2020-602-0T5:61:61"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<null>", "<sample:3>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<null>", "<sample:5>", "<null>", "1.1234567"}, {"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:6>", "<sample:0>", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:5>", "<sample:5>", "2020-602-0T5:61:61"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<null>", "<sample:3>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<null>", "<sample:5>", "<null>", "1.1234567"}, {"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:6>", "<sample:1>", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanOverride", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<sample:5>", "<sample:4>", "<sample:6>", "'[]'", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:7>", "<sample:4>", "202V0-602-0L5:61:61"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<null>", "<sample:3>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<null>", "<sample:6>", "<null>", "1.1234567"}, {"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:7>", "<sample:1>", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:7>", "<sample:7>", "202V0-602-0L5:61:6"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<null>", "<sample:3>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<null>", "<sample:6>", "<sample:0>", "1.1234567"}, {"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:7>", "<sample:1>", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:7>", "<sample:6>", "202V0-602-0L5:61:6"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<null>", "<sample:3>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<null>", "<sample:6>", "<sample:0>", "1.1234567"}, {"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:7>", "<sample:1>", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:4>", "<sample:1>", "<sample:2>", "Title"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "1e10", "<null>", "<sample:2>", "<sample:7>", "<sample:4>", "-1", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "setShouldReport", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:5>", "<sample:4>", "<null>", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>", "<sample:5>", "<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:2>", "<sample:6>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:1>", "<sample:4>", "<sample:6>", "202V0-602-0LL5951:6"}, false, 14, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<null>", "<sample:1>", "<sample:1>", "1.1234567"}, {"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:5>", "<sample:1>", "<sample:2>"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:1>", "<sample:7>", "<sample:6>", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:1>", "<sample:4>", "<sample:6>", "202V0-602-0LL5951:6"}, false, 14, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<null>", "<sample:1>", "<sample:3>", "1.1234567"}, {"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:5>", "<sample:1>", "<sample:2>"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:1>", "<sample:7>", "<sample:6>", "<null>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:0>", "<sample:6>", "<sample:6>", "202V0-602-0LL5951:6"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:5>", "<sample:2>", "<sample:2>"}, {"com.google.javascript.jscomp.TypeValidator", "expectNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:7>", "<sample:1>", "<null>", "1L"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:4>", "<sample:1>", "<sample:6>", "202V0-602-0LL59516"}, false, 8, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:5>", "<sample:2>", "<sample:2>"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:2>", "<sample:2>", "<sample:3>"}, {"com.google.javascript.jscomp.TypeValidator", "expectNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:6>", "<sample:1>", "<null>", "1L"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<null>", "<sample:7>", "0x123456789", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:5>", "<sample:2>", "<sample:6>", "2020-01-01"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:5>", "<sample:0>", "<sample:2>", "202V0-E602-0LL59516"}, false, 8, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:5>", "<sample:0>", "<sample:1>", "2020-602-0T5:61:61"}, {"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:5>", "<sample:2>", "<sample:2>"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:2>", "<sample:2>", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:4>", "<sample:0>", "<sample:4>", "202V0-E62-0LL59516"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:5>", "<sample:0>", "<sample:1>", "2020-602-0T5:61:61"}, {"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:5>", "<sample:2>", "<sample:2>"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:2>", "<sample:2>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:5>", "<sample:0>", "<sample:6>", "null"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:0>", "<sample:2>", "("}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:5>", "<sample:6>", "<sample:1>", "2020-602-0T5:61:61"}, {"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:5>", "<sample:2>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:4>", "<sample:2>", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:5>", "<sample:5>", "<sample:1>", "<sample:2>", "<sample:4>", "0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:1>", "<sample:7>", "<sample:6>", "--1"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:2>", "<null>", "(("}, false, 14, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:5>", "<sample:0>", "<sample:1>", "2020-602-0T5:61:61"}, {"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:7>", "<sample:2>", "<sample:3>"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:4>", "<sample:2>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:2>", "<sample:2>", "1.1234567"}, false, 14, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:5>", "<sample:0>", "<sample:1>", "2020-602-0T5:61:61"}, {"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:7>", "<sample:2>", "<sample:3>"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:4>", "<sample:1>", "<sample:6>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<sample:1>", "<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<null>", "<sample:3>", "<sample:0>", "<sample:6>", "--1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:2>", "<sample:7>", "<null>", "0xFFFFFFFF"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:5>", "<sample:6>", "212V0-602-0L5:(71"}, false, 13, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<sample:6>", "<sample:3>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeValidator", "setShouldReport", "boolean", "false"}, {"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:7>", "<sample:1>", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:1>", "<sample:1>", "<null>", "<sample:6>", "<sample:3>", "duplicate"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanOverride", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:4>", "<sample:1>", "<sample:2>", "0x1F", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:1>", "<sample:5>", "duplicate"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:2>", "<null>", "-0.0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:1>", "<sample:5>", "duplicate"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:1>", "<sample:2>", "<null>", "-0.0"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:1>", "<sample:5>", "duplicate"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<null>", "<sample:7>", "<sample:7>", ".5"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:0>", "<sample:2>", "<sample:6>", "<sample:1>", "<sample:6>", "202V0-602-0LL5951:6"}, {"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:1>", "<sample:2>", "<null>", "-0.0"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<null>", "<sample:5>", "5."}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<sample:6>", "<sample:1>", "<sample:6>"}, {"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:6>", "<sample:1>", "<sample:3>", "-0.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanOverride", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:7>", "<sample:0>", "<sample:0>", "1.5d", "<sample:2>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:1>", "<sample:5>", "<sample:2>", "<null>"}, {"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<null>", "<sample:6>", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:7>", "<null>", "/"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:4>", "<sample:2>", "<sample:7>", ".5"}, {"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:6>", "<sample:3>", "a"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:0>", "<sample:2>", "<sample:5>", "<sample:1>", "<sample:8>", "202V0-602-0LL5951:6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:7>", "<null>", "/"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:6>", "<sample:3>", "a"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:0>", "<sample:2>", "<sample:5>", "<sample:1>", "<sample:8>", "202V0-602-0LL5951:6"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<sample:5>", "<sample:7>", "<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:4>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:6>", "<sample:5>", "<null>", "202V0-602-0L5:61:6"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<null>", "<sample:7>", "<sample:3>", "<sample:0>", "JSC_TYPE_MISMATBH"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.jscomp.CompilerInput", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"duplicate", "<sample:4>", "<sample:4>", "<sample:1>", "<sample:1>", "'[]'", "<sample:2>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:6>", "<sample:2>", "<sample:2>", "a,b,c"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var null{null} {getInputName=<non-file>, getName=null, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=!NullPointerException, isLocal=!NullPointerException, isN...#236#918273423", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:3>", "<sample:4>", "00JSB_ULKNOWN_TYP"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:2>", "<sample:2>", "<sample:5>", "<sample:2>", "<sample:8>", "202V0-602-0LL5951:6"}, {"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:0>", "<sample:5>", "'[]'", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:3>", "<sample:4>", "00JSB_UMKNOWN_TYP"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<null>", "<sample:5>", "<null>", "<sample:1>"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:4>", "<sample:2>", "<sample:5>", "<sample:2>", "<sample:11>", "202V0-602-0LL5951:6"}, {"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<null>", "<sample:0>", "<sample:5>", "'[]'", "<sample:6>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<null>", "<sample:1>", "00JSB_UMKNOWN_TYP"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<null>", "<sample:5>", "<null>", "<sample:1>"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:4>", "<sample:2>", "<sample:5>", "<sample:2>", "<sample:6>", "202V0-602-0LL5951:6"}, {"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<null>", "<sample:0>", "<sample:5>", "'[]'", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:1>", "<sample:7>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "202V0-602-0LL5951:6", "<sample:4>", "<sample:1>", "<sample:0>", "<sample:1>", ", ", "<sample:4>"}, {"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:6>", "<null>", "<sample:1>", "("}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:1>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "Title", "<null>", "<sample:3>", "<sample:2>", "<sample:7>", "202V0-602-0LL59516", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:2>", "<sample:3>", "<sample:2>", "1.5e300"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:4>", "<sample:5>", "0z,,"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getMismatches", ""}, {"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:2>", "<sample:5>", "2"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:4>", "<sample:2>", "<sample:5>", "<sample:3>", "<sample:4>", "202V0-602-0LL5951:6"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<sample:6>", "<null>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:3>", "<sample:4>", "<sample:6>", "1.12345678901234567"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:4>", "<sample:8>", "<sample:1>", "<sample:6>", "<sample:4>", "2147483647"}, {"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<null>", "<null>", "<sample:1>", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<null>", "<sample:0>", "<sample:5>", "1.5"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<sample:6>", "<sample:8>", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:5>", "<sample:2>", "<sample:3>", "<sample:3>", "<sample:0>", "1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:5>", "true"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:0>", "<sample:3>", "<sample:1>", "<sample:6>", "<sample:1>", "true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:8>", "<sample:4>", "(dEHeklo, lorkd"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:7>", "<sample:2>", "<sample:3>", "<sample:2>", "struct"}, {"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:2>", "<sample:5>", "2"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:4>", "<sample:5>", "<sample:5>", "<sample:3>", "<sample:3>", "202V0-602-0LL5951:6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:1>", "<sample:6>", "<sample:1>", "<null>", "<sample:7>", "JSC_TYPE_MISMATCH"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<sample:6>", "<sample:6>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<sample:2>", "<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:4>", "<sample:2>", "<sample:1>", "1E-5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>", "<sample:2>", "<sample:0>", "--1", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<null>", "<sample:6>", "<sample:4>", "<sample:0>", "<null>", "restricted index type", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:4>", "<sample:6>", "<sample:5>", "array access"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:8>", "<sample:2>", "<sample:7>", "function"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:3>", "<sample:5>", "<sample:3>", "JSC_MISSING_EXTENDS_TAG", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanCast", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:0>", "<null>", "<sample:6>", "<sample:1>"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:8>", "<sample:4>", "<sample:7>", "<null>", "abc", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<sample:1>", "<sample:1>", "<sample:0>"}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:3>", "<sample:6>", "<null>", "2147483648"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:3>", "<sample:4>", "<sample:5>", "<sample:1>", "<sample:2>", "0"}, {"com.google.javascript.jscomp.TypeValidator", "setShouldReport", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:9>", "<sample:8>", "<null>", "214M483648"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:3>", "<sample:2>", "<sample:5>", "<sample:1>", "<sample:2>", "0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:9>", "<sample:8>", "<sample:1>", "214M48364"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:3>", "<sample:2>", "<sample:5>", "<sample:1>", "<sample:2>", "0"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.jscomp.CompilerInput", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"true", "<sample:5>", "<sample:3>", "<sample:6>", "<sample:4>", "2147483648", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:9>", "<sample:2>", "<sample:2>", "010"}}), new String[][]{{"isTypeInferred", "", "4"}, {"isNoShadow", "", "7"}, {"getJSDocInfo", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.jscomp.CompilerInput", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"true", "<sample:5>", "<sample:3>", "<sample:6>", "<sample:4>", "2147483648", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:9>", "<sample:2>", "<sample:2>", "010"}}), new String[][]{{"isTypeInferred", "", "4"}, {"isNoShadow", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.jscomp.CompilerInput", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"tru", "<sample:5>", "<sample:3>", "<sample:6>", "<sample:4>", "20147483648", "<sample:6>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<null>", "<sample:8>", "<sample:5>", "2020-01-01"}, {"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:6>", "<sample:4>", "<sample:2>", "5."}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var null{null} {getInputName=<non-file>, getName=null, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=!NullPointerException, isLocal=!NullPointerException, isN...#236#918273423", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectString", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:5>", "<null>", "<sample:7>", "Title"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:7>", "<sample:7>", "202V0-602-0LL59516"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:5>", "<null>", "<sample:2>", "<sample:5>", "-0.0"}}), new String[][]{{"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:10>", "<sample:7>", "202V-0-602-0LL59516"}, {"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<null>", "<sample:6>", "<sample:1>", "struct"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:10>", "<sample:7>", "202V-0-602-0LL59516"}, {"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<null>", "<sample:6>", "<sample:1>", "struct"}}, 3), new String[][]{{"ensureCapacity", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectString", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:1>", "<sample:0>", "<sample:5>", "JSC_TYPE_MISMATCH"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectString", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:11>", "<sample:0>", "<sample:4>", "JSC_TYPE_MISMATCH"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectString", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:11>", "<sample:0>", "<sample:6>", "JSC_TYPE_MISMATCH"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<sample:1>", "<sample:1>", "1.215", "<sample:4>"}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:4>", "<sample:8>", "<sample:5>", "1L"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<sample:5>", "<sample:0>", "nul", "<null>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "restrict", "<sample:6>", "<sample:8>", "<sample:6>", "<sample:2>", "5.", "<null>"}, {"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:5>", "<sample:7>", "<sample:4>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:5>", "<sample:0>", "<sample:3>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<sample:5>", "<null>", "nl", "<null>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "restrict", "<sample:6>", "<sample:8>", "<sample:6>", "<sample:2>", "5.", "<null>"}, {"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "1.1234567", "<sample:6>", "<sample:3>", "<sample:10>", "<sample:3>", "1", "<sample:6>"}, {"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:5>", "<sample:7>", "<sample:4>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<sample:7>", "<sample:2>", "m", "<null>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "1.1234567", "<sample:6>", "<sample:3>", "<sample:10>", "<sample:3>", "1", "<sample:6>"}, {"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:5>", "<sample:7>", "<sample:4>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:9>", "<sample:4>", "<sample:3>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<sample:7>", "<sample:4>", "JSC_UNKNOWN_TYPEOF_VALUE", "<sample:0>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "1.1234567", "<sample:6>", "<sample:3>", "<sample:10>", "<sample:3>", "1", "<sample:6>"}, {"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:5>", "<sample:6>", "<sample:5>", ")"}, {"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:9>", "<sample:5>", "<sample:3>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:2>", "<sample:5>", "<sample:0>", "<sample:4>", "function"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<null>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:8>", "<sample:9>", "<sample:5>", ">)", "<sample:5>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:10>", "<sample:5>", "<sample:5>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:0>", "<null>", "JSC_TYPE_MISMATCH"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:4>", "<sample:4>", "<sample:5>", "<sample:2>"}, {"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:0>", "<sample:0>", "<sample:5>", "-1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:3>", "<sample:0>", "<sample:5>", "JSC_MISSING_EXTENDS_TAG"}}), new String[][]{{"clone", "", "4"}, {"listIterator", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:8>", "<sample:4>", "<sample:5>", "g", "<sample:3>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:6>", "<sample:4>", "<sample:5>", "<sample:0>"}, {"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:6>", "<sample:0>", "<sample:6>", "PT1H"}, {"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "dupeicate", "<sample:3>", "<sample:4>", "<sample:9>", "<sample:0>", "5.", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<sample:8>", "<sample:5>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<null>", "<sample:1>", "<sample:2>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:9>", "<sample:7>", "<sample:1>", "<sample:5>", "a,b,c", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectString", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<null>", "<sample:10>", "<sample:1>", "a"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:10>", "<sample:5>", "<sample:1>", "<sample:1>", "<sample:9>", "0xFFFFFFFF"}, {"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:10>", "<sample:3>", "<sample:3>", ")"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<sample:2>", "<sample:9>", "gg", "<sample:5>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:6>", "<sample:1>", "<sample:6>", "PT1H"}, {"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:9>", "false"}, {"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "dupeicate", "<sample:3>", "<sample:4>", "<sample:9>", "<sample:0>", "5.", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:10>", "<sample:1>", "unknown type: {0}"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:10>", "<sample:6>", "<null>", "4412:30:45", "<sample:0>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:6>", "<sample:1>", "<sample:1>", ""}, {"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:0>", "false"}, {"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "dupeicate", "<sample:5>", "<sample:7>", "<sample:9>", "<sample:0>", "5.", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "setShouldReport", new String[]{"boolean"}, new String[]{"true"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:7>", "<sample:4>", "<sample:7>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeValidator", "expectNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<null>", "<sample:3>", "<sample:5>", "010"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:0>", "<sample:2>", "<sample:9>", "<sample:0>", "JSC_UNKNOWN_TYPEOF_VALUE"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:10>", "<sample:2>", "<sample:3>", "<sample:1>"}, {"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<null>", "<sample:2>", "<sample:4>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<sample:6>", "<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:0>", "<sample:10>", "<null>", "2147483648"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<sample:7>", "<sample:1>", "<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:4>", "true"}, {"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:8>", "<sample:1>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:4>", "<sample:8>", "<sample:6>", "<sample:2>", "2020-02-0T5:61:61"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:4>", "<sample:8>", "<sample:6>", "<sample:1>", "2020-02-0T5:61:61"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectString", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:10>", "<sample:9>", "<sample:3>", "0"}, false, 12, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectString", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:0>", "<sample:5>", "<sample:5>", "JSC_DUP_VAR_DECLARATION"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:1>", "<sample:9>", "<sample:6>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:2>", "<sample:5>", "<sample:4>", "<null>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:1>", "<sample:1>", "<sample:3>", "{0X0x1F"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:3>", "<sample:10>", "<sample:8>", "<sample:0>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:2>", "<null>", "<sample:6>", "assignment to property ", "<null>"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:0>", "<sample:8>", "<sample:2>", "<sample:4>", "<sample:8>", "1E-5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<sample:9>", "<sample:9>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:3>", "<sample:9>", "<sample:5>", "1.5I"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:2>", "<sample:4>", "<sample:6>", "<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:2>", "<sample:7>", "<sample:7>", "duplicate"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<null>", "<sample:1>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:11>", "<sample:0>", "<sample:11>"}, {"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:6>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.jscomp.CompilerInput", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"JSC_DUP_VAR_DECLARATION", "<sample:5>", "<sample:4>", "<sample:5>", "<null>", "Title", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:9>", "<null>", "<sample:4>", " "}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:6>", "<sample:1>", "<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:11>", "<sample:0>", "<sample:6>"}, {"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "JSC_TYPE_MISMATBH", "<sample:2>", "<null>", "<sample:2>", "<sample:5>", "-0.0", "<null>"}, {"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:6>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<null>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<null>", "<sample:4>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<sample:6>", "<sample:7>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:6>", "<sample:7>", "<sample:2>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:7>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>", "<null>", "<sample:6>", "<sample:5>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:1>", "false"}, {"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:6>", "<sample:3>", "<sample:4>", "unknown type: {0}"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:1>", "<sample:2>", "<sample:9>", "<sample:0>", "<sample:0>", "struct"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanOverride", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>", "<sample:2>", "<sample:5>", "<sample:1>", "010", "<sample:4>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanOverride", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>", "<sample:5>", "<sample:0>", "<sample:1>", "010", "<sample:6>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.jscomp.CompilerInput", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"JSC_UNKNOWN_TYPEOF_VALUUE", "<null>", "<sample:5>", "<sample:6>", "<sample:6>", "5.//", "<null>"}, false, 11, new String[][]{}, 1), new String[][]{{"getDeclaration", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectString", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:8>", "<sample:6>", "JSC_UN"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectString", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:8>", "<sample:7>", "JSC__Ur"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:0>", "<null>", "'[]'"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:2>", "<null>", "'[]'"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectActualObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:2>", "<sample:3>", "'[]'"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:6>", "false"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:1>", "<sample:5>", "<sample:1>", "1.5"}, {"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:1>", "<sample:7>", "<sample:5>", "1.1223456712:30:45"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:7>", "<sample:1>", "<sample:6>", "<sample:0>", "<sample:7>", " of "}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:6>", "true"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.jscomp.CompilerInput", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"202V0-E602-0LL59516", "<sample:3>", "<sample:3>", "<sample:6>", "<sample:7>", "a,b,c", "<sample:5>"}, false, 0, null, 2), new String[][]{{"getParentNode", "", "3"}, {"getName", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<null>", "false"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:9>", "<sample:4>", "<sample:1>", "<sample:2>", "<sample:7>", "214748364"}, {"com.google.javascript.jscomp.TypeValidator", "expectNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:8>", "<sample:6>", "<sample:3>", "202V0-602-0L5:61:6"}, {"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:1>", "<sample:10>", "", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<null>", "false"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:0>", "<sample:3>", "<sample:0>", "<sample:3>", "<sample:7>", "114748l64"}, {"com.google.javascript.jscomp.TypeValidator", "expectNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:9>", "<sample:1>", "<sample:1>", "202I0-6N02a,b,c"}, {"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:0>", "<sample:4>", "<sample:10>", "ssignment to property ", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:0>", "<sample:7>", "<sample:7>", "<sample:7>", "-1"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:7>", "<sample:6>", "2020-602-0T5:61:61"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<null>", "<sample:5>", "<sample:9>", "/", "<sample:6>"}, {"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:6>", "<sample:2>", "<sample:7>", "(dEHeNlo, lorkd"}, {"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:10>", "<sample:2>", "JSC_INVALID_CAST"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "<sample:7>", "<sample:7>", "2020--602-T5:61:61"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<null>", "<sample:5>", "<sample:9>", "d", "<sample:6>"}, {"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:6>", "<sample:2>", "<sample:7>", "(dEHeNlo, lorkd"}, {"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:10>", "<sample:2>", "JSC_INVALID_CAST"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:8>", "<sample:7>", "<sample:9>", "202-- 602-T5:6161-0.0"}, false, 9, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:5>", "<sample:3>", "<sample:2>", "<sample:3>", "<sample:6>", "-1"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:10>", "<sample:9>", "<sample:9>", "<null>", "<sample:2>", "1.1234567"}, {"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:5>", "<sample:4>", "<sample:3>", "(dEHeklo, lorkd"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "setShouldReport", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:0>", "<sample:8>", "<sample:2>", "<sample:0>", "<sample:8>", "-1"}, {"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<null>", "<null>", "<sample:2>", "202V0-602-0LL5951:6"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:3>", "<sample:10>", "<sample:2>", "<sample:0>", "202V0-602-0LL5951:6"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<null>", "<sample:2>", "<sample:4>", "<sample:9>", "<sample:2>", "0"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<null>", "<sample:4>", "<sample:2>", "12:30:45", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanOverride", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:7>", "<sample:5>", "<sample:1>", "furct", "<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "1.5f", "<sample:5>", "<sample:0>", "<sample:4>", "<sample:1>", "JSC_MISSING_EXTENDS_TAG", "<null>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:1>", "<sample:8>", "<sample:5>", "<sample:6>", "<sample:2>", "-1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:9>", "<sample:8>", "<sample:5>", "<sample:1>"}, {"com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int", "<sample:9>", "<sample:6>", "<sample:6>", "<null>", "<sample:5>", "2147483647"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:8>", "<sample:3>", "<sample:6>", "202V/-602-_0LL59,5E16"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectValidTypeofName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,java.lang.String", "<sample:10>", "<sample:4>", "2"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String", "<sample:4>", "<sample:4>", "<sample:6>", "<sample:4>", "<sample:6>", "."}, {"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:1>", "true"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:7>", "<sample:3>", "<sample:4>", " nff"}, false, 14, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectNotNullOrUndefined", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:1>", "<sample:2>", " of ", "<sample:5>"}, {"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:4>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:4>", "<sample:7>", "<sample:1>", "314M48364'[]'"}, false, 10, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "a!", "<sample:4>", "<sample:9>", "<sample:4>", "<sample:2>", "Hello, Wor", "<sample:3>"}, {"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:3>", "true"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.jscomp.CompilerInput", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"0xFFFFFFFF", "<sample:0>", "<sample:4>", "<sample:5>", "<sample:6>", "212V0-602-0L5:(71", "<sample:4>"}, false, 0, null, 3), new String[][]{{"isLocal", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:3>", "<sample:9>", "<sample:5>", "(dEHeklo, lorkd"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:4>", "<sample:8>", "<sample:1>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAnyObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:3>", "<sample:7>", "<sample:6>", "{0}"}, {"com.google.javascript.jscomp.TypeValidator", "expectCanAssignTo", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:6>", "<sample:10>", "<sample:9>", "<sample:1>", "1.5"}, {"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:6>", "<sample:3>", "(dEHeklo, lorkd"}}, 2), new String[][]{{"retainAll", "java.util.Collection", "5"}, {"get", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<null>", "<sample:9>", "<sample:1>", "<sample:9>", "<sample:8>", "0"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<sample:7>", "<sample:1>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectArgumentMatchesParameter", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:0>", "<sample:9>", "<sample:0>", "<sample:10>", "<sample:8>", "0"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<sample:7>", "<sample:1>", "<sample:1>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectSuperType", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:3>", "<sample:1>", "<null>", "<sample:7>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "<sample:1>", "<sample:8>", "1.1234567"}, {"com.google.javascript.jscomp.TypeValidator", "expectSwitchMatchesCase", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:10>", "<sample:5>", "<sample:1>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<null>", "<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "setShouldReport", "boolean", "false"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanCast", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<null>", "<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "setShouldReport", "boolean", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", new String[]{"java.lang.String", "com.google.javascript.jscomp.CompilerInput", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope$Var", "java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"202V0-602-0LL59516", "<sample:2>", "<sample:1>", "<sample:8>", "<sample:0>", ">)", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:6>", "true"}, {"com.google.javascript.jscomp.TypeValidator", "expectActualObject", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<null>", "<null>", "<sample:9>", "0z,,"}}, 1), new String[][]{{"getNameNode", "", "5"}, {"isBleedingFunction", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectAnyObject", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<null>", "<sample:10>", "<sample:3>", " of!o"}, false, 11, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectUndeclaredVariable", "java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope$Var,java.lang.String,com.google.javascript.rhino.jstype.JSType", "", "<sample:5>", "<sample:7>", "<sample:6>", "<sample:0>", "Title", "<sample:5>"}, {"com.google.javascript.jscomp.TypeValidator", "getReadableJSTypeName", "com.google.javascript.rhino.Node,boolean", "<sample:9>", "true"}, {"com.google.javascript.jscomp.TypeValidator", "expectIndexMatch", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:1>", "<sample:8>", "<sample:7>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:8>", "<sample:9>", "<null>", "123456789012345678901234567890"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectAllInterfaceProperties", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType", "<sample:2>", "<sample:3>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "getMismatches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectCanOverride", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:6>", "<sample:1>", "<sample:4>", "JSC_DUP_VAR_DECLARATION", "<sample:7>"}}), new String[][]{{"lastIndexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeValidator", "com.google.javascript.jscomp.TypeValidator", "expectCanAssignToPropertyOf", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:1>", "<sample:0>", "<sample:2>", "<sample:5>", "<sample:6>", "1"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeValidator", "expectBitwiseable", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:6>", "<sample:3>", "<sample:0>", "Tttle"}, {"com.google.javascript.jscomp.TypeValidator", "expectStringOrNumber", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:7>", "<sample:1>", "<sample:3>", "202V0-602-0LL5951:6"}, {"com.google.javascript.jscomp.TypeValidator", "expectSuperType", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:1>", "<sample:10>", "<sample:3>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
}
